package chicasmagicas.igu;

public final class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
        transparencia();
    }
   
    @SuppressWarnings("unchecked")
    
    public void transparencia() {
    jButton1.setBackground(new java.awt.Color(255, 221, 188, 220));
    jButton1.setOpaque(true);
    jButton1.setContentAreaFilled(true);
    jButton1.setBorderPainted(false);

    jButton2.setBackground(new java.awt.Color(255, 221, 188, 220));
    jButton2.setOpaque(true);
    jButton2.setContentAreaFilled(true);
    jButton2.setBorderPainted(false);
    
    
    jButton3.setBackground(new java.awt.Color(255, 221, 188, 220));
    jButton3.setOpaque(true);
    jButton3.setContentAreaFilled(true);
    jButton3.setBorderPainted(false);
}

    
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jButton1.setBackground(new java.awt.Color(255, 221, 188));
        jButton1.setForeground(new java.awt.Color(102, 102, 102));
        jButton1.setText("CREA TU CHICA");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(330, 150, 216, 66);

        jButton2.setBackground(new java.awt.Color(255, 221, 188));
        jButton2.setText("VER DATOS");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(330, 280, 216, 66);

        jButton3.setBackground(new java.awt.Color(255, 221, 188));
        jButton3.setText("SALIR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(330, 420, 216, 66);

        jLabel1.setFont(new java.awt.Font("Old English Text MT", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Chicas Magicas");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(320, 10, 240, 80);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo-Inicial.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 0, 750, 680);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        CargarDatos pantalla = new CargarDatos();
        pantalla.setVisible(true); //lo hace visible
        pantalla.setLocationRelativeTo(null);//lo centra

    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
