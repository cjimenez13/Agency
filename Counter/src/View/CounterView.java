package View;

import counter.Client;
import counter.Package;
import counter.Counter;
import counter.Envelope;
import counter.Magazine;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import static java.util.Arrays.asList;
import java.util.Calendar;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author YorleydeMaría
 */
public class CounterView extends javax.swing.JFrame {
    // Variables para el panel de retiro de paquetes
    private ArrayList<CheckBox>_CheckBoxList = new ArrayList<CheckBox>();
    // Variables para el panel de recepcion de paquetes
    private Font _BasicFont = new Font("Tahoma",0,14);
    private JLabel lbl_TypeContent = new JLabel("Tipo Contenido");
    private JLabel lbl_Weight = new JLabel("Peso");
    private JLabel lbl_isTechonology = new JLabel("Tecnologico");
    private JLabel lbl_MagazineName = new JLabel("Nombre");
    private JLabel lbl_MagazineTopic = new JLabel("Revista");
    private JLabel lbl_isCatalog = new JLabel("Catalogo");
    private JLabel lbl_TypeEnvelope = new JLabel("Tipo de sobre");
    private JLabel lbl_isFrailness = new JLabel("Fragilidad");
    private JTextField txt_TypeContent = new JTextField();
    private JTextField txt_Weight = new JTextField();
    private JTextField txt_MagazineName = new JTextField();
    private JTextField txt_MagazineTopic = new JTextField();
    private JTextField txt_TypeEnvelope = new JTextField();
    private String[] isSomething = {"Si","No" }; 
    private JComboBox cbox_isFrailness = new JComboBox(isSomething);
    private JComboBox cbox_isTechonology = new JComboBox(isSomething);
    private JComboBox cbox_isCatalog = new JComboBox(isSomething);
    

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
        cbox_selectAll = new javax.swing.JCheckBox();
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
        panel_Currency = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lbl_TypeBuyCur = new javax.swing.JLabel();
        lbl_TypeSellCur = new javax.swing.JLabel();
        panel_Report = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        panel_ReportDisplay = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        lbl_Tax = new javax.swing.JLabel();
        lbl_Colones = new javax.swing.JLabel();
        lbl_Dollars = new javax.swing.JLabel();
        lbl_Disscount = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        lbl_TotalDolars = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        lbl_TotalColons = new javax.swing.JLabel();
        btn_CreateReport = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        spinner_DayReport = new javax.swing.JSpinner();
        spinner_MonthReport = new javax.swing.JSpinner();
        spinner_YearReport = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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
        btn_SearchClientdrop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SearchClientdropActionPerformed(evt);
            }
        });

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
        btn_DropDelivery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DropDeliveryActionPerformed(evt);
            }
        });

        cbox_selectAll.setText("Seleccionar todos los artículos");
        cbox_selectAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbox_selectAllActionPerformed(evt);
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
                                .addComponent(btn_SearchClientdrop))
                            .addGroup(panel_ReturnDeliveryLayout.createSequentialGroup()
                                .addGap(109, 109, 109)
                                .addComponent(lbl_CodeDrop)
                                .addGap(35, 35, 35)
                                .addComponent(jLabel2)
                                .addGap(35, 35, 35)
                                .addComponent(lbl_StateDrop)
                                .addGap(33, 33, 33)
                                .addComponent(lbl_RemittentDrop)
                                .addGap(36, 36, 36)
                                .addComponent(lbl_DateDrop)
                                .addGap(88, 88, 88)
                                .addComponent(lbl_DescriptionDrop)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_ReturnDeliveryLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_DropDelivery)))
                .addContainerGap())
            .addGroup(panel_ReturnDeliveryLayout.createSequentialGroup()
                .addGap(0, 33, Short.MAX_VALUE)
                .addGroup(panel_ReturnDeliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbox_selectAll)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 644, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        panel_ReturnDeliveryLayout.setVerticalGroup(
            panel_ReturnDeliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_ReturnDeliveryLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_IDdrop)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_ReturnDeliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_IDdrop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_SearchClientdrop))
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
                .addComponent(cbox_selectAll)
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
                .addGap(119, 119, 119))
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
                .addGroup(panel_ReceiveDeliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_TypeDeliery)
                    .addComponent(cbox_TypeReceivedArticle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 415, Short.MAX_VALUE)
                .addComponent(btn_Receive)
                .addGap(64, 64, 64))
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

        javax.swing.GroupLayout panel_CurrencyLayout = new javax.swing.GroupLayout(panel_Currency);
        panel_Currency.setLayout(panel_CurrencyLayout);
        panel_CurrencyLayout.setHorizontalGroup(
            panel_CurrencyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_CurrencyLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(panel_CurrencyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_TypeSellCur)
                    .addComponent(lbl_TypeBuyCur)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13))
                .addContainerGap(349, Short.MAX_VALUE))
        );
        panel_CurrencyLayout.setVerticalGroup(
            panel_CurrencyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_CurrencyLayout.createSequentialGroup()
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

        tabPanel_CounterPrincipal.addTab("Consultar Tipo de Cambio", panel_Currency);

        jLabel14.setText("Día");

        panel_ReportDisplay.setPreferredSize(new java.awt.Dimension(680, 1000));

        javax.swing.GroupLayout panel_ReportDisplayLayout = new javax.swing.GroupLayout(panel_ReportDisplay);
        panel_ReportDisplay.setLayout(panel_ReportDisplayLayout);
        panel_ReportDisplayLayout.setHorizontalGroup(
            panel_ReportDisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 680, Short.MAX_VALUE)
        );
        panel_ReportDisplayLayout.setVerticalGroup(
            panel_ReportDisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );

        jScrollPane5.setViewportView(panel_ReportDisplay);

        jLabel15.setText("Código");

        jLabel16.setText("Tipo");

        lbl_Tax.setText("Impuesto");

        lbl_Colones.setText("Total Colones");

        lbl_Dollars.setText("Total Dolares");

        lbl_Disscount.setText("Descuento");

        jLabel17.setText("Seleccionar fecha");

        jLabel18.setText("Monto Total:");

        lbl_TotalDolars.setText("000000.0");

        jLabel20.setText("$");

        jLabel21.setText("₡");

        lbl_TotalColons.setText("000000.0");

        btn_CreateReport.setText("Generar Reporte");
        btn_CreateReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CreateReportActionPerformed(evt);
            }
        });

        jLabel19.setText("Mes");

        jLabel22.setText("Año");

        spinner_DayReport.setModel(new javax.swing.SpinnerNumberModel(1, 1, 31, 1));

        spinner_MonthReport.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));

        spinner_YearReport.setModel(new javax.swing.SpinnerNumberModel(2015, 2015, 2030, 1));

        javax.swing.GroupLayout panel_ReportLayout = new javax.swing.GroupLayout(panel_Report);
        panel_Report.setLayout(panel_ReportLayout);
        panel_ReportLayout.setHorizontalGroup(
            panel_ReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_ReportLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5)
                .addContainerGap())
            .addGroup(panel_ReportLayout.createSequentialGroup()
                .addGroup(panel_ReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_ReportLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(panel_ReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel17)
                            .addGroup(panel_ReportLayout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addGap(38, 38, 38)
                                .addComponent(jLabel16))))
                    .addGroup(panel_ReportLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(panel_ReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(spinner_DayReport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))))
                .addGroup(panel_ReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_ReportLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(panel_ReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(spinner_MonthReport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19))
                        .addGap(222, 222, 222)
                        .addComponent(btn_CreateReport)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panel_ReportLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(panel_ReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_ReportLayout.createSequentialGroup()
                                .addGroup(panel_ReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel22)
                                    .addComponent(lbl_Tax))
                                .addGap(37, 37, 37)
                                .addComponent(lbl_Disscount)
                                .addGap(42, 42, 42)
                                .addComponent(lbl_Colones)
                                .addGap(43, 43, 43)
                                .addComponent(lbl_Dollars))
                            .addGroup(panel_ReportLayout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(spinner_YearReport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_ReportLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel18)
                .addGap(26, 26, 26)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_TotalDolars)
                .addGap(18, 18, 18)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_TotalColons)
                .addGap(47, 47, 47))
        );
        panel_ReportLayout.setVerticalGroup(
            panel_ReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_ReportLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_ReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_ReportLayout.createSequentialGroup()
                        .addComponent(btn_CreateReport)
                        .addGap(55, 55, 55)
                        .addGroup(panel_ReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16)
                            .addComponent(lbl_Tax)
                            .addComponent(lbl_Colones)
                            .addComponent(lbl_Dollars)
                            .addComponent(lbl_Disscount)))
                    .addGroup(panel_ReportLayout.createSequentialGroup()
                        .addGroup(panel_ReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(jLabel19)
                            .addComponent(jLabel22))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel_ReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spinner_DayReport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spinner_MonthReport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spinner_YearReport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panel_ReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(lbl_TotalDolars)
                    .addComponent(jLabel20)
                    .addComponent(lbl_TotalColons)
                    .addComponent(jLabel21))
                .addContainerGap(244, Short.MAX_VALUE))
        );

        tabPanel_CounterPrincipal.addTab("Reporte", panel_Report);

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

    private void btn_ReceiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ReceiveActionPerformed
        // TODO add your handling code here:
        if (!(txt_Destinatary.getText().equals("") ||txt_DescriptionRD.getText().equals("") 
                || txt_RemittentRD.getText().equals(""))) {
            int destinataryID = Integer.valueOf(txt_Destinatary.getText());
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
                    Package nPackage = new Package(false,description,remittent,0,
                            isFrailness, isTechnology,weight);
                    Counter.getInstance().saveDeliveryPackage(destinataryID, nPackage);                    
                }else{
                    JOptionPane.showMessageDialog(null, "Ingrese todas los datos solicitadas");
                }             
            }else if (typeArticle.equals("Sobre")){
                if (!(txt_Weight.getText().equals("") || txt_TypeEnvelope.getText().equals("") || 
                        txt_TypeContent.getText().equals(""))){
                    int weight = Integer.valueOf(txt_Weight.getText());
                    String typeEnvelope = lbl_TypeEnvelope.getText();
                    String typeContent = lbl_TypeContent.getText();
                    Envelope nEnvelope = new Envelope(false,description,remittent,0,
                            typeEnvelope, typeContent,weight);  
                    Counter.getInstance().saveDeliveryEnvelope(destinataryID, nEnvelope);
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
                    Magazine nMagazine = new Magazine(false,description,remittent,0,
                            name, isCatalog,topic);
                    Counter.getInstance().saveDeliveryMagazine(destinataryID, nMagazine);
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

    private void cbox_selectAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbox_selectAllActionPerformed
        // TODO add your handling code here:      
        for (int iBox = 0; iBox != _CheckBoxList.size(); iBox++){
            _CheckBoxList.get(iBox).setSelected(cbox_selectAll.isSelected());
        }
    }//GEN-LAST:event_cbox_selectAllActionPerformed

    private void btn_DropDeliveryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DropDeliveryActionPerformed
        ArrayList <Package> packageList = new ArrayList<Package>();
        ArrayList <Magazine> magazineList = new ArrayList<Magazine>();
        ArrayList <Envelope> envelopeList = new ArrayList<Envelope>();
        for (int iBox = 0; iBox != _CheckBoxList.size(); iBox++){
            if (_CheckBoxList.get(iBox).isSelected() && _CheckBoxList.get(iBox).getPackage() != null){
                packageList.add(_CheckBoxList.get(iBox).getPackage());
            }
            if (_CheckBoxList.get(iBox).isSelected() && _CheckBoxList.get(iBox).getMagazine() != null){
                magazineList.add(_CheckBoxList.get(iBox).getMagazine());
            }
            if (_CheckBoxList.get(iBox).isSelected() && _CheckBoxList.get(iBox).getEnvelope() != null){
                envelopeList.add(_CheckBoxList.get(iBox).getEnvelope());
            }
        }        
        this.setVisible(false);
        new Costs_View(packageList,magazineList,envelopeList).setVisible(true);
    }//GEN-LAST:event_btn_DropDeliveryActionPerformed

    private void btn_SearchClientdropActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SearchClientdropActionPerformed
        // TODO add your handling code here:
        panel_DropDelivery.removeAll();
        int id = Integer.valueOf(txt_IDdrop.getText());
        Client client = Counter.getInstance().getClient(id);
        if (client != null){
            ////Variables para editar el margen en el que se colocan
            ArrayList <Package> packageList = client.get_locker().DeliverPackage();
            ArrayList <Magazine> magazineList = client.get_locker().DeliverMagazine();
            ArrayList <Envelope> envelopeList = client.get_locker().DeliverEnvelope();

            for(int iDelivery = 0; iDelivery!= packageList.size(); iDelivery++){
                createLineDropPackage(packageList.get(iDelivery),iDelivery);
            }
            for(int iDelivery = 0; iDelivery!= magazineList.size(); iDelivery++){
                createLineDropMagazine(magazineList.get(iDelivery),iDelivery+packageList.size());
            }
            for(int iDelivery = 0; iDelivery!= envelopeList.size(); iDelivery++){
                createLineDropEnvelope(envelopeList.get(iDelivery),iDelivery+packageList.size()+magazineList.size());
            }

        }else{
            JOptionPane.showMessageDialog(null,"No se encontro el cliente solicitado");
        }
        panel_DropDelivery.updateUI();
    }//GEN-LAST:event_btn_SearchClientdropActionPerformed

    private void btn_CreateReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CreateReportActionPerformed
        // TODO add your handling code here:
        panel_ReportDisplay.removeAll();
        String day = spinner_DayReport.getValue().toString();
        String month = spinner_MonthReport.getValue().toString();
        String year = spinner_YearReport.getValue().toString();
        int cantDeliveries = 0;
        for (int iClient = 0; iClient != Counter.getInstance().getClient_register().size(); iClient++){
            Client client = Counter.getInstance().getClient_register().get(iClient);
            ArrayList <Package> packageList = client.get_locker().DeliverPackage();
            ArrayList <Magazine> magazineList = client.get_locker().DeliverMagazine();
            ArrayList <Envelope> envelopeList = client.get_locker().DeliverEnvelope();
            
            for(int iDelivery = 0; iDelivery!= packageList.size(); iDelivery++){
                createLineReportPackage(packageList.get(iDelivery),iDelivery+cantDeliveries);
            }
            for(int iDelivery = 0; iDelivery!= magazineList.size(); iDelivery++){
                createLineReportMagazine(magazineList.get(iDelivery),iDelivery+packageList.size()+cantDeliveries);
            }
            for(int iDelivery = 0; iDelivery!= envelopeList.size(); iDelivery++){
                createLineReportEnvelope(envelopeList.get(iDelivery),iDelivery+packageList.size()+magazineList.size()+cantDeliveries);
            }
            cantDeliveries =+ packageList.size();
            cantDeliveries =+ magazineList.size();
            cantDeliveries =+ envelopeList.size();
        }
        
        panel_ReportDisplay.updateUI();
        String totalUSD = "0000.0";
        String totalCRC = "0000.0";
        lbl_TotalDolars.setText(totalUSD);
        lbl_TotalColons.setText(totalCRC);
    }//GEN-LAST:event_btn_CreateReportActionPerformed

    private void createLineDropPackage(Package pPackage, int iDelivery){
        String code = String.valueOf(pPackage.get_code());
        String deliveryType = "Paquete";
        String isCommited = String.valueOf(pPackage.get_status());
        String remittent = pPackage.get_remittent();
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        String dateIn = dateFormat.format(pPackage.get_date().getTime()); 
        String description = pPackage.get_description();
        ArrayList<String> packageInfo = new ArrayList<>(asList(code,deliveryType,isCommited,remittent,dateIn,description));
        CheckBox checkBox = new CheckBox(pPackage,null,null);
        createLineDrop(packageInfo,iDelivery,checkBox);
        
    }
    private void createLineDropMagazine(Magazine pMagazine, int iDelivery){
        String code = String.valueOf(pMagazine.get_code());
        String deliveryType = "Revista";
        String isCommited = String.valueOf(pMagazine.get_status());
        String remittent = pMagazine.get_remittent();
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        String dateIn = dateFormat.format(pMagazine.get_date().getTime());       
        String description = pMagazine.get_description();
        ArrayList<String> magazineInfo = new ArrayList<>(asList(code,deliveryType,isCommited,remittent,dateIn,description));
        CheckBox checkBox = new CheckBox(null,null,pMagazine);
        createLineDrop(magazineInfo,iDelivery,checkBox);
    }
    private void createLineDropEnvelope(Envelope pEnvelope, int iDelivery){
        String code = String.valueOf(pEnvelope.get_code());
        String deliveryType = "Sobre";
        String isCommited = String.valueOf(pEnvelope.get_status());
        String remittent = pEnvelope.get_remittent();
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        String dateIn = dateFormat.format(pEnvelope.get_date().getTime());
        String description = pEnvelope.get_description();
        ArrayList<String> envelopeInfo = new ArrayList<>(asList(code,deliveryType,isCommited,remittent,dateIn,description));
        CheckBox checkBox = new CheckBox(null,pEnvelope,null);
        createLineDrop(envelopeInfo,iDelivery,checkBox);
    }
    private void createLineDrop(ArrayList<String> pDeliveryInfo, int iDelivery, CheckBox pCheckBox){
        int firstMargenX = 55;
        int firstMargenY = 15;
        int widthLbl = 65;
        int heightLbl = 25;
        int spaceBetweenLblY = 20;
                
        JLabel lbl_code = new JLabel(pDeliveryInfo.get(0));
        JLabel lbl_deliveryType = new JLabel(pDeliveryInfo.get(1));
        JLabel lbl_isCommited = new JLabel(pDeliveryInfo.get(2));
        JLabel lbl_Remittent = new JLabel(pDeliveryInfo.get(3));
        JLabel lbl_DateIn = new JLabel(pDeliveryInfo.get(4));
        JLabel lbl_Description = new JLabel(pDeliveryInfo.get(5));
        
        pCheckBox.setBounds(15, firstMargenY+(spaceBetweenLblY+heightLbl)*iDelivery, 25, heightLbl);
        lbl_code.setBounds(firstMargenX+widthLbl*0,firstMargenY+(spaceBetweenLblY+heightLbl)*iDelivery,widthLbl,heightLbl);
        lbl_deliveryType.setBounds(firstMargenX+widthLbl*1,firstMargenY+(spaceBetweenLblY+heightLbl)*iDelivery,widthLbl,heightLbl);
        lbl_isCommited.setBounds(firstMargenX+widthLbl*2,firstMargenY+(spaceBetweenLblY+heightLbl)*iDelivery,widthLbl,heightLbl);
        lbl_Remittent.setBounds(firstMargenX+widthLbl*3,firstMargenY+(spaceBetweenLblY+heightLbl)*iDelivery,widthLbl,heightLbl);
        lbl_DateIn.setBounds(firstMargenX+widthLbl*4,firstMargenY+(spaceBetweenLblY+heightLbl)*iDelivery,widthLbl+10,heightLbl);
        lbl_Description.setBounds(firstMargenX+widthLbl*5+50,firstMargenY+(spaceBetweenLblY+heightLbl)*iDelivery,widthLbl+70,heightLbl);
        
        _CheckBoxList.add(pCheckBox);
        panel_DropDelivery.add(pCheckBox);
        panel_DropDelivery.add(lbl_code);
        panel_DropDelivery.add(lbl_deliveryType);
        panel_DropDelivery.add(lbl_isCommited);
        panel_DropDelivery.add(lbl_Remittent);
        panel_DropDelivery.add(lbl_DateIn);
        panel_DropDelivery.add(lbl_Description);
    }
    private void createLineReportPackage(Package pPackage, int iDelivery){
        String code = String.valueOf(pPackage.get_code());
        String deliveryType = "Paquete";
        String tax = String.valueOf(Counter.getInstance().chargeIndividualPrice(pPackage.get_code(),1));
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
        
        panel_ReportDisplay.add(lbl_code);
        panel_ReportDisplay.add(lbl_deliveryType);
        panel_ReportDisplay.add(lbl_tax);
        panel_ReportDisplay.add(lbl_discount);
        panel_ReportDisplay.add(lbl_CRC);
        panel_ReportDisplay.add(lbl_USD);
        panel_ReportDisplay.add(btn_Details);
    }
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
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CounterView().setVisible(true);
            }
        });
        Counter Aerostore=new Counter("aerosostes",12313,"cwewef",100);
        //Aerostore.add_client(304900953,"Byron", "bmiranda@.com", 12345678, "paraiso cartago", "H","18/11/1995");
        Aerostore.add_client(116080577,"GOKU", "bmiranda@.com", 12345678, "paraiso cartago", "H","18/11/1995");
        //Aerostore.add_client(304900951,"Chichimara", "bmiranda@.com", 12345678, "paraiso cartago", "F","18/11/1995");
        //Aerostore.add_client(304900952,"Liryel", "bmiranda@.com", 12345678, "paraiso cartago", "H","18/11/1995");
        //Aerostore.changeType(304900952);
        Magazine deliver= new Magazine(true, "revista de cocina mediterranea", "yor",3123, "cocina mediterranea", false, "cocina");
        Aerostore.saveDeliveryMagazine(116080577, deliver);
        Package deliver1=new Package(true,"computadora mac","yorley",100,true,true,40);
        Aerostore.saveDeliveryPackage(116080577, deliver1);
        Package deliver2=new Package(true,"almohadas","yorley",14513,true,true,60);
        Aerostore.saveDeliveryPackage(116080577, deliver2);
//        Aerostore.chargeTotalPrice_InsideLocker(304900950);
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_CreateReport;
    private javax.swing.JButton btn_DropDelivery;
    private javax.swing.JButton btn_Receive;
    private javax.swing.JButton btn_SearchClientdrop;
    private javax.swing.JComboBox cbox_TypeReceivedArticle;
    private javax.swing.JCheckBox cbox_selectAll;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSpinner jSpinner3;
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
    private javax.swing.JLabel lbl_TotalColons;
    private javax.swing.JLabel lbl_TotalDolars;
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
    private javax.swing.JPanel panel_Currency;
    private javax.swing.JPanel panel_DropDelivery;
    private javax.swing.JPanel panel_EnvelopeSDeliver;
    private javax.swing.JPanel panel_MagazineSDeliver;
    private javax.swing.JPanel panel_PackagesSDeliver;
    private javax.swing.JPanel panel_ReceiveDelivery;
    private javax.swing.JPanel panel_Report;
    private javax.swing.JPanel panel_ReportDisplay;
    private javax.swing.JPanel panel_ReturnDelivery;
    private javax.swing.JPanel panel_SearchDelivery;
    private javax.swing.JSpinner spinner_DayReport;
    private javax.swing.JSpinner spinner_MonthReport;
    private javax.swing.JSpinner spinner_YearReport;
    private javax.swing.JTabbedPane tabPanel_CounterPrincipal;
    private javax.swing.JTextField txt_DescriptionRD;
    private javax.swing.JTextField txt_Destinatary;
    private javax.swing.JTextField txt_IDdrop;
    private javax.swing.JTextField txt_RemittentRD;
    // End of variables declaration//GEN-END:variables
    private class CheckBox extends JCheckBox{
        private Package _Package = null;
        private Envelope _Envelope = null;
        private Magazine _Magazine = null;
        boolean isSelected = false;
        public CheckBox(Package pPackage, Envelope pEnvelope, Magazine pMagazine){
            _Package = pPackage;
            _Envelope = pEnvelope;
            _Magazine = pMagazine;
        }
        public Package getPackage() {
            return _Package;
        }

        public void setPackage(Package _Package) {
            this._Package = _Package;
        }

        public Envelope getEnvelope() {
            return _Envelope;
        }

        public void setEnvelope(Envelope _Envelope) {
            this._Envelope = _Envelope;
        }

        public Magazine getMagazine() {
            return _Magazine;
        }

        public void setMagazine(Magazine _Magazine) {
            this._Magazine = _Magazine;
        }

        public boolean isIsSelected() {
            return isSelected;
        }

        public void setIsSelected(boolean isSelected) {
            this.isSelected = isSelected;
        }
        

        
        
    }
}
