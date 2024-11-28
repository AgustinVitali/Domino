package vista;

public class Historial extends javax.swing.JFrame {

    public Historial() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cerrarJug = new javax.swing.JButton();
        jugarNuevoGan = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        texto = new javax.swing.JTextArea();
        Ganadores = new javax.swing.JLabel();
        cartel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jugarNuevoGan.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jugarNuevoGan.setForeground(new java.awt.Color(0, 0, 0));
        jugarNuevoGan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Juego/Imagenes/actualizar 32.png"))); // NOI18N
        jugarNuevoGan.setText("Jugar de Nuevo");
        jugarNuevoGan.setBorder(null);
        jugarNuevoGan.setContentAreaFilled(false);
        jugarNuevoGan.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jugarNuevoGan.setName(""); // NOI18N
        jugarNuevoGan.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Juego/Imagenes/actualizar 32.png"))); // NOI18N
        jugarNuevoGan.setRolloverEnabled(true);
        jugarNuevoGan.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Juego/Imagenes/actualizar 48.png"))); // NOI18N
        jugarNuevoGan.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jugarNuevoGan, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 130, 100));

        texto.setEditable(false);
        texto.setBackground(new java.awt.Color(153, 0, 0));
        texto.setColumns(20);
        texto.setFont(new java.awt.Font("Elephant", 1, 14)); // NOI18N
        texto.setForeground(new java.awt.Color(0, 0, 0));
        texto.setRows(5);
        texto.setBorder(null);
        texto.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(texto);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 240, 310));
        jPanel1.add(Ganadores, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 330, 270));

        cartel.setFont(new java.awt.Font("Elephant", 3, 36)); // NOI18N
        cartel.setForeground(new java.awt.Color(0, 0, 0));
        cartel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cartel.setText("Ganadores:");
        jPanel1.add(cartel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 250, 100));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Juego/Imagenes/red-curtains-cinema-theater-mock.jpg"))); // NOI18N
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
    private javax.swing.JLabel Ganadores;
    private javax.swing.JLabel cartel;
    public javax.swing.JButton cerrarJug;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JPanel jPanel1;
    public javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JButton jugarNuevoGan;
    public javax.swing.JTextArea texto;
    // End of variables declaration//GEN-END:variables
}
