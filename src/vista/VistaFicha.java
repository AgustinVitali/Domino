package vista;

import javax.swing.JLabel;

import modelo.Ficha;

public class VistaFicha extends javax.swing.JPanel {

    private Ficha ficha;

    public VistaFicha() {
    }

    public VistaFicha(Ficha ficha) {
        this.ficha = ficha;
        initComponents();
    }

    public Ficha getFichas() {
        return ficha;
    }

    public void setFichas(Ficha ficha) {
        this.ficha = ficha;
    }

    public JLabel getnAbajo() {
        return nAbajo;
    }

    public JLabel getnArriba() {
        return nArriba;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        nArriba = new javax.swing.JLabel();
        nAbajo = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(0, 2));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        nArriba.setBackground(new java.awt.Color(255, 0, 0));
        nArriba.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        nArriba.setForeground(new java.awt.Color(0, 0, 0));
        nArriba.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nArriba.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Juego/Imagenes/"+getFichas().getNumeroArriba()+".jpg")));
        nArriba.setPreferredSize(new java.awt.Dimension(20, 20));

        nAbajo.setBackground(new java.awt.Color(255, 255, 255));
        nAbajo.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        nAbajo.setForeground(new java.awt.Color(0, 0, 0));
        nAbajo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nAbajo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Juego/Imagenes/"+getFichas().getNumeroAbajo()+".jpg")));
        nAbajo.setPreferredSize(new java.awt.Dimension(20, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(nArriba, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(nAbajo, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nArriba, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(nAbajo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    public javax.swing.JLabel nAbajo;
    public javax.swing.JLabel nArriba;
    // End of variables declaration//GEN-END:variables

}
