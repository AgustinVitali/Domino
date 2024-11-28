package mvc;

import controlador.Controlador;
import modelo.Modelo;
import vista.Historial;
import vista.VistaTablero;
import vista.crearJug;
import vista.ganador;
import vista.jugador1;
import vista.jugador2;
import vista.pantallaInicio;
public class NewMain {

    public static void main(String[] args) {
        pantallaInicio pantin = new pantallaInicio();
        Historial hist = new Historial();
        Modelo model = new Modelo();
        crearJug creju = new crearJug();
        jugador1 jug1 = new jugador1();
        jugador2 jug2 = new jugador2();
        VistaTablero tablero = new VistaTablero();
        ganador gan = new ganador();
        Controlador ctrl = new Controlador(creju, model, pantin, jug1, jug2, tablero, gan, hist);
        ctrl.iniciar();

    }

}
