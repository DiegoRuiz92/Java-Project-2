
public class frmPrincipal extends javax.swing.JFrame {

   
    public frmPrincipal() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuPersonas = new javax.swing.JMenuItem();
        menuContagiados = new javax.swing.JMenuItem();
        item = new javax.swing.JMenu();
        menuInformacion = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Panel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Panel.setPreferredSize(new java.awt.Dimension(900, 600));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("REGISTRO DE INGRESO DE PERSONAS");

        jPanel1.setBackground(new java.awt.Color(0, 0, 255));
        jPanel1.setForeground(new java.awt.Color(51, 51, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setText("Protocolo de Bioseguridad Covid - 19");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Seleccione las opciones en la esquina superior izquierda para continuar");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/41c5e8bd74df4a1314c48c81d2dfe243-covid-19-icono-de-trazo-desinfectante-para-manos-que-se-lava.png"))); // NOI18N

        Panel.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Panel.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Panel.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Panel.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Panel.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGap(229, 229, 229)
                        .addComponent(jLabel2))
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGap(259, 259, 259)
                        .addComponent(jLabel4))
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))))
                .addContainerGap(143, Short.MAX_VALUE))
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel1)
                .addGap(62, 62, 62)
                .addComponent(jLabel2)
                .addGap(47, 47, 47)
                .addComponent(jLabel3)
                .addGap(50, 50, 50)
                .addComponent(jLabel4)
                .addContainerGap(58, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jMenu1.setText("Registro de Ingreso de Personas");

        menuPersonas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/users.png"))); // NOI18N
        menuPersonas.setText("Registro Personas");
        menuPersonas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPersonasActionPerformed(evt);
            }
        });
        jMenu1.add(menuPersonas);

        menuContagiados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/enfermo.png"))); // NOI18N
        menuContagiados.setText("Personas Contagiadas");
        menuContagiados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuContagiadosActionPerformed(evt);
            }
        });
        jMenu1.add(menuContagiados);

        jMenuBar1.add(jMenu1);

        item.setText("Acerca de");

        menuInformacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/bombilla.png"))); // NOI18N
        menuInformacion.setText("Información Covid-19");
        menuInformacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuInformacionActionPerformed(evt);
            }
        });
        item.add(menuInformacion);

        jMenuBar1.add(item);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, 807, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuPersonasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPersonasActionPerformed
        frmPersona fp = new frmPersona();
        Panel.add(fp);
        fp.setVisible(true);
    }//GEN-LAST:event_menuPersonasActionPerformed

    private void menuContagiadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuContagiadosActionPerformed
        frmPersonaRiesgo fpr = new frmPersonaRiesgo();
        Panel.add(fpr);
        fpr.setVisible(true);
    }//GEN-LAST:event_menuContagiadosActionPerformed

    private void menuInformacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuInformacionActionPerformed
        frmInformacion fi = new frmInformacion();
        Panel.add(fi);
        fi.setVisible(true);
    }//GEN-LAST:event_menuInformacionActionPerformed


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
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Panel;
    private javax.swing.JMenu item;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem menuContagiados;
    private javax.swing.JMenuItem menuInformacion;
    private javax.swing.JMenuItem menuPersonas;
    // End of variables declaration//GEN-END:variables
}
