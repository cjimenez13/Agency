package View;

import counter.Envelope;
import counter.Magazine;
import counter.Package;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import static java.util.Arrays.asList;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author YorleydeMaría
 */
public class Costs_View extends javax.swing.JFrame {
    ArrayList<Package> _PackageList = new ArrayList<Package>();
    ArrayList<Magazine> _MagazineList = new ArrayList<Magazine>();
    ArrayList<Envelope> _EnvelopeList = new ArrayList<Envelope>();
    public Costs_View(ArrayList<Package> pPackageList, ArrayList<Magazine> pMagazineList, 
            ArrayList<Envelope> pEnvelopeList) {
        initComponents();
        lbl_Buy.setText("00000.0");
        lbl_Sell.setText("00000.0");
        showDeliveryInformation();
    }
    private void showDeliveryInformation(){
        this.panel_CostsDisplay.removeAll();
        for(int iDelivery = 0; iDelivery!= _PackageList.size(); iDelivery++){
                createLineReportPackage(_PackageList.get(iDelivery),iDelivery);
            }
            for(int iDelivery = 0; iDelivery!= _MagazineList.size(); iDelivery++){
                createLineReportMagazine(_MagazineList.get(iDelivery),iDelivery+_PackageList.size());
            }
            for(int iDelivery = 0; iDelivery!= _EnvelopeList.size(); iDelivery++){
                createLineReportEnvelope(_EnvelopeList.get(iDelivery),iDelivery+_PackageList.size()+_MagazineList.size());
            }
        this.panel_CostsDisplay.updateUI();
    }
    
    private void createLineReportPackage(Package pPackage, int iDelivery){
        String code = String.valueOf(pPackage.get_code());
        String deliveryType = "Paquete";
        String tax = String.valueOf(pPackage.get_status());
        String discount = pPackage.get_remittent();
        String totalCRC = "";
        String totalUSD = pPackage.get_description();
        String details = "";
        ArrayList<String> packageInfo = new ArrayList<>(asList(code,deliveryType,tax,discount,totalCRC,totalUSD,details));
        createLineReport(packageInfo,iDelivery);
        
    }
    private void createLineReportMagazine(Magazine pMagazine, int iDelivery){
        String code = String.valueOf(pMagazine.get_code());
        String deliveryType = "Revista";
        String tax = String.valueOf(pMagazine.get_status());
        String discount = pMagazine.get_remittent();
        String totalCRC = "";       
        String totalUSD = pMagazine.get_description();
        String details = "";
        ArrayList<String> magazineInfo = new ArrayList<>(asList(code,deliveryType,tax,discount,totalCRC,totalUSD,details));
        createLineReport(magazineInfo,iDelivery);
    }
    private void createLineReportEnvelope(Envelope pEnvelope, int iDelivery){
        String code = String.valueOf(pEnvelope.get_code());
        String deliveryType = "Sobre";
        String tax = String.valueOf(pEnvelope.get_status());
        String discount = pEnvelope.get_remittent();
        String totalCRC = "";
        String totalUSD = pEnvelope.get_description();
        String details = "";
        ArrayList<String> envelopeInfo = new ArrayList<>(asList(code,deliveryType,tax,discount,totalCRC,totalUSD,details));
        createLineReport(envelopeInfo,iDelivery);
    }
    private void createLineReport(ArrayList<String> pDeliveryInfo, int iDelivery){
        int firstMargenX = 55;
        int firstMargenY = 15;
        int widthLbl = 65;
        int heightLbl = 25;
        int spaceBetweenLblY = 20;

        JLabel lbl_code = new JLabel(pDeliveryInfo.get(0));
        JLabel lbl_deliveryType = new JLabel(pDeliveryInfo.get(1));
        JLabel lbl_tax = new JLabel(pDeliveryInfo.get(2));
        JLabel lbl_discount = new JLabel(pDeliveryInfo.get(3));
        JLabel lbl_CRC = new JLabel(pDeliveryInfo.get(4));
        JLabel lbl_USD = new JLabel(pDeliveryInfo.get(5));
        JButton btn_Details = new JButton("Detalles");                
        btn_Details.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, pDeliveryInfo.get(6));
            }
            
        });
        
        lbl_code.setBounds(firstMargenX+widthLbl*0,firstMargenY+(spaceBetweenLblY+heightLbl)*iDelivery,widthLbl,heightLbl);
        lbl_deliveryType.setBounds(firstMargenX+widthLbl*1,firstMargenY+(spaceBetweenLblY+heightLbl)*iDelivery,widthLbl,heightLbl);
        lbl_tax.setBounds(firstMargenX+widthLbl*2,firstMargenY+(spaceBetweenLblY+heightLbl)*iDelivery,widthLbl,heightLbl);
        lbl_discount.setBounds(firstMargenX+widthLbl*3,firstMargenY+(spaceBetweenLblY+heightLbl)*iDelivery,widthLbl,heightLbl);
        lbl_CRC.setBounds(firstMargenX+widthLbl*4,firstMargenY+(spaceBetweenLblY+heightLbl)*iDelivery,widthLbl,heightLbl);
        lbl_USD.setBounds(firstMargenX+widthLbl*5,firstMargenY+(spaceBetweenLblY+heightLbl)*iDelivery,widthLbl,heightLbl);
        btn_Details.setBounds(firstMargenX+widthLbl*6,firstMargenY+(spaceBetweenLblY+heightLbl)*iDelivery,widthLbl,heightLbl);                
        
        
        panel_CostsDisplay.add(lbl_code);
        panel_CostsDisplay.add(lbl_deliveryType);
        panel_CostsDisplay.add(lbl_tax);
        panel_CostsDisplay.add(lbl_discount);
        panel_CostsDisplay.add(lbl_CRC);
        panel_CostsDisplay.add(lbl_USD);
        panel_CostsDisplay.add(btn_Details);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_Costs = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        panel_CostsDisplay = new javax.swing.JPanel();
        lbl_Code = new javax.swing.JLabel();
        lbl_Type = new javax.swing.JLabel();
        lbl_Tax = new javax.swing.JLabel();
        lbl_Disscount = new javax.swing.JLabel();
        lbl_Colones = new javax.swing.JLabel();
        lbl_Dollars = new javax.swing.JLabel();
        lbl_Bill = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lbl_BuyText = new javax.swing.JLabel();
        lbl_SellText = new javax.swing.JLabel();
        lbl_Buy = new javax.swing.JLabel();
        lbl_Sell = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btn_Pay = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel_CostsDisplay.setPreferredSize(new java.awt.Dimension(634, 1000));

        javax.swing.GroupLayout panel_CostsDisplayLayout = new javax.swing.GroupLayout(panel_CostsDisplay);
        panel_CostsDisplay.setLayout(panel_CostsDisplayLayout);
        panel_CostsDisplayLayout.setHorizontalGroup(
            panel_CostsDisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 634, Short.MAX_VALUE)
        );
        panel_CostsDisplayLayout.setVerticalGroup(
            panel_CostsDisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(panel_CostsDisplay);

        lbl_Code.setText("Código");

        lbl_Type.setText("Tipo");

        lbl_Tax.setText("Impuesto");

        lbl_Disscount.setText("Descuento");

        lbl_Colones.setText("Total Colones");

        lbl_Dollars.setText("Total Dolares");

        lbl_Bill.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        lbl_Bill.setText("Facturacion");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Tipo de Cambio ");

        lbl_BuyText.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_BuyText.setText("Compra");

        lbl_SellText.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_SellText.setText("Venta");

        lbl_Buy.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_Buy.setText("00000.0");

        lbl_Sell.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_Sell.setText("00000.0");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Tipo de pago");

        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Contado", "American Express", "Visa", "Master Card" }));

        jLabel3.setText("Monto Total:");

        jLabel4.setText("000000.0");

        jLabel5.setText("$");

        jLabel6.setText("000000.0");

        jLabel7.setText("₡");

        btn_Pay.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_Pay.setText("Cobrar");

        javax.swing.GroupLayout panel_CostsLayout = new javax.swing.GroupLayout(panel_Costs);
        panel_Costs.setLayout(panel_CostsLayout);
        panel_CostsLayout.setHorizontalGroup(
            panel_CostsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_CostsLayout.createSequentialGroup()
                .addGroup(panel_CostsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_CostsLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(panel_CostsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_Bill)
                            .addGroup(panel_CostsLayout.createSequentialGroup()
                                .addGap(376, 376, 376)
                                .addGroup(panel_CostsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_BuyText)
                                    .addComponent(lbl_Buy)))))
                    .addGroup(panel_CostsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panel_CostsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panel_CostsLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(26, 26, 26)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6))
                            .addGroup(panel_CostsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panel_CostsLayout.createSequentialGroup()
                                    .addGap(15, 15, 15)
                                    .addComponent(lbl_Code)
                                    .addGap(56, 56, 56)
                                    .addComponent(lbl_Type)
                                    .addGap(69, 69, 69)
                                    .addComponent(lbl_Tax)
                                    .addGap(47, 47, 47)
                                    .addComponent(lbl_Disscount)
                                    .addGap(55, 55, 55)
                                    .addComponent(lbl_Colones)
                                    .addGap(51, 51, 51)
                                    .addComponent(lbl_Dollars))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(32, Short.MAX_VALUE))
            .addGroup(panel_CostsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_CostsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_CostsLayout.createSequentialGroup()
                        .addGap(0, 589, Short.MAX_VALUE)
                        .addGroup(panel_CostsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_SellText, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl_Sell, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(33, 33, 33))
                    .addGroup(panel_CostsLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(31, 31, 31)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_CostsLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(panel_CostsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_CostsLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(108, 108, 108))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_CostsLayout.createSequentialGroup()
                        .addComponent(btn_Pay)
                        .addContainerGap())))
        );
        panel_CostsLayout.setVerticalGroup(
            panel_CostsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_CostsLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lbl_Bill)
                .addGap(5, 5, 5)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(panel_CostsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel_CostsLayout.createSequentialGroup()
                        .addComponent(lbl_SellText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbl_Sell))
                    .addGroup(panel_CostsLayout.createSequentialGroup()
                        .addComponent(lbl_BuyText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbl_Buy)))
                .addGap(18, 18, 18)
                .addGroup(panel_CostsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Code)
                    .addComponent(lbl_Type)
                    .addComponent(lbl_Tax)
                    .addComponent(lbl_Disscount)
                    .addComponent(lbl_Colones)
                    .addComponent(lbl_Dollars))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panel_CostsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_CostsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(jLabel7))
                    .addGroup(panel_CostsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4)
                        .addComponent(jLabel5))
                    .addGroup(panel_CostsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(btn_Pay)
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(panel_Costs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(panel_Costs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Pay;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_Bill;
    private javax.swing.JLabel lbl_Buy;
    private javax.swing.JLabel lbl_BuyText;
    private javax.swing.JLabel lbl_Code;
    private javax.swing.JLabel lbl_Colones;
    private javax.swing.JLabel lbl_Disscount;
    private javax.swing.JLabel lbl_Dollars;
    private javax.swing.JLabel lbl_Sell;
    private javax.swing.JLabel lbl_SellText;
    private javax.swing.JLabel lbl_Tax;
    private javax.swing.JLabel lbl_Type;
    private javax.swing.JPanel panel_Costs;
    private javax.swing.JPanel panel_CostsDisplay;
    // End of variables declaration//GEN-END:variables
}
