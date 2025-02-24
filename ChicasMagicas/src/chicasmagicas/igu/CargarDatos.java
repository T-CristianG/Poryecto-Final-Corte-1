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
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Old English Text MT", 0, 48)); // NOI18N
        jLabel1.setText("Crea Tu Chica");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(180, 30, 370, 40);

        jLabel3.setText("NOMBRE DE LA CHICA");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(76, 115, 122, 16);

        jLabel4.setText("EDAD");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(80, 180, 122, 16);

        jLabel5.setText("DESCRIPCION");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(80, 390, 90, 30);

        jLabel6.setText("ESTADO ACTUAL");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(76, 275, 90, 16);

        txtedad.setBackground(new java.awt.Color(255, 221, 188));
        txtedad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtedadActionPerformed(evt);
            }
        });
        getContentPane().add(txtedad);
        txtedad.setBounds(218, 176, 277, 20);

        txtestadoactual.setBackground(new java.awt.Color(255, 221, 188));
        txtestadoactual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtestadoactualActionPerformed(evt);
            }
        });
        getContentPane().add(txtestadoactual);
        txtestadoactual.setBounds(218, 271, 277, 20);

        txtnombredelachica.setBackground(new java.awt.Color(255, 221, 188));
        txtnombredelachica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombredelachicaActionPerformed(evt);
            }
        });
        getContentPane().add(txtnombredelachica);
        txtnombredelachica.setBounds(218, 115, 277, 20);

        txtciudaddeorigen.setBackground(new java.awt.Color(255, 221, 188));
        txtciudaddeorigen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtciudaddeorigenActionPerformed(evt);
            }
        });
        getContentPane().add(txtciudaddeorigen);
        txtciudaddeorigen.setBounds(218, 222, 277, 20);

        txtdescripciondelpersonaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdescripciondelpersonajeActionPerformed(evt);
            }
        });
        getContentPane().add(txtdescripciondelpersonaje);
        txtdescripciondelpersonaje.setBounds(220, 390, 277, 90);

        btnGuardar.setBackground(new java.awt.Color(255, 221, 188));
        btnGuardar.setText("GUARDAR");
        getContentPane().add(btnGuardar);
        btnGuardar.setBounds(348, 490, 181, 49);

        btnLimpiar.setBackground(new java.awt.Color(255, 221, 188));
        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpiar);
        btnLimpiar.setBounds(76, 490, 181, 49);

        jLabel8.setText("CREADOR");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(76, 321, 53, 16);

        txtusuario.setBackground(new java.awt.Color(255, 221, 188));
        txtusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusuarioActionPerformed(evt);
            }
        });
        getContentPane().add(txtusuario);
        txtusuario.setBounds(218, 321, 277, 20);

        jLabel9.setText("CORREO");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(76, 359, 46, 16);

        txtcorreo.setBackground(new java.awt.Color(255, 221, 188));
        txtcorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcorreoActionPerformed(evt);
            }
        });
        getContentPane().add(txtcorreo);
        txtcorreo.setBounds(218, 359, 277, 20);

        jLabel10.setText("CIUDAD DE ORIGEN");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(76, 222, 105, 16);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo-Formulario.png"))); // NOI18N
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel7);
        jLabel7.setBounds(10, 10, 610, 560);

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
