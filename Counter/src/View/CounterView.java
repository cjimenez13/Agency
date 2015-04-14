package View;


import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author YorleydeMaría
 */
public class CounterView extends javax.swing.JFrame {
    Font _BasicFont = new Font("Tahoma",0,14);
    JLabel lbl_TypeContent = new JLabel("Tipo Contenido");
    JLabel lbl_Weight = new JLabel("Peso");
    JLabel lbl_isTechonology = new JLabel("Tecnologico");
    JLabel lbl_MagazineName = new JLabel("Nombre");
    JLabel lbl_MagazineTopic = new JLabel("Revista");
    JLabel lbl_isCatalog = new JLabel("Catalogo");
    JLabel lbl_TypeEnvelope = new JLabel("Tipo de sobre");
    JLabel lbl_isFrailness = new JLabel("Fragilidad");
    JTextField txt_TypeContent = new JTextField();
    JTextField txt_Weight = new JTextField();
    JTextField txt_MagazineName = new JTextField();
    JTextField txt_MagazineTopic = new JTextField();
    JTextField txt_TypeEnvelope = new JTextField();
    
    String[] isSomething = {"Si","No" }; 
    JComboBox cbox_isFrailness = new JComboBox(isSomething);
    JComboBox cbox_isTechonology = new JComboBox(isSomething);
    JComboBox cbox_isCatalog = new JComboBox(isSomething);
    

    public CounterView() {
        initComponents();
        //this.setLayout(new FlowLayout());
        cbox_isFrailness.setSelectedIndex(0);
        cbox_isTechonology.setSelectedIndex(0);
        cbox_isCatalog.setSelectedIndex(0);
        
        cbox_isFrailness.setEditable(true);
        cbox_isTechonology.setEditable(true);
        cbox_isCatalog.setEditable(true);
        
        lbl_TypeContent.setFont(_BasicFont);
        lbl_Weight.setFont(_BasicFont);
        lbl_isTechonology.setFont(_BasicFont);
        lbl_MagazineName.setFont(_BasicFont);
        lbl_MagazineTopic.setFont(_BasicFont);
        lbl_isCatalog.setFont(_BasicFont);
        lbl_TypeEnvelope.setFont(_BasicFont); 
        lbl_isFrailness.setFont(_BasicFont);
        
        panel_ReceiveDelivery.add(lbl_TypeContent);
        panel_ReceiveDelivery.add(lbl_Weight); 
        panel_ReceiveDelivery.add(lbl_isTechonology);
        panel_ReceiveDelivery.add(lbl_MagazineName); 
        panel_ReceiveDelivery.add(lbl_MagazineTopic); 
        panel_ReceiveDelivery.add(lbl_isCatalog); 
        panel_ReceiveDelivery.add(lbl_TypeEnvelope); 
        panel_ReceiveDelivery.add(lbl_isFrailness); 

        panel_ReceiveDelivery.add(txt_TypeContent); 
        panel_ReceiveDelivery.add(txt_Weight); 
        panel_ReceiveDelivery.add(txt_MagazineName); 
        panel_ReceiveDelivery.add(txt_MagazineTopic); 
        panel_ReceiveDelivery.add(txt_TypeEnvelope); 
        
        panel_ReceiveDelivery.add(cbox_isFrailness);
        panel_ReceiveDelivery.add(cbox_isTechonology);
        panel_ReceiveDelivery.add(cbox_isCatalog);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabPanel_CounterPrincipal = new javax.swing.JTabbedPane();
        panel_ReturnDelivery = new javax.swing.JPanel();
        btn_CountableReportdrop = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        panel_DropDelivery = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lbl_IDdrop = new javax.swing.JLabel();
        txt_IDdrop = new javax.swing.JTextField();
        btn_SearchClientdrop = new javax.swing.JButton();
        lbl_CodeDrop = new javax.swing.JLabel();
        lbl_StateDrop = new javax.swing.JLabel();
        lbl_RemittentDrop = new javax.swing.JLabel();
        lbl_DateDrop = new javax.swing.JLabel();
        lbl_DescriptionDrop = new javax.swing.JLabel();
        btn_DropDelivery = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        panel_ReceiveDelivery = new javax.swing.JPanel();
        lbl_Destinatary = new javax.swing.JLabel();
        txt_Destinatary = new javax.swing.JTextField();
        lbl_TypeDeliery = new javax.swing.JLabel();
        cbox_TypeReceivedArticle = new javax.swing.JComboBox();
        lbl_DescriptionRD = new javax.swing.JLabel();
        lbl_RemittentRD = new javax.swing.JLabel();
        txt_DescriptionRD = new javax.swing.JTextField();
        txt_RemittentRD = new javax.swing.JTextField();
        btn_Receive = new javax.swing.JButton();
        panel_SearchDelivery = new javax.swing.JPanel();
        jSpinner3 = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        lbl_CodeDelieveryConsult = new javax.swing.JLabel();
        lbl_TypeDeliveryConsult = new javax.swing.JLabel();
        lbl_TypeDeliveryConsult3 = new javax.swing.JLabel();
        lbl_statusDeliveryConsult = new javax.swing.JLabel();
        lbl_RemittentConsult = new javax.swing.JLabel();
        lbl_dateDelivery = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lbl_DescriptionDeliveryConsult = new javax.swing.JLabel();
        lbl_CodeDelieveryConsult1 = new javax.swing.JLabel();
        lbl_TypeDeliveryConsult1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lbl_statusDeliveryConsult1 = new javax.swing.JLabel();
        lbl_RemittentConsult1 = new javax.swing.JLabel();
        lbl_dateDelivery1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lbl_DescriptionDeliveryConsult1 = new javax.swing.JLabel();
        lbl_CodeDelieveryConsult2 = new javax.swing.JLabel();
        lbl_TypeDeliveryConsult2 = new javax.swing.JLabel();
        lbl_statusDeliveryConsult2 = new javax.swing.JLabel();
        lbl_RemittentConsult2 = new javax.swing.JLabel();
        lbl_dateDelivery2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lbl_DescriptionDeliveryConsult2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        panel_EnvelopeSDeliver = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        panel_PackagesSDeliver = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        panel_MagazineSDeliver = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lbl_TypeBuyCur = new javax.swing.JLabel();
        lbl_TypeSellCur = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jSpinner4 = new javax.swing.JSpinner();
        jScrollPane5 = new javax.swing.JScrollPane();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        lbl_Tax = new javax.swing.JLabel();
        lbl_Colones = new javax.swing.JLabel();
        lbl_Dollars = new javax.swing.JLabel();
        lbl_Disscount = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_CountableReportdrop.setText("Generar Reporte Contable");

        panel_DropDelivery.setPreferredSize(new java.awt.Dimension(580, 1000));

        javax.swing.GroupLayout panel_DropDeliveryLayout = new javax.swing.GroupLayout(panel_DropDelivery);
        panel_DropDelivery.setLayout(panel_DropDeliveryLayout);
        panel_DropDeliveryLayout.setHorizontalGroup(
            panel_DropDeliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 625, Short.MAX_VALUE)
        );
        panel_DropDeliveryLayout.setVerticalGroup(
            panel_DropDeliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(panel_DropDelivery);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Tipo");

        lbl_IDdrop.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_IDdrop.setText("Identificación");

        btn_SearchClientdrop.setText("Buscar");

        lbl_CodeDrop.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_CodeDrop.setText("Codigo");

        lbl_StateDrop.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_StateDrop.setText("Estado");

        lbl_RemittentDrop.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_RemittentDrop.setText("Remitente");

        lbl_DateDrop.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_DateDrop.setText("Fecha");

        lbl_DescriptionDrop.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_DescriptionDrop.setText("Descripción");

        btn_DropDelivery.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_DropDelivery.setText("Retirar");

        jCheckBox1.setText("Seleccionar todos los artículos");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_ReturnDeliveryLayout = new javax.swing.GroupLayout(panel_ReturnDelivery);
        panel_ReturnDelivery.setLayout(panel_ReturnDeliveryLayout);
        panel_ReturnDeliveryLayout.setHorizontalGroup(
            panel_ReturnDeliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_ReturnDeliveryLayout.createSequentialGroup()
                .addGroup(panel_ReturnDeliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_ReturnDeliveryLayout.createSequentialGroup()
                        .addGroup(panel_ReturnDeliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_ReturnDeliveryLayout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(panel_ReturnDeliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_IDdrop, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_IDdrop, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(53, 53, 53)
                                .addComponent(btn_SearchClientdrop)
                                .addGap(25, 25, 25)
                                .addComponent(btn_CountableReportdrop))
                            .addGroup(panel_ReturnDeliveryLayout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addComponent(lbl_CodeDrop)
                                .addGap(35, 35, 35)
                                .addComponent(jLabel2)
                                .addGap(35, 35, 35)
                                .addComponent(lbl_StateDrop)
                                .addGap(33, 33, 33)
                                .addComponent(lbl_RemittentDrop)
                                .addGap(36, 36, 36)
                                .addComponent(lbl_DateDrop)
                                .addGap(120, 120, 120)
                                .addComponent(lbl_DescriptionDrop)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_ReturnDeliveryLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_DropDelivery)))
                .addContainerGap())
            .addGroup(panel_ReturnDeliveryLayout.createSequentialGroup()
                .addGap(0, 33, Short.MAX_VALUE)
                .addGroup(panel_ReturnDeliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 644, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        panel_ReturnDeliveryLayout.setVerticalGroup(
            panel_ReturnDeliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_ReturnDeliveryLayout.createSequentialGroup()
                .addGroup(panel_ReturnDeliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_ReturnDeliveryLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(btn_CountableReportdrop))
                    .addGroup(panel_ReturnDeliveryLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbl_IDdrop)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel_ReturnDeliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_IDdrop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_SearchClientdrop))))
                .addGap(18, 18, 18)
                .addGroup(panel_ReturnDeliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_ReturnDeliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl_StateDrop)
                        .addComponent(lbl_RemittentDrop)
                        .addComponent(jLabel2)
                        .addComponent(lbl_CodeDrop))
                    .addGroup(panel_ReturnDeliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl_DateDrop)
                        .addComponent(lbl_DescriptionDrop)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jCheckBox1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 137, Short.MAX_VALUE)
                .addComponent(btn_DropDelivery)
                .addContainerGap())
        );

        tabPanel_CounterPrincipal.addTab("Retiro de Articulos", panel_ReturnDelivery);

        lbl_Destinatary.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_Destinatary.setText("Identificación del Destinatario");

        lbl_TypeDeliery.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_TypeDeliery.setText("Tipo de Artículo");

        cbox_TypeReceivedArticle.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "  ", "Sobre", "Paquete", "Revista" }));
        cbox_TypeReceivedArticle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbox_TypeReceivedArticleActionPerformed(evt);
            }
        });

        lbl_DescriptionRD.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_DescriptionRD.setText("Descripción");

        lbl_RemittentRD.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_RemittentRD.setText("Remitente");

        btn_Receive.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_Receive.setText("Recibir");
        btn_Receive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ReceiveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_ReceiveDeliveryLayout = new javax.swing.GroupLayout(panel_ReceiveDelivery);
        panel_ReceiveDelivery.setLayout(panel_ReceiveDeliveryLayout);
        panel_ReceiveDeliveryLayout.setHorizontalGroup(
            panel_ReceiveDeliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_ReceiveDeliveryLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(panel_ReceiveDeliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_ReceiveDeliveryLayout.createSequentialGroup()
                        .addComponent(lbl_TypeDeliery)
                        .addGap(50, 50, 50)
                        .addComponent(cbox_TypeReceivedArticle, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panel_ReceiveDeliveryLayout.createSequentialGroup()
                        .addGroup(panel_ReceiveDeliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbl_Destinatary, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_Destinatary))
                        .addGroup(panel_ReceiveDeliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_ReceiveDeliveryLayout.createSequentialGroup()
                                .addGap(89, 89, 89)
                                .addComponent(lbl_DescriptionRD))
                            .addGroup(panel_ReceiveDeliveryLayout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(txt_DescriptionRD, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                        .addGroup(panel_ReceiveDeliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_ReceiveDeliveryLayout.createSequentialGroup()
                                .addComponent(txt_RemittentRD, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_ReceiveDeliveryLayout.createSequentialGroup()
                                .addComponent(lbl_RemittentRD, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_ReceiveDeliveryLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_Receive)
                .addContainerGap())
        );
        panel_ReceiveDeliveryLayout.setVerticalGroup(
            panel_ReceiveDeliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_ReceiveDeliveryLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_ReceiveDeliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_ReceiveDeliveryLayout.createSequentialGroup()
                        .addGroup(panel_ReceiveDeliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_RemittentRD, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panel_ReceiveDeliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lbl_Destinatary)
                                .addComponent(lbl_DescriptionRD)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel_ReceiveDeliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_Destinatary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_DescriptionRD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panel_ReceiveDeliveryLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(txt_RemittentRD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(panel_ReceiveDeliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_TypeDeliery)
                    .addComponent(cbox_TypeReceivedArticle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 468, Short.MAX_VALUE)
                .addComponent(btn_Receive)
                .addContainerGap())
        );

        tabPanel_CounterPrincipal.addTab("Recepcion de  Artículos", panel_ReceiveDelivery);

        jSpinner3.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(1428968760000L), new java.util.Date(1428968760000L), null, java.util.Calendar.DAY_OF_MONTH));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Tipo de Busqueda");

        jComboBox2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Fecha de entrega", "Fecha de recibido", "Pendientes" }));

        jLabel3.setText("Fecha");

        lbl_CodeDelieveryConsult.setText("Código");

        lbl_TypeDeliveryConsult.setText("Tipo");

        lbl_TypeDeliveryConsult3.setText("Tipo Sobre");

        lbl_statusDeliveryConsult.setText("Estado");

        lbl_RemittentConsult.setText("Remitente");

        lbl_dateDelivery.setText("Fecha");

        jLabel4.setText("Tipo Contenido");

        jLabel5.setText("Peso");

        lbl_DescriptionDeliveryConsult.setText("Descripción");

        lbl_CodeDelieveryConsult1.setText("Código");

        lbl_TypeDeliveryConsult1.setText("Tipo");

        jLabel6.setText("Fragil");

        lbl_statusDeliveryConsult1.setText("Estado");

        lbl_RemittentConsult1.setText("Remitente");

        lbl_dateDelivery1.setText("Fecha");

        jLabel7.setText("Tecnológico");

        jLabel8.setText("Peso");

        lbl_DescriptionDeliveryConsult1.setText("Descripción");

        lbl_CodeDelieveryConsult2.setText("Código");

        lbl_TypeDeliveryConsult2.setText("Tipo");

        lbl_statusDeliveryConsult2.setText("Estado");

        lbl_RemittentConsult2.setText("Remitente");

        lbl_dateDelivery2.setText("Fecha");

        jLabel9.setText("Catálogo");

        jLabel10.setText("Tema");

        jLabel11.setText("Nombre");

        lbl_DescriptionDeliveryConsult2.setText("Descripción");

        panel_EnvelopeSDeliver.setPreferredSize(new java.awt.Dimension(578, 1000));

        javax.swing.GroupLayout panel_EnvelopeSDeliverLayout = new javax.swing.GroupLayout(panel_EnvelopeSDeliver);
        panel_EnvelopeSDeliver.setLayout(panel_EnvelopeSDeliverLayout);
        panel_EnvelopeSDeliverLayout.setHorizontalGroup(
            panel_EnvelopeSDeliverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 578, Short.MAX_VALUE)
        );
        panel_EnvelopeSDeliverLayout.setVerticalGroup(
            panel_EnvelopeSDeliverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );

        jScrollPane2.setViewportView(panel_EnvelopeSDeliver);

        panel_PackagesSDeliver.setPreferredSize(new java.awt.Dimension(577, 1000));

        javax.swing.GroupLayout panel_PackagesSDeliverLayout = new javax.swing.GroupLayout(panel_PackagesSDeliver);
        panel_PackagesSDeliver.setLayout(panel_PackagesSDeliverLayout);
        panel_PackagesSDeliverLayout.setHorizontalGroup(
            panel_PackagesSDeliverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 577, Short.MAX_VALUE)
        );
        panel_PackagesSDeliverLayout.setVerticalGroup(
            panel_PackagesSDeliverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );

        jScrollPane3.setViewportView(panel_PackagesSDeliver);

        panel_MagazineSDeliver.setPreferredSize(new java.awt.Dimension(577, 1000));

        javax.swing.GroupLayout panel_MagazineSDeliverLayout = new javax.swing.GroupLayout(panel_MagazineSDeliver);
        panel_MagazineSDeliver.setLayout(panel_MagazineSDeliverLayout);
        panel_MagazineSDeliverLayout.setHorizontalGroup(
            panel_MagazineSDeliverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 577, Short.MAX_VALUE)
        );
        panel_MagazineSDeliverLayout.setVerticalGroup(
            panel_MagazineSDeliverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );

        jScrollPane4.setViewportView(panel_MagazineSDeliver);

        javax.swing.GroupLayout panel_SearchDeliveryLayout = new javax.swing.GroupLayout(panel_SearchDelivery);
        panel_SearchDelivery.setLayout(panel_SearchDeliveryLayout);
        panel_SearchDeliveryLayout.setHorizontalGroup(
            panel_SearchDeliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_SearchDeliveryLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(126, 126, 126))
            .addGroup(panel_SearchDeliveryLayout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addGroup(panel_SearchDeliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_SearchDeliveryLayout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_SearchDeliveryLayout.createSequentialGroup()
                        .addGap(0, 29, Short.MAX_VALUE)
                        .addGroup(panel_SearchDeliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_SearchDeliveryLayout.createSequentialGroup()
                                .addComponent(lbl_CodeDelieveryConsult2)
                                .addGap(27, 27, 27)
                                .addComponent(lbl_TypeDeliveryConsult2)
                                .addGap(38, 38, 38)
                                .addComponent(lbl_statusDeliveryConsult2)
                                .addGap(18, 18, 18)
                                .addComponent(lbl_RemittentConsult2)
                                .addGap(27, 27, 27)
                                .addComponent(lbl_dateDelivery2)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel10)
                                .addGap(26, 26, 26)
                                .addComponent(jLabel11)
                                .addGap(59, 59, 59)
                                .addComponent(lbl_DescriptionDeliveryConsult2))
                            .addGroup(panel_SearchDeliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(panel_SearchDeliveryLayout.createSequentialGroup()
                                    .addComponent(lbl_CodeDelieveryConsult)
                                    .addGap(27, 27, 27)
                                    .addComponent(lbl_TypeDeliveryConsult)
                                    .addGap(24, 24, 24)
                                    .addComponent(lbl_TypeDeliveryConsult3)
                                    .addGap(18, 18, 18)
                                    .addComponent(lbl_statusDeliveryConsult)
                                    .addGap(14, 14, 14)
                                    .addComponent(lbl_RemittentConsult)
                                    .addGap(18, 18, 18)
                                    .addComponent(lbl_dateDelivery)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel4)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel5)
                                    .addGap(58, 58, 58)
                                    .addComponent(lbl_DescriptionDeliveryConsult))
                                .addComponent(jSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(59, 59, 59))
                    .addGroup(panel_SearchDeliveryLayout.createSequentialGroup()
                        .addGroup(panel_SearchDeliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_SearchDeliveryLayout.createSequentialGroup()
                                .addComponent(lbl_CodeDelieveryConsult1)
                                .addGap(27, 27, 27)
                                .addComponent(lbl_TypeDeliveryConsult1)
                                .addGap(27, 27, 27)
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(lbl_statusDeliveryConsult1)
                                .addGap(27, 27, 27)
                                .addComponent(lbl_RemittentConsult1)
                                .addGap(28, 28, 28)
                                .addComponent(lbl_dateDelivery1)
                                .addGap(29, 29, 29)
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8)
                                .addGap(60, 60, 60)
                                .addComponent(lbl_DescriptionDeliveryConsult1))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        panel_SearchDeliveryLayout.setVerticalGroup(
            panel_SearchDeliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_SearchDeliveryLayout.createSequentialGroup()
                .addGroup(panel_SearchDeliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_SearchDeliveryLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(panel_SearchDeliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panel_SearchDeliveryLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panel_SearchDeliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_CodeDelieveryConsult)
                    .addComponent(lbl_TypeDeliveryConsult)
                    .addComponent(lbl_statusDeliveryConsult)
                    .addComponent(lbl_RemittentConsult)
                    .addComponent(lbl_DescriptionDeliveryConsult)
                    .addComponent(lbl_dateDelivery)
                    .addComponent(lbl_TypeDeliveryConsult3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(panel_SearchDeliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_CodeDelieveryConsult1)
                    .addComponent(lbl_TypeDeliveryConsult1)
                    .addComponent(lbl_statusDeliveryConsult1)
                    .addComponent(lbl_RemittentConsult1)
                    .addComponent(lbl_dateDelivery1)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(lbl_DescriptionDeliveryConsult1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel_SearchDeliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_CodeDelieveryConsult2)
                    .addComponent(lbl_TypeDeliveryConsult2)
                    .addComponent(lbl_statusDeliveryConsult2)
                    .addComponent(lbl_RemittentConsult2)
                    .addComponent(lbl_DescriptionDeliveryConsult2)
                    .addComponent(lbl_dateDelivery2)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        tabPanel_CounterPrincipal.addTab("Búsqueda de Artículos", panel_SearchDelivery);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setText("Tipo de cambio de compra extrajera");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setText("Tipo de cambio de venta extrajera");

        lbl_TypeBuyCur.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_TypeBuyCur.setText("000000.0");

        lbl_TypeSellCur.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_TypeSellCur.setText("000000.0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_TypeSellCur)
                    .addComponent(lbl_TypeBuyCur)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13))
                .addContainerGap(349, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addComponent(lbl_TypeBuyCur)
                .addGap(29, 29, 29)
                .addComponent(jLabel13)
                .addGap(29, 29, 29)
                .addComponent(lbl_TypeSellCur)
                .addContainerGap(409, Short.MAX_VALUE))
        );

        tabPanel_CounterPrincipal.addTab("Consultar Tipo de Cambio", jPanel1);

        jLabel14.setText("Fecha");

        jSpinner4.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(1428968760000L), new java.util.Date(1428968760000L), null, java.util.Calendar.DAY_OF_MONTH));

        jLabel15.setText("Código");

        jLabel16.setText("Tipo");

        lbl_Tax.setText("Impuesto");

        lbl_Colones.setText("Total Colones");

        lbl_Dollars.setText("Total Dolares");

        lbl_Disscount.setText("Descuento");

        jLabel17.setText("Seleccionar fecha");

        jLabel18.setText("Monto Total:");

        jLabel19.setText("000000.0");

        jLabel20.setText("$");

        jLabel21.setText("₡");

        jLabel22.setText("000000.0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel17)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(38, 38, 38)
                        .addComponent(jLabel16)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(lbl_Tax)
                        .addGap(37, 37, 37)
                        .addComponent(lbl_Disscount)
                        .addGap(42, 42, 42)
                        .addComponent(lbl_Colones)
                        .addGap(43, 43, 43)
                        .addComponent(lbl_Dollars)
                        .addGap(0, 204, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jLabel14)
                                .addGap(80, 80, 80))
                            .addComponent(jSpinner4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel18)
                .addGap(26, 26, 26)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel19)
                .addGap(18, 18, 18)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel22)
                .addGap(47, 47, 47))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSpinner4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16)
                    .addComponent(lbl_Tax)
                    .addComponent(lbl_Colones)
                    .addComponent(lbl_Dollars)
                    .addComponent(lbl_Disscount))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19)
                    .addComponent(jLabel20)
                    .addComponent(jLabel22)
                    .addComponent(jLabel21))
                .addContainerGap(245, Short.MAX_VALUE))
        );

        tabPanel_CounterPrincipal.addTab("Reporte", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabPanel_CounterPrincipal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tabPanel_CounterPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clearReceiveComponents(){
        lbl_TypeContent.setVisible(false);
        lbl_Weight.setVisible(false); 
        lbl_isTechonology.setVisible(false);
        lbl_MagazineName.setVisible(false); 
        lbl_MagazineTopic.setVisible(false); 
        lbl_isCatalog.setVisible(false); 
        lbl_TypeEnvelope.setVisible(false); 
        lbl_isFrailness.setVisible(false); 

        txt_TypeContent.setVisible(false); 
        txt_Weight.setVisible(false); 
        txt_MagazineName.setVisible(false); 
        txt_MagazineTopic.setVisible(false); 
        txt_TypeEnvelope.setVisible(false); 

        cbox_isFrailness.setVisible(false);
        cbox_isTechonology.setVisible(false);
        cbox_isCatalog.setVisible(false);
    }
    private void showPackageComponents(){
        clearReceiveComponents();
        int lbl_coordX =25;
        int lbl_coordY =150;        
        lbl_isFrailness.setBounds(lbl_coordX, lbl_coordY, 150, 25);
        lbl_isFrailness.setVisible(true);
        lbl_isTechonology.setBounds(lbl_coordX, lbl_coordY+50, 150 ,25 );
        lbl_isTechonology.setVisible(true);
        lbl_Weight.setBounds(lbl_coordX, lbl_coordY+100, 80 ,25);           
        lbl_Weight.setVisible(true);
        
        int entryComp_coodX = 150;
        int entryComp_coodY = 150;
        cbox_isFrailness.setBounds(entryComp_coodX,entryComp_coodY,50,25);
        cbox_isFrailness.setVisible(true);
        cbox_isTechonology.setBounds(entryComp_coodX,entryComp_coodY+50,50,25);
        cbox_isTechonology.setVisible(true);
        txt_Weight.setBounds(entryComp_coodX,entryComp_coodY+100,150,25);
        txt_Weight.setVisible(true);
        
        panel_ReceiveDelivery.updateUI();
    }
    private void showMagazineComponents(){
        clearReceiveComponents();
        // Labels
        int lbl_coordX =25;
        int lbl_coordY =150;
        lbl_isCatalog.setVisible(true);
        lbl_MagazineName.setVisible(true);
        lbl_MagazineTopic.setVisible(true);
        lbl_isCatalog.setBounds(lbl_coordX,lbl_coordY,100,25);
        lbl_MagazineName.setBounds(lbl_coordX,lbl_coordY+50,100,25);
        lbl_MagazineTopic.setBounds(lbl_coordX,lbl_coordY+100,100,25);
        // Componentes para ingresar informacion
        int entryComp_coodX = 150;
        int entryComp_coodY = 150;        
        cbox_isCatalog.setVisible(true);
        txt_MagazineName.setVisible(true);
        txt_MagazineTopic.setVisible(true);
        cbox_isCatalog.setBounds(entryComp_coodX,entryComp_coodY,50,25);
        txt_MagazineName.setBounds(entryComp_coodX,entryComp_coodY+50,150,25);
        txt_MagazineTopic.setBounds(entryComp_coodX,entryComp_coodY+100,150,25);
        
        panel_ReceiveDelivery.updateUI();
    }
    private void showEnvelopeComponents(){
        clearReceiveComponents();
        int lbl_coordX =25;
        int lbl_coordY =150;
        lbl_TypeEnvelope.setVisible(true);
        lbl_TypeContent.setVisible(true);
        lbl_Weight.setVisible(true);
        lbl_TypeEnvelope.setBounds(lbl_coordX,lbl_coordY,150,25);
        lbl_TypeContent.setBounds(lbl_coordX,lbl_coordY+50,150,25);
        lbl_Weight.setBounds(lbl_coordX,lbl_coordY+100,100,25);
        
        int entryComp_coodX = 150;
        int entryComp_coodY = 150;                
        txt_TypeEnvelope.setVisible(true);
        txt_TypeContent.setVisible(true);
        txt_Weight.setVisible(true);
        txt_TypeEnvelope.setBounds(entryComp_coodX,entryComp_coodY,150,25);
        txt_TypeContent.setBounds(entryComp_coodX,entryComp_coodY+50,150,25);
        txt_Weight.setBounds(entryComp_coodX,entryComp_coodY+100,150,25);
        
        panel_ReceiveDelivery.updateUI();               
    }
            
    private void cbox_TypeReceivedArticleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbox_TypeReceivedArticleActionPerformed
        // TODO add your handling code here:
        String typeArticle = cbox_TypeReceivedArticle.getSelectedItem().toString();
        if (typeArticle.equals("Paquete")){
            showPackageComponents();            
        }else if (typeArticle.equals("Sobre")){
            showEnvelopeComponents();
        }else if (typeArticle.equals("Revista")){
            showMagazineComponents();
        }else{
            clearReceiveComponents();
        }
            
    }//GEN-LAST:event_cbox_TypeReceivedArticleActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void btn_ReceiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ReceiveActionPerformed
        // TODO add your handling code here:
        if (!(txt_Destinatary.getText().equals("") ||txt_DescriptionRD.getText().equals("") 
                || txt_RemittentRD.getText().equals(""))) {
            String destinatary = txt_Destinatary.getText();
            String description = txt_DescriptionRD.getText();
            String remittent = txt_RemittentRD.getText();
            String typeArticle = cbox_TypeReceivedArticle.getSelectedItem().toString();
            if (typeArticle.equals("Paquete")){
                if (!txt_Weight.getText().equals("")){
                    boolean isFrailness = true;
                    boolean isTechnology = false;
                    int weight = Integer.valueOf(txt_Weight.getText());
                    if (cbox_isFrailness.getSelectedItem().toString().equals("No")){
                        isFrailness = false;
                    }
                    if (cbox_isTechonology.getSelectedItem().toString().equals("No")){
                        isTechnology = false;
                    }
                    ///////// Crear paquete 
                }else{
                    JOptionPane.showMessageDialog(null, "Ingrese todas los datos solicitadas");
                }             
            }else if (typeArticle.equals("Sobre")){
                if (!(txt_Weight.getText().equals("") || txt_TypeEnvelope.getText().equals("") || 
                        txt_TypeContent.getText().equals(""))){
                    int weight = Integer.valueOf(txt_Weight.getText());
                    String typeEnvelope = lbl_TypeEnvelope.getText();
                    String typeContent = lbl_TypeContent.getText();
                    ////// Crear Sobreeee
                }else{
                    JOptionPane.showMessageDialog(null, "Ingrese todas los datos solicitadas");
                }
            }else if (typeArticle.equals("Revista")){
                if (!(txt_MagazineName.getText().equals("") || txt_MagazineTopic.getText().equals(""))){
                    boolean isCatalog = true;
                    String name = txt_MagazineName.getText();
                    String topic = txt_MagazineTopic.getText();
                    if (cbox_isCatalog.getSelectedItem().toString().equals("No")){
                        isCatalog = false;
                    }
                    ////// Crea las revistas
                }else{
                    JOptionPane.showMessageDialog(null, "Ingrese todas los datos solicitadas");
                }
            }else{
                JOptionPane.showMessageDialog(null, "Porfavor seleccione una opción");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Ingrese todas los datos solicitadas");
        }
    }//GEN-LAST:event_btn_ReceiveActionPerformed

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
            java.util.logging.Logger.getLogger(CounterView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CounterView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CounterView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CounterView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CounterView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_CountableReportdrop;
    private javax.swing.JButton btn_DropDelivery;
    private javax.swing.JButton btn_Receive;
    private javax.swing.JButton btn_SearchClientdrop;
    private javax.swing.JComboBox cbox_TypeReceivedArticle;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSpinner jSpinner3;
    private javax.swing.JSpinner jSpinner4;
    private javax.swing.JLabel lbl_CodeDelieveryConsult;
    private javax.swing.JLabel lbl_CodeDelieveryConsult1;
    private javax.swing.JLabel lbl_CodeDelieveryConsult2;
    private javax.swing.JLabel lbl_CodeDrop;
    private javax.swing.JLabel lbl_Colones;
    private javax.swing.JLabel lbl_DateDrop;
    private javax.swing.JLabel lbl_DescriptionDeliveryConsult;
    private javax.swing.JLabel lbl_DescriptionDeliveryConsult1;
    private javax.swing.JLabel lbl_DescriptionDeliveryConsult2;
    private javax.swing.JLabel lbl_DescriptionDrop;
    private javax.swing.JLabel lbl_DescriptionRD;
    private javax.swing.JLabel lbl_Destinatary;
    private javax.swing.JLabel lbl_Disscount;
    private javax.swing.JLabel lbl_Dollars;
    private javax.swing.JLabel lbl_IDdrop;
    private javax.swing.JLabel lbl_RemittentConsult;
    private javax.swing.JLabel lbl_RemittentConsult1;
    private javax.swing.JLabel lbl_RemittentConsult2;
    private javax.swing.JLabel lbl_RemittentDrop;
    private javax.swing.JLabel lbl_RemittentRD;
    private javax.swing.JLabel lbl_StateDrop;
    private javax.swing.JLabel lbl_Tax;
    private javax.swing.JLabel lbl_TypeBuyCur;
    private javax.swing.JLabel lbl_TypeDeliery;
    private javax.swing.JLabel lbl_TypeDeliveryConsult;
    private javax.swing.JLabel lbl_TypeDeliveryConsult1;
    private javax.swing.JLabel lbl_TypeDeliveryConsult2;
    private javax.swing.JLabel lbl_TypeDeliveryConsult3;
    private javax.swing.JLabel lbl_TypeSellCur;
    private javax.swing.JLabel lbl_dateDelivery;
    private javax.swing.JLabel lbl_dateDelivery1;
    private javax.swing.JLabel lbl_dateDelivery2;
    private javax.swing.JLabel lbl_statusDeliveryConsult;
    private javax.swing.JLabel lbl_statusDeliveryConsult1;
    private javax.swing.JLabel lbl_statusDeliveryConsult2;
    private javax.swing.JPanel panel_DropDelivery;
    private javax.swing.JPanel panel_EnvelopeSDeliver;
    private javax.swing.JPanel panel_MagazineSDeliver;
    private javax.swing.JPanel panel_PackagesSDeliver;
    private javax.swing.JPanel panel_ReceiveDelivery;
    private javax.swing.JPanel panel_ReturnDelivery;
    private javax.swing.JPanel panel_SearchDelivery;
    private javax.swing.JTabbedPane tabPanel_CounterPrincipal;
    private javax.swing.JTextField txt_DescriptionRD;
    private javax.swing.JTextField txt_Destinatary;
    private javax.swing.JTextField txt_IDdrop;
    private javax.swing.JTextField txt_RemittentRD;
    // End of variables declaration//GEN-END:variables
}
