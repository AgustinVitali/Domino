package controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import vista.VistaFicha;
import modelo.Modelo;
import modelo.Ficha;
import vista.VistaTablero;
import vista.crearJug;
import vista.ganador;
import vista.jugador1;
import vista.jugador2;
import vista.pantallaInicio;
import vista.Historial;


public class Controlador implements ActionListener {

    int prueba = 0;
    int cont = 0;
    int camb = 0;
    int contFiju1 = 0;
    int contFiju2 = 0;
    int contt = 0;
    int ganJ1 = 0;
    int ganJ2 = 0;
    private crearJug creju;
    private Modelo modelo;
    private VistaFicha ultimaFichaAgregada;
    private pantallaInicio pantin;
    private jugador1 jug1;
    private jugador2 jug2;
    private VistaTablero tablero;
    private ganador gan;
    private JPanel[] fichas;
    private Historial hist;
    private ArrayList<String> ganadores;
    String nombre;

    private VistaFicha[] fichasVista = new VistaFicha[28];
    
    public Controlador(crearJug creju, Modelo model, pantallaInicio pantin, jugador1 jug1, jugador2 jug2,
            VistaTablero tablero, ganador gan, Historial hist) {
        this.creju = creju;
        this.modelo = model;
        this.pantin = pantin;
        this.jug1 = jug1;
        this.jug2 = jug2;
        this.tablero = tablero;
        this.gan = gan;
        this.hist = hist;
        ganadores = new ArrayList<>();

        this.fichas = new JPanel[]{
            jug1.ficha1, jug1.ficha2, jug1.ficha3, jug1.ficha4, jug1.ficha5, jug1.ficha6, jug1.ficha7,
            jug1.ficha8, jug1.ficha9, jug1.ficha10, jug1.ficha11, jug1.ficha12, jug1.ficha13, jug1.ficha14,
            jug2.ficha1j2, jug2.ficha2j2, jug2.ficha3j2, jug2.ficha4j2, jug2.ficha5j2, jug2.ficha6j2,
            jug2.ficha7j2, jug2.ficha8j2, jug2.ficha9j2, jug2.ficha10j2, jug2.ficha11j2, jug2.ficha12j2,
            jug2.ficha13j2, jug2.ficha14j2,};

    }

    public void iniciar() {
        agregarEventoFicha();
        pantin.setVisible(true);
        modelo = new Modelo();
        modelo.generarFichas();
        modelo.mezclar();
        pantallas();
        botones();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object boton = e.getSource();
        if (boton == this.pantin.btInicio) {
            this.pantin.dispose();
            this.creju.setVisible(true);
        }
        if (boton == this.creju.btEmpezar) {
            this.creju.dispose();
            if (contt == 0) {
                agregarFichas();
                contt++;
            }
            nombre();
            agregarEventoFicha();
            jug1.setVisible(true);
            mostrar2();
        }
        if (boton == this.jug1.siguiente) {
            this.jug1.dispose();
            jug2.setVisible(true);
            mostrar();
        }
        if (boton == this.jug2.siguienteJ2) {
            this.jug2.dispose();
            jug1.setVisible(true);
            mostrar2();
        }
        if (boton == this.jug1.rendirse) {
            gan.setVisible(true);
            gan.nomGanador.setText(this.creju.nombrej2.getText());
            nombre = jugador1.mNombrej2.getText();
            prueba = 2;
            agregarGanador(prueba);
            nombre = null;
            escribirGanadoresEnArchivo();
        }
        if (boton == this.jug2.rendirseJ2) {
            gan.setVisible(true);
            gan.nomGanador.setText(this.creju.nombrej1.getText());
            nombre = jugador1.mNombre.getText();
            prueba = 1;
            agregarGanador(prueba);
            nombre = null;
            escribirGanadoresEnArchivo();
        }
        if (boton == this.gan.jugarNuevo || boton == this.hist.jugarNuevoGan) {
            iniciar();
            gan.setVisible(false);
            jug1.setVisible(false);
            jug2.setVisible(false);
            limpiarVista();
            jug1.revalidate();
            jug1.repaint();
            jug2.revalidate();
            jug2.repaint();
        }
        if (boton == this.gan.ganadores) {
            gan.setVisible(false);
            hist.setVisible(true);
            leer();
        }
        if (boton == this.hist.cerrarJug || boton == this.gan.cerrarJug) {
            System.exit(0);
        }
    }

    public void agregarEventoFicha() {
//        Recorro el arreglo fichas para obtener las instancias de VistaFicha
//        Esto garantiza que el arreglo fichasVista contenga solo las instancias de VistaFicha que 
//        están dentro de los JPanel del arreglo fichas
        VistaFicha[] fichasVistas = new VistaFicha[fichas.length];
        for (int i = 0; i < fichas.length; i++) {
            if (fichas[i].getComponentCount() > 0 && fichas[i].getComponent(0) instanceof VistaFicha) {
                fichasVistas[i] = (VistaFicha) fichas[i].getComponent(0);
            }
        }
        for (VistaFicha ficha : fichasVistas) {
            if (ficha != null) {
                ficha.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        if (e.getButton() == MouseEvent.BUTTON3) {
//                      llamo a rotar ficha cuando se haga click derecho
                            rotar(ficha);
                            jug1.revalidate();
                            jug1.repaint();
                            jug2.revalidate();
                            jug2.repaint();
                        } else {
                            if (cont == 0) { //este if consigue que solo se agregue una ficha sin necesidad de ser comparada
                                // con otra ya que es la primera 
                                if (camb == 1) {
                                    contFiju1++;
                                }
                                if (camb == 2) {
                                    contFiju2++;
                                }
                                tablero.tab.add(ficha);
                                cont++;
                                jug1.revalidate();
                                jug1.repaint();
                                jug2.revalidate();
                                jug2.repaint();
                                agregarFicha(ficha);
                                jug1.mano.setVisible(false);
                                jug2.manoj2.setVisible(false);
                            } else {
                                VistaFicha ultimaFichaAgregada = getUltimaFichaAgregada();
                                // Obtengo la información de nArriba y nAbajo de la ficha a agregar
                                int nArribaFicha = ficha.getFichas().getNumeroArriba();
                                // Obtengo la información de nArriba y nAbajo de la última ficha del tablero
                                int nAbajoUltimaFicha = ultimaFichaAgregada.getFichas().getNumeroAbajo();
                                // Verificar si coincide nAbajo con nArriba de la ultima ficha
                                if (nAbajoUltimaFicha == nArribaFicha) {
                                    agregarFicha(ficha);
                                    jug1.revalidate();
                                    jug1.repaint();
                                    jug2.revalidate();
                                    jug2.repaint();
                                    jug1.mano.setVisible(false);
                                    jug2.manoj2.setVisible(false);
                                    if (camb == 1) {
                                        contFiju1++;
                                        if (contFiju1 == 14) {
                                            gan.setVisible(true);
                                            gan.nomGanador.setText(creju.nombrej1.getText());
                                            nombre = jugador1.mNombre.getText();
                                            prueba = 1;
                                            agregarGanador(prueba);
                                            nombre = null;
                                            escribirGanadoresEnArchivo();
                                        }
                                    }
                                    if (camb == 2) {
                                        contFiju2++;
                                        if (contFiju2 == 14) {
                                            gan.setVisible(true);
                                            gan.nomGanador.setText(creju.nombrej2.getText());
                                            nombre = jugador1.mNombrej2.getText();
                                            prueba = 2;
                                            agregarGanador(prueba);
                                            nombre = null;
                                            escribirGanadoresEnArchivo();
                                        }
                                    }
                                }
                            }
                        }
                    }
                });
            }
        }
    }

    public void rotar(VistaFicha ficha) {
        Ficha modeloFicha = ficha.getFichas();
        // Intercambiar los valores de numeroArriba y numeroAbajo
        int temp = modeloFicha.getNumeroArriba();
        modeloFicha.setNumeroArriba(modeloFicha.getNumeroAbajo());
        modeloFicha.setNumeroAbajo(temp);
        // Obtener nArriba y nAbajo de la VistaFicha
        JLabel auxArriba = ficha.getnArriba();
        JLabel auxAbajo = ficha.getnAbajo();
        // Intercambiar los iconos
        Icon iconoArriba = auxArriba.getIcon();
        Icon iconoAbajo = auxAbajo.getIcon();
        auxArriba.setIcon(iconoAbajo);
        auxAbajo.setIcon(iconoArriba);
        ficha.revalidate();
        ficha.repaint();

    }
    
    public void agregarFicha(VistaFicha ficha) {
        if (ficha != null) {
            tablero.tab.add(ficha);
            ultimaFichaAgregada = ficha;
            tablero.revalidate();
            tablero.repaint();

        }
    }
    
    public VistaFicha getUltimaFichaAgregada() {
        return ultimaFichaAgregada;
    }
    
    public void removeFichas() {
        tablero.tab.removeAll();
        ultimaFichaAgregada = null;
        tablero.revalidate();
        tablero.repaint();
    }
    
    public void agregarGanador(int prueba) {
        if (prueba == 1) {
            ganadores.add(jugador1.mNombre.getText());
        } else if (prueba == 2) {
            ganadores.add(jugador1.mNombrej2.getText());
        }
        jugador1.mNombrej2.removeAll();
        jugador1.mNombre.removeAll();
    }
    
    public void escribirGanadoresEnArchivo() {
        try {
            FileWriter archivo = new FileWriter("Nombres.txt", true);
            BufferedWriter flujo = new BufferedWriter(archivo);
            PrintWriter escribir = new PrintWriter(flujo);
            for (String ganador : ganadores) {
                escribir.println(ganador);
            }
            escribir.flush();
            escribir.close();
        } catch (IOException e) {
            System.out.println("No se puede escribir" + e.getMessage());
        }       
    }
    
    public void leer() {
        File archivo = new File("C:\\Users\\Agustin\\OneDrive\\Escritorio\\Agus\\Domino2\\Nombres.txt");
        try {
            BufferedReader leer = new BufferedReader(new FileReader(archivo));
            String linea = leer.readLine();
            while (linea != null) {
                hist.texto.append(linea + "\n");
                linea = leer.readLine();
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error Importando - " + ex);
        }
    }

    public void nombre() {
        jugador1.mNombre.setEditable(false);
        jugador1.mNombre.setEnabled(false);
        jugador1.mNombrej2.setEditable(false);
        jugador1.mNombrej2.setEnabled(false);
        jugador2.mNombrej2.setEditable(false);
        jugador2.mNombrej2.setEnabled(false);
        jugador2.mNombrej1.setEditable(false);
        jugador2.mNombrej1.setEnabled(false);

        ganador.nomGanador.setEditable(false);
        ganador.nomGanador.setEnabled(false);

        jugador1.mNombre.setText(crearJug.nombrej1.getText());
        jugador1.mNombrej2.setText(crearJug.nombrej2.getText());

        jugador2.mNombrej2.setText(crearJug.nombrej2.getText());
        jugador2.mNombrej1.setText(crearJug.nombrej1.getText());

        jugador1.mNombre.setOpaque(false);
        jugador1.mNombrej2.setOpaque(false);
        jugador2.mNombrej2.setOpaque(false);
        jugador2.mNombrej1.setOpaque(false);

        ganador.nomGanador.setOpaque(false);
    }
    
    public void mostrar() { //con esta funcion se agrega/muestra el tablero en jug2
        tablero.setSize(1410, 420);
        tablero.setLocation(0, 0);
        jug2.tablero.removeAll();
        jug2.tablero.add(tablero);
        jug2.tablero.revalidate();
        jug2.tablero.repaint();
        jug2.manoj2.setVisible(true);
        camb = 2;
    }

    public void mostrar2() { //con esta funcion se agrega/muestra el tablero en jug1
        tablero.setSize(1410, 420);
        tablero.setLocation(0, 0);
        jug1.tab.removeAll();
        jug1.tab.add(tablero);
        jug1.tab.revalidate();
        jug1.tab.repaint();
        jug1.mano.setVisible(true);
        camb = 1;
    }

    public void pantallas() {
        pantin.setTitle("Domino");
        creju.setTitle("Domino || Crear Jugadores");
        jug1.setTitle("Domino || Jugador 1");
        jug2.setTitle("Domino || Jugador 2");
        gan.setTitle("Domino || Ganador");
        pantin.setExtendedState(JFrame.MAXIMIZED_BOTH);
        creju.setExtendedState(JFrame.MAXIMIZED_BOTH);
        jug1.setExtendedState(JFrame.MAXIMIZED_BOTH);
        jug2.setExtendedState(JFrame.MAXIMIZED_BOTH);
        gan.setLocationRelativeTo(null);
        hist.setLocationRelativeTo(null);
    }

    public void botones() {
        this.pantin.btInicio.addActionListener(this);
        this.creju.btEmpezar.addActionListener(this);
        this.jug1.siguiente.addActionListener(this);
        this.jug2.siguienteJ2.addActionListener(this);
        this.jug1.rendirse.addActionListener(this);
        this.jug2.rendirseJ2.addActionListener(this);
        this.gan.jugarNuevo.addActionListener(this);
        this.gan.cerrarJug.addActionListener(this);
        this.gan.ganadores.addActionListener(this);
        this.hist.cerrarJug.addActionListener(this);
        this.hist.jugarNuevoGan.addActionListener(this);
    }

    public void limpiarVista() {
        limpiarManos();
        removeFichas();
        agregarFichas();
        cont = 0;
        camb = 0;
        contFiju1 = 0;
        contFiju2 = 0;
        prueba = 0;
        nombre = null;
        limpiarBotones();
        agregarEventoFicha();
    }

    public void limpiarBotones() {
        jug1.rendirse.removeActionListener(this);
        jug1.siguiente.removeActionListener(this);
        jug2.rendirseJ2.removeActionListener(this);
        jug2.siguienteJ2.removeActionListener(this);
        gan.cerrarJug.removeActionListener(this);
        gan.ganadores.removeActionListener(this);
        hist.cerrarJug.removeActionListener(this);
        hist.jugarNuevoGan.removeActionListener(this);
    }

    public void limpiarManos() {
        for (JPanel p : fichas) {
            p.removeAll();
        }
    }

    public void agregarFichas() {
        for (int i = 0; i < 28; i++) {
            Ficha ficha = modelo.getBaraja().get(i); // Obtener la ficha de la baraja
            VistaFicha vistaFicha = new VistaFicha(ficha); // Crear la VistaFicha correspondiente
            fichasVista[i] = vistaFicha;
            vistaFicha.setFichas(ficha);
            fichas[i].add(vistaFicha);
        }

    }
}
