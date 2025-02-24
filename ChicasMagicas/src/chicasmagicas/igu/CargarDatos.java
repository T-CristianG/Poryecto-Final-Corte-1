package chicasmagicas.igu;

public class CargarDatos extends javax.swing.JFrame {

    public CargarDatos() {
        initComponents();
    }

    public void transparencia() {
   

    btnGuardar.setBackground(new java.awt.Color(255, 221, 188, 220));
    btnGuardar.setOpaque(true);
    btnGuardar.setContentAreaFilled(true);
    btnGuardar.setBorderPainted(false);
    
    
    btnLimpiar.setBackground(new java.awt.Color(255, 221, 188, 220));
    btnLimpiar.setOpaque(true);
    btnLimpiar.setContentAreaFilled(true);
    btnLimpiar.setBorderPainted(false);
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtedad = new java.awt.TextField();
        txtestadoactual = new java.awt.TextField();
        txtnombredelachica = new java.awt.TextField();
        txtciudaddeorigen = new java.awt.TextField();
        txtdescripciondelpersonaje = new java.awt.TextField();
        btnGuardar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtusuario = new java.awt.TextField();
        jLabel9 = new javax.swing.JLabel();
        txtcorreo = new java.awt.TextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel2.setText("CREA TU CHICA MAGICA");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Old English Text MT", 0, 48)); // NOI18N
        jLabel1.setText("Crea Tu Chica");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 370, 40));

        jLabel3.setFont(new java.awt.Font("Perpetua Titling MT", 0, 12)); // NOI18N
        jLabel3.setText("NOMBRE DE LA CHICA");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, -1, -1));

        jLabel4.setFont(new java.awt.Font("Perpetua Titling MT", 0, 12)); // NOI18N
        jLabel4.setText("EDAD");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 122, -1));

        jLabel5.setFont(new java.awt.Font("Perpetua Titling MT", 0, 12)); // NOI18N
        jLabel5.setText("DESCRIPCIÓN");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 390, 90, 30));

        jLabel6.setFont(new java.awt.Font("Perpetua Titling MT", 0, 12)); // NOI18N
        jLabel6.setText("ESTADO ACTUAL");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 275, 110, -1));

        txtedad.setBackground(new java.awt.Color(199, 171, 126));
        txtedad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtedadActionPerformed(evt);
            }
        });
        getContentPane().add(txtedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 176, 277, -1));

        txtestadoactual.setBackground(new java.awt.Color(199, 171, 126));
        txtestadoactual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtestadoactualActionPerformed(evt);
            }
        });
        getContentPane().add(txtestadoactual, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 271, 277, -1));

        txtnombredelachica.setBackground(new java.awt.Color(199, 171, 126));
        txtnombredelachica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombredelachicaActionPerformed(evt);
            }
        });
        getContentPane().add(txtnombredelachica, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 115, 277, -1));

        txtciudaddeorigen.setBackground(new java.awt.Color(199, 171, 126));
        txtciudaddeorigen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtciudaddeorigenActionPerformed(evt);
            }
        });
        getContentPane().add(txtciudaddeorigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 222, 277, -1));

        txtdescripciondelpersonaje.setBackground(new java.awt.Color(199, 171, 126));
        txtdescripciondelpersonaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdescripciondelpersonajeActionPerformed(evt);
            }
        });
        getContentPane().add(txtdescripciondelpersonaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 390, 277, 90));

        btnGuardar.setBackground(new java.awt.Color(199, 171, 126));
        btnGuardar.setFont(new java.awt.Font("Perpetua Titling MT", 1, 12)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("GUARDAR");
        getContentPane().add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 510, 140, 30));

        btnLimpiar.setBackground(new java.awt.Color(199, 171, 126));
        btnLimpiar.setFont(new java.awt.Font("Perpetua Titling MT", 1, 12)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 510, 130, 30));

        jLabel8.setFont(new java.awt.Font("Perpetua Titling MT", 0, 12)); // NOI18N
        jLabel8.setText("CREADOR");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 321, 90, -1));

        txtusuario.setBackground(new java.awt.Color(199, 171, 126));
        txtusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusuarioActionPerformed(evt);
            }
        });
        getContentPane().add(txtusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 321, 277, -1));

        jLabel9.setFont(new java.awt.Font("Perpetua Titling MT", 0, 12)); // NOI18N
        jLabel9.setText("CORREO");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 359, -1, -1));

        txtcorreo.setBackground(new java.awt.Color(199, 171, 126));
        txtcorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcorreoActionPerformed(evt);
            }
        });
        getContentPane().add(txtcorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 359, 277, -1));

        jLabel10.setFont(new java.awt.Font("Perpetua Titling MT", 0, 12)); // NOI18N
        jLabel10.setText("CIUDAD DE ORIGEN");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 222, 130, -1));

        jLabel7.setFont(new java.awt.Font("Perpetua Titling MT", 0, 12)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo-Formulario.png"))); // NOI18N
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtedadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtedadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtedadActionPerformed

    private void txtestadoactualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtestadoactualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtestadoactualActionPerformed

    private void txtnombredelachicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombredelachicaActionPerformed

    }//GEN-LAST:event_txtnombredelachicaActionPerformed

    private void txtciudaddeorigenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtciudaddeorigenActionPerformed

    }//GEN-LAST:event_txtciudaddeorigenActionPerformed

    private void txtdescripciondelpersonajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdescripciondelpersonajeActionPerformed

    }//GEN-LAST:event_txtdescripciondelpersonajeActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtnombredelachica.setText("");//cambiar texto por vacio
        txtestadoactual.setText("");
        txtedad.setText("");
        txtdescripciondelpersonaje.setText("");
        txtciudaddeorigen.setText("");
        txtusuario.setText("");
        txtcorreo.setText("");
        
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void txtusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusuarioActionPerformed

    private void txtcorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcorreoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private java.awt.TextField txtciudaddeorigen;
    private java.awt.TextField txtcorreo;
    private java.awt.TextField txtdescripciondelpersonaje;
    private java.awt.TextField txtedad;
    private java.awt.TextField txtestadoactual;
    private java.awt.TextField txtnombredelachica;
    private java.awt.TextField txtusuario;
    // End of variables declaration//GEN-END:variables
}
