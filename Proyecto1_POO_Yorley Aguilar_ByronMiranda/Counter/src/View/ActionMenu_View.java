package View;

/**
 *
 * @author YorleydeMaría
 */
public class ActionMenu_View extends javax.swing.JFrame {

    public ActionMenu_View() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_ActionMenu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btn_AdminClients = new javax.swing.JButton();
        btn_AdminCounter = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel_ActionMenu.setBackground(new java.awt.Color(255, 204, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Seleccione la acción que desea realizar");

        btn_AdminClients.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_AdminClients.setText("Administrar Clientes");
        btn_AdminClients.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AdminClientsActionPerformed(evt);
            }
        });

        btn_AdminCounter.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_AdminCounter.setText("Administrar Counter");
        btn_AdminCounter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AdminCounterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_ActionMenuLayout = new javax.swing.GroupLayout(panel_ActionMenu);
        panel_ActionMenu.setLayout(panel_ActionMenuLayout);
        panel_ActionMenuLayout.setHorizontalGroup(
            panel_ActionMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_ActionMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(15, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_ActionMenuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel_ActionMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_AdminClients)
                    .addComponent(btn_AdminCounter))
                .addGap(77, 77, 77))
        );
        panel_ActionMenuLayout.setVerticalGroup(
            panel_ActionMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_ActionMenuLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(50, 50, 50)
                .addComponent(btn_AdminClients)
                .addGap(57, 57, 57)
                .addComponent(btn_AdminCounter)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_ActionMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_ActionMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_AdminClientsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AdminClientsActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new ClientView().setVisible(true);
    }//GEN-LAST:event_btn_AdminClientsActionPerformed

    private void btn_AdminCounterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AdminCounterActionPerformed
        // TODO add your handling code here:
//        this.setVisible(false);
        this.dispose();
        new CounterView().setVisible(true);
    }//GEN-LAST:event_btn_AdminCounterActionPerformed

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
            java.util.logging.Logger.getLogger(ActionMenu_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ActionMenu_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ActionMenu_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ActionMenu_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ActionMenu_View().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_AdminClients;
    private javax.swing.JButton btn_AdminCounter;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel panel_ActionMenu;
    // End of variables declaration//GEN-END:variables
}
