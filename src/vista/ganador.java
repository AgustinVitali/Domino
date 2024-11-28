package vista;

public class ganador extends javax.swing.JFrame {

    public ganador() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        nomGanador = new javax.swing.JTextField();
        cerrarJug = new javax.swing.JButton();
        jugarNuevo = new javax.swing.JButton();
        ganadores = new javax.swing.JButton();
        cartel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nomGanador.setEditable(false);
        nomGanador.setFont(new java.awt.Font("Elephant", 1, 24)); // NOI18N
        nomGanador.setForeground(new java.awt.Color(0, 0, 0));
        nomGanador.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nomGanador.setBorder(null);
        nomGanador.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jPanel1.add(nomGanador, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 590, -1));

        cerrarJug.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        cerrarJug.setForeground(new java.awt.Color(0, 0, 0));
        cerrarJug.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Juego/Imagenes/eliminar 32.png"))); // NOI18N
        cerrarJug.setText("Cerrar juego");
        cerrarJug.setBorder(null);
        cerrarJug.setContentAreaFilled(false);
        cerrarJug.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cerrarJug.setName(""); // NOI18N
        cerrarJug.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Juego/Imagenes/eliminar 32.png"))); // NOI18N
        cerrarJug.setRolloverEnabled(true);
        cerrarJug.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Juego/Imagenes/eliminar 48.png"))); // NOI18N
        cerrarJug.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(cerrarJug, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 350, 130, 110));

        jugarNuevo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jugarNuevo.setForeground(new java.awt.Color(0, 0, 0));
        jugarNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Juego/Imagenes/actualizar 32.png"))); // NOI18N
        jugarNuevo.setText("Jugar de Nuevo");
        jugarNuevo.setBorder(null);
        jugarNuevo.setContentAreaFilled(false);
        jugarNuevo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jugarNuevo.setName(""); // NOI18N
        jugarNuevo.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Juego/Imagenes/actualizar 32.png"))); // NOI18N
        jugarNuevo.setRolloverEnabled(true);
        jugarNuevo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Juego/Imagenes/actualizar 48.png"))); // NOI18N
        jugarNuevo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jugarNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 130, 100));

        ganadores.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        ganadores.setForeground(new java.awt.Color(0, 0, 0));
        ganadores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Juego/Imagenes/trofeo 32.png"))); // NOI18N
        ganadores.setText("Ganadores");
        ganadores.setBorder(null);
        ganadores.setContentAreaFilled(false);
        ganadores.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ganadores.setName(""); // NOI18N
        ganadores.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Juego/Imagenes/trofeo 32.png"))); // NOI18N
        ganadores.setRolloverEnabled(true);
        ganadores.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Juego/Imagenes/trofeo 48.png"))); // NOI18N
        ganadores.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(ganadores, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 350, 130, 100));

        cartel.setFont(new java.awt.Font("Elephant", 3, 24)); // NOI18N
        cartel.setForeground(new java.awt.Color(0, 0, 0));
        cartel.setText("Felicidades GANASTE el JUEGO:");
        jPanel1.add(cartel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 480, 100));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Juego/Imagenes/istockphoto-1339034513-612x612.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 479));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cartel;
    public javax.swing.JButton cerrarJug;
    public javax.swing.JButton ganadores;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JPanel jPanel1;
    public javax.swing.JButton jugarNuevo;
    public static javax.swing.JTextField nomGanador;
    // End of variables declaration//GEN-END:variables

}
