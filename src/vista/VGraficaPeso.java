/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;


import logica.LVgraficaPeso;




/**
 *
 * @author Usuario
 */
public class VGraficaPeso extends javax.swing.JFrame {

    /**
     * @return the panelLinea
     */
    public static javax.swing.JPanel getPanelLinea() {
        return panelLinea;
    }

    /**
     * @param aPanelLinea the panelLinea to set
     */
    public static void setPanelLinea(javax.swing.JPanel aPanelLinea) {
        panelLinea = aPanelLinea;
    }

    /**
     * @return the jTable1
     */
    public static javax.swing.JTable getjTable1() {
        return getTpeso();
    }

    /**
     * @param ajTable1 the jTable1 to set
     */
    public static void setjTable1(javax.swing.JTable ajTable1) {
        setTpeso(ajTable1);
    }

    /**
     * @return the Tpeso
     */
    public static javax.swing.JTable getTpeso() {
        return Tpeso;
    }

    /**
     * @param aTpeso the Tpeso to set
     */
    public static void setTpeso(javax.swing.JTable aTpeso) {
        Tpeso = aTpeso;
    }

    /**
     * @return the txtCODE
     */
    public static javax.swing.JTextField getTxtCODE() {
        return txtCODE;
    }

    /**
     * @param aTxtCODE the txtCODE to set
     */
    public static void setTxtCODE(javax.swing.JTextField aTxtCODE) {
        txtCODE = aTxtCODE;
    }

    /**
     * Creates new form Graficas
     */
    public VGraficaPeso() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tpeso = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jRLinea = new javax.swing.JRadioButton();
        jButton2 = new javax.swing.JButton();
        txtCODE = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        capa = new javax.swing.JLayeredPane();
        panelLinea = new javax.swing.JPanel();
        panelBarras = new javax.swing.JPanel();
        panelTorta = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Tpeso.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "mes", "peso"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        Tpeso.setEnabled(false);
        jScrollPane1.setViewportView(Tpeso);

        jButton1.setText("Graficar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRLinea);
        jRLinea.setText("Linea");
        jRLinea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRLineaActionPerformed(evt);
            }
        });

        jButton2.setText("Buscar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setText("codigo del estudiante");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(txtCODE, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton2))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(22, 22, 22)
                            .addComponent(jRLinea)
                            .addGap(156, 156, 156)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRLinea)
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(txtCODE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        capa.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        panelLinea.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("linea")));

        javax.swing.GroupLayout panelLineaLayout = new javax.swing.GroupLayout(panelLinea);
        panelLinea.setLayout(panelLineaLayout);
        panelLineaLayout.setHorizontalGroup(
            panelLineaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 427, Short.MAX_VALUE)
        );
        panelLineaLayout.setVerticalGroup(
            panelLineaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 417, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelBarrasLayout = new javax.swing.GroupLayout(panelBarras);
        panelBarras.setLayout(panelBarrasLayout);
        panelBarrasLayout.setHorizontalGroup(
            panelBarrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 418, Short.MAX_VALUE)
        );
        panelBarrasLayout.setVerticalGroup(
            panelBarrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelTortaLayout = new javax.swing.GroupLayout(panelTorta);
        panelTorta.setLayout(panelTortaLayout);
        panelTortaLayout.setHorizontalGroup(
            panelTortaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 418, Short.MAX_VALUE)
        );
        panelTortaLayout.setVerticalGroup(
            panelTortaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
        );

        capa.setLayer(panelLinea, javax.swing.JLayeredPane.DEFAULT_LAYER);
        capa.setLayer(panelBarras, javax.swing.JLayeredPane.DEFAULT_LAYER);
        capa.setLayer(panelTorta, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout capaLayout = new javax.swing.GroupLayout(capa);
        capa.setLayout(capaLayout);
        capaLayout.setHorizontalGroup(
            capaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelLinea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(capaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panelBarras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(capaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panelTorta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        capaLayout.setVerticalGroup(
            capaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelLinea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(capaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panelBarras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(capaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panelTorta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(capa))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(capa)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRLineaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRLineaActionPerformed
      
        VGraficaPeso.getPanelLinea().setVisible(true);
        getCapa().setLayer(getPanelLinea(),0,0);
  
       
        this.getPanelBarras().setVisible(false);
        this.getPanelTorta().setVisible(false);
       
        
        
        
    }//GEN-LAST:event_jRLineaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    
        
        
        logica.LGraficapeso.logicaBtnGraficar(getjRLinea());
        
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        String cod;
        
        if(getTxtCODE().getText().equals("")){
        
        cod= "";
        }
        else{
            cod=getTxtCODE().getText();
            
        
        }
    
        LVgraficaPeso.logicabtnbuscar(cod);
       
        
       
      


        
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(VGraficaPeso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VGraficaPeso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VGraficaPeso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VGraficaPeso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VGraficaPeso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTable Tpeso;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLayeredPane capa;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRLinea;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelBarras;
    private static javax.swing.JPanel panelLinea;
    private javax.swing.JPanel panelTorta;
    public static javax.swing.JTextField txtCODE;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the buttonGroup1
     */
    public javax.swing.ButtonGroup getButtonGroup1() {
        return buttonGroup1;
    }

    /**
     * @param buttonGroup1 the buttonGroup1 to set
     */
    public void setButtonGroup1(javax.swing.ButtonGroup buttonGroup1) {
        this.buttonGroup1 = buttonGroup1;
    }

    /**
     * @return the capa
     */
    public javax.swing.JLayeredPane getCapa() {
        return capa;
    }

    /**
     * @param capa the capa to set
     */
    public void setCapa(javax.swing.JLayeredPane capa) {
        this.capa = capa;
    }

    /**
     * @return the jButton1
     */
    public javax.swing.JButton getjButton1() {
        return jButton1;
    }

    /**
     * @param jButton1 the jButton1 to set
     */
    public void setjButton1(javax.swing.JButton jButton1) {
        this.jButton1 = jButton1;
    }

    /**
     * @return the jPanel1
     */
    public javax.swing.JPanel getjPanel1() {
        return jPanel1;
    }

    /**
     * @param jPanel1 the jPanel1 to set
     */
    public void setjPanel1(javax.swing.JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

 

    /**
     * @return the jRLinea
     */
    public javax.swing.JRadioButton getjRLinea() {
        return jRLinea;
    }

    /**
     * @param jRLinea the jRLinea to set
     */
    public void setjRLinea(javax.swing.JRadioButton jRLinea) {
        this.jRLinea = jRLinea;
    }

   
    /**
     * @return the jScrollPane1
     */
    public javax.swing.JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    /**
     * @param jScrollPane1 the jScrollPane1 to set
     */
    public void setjScrollPane1(javax.swing.JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    /**
     * @return the panelBarras
     */
    public javax.swing.JPanel getPanelBarras() {
        return panelBarras;
    }

    /**
     * @param panelBarras the panelBarras to set
     */
    public void setPanelBarras(javax.swing.JPanel panelBarras) {
        this.panelBarras = panelBarras;
    }

    /**
     * @return the panelTorta
     */
    public javax.swing.JPanel getPanelTorta() {
        return panelTorta;
    }

    /**
     * @param panelTorta the panelTorta to set
     */
    public void setPanelTorta(javax.swing.JPanel panelTorta) {
        this.panelTorta = panelTorta;
    }
}
