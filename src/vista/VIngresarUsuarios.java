/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import logica.LEncriptar;

/**
 *
 * @author cata
 */
public class VIngresarUsuarios extends javax.swing.JFrame {

    /**
     * @return the CmbPreguntas
     */
    public static javax.swing.JComboBox getCmbPreguntas() {
        return CmbPreguntas;
    }

    /**
     * @param aCmbPreguntas the CmbPreguntas to set
     */
    public static void setCmbPreguntas(javax.swing.JComboBox aCmbPreguntas) {
        CmbPreguntas = aCmbPreguntas;
    }

    /**
     * @return the TxtContraseña
     */
    public static javax.swing.JTextField getTxtContraseña() {
        return TxtContraseña;
    }

    /**
     * @param aTxtContraseña the TxtContraseña to set
     */
    public static void setTxtContraseña(javax.swing.JTextField aTxtContraseña) {
        TxtContraseña = aTxtContraseña;
    }

    /**
     * @return the TxtNombres
     */
    public static javax.swing.JTextField getTxtNombres() {
        return TxtNombres;
    }

    /**
     * @param aTxtNombres the TxtNombres to set
     */
    public static void setTxtNombres(javax.swing.JTextField aTxtNombres) {
        TxtNombres = aTxtNombres;
    }

    /**
     * @return the TxtRespuesta
     */
    public static javax.swing.JTextField getTxtRespuesta() {
        return TxtRespuesta;
    }

    /**
     * @param aTxtRespuesta the TxtRespuesta to set
     */
    public static void setTxtRespuesta(javax.swing.JTextField aTxtRespuesta) {
        TxtRespuesta = aTxtRespuesta;
    }

    /**
     * @return the TxtUsuario
     */
    public static javax.swing.JTextField getTxtUsuario() {
        return TxtUsuario;
    }

    /**
     * @param aTxtUsuario the TxtUsuario to set
     */
    public static void setTxtUsuario(javax.swing.JTextField aTxtUsuario) {
        TxtUsuario = aTxtUsuario;
    }

    /**
     * Creates new form VIngresarUsuarios
     */
    public VIngresarUsuarios() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        TxtUsuario = new javax.swing.JTextField();
        TxtNombres = new javax.swing.JTextField();
        TxtContraseña = new javax.swing.JTextField();
        TxtRespuesta = new javax.swing.JTextField();
        CmbPreguntas = new javax.swing.JComboBox();
        LblUsuario = new javax.swing.JLabel();
        LblNombres = new javax.swing.JLabel();
        LblContraseña = new javax.swing.JLabel();
        LblPregunta = new javax.swing.JLabel();
        LblRespuesta = new javax.swing.JLabel();
        BtnRegistrar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TxtContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtContraseñaActionPerformed(evt);
            }
        });

        CmbPreguntas.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione", "Primer nombre de su mamá", "Nombre de su primer mascota", "Animal favorito", "Nombre de su padrino de bautizo", "Comida favotita" }));

        LblUsuario.setText("Ingrese el usuario");

        LblNombres.setText("Nombres y apellidos");

        LblContraseña.setText("Contraseña");

        LblPregunta.setText("Seleccione una pregunta de seguridad");

        LblRespuesta.setText("Respuesta");

        BtnRegistrar.setText("REGISTRAR");
        BtnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegistrarActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/IMAGEN CDI.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Ravie", 0, 24)); // NOI18N
        jLabel1.setText("REGISTRAR");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LblNombres)
                            .addComponent(LblRespuesta)
                            .addComponent(TxtRespuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CmbPreguntas, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LblPregunta)
                            .addComponent(TxtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LblContraseña)
                            .addComponent(TxtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LblUsuario))))
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BtnRegistrar)
                .addGap(86, 86, 86))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LblUsuario)
                .addGap(12, 12, 12)
                .addComponent(TxtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LblNombres)
                .addGap(18, 18, 18)
                .addComponent(TxtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LblContraseña)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TxtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LblPregunta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CmbPreguntas, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LblRespuesta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxtRespuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BtnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegistrarActionPerformed
      String preg=""+getCmbPreguntas().getSelectedIndex();
        datos.DUsuario.InsertarUsuario(getTxtUsuario().getText(),getTxtNombres().getText(), logica.LEncriptar.Encriptar(getTxtContraseña().getText()), preg ,logica.LEncriptar.Encriptar( getTxtRespuesta().getText()));
        logica.LUsuario.LimpiarCampos();
        ManejadorDePantalla.AbrirLogin();
        ManejadorDePantalla.CerrarPantallaIngresarUsuario();
    }//GEN-LAST:event_BtnRegistrarActionPerformed

    private void TxtContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtContraseñaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VIngresarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VIngresarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VIngresarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VIngresarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VIngresarUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnRegistrar;
    public static javax.swing.JComboBox CmbPreguntas;
    private javax.swing.JLabel LblContraseña;
    private javax.swing.JLabel LblNombres;
    private javax.swing.JLabel LblPregunta;
    private javax.swing.JLabel LblRespuesta;
    private javax.swing.JLabel LblUsuario;
    public static javax.swing.JTextField TxtContraseña;
    public static javax.swing.JTextField TxtNombres;
    public static javax.swing.JTextField TxtRespuesta;
    public static javax.swing.JTextField TxtUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
