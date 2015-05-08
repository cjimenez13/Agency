package View;

import counter.Counter;
import javax.swing.JOptionPane;

/**
 *
 * @author YorleydeMaría
 */
public class Start_View extends javax.swing.JFrame {

    public Start_View() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Start_Panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btn_CreateCounter = new javax.swing.JButton();
        txt_CounterName = new javax.swing.JTextField();
        lbl_CantCounters = new javax.swing.JLabel();
        lbl_CounterName = new javax.swing.JLabel();
        lbl_CounterDirection = new javax.swing.JLabel();
        lbl_LegalID = new javax.swing.JLabel();
        txt_LegalID = new javax.swing.JTextField();
        txt_CounterDirection = new javax.swing.JTextField();
        txt_CantCounters = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Start_Panel.setBackground(new java.awt.Color(153, 153, 255));

        jLabel1.setFont(new java.awt.Font("Cooper Black", 1, 48)); // NOI18N
        jLabel1.setText("Agency Counter");

        btn_CreateCounter.setBackground(new java.awt.Color(51, 51, 255));
        btn_CreateCounter.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        btn_CreateCounter.setText("Crear Counter");
        btn_CreateCounter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CreateCounterActionPerformed(evt);
            }
        });

        lbl_CantCounters.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lbl_CantCounters.setText("Cantidad de casilleros:");

        lbl_CounterName.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lbl_CounterName.setText("Nombre:");

        lbl_CounterDirection.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lbl_CounterDirection.setText("Dirección:");

        lbl_LegalID.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lbl_LegalID.setText("Cédula Jurídica");

        javax.swing.GroupLayout Start_PanelLayout = new javax.swing.GroupLayout(Start_Panel);
        Start_Panel.setLayout(Start_PanelLayout);
        Start_PanelLayout.setHorizontalGroup(
            Start_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Start_PanelLayout.createSequentialGroup()
                .addGroup(Start_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Start_PanelLayout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(jLabel1))
                    .addGroup(Start_PanelLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(Start_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_CantCounters)
                            .addComponent(lbl_CounterDirection)
                            .addComponent(lbl_LegalID)
                            .addComponent(lbl_CounterName)))
                    .addGroup(Start_PanelLayout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addGroup(Start_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_LegalID, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_CounterName, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_CounterDirection, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_CantCounters, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(328, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Start_PanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_CreateCounter)
                .addGap(242, 242, 242))
        );
        Start_PanelLayout.setVerticalGroup(
            Start_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Start_PanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(54, 54, 54)
                .addComponent(lbl_CounterName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_CounterName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(lbl_LegalID)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_LegalID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(lbl_CantCounters)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_CantCounters, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(lbl_CounterDirection)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_CounterDirection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(btn_CreateCounter)
                .addGap(77, 77, 77))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Start_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Start_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_CreateCounterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CreateCounterActionPerformed
        if (!(txt_CounterName.getText().equals("") || txt_LegalID.getText().equals("") 
                || txt_CounterDirection.getText().equals("") || txt_CantCounters.getText().equals(""))){
            int cantCounters = Integer.valueOf(txt_CantCounters.getText());
            if (cantCounters<=0){
               JOptionPane.showMessageDialog(null, "Debe crear almenos un casillero");
           }else{
                String counterName = txt_CounterName.getText();
                long legalID = Integer.valueOf(txt_LegalID.getText());
                String counterDirection = txt_CounterDirection.getText();
                this.setVisible(false);           
                new ActionMenu_View().setVisible(true); 
                new Counter(counterName,legalID, counterDirection,cantCounters);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Ingrese todos los datos solicitados");
        }
               
    }//GEN-LAST:event_btn_CreateCounterActionPerformed

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
            java.util.logging.Logger.getLogger(Start_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Start_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Start_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Start_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Start_View().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Start_Panel;
    private javax.swing.JButton btn_CreateCounter;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbl_CantCounters;
    private javax.swing.JLabel lbl_CounterDirection;
    private javax.swing.JLabel lbl_CounterName;
    private javax.swing.JLabel lbl_LegalID;
    private javax.swing.JTextField txt_CantCounters;
    private javax.swing.JTextField txt_CounterDirection;
    private javax.swing.JTextField txt_CounterName;
    private javax.swing.JTextField txt_LegalID;
    // End of variables declaration//GEN-END:variables
}
