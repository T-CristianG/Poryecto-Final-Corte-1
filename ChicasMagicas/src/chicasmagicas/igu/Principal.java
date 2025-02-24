package chicasmagicas.igu;

public final class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
        transparencia();
    }
   
    @SuppressWarnings("unchecked")
    
    public void transparencia() {
    jButton1.setBackground(new java.awt.Color(255, 221, 188, 100));
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
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(199, 171, 126));
        jButton1.setFont(new java.awt.Font("Perpetua Titling MT", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("CREA TU CHICA");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setBorderPainted(false);
        jButton1.setFocusCycleRoot(true);
        jButton1.setFocusTraversalPolicyProvider(true);
        jButton1.setHideActionText(true);
        jButton1.setOpaque(true);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 450, 170, 50));

        jButton2.setBackground(new java.awt.Color(199, 171, 126));
        jButton2.setFont(new java.awt.Font("Perpetua Titling MT", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("VER DATOS");
        jButton2.setAutoscrolls(true);
        jButton2.setBorderPainted(false);
        jButton2.setFocusCycleRoot(true);
        jButton2.setFocusTraversalPolicyProvider(true);
        jButton2.setHideActionText(true);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 360, 170, 50));

        jButton3.setBackground(new java.awt.Color(199, 171, 126));
        jButton3.setFont(new java.awt.Font("Perpetua Titling MT", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("SALIR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 540, 170, 50));

        jLabel1.setFont(new java.awt.Font("Old English Text MT", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Chicas Magicas");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 310, 80));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo-Inicial.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 680));

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
