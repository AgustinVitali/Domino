package vista;

public class crearJug extends javax.swing.JFrame {

    public crearJug() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jugador2 = new javax.swing.JLabel();
        jugador1 = new javax.swing.JLabel();
        nombrej2 = new javax.swing.JTextField();
        nombrej1 = new javax.swing.JTextField();
        txtnombrej2 = new javax.swing.JLabel();
        txtnombrej1 = new javax.swing.JLabel();
        txtsexoj1 = new javax.swing.JLabel();
        sexoj1 = new javax.swing.JComboBox<>();
        txtsexoj2 = new javax.swing.JLabel();
        sexoj2 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        btEmpezar = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1411, 736));

        jPanel2.setMaximumSize(new java.awt.Dimension(741, 490));
        jPanel2.setMinimumSize(new java.awt.Dimension(0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jugador2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jugador2.setForeground(new java.awt.Color(0, 0, 0));
        jugador2.setText("Jugador 2");
        jPanel2.add(jugador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 90, -1, -1));

        jugador1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jugador1.setForeground(new java.awt.Color(0, 0, 0));
        jugador1.setText("Jugador 1");
        jPanel2.add(jugador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, -1, -1));

        nombrej2.setText("\n");
        jPanel2.add(nombrej2, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 180, 110, -1));

        nombrej1.setText(" ");
        jPanel2.add(nombrej1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, 110, -1));

        txtnombrej2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtnombrej2.setForeground(new java.awt.Color(0, 0, 0));
        txtnombrej2.setText("Nombre:");
        jPanel2.add(txtnombrej2, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 140, -1, -1));

        txtnombrej1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtnombrej1.setForeground(new java.awt.Color(0, 0, 0));
        txtnombrej1.setText("Nombre:");
        jPanel2.add(txtnombrej1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 140, -1, -1));

        txtsexoj1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtsexoj1.setForeground(new java.awt.Color(0, 0, 0));
        txtsexoj1.setText("Sexo:");
        jPanel2.add(txtsexoj1, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 230, -1, -1));

        sexoj1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino ", "Femenino", "Prefiero no decirlo" }));
        jPanel2.add(sexoj1, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 260, 110, -1));

        txtsexoj2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtsexoj2.setForeground(new java.awt.Color(0, 0, 0));
        txtsexoj2.setText("Sexo:");
        jPanel2.add(txtsexoj2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, -1, -1));

        sexoj2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino ", "Femenino", "Prefiero no decirlo" }));
        jPanel2.add(sexoj2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 260, 110, -1));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("IMPORTANTE: Debe iniciar la partida el jugador que contenga la ficha doble 6 USANDO dicha ficha");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 360, -1, -1));

        btEmpezar.setText("Guardar y Empezar");
        btEmpezar.setBorder(null);
        jPanel2.add(btEmpezar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 320, 190, 30));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Juego/Imagenes/blue-gradient-background-design-with-straight-line-texture-design-for-banner-poster-website-free-vector.jpg"))); // NOI18N
        jPanel2.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1410, 740));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 736, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btEmpezar;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jugador1;
    private javax.swing.JLabel jugador2;
    public static javax.swing.JTextField nombrej1;
    public static javax.swing.JTextField nombrej2;
    public javax.swing.JComboBox<String> sexoj1;
    public javax.swing.JComboBox<String> sexoj2;
    private javax.swing.JLabel txtnombrej1;
    private javax.swing.JLabel txtnombrej2;
    private javax.swing.JLabel txtsexoj1;
    private javax.swing.JLabel txtsexoj2;
    // End of variables declaration//GEN-END:variables
}
