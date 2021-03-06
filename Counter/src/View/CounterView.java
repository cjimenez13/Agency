package View;

import counter.Client;
import counter.Package;
import counter.Counter;
import counter.Envelope;
import counter.Magazine;
import counter.WebServiceBCCR;
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
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author YorleydeMaría
 */
public class CounterView extends javax.swing.JFrame {
    // Variables para el panel de retiro de paquetes
    private ArrayList<CheckBox>_CheckBoxList = new ArrayList<>();
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
        btn_ReturnBackfromReg = new javax.swing.JButton();
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
        btn_ReturnBackfromReceive = new javax.swing.JButton();
        panel_Currency = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lbl_TypeBuyCur = new javax.swing.JLabel();
        lbl_TypeSellCur = new javax.swing.JLabel();
        btn_ConsultExchange = new javax.swing.JButton();
        btn_ReturnBackfromExchange = new javax.swing.JButton();
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
        btn_ReturnBackfromReport = new javax.swing.JButton();
        panel_SearchDelivery = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cbox_SearchD = new javax.swing.JComboBox();
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
        btn_ReturnBackfromSearch = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        spinner_DayReport1 = new javax.swing.JSpinner();
        jLabel24 = new javax.swing.JLabel();
        spinner_MonthReport1 = new javax.swing.JSpinner();
        jLabel25 = new javax.swing.JLabel();
        spinner_YearReport1 = new javax.swing.JSpinner();
        btn_Search = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        panel_ClientPendant = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btn_Regresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel_ReturnDelivery.setBackground(new java.awt.Color(255, 204, 153));

        panel_DropDelivery.setBackground(new java.awt.Color(255, 255, 204));
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

        btn_ReturnBackfromReg.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_ReturnBackfromReg.setText("Regresar");
        btn_ReturnBackfromReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ReturnBackfromRegActionPerformed(evt);
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
                        .addComponent(btn_ReturnBackfromReg)
                        .addGap(18, 18, 18)
                        .addComponent(btn_DropDelivery)))
                .addContainerGap())
            .addGroup(panel_ReturnDeliveryLayout.createSequentialGroup()
                .addGap(0, 61, Short.MAX_VALUE)
                .addGroup(panel_ReturnDeliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbox_selectAll)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 644, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(55, Short.MAX_VALUE))
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cbox_selectAll)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addGroup(panel_ReturnDeliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_DropDelivery)
                    .addComponent(btn_ReturnBackfromReg))
                .addContainerGap())
        );

        tabPanel_CounterPrincipal.addTab("Retiro de Articulos", panel_ReturnDelivery);

        panel_ReceiveDelivery.setBackground(new java.awt.Color(255, 204, 153));

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

        btn_ReturnBackfromReceive.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_ReturnBackfromReceive.setText("Regresar");
        btn_ReturnBackfromReceive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ReturnBackfromReceiveActionPerformed(evt);
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 153, Short.MAX_VALUE)
                        .addGroup(panel_ReceiveDeliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_ReceiveDeliveryLayout.createSequentialGroup()
                                .addComponent(txt_RemittentRD, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_ReceiveDeliveryLayout.createSequentialGroup()
                                .addComponent(lbl_RemittentRD, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_ReceiveDeliveryLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_ReturnBackfromReceive)
                .addGap(18, 18, 18)
                .addComponent(btn_Receive)
                .addGap(23, 23, 23))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 481, Short.MAX_VALUE)
                .addGroup(panel_ReceiveDeliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Receive)
                    .addComponent(btn_ReturnBackfromReceive))
                .addGap(56, 56, 56))
        );

        tabPanel_CounterPrincipal.addTab("Recepcion de  Artículos", panel_ReceiveDelivery);

        panel_Currency.setBackground(new java.awt.Color(255, 204, 153));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setText("Tipo de cambio de compra extrajera");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setText("Tipo de cambio de venta extrajera");

        lbl_TypeBuyCur.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_TypeBuyCur.setText("000000.0");

        lbl_TypeSellCur.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_TypeSellCur.setText("000000.0");

        btn_ConsultExchange.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_ConsultExchange.setText("Consultar");
        btn_ConsultExchange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ConsultExchangeActionPerformed(evt);
            }
        });

        btn_ReturnBackfromExchange.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_ReturnBackfromExchange.setText("Regresar");
        btn_ReturnBackfromExchange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ReturnBackfromExchangeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_CurrencyLayout = new javax.swing.GroupLayout(panel_Currency);
        panel_Currency.setLayout(panel_CurrencyLayout);
        panel_CurrencyLayout.setHorizontalGroup(
            panel_CurrencyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_CurrencyLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_ReturnBackfromExchange)
                .addGap(46, 46, 46)
                .addComponent(btn_ConsultExchange)
                .addGap(46, 46, 46))
            .addGroup(panel_CurrencyLayout.createSequentialGroup()
                .addGroup(panel_CurrencyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_CurrencyLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(panel_CurrencyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addGroup(panel_CurrencyLayout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(lbl_TypeBuyCur))))
                    .addGroup(panel_CurrencyLayout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(lbl_TypeSellCur)))
                .addContainerGap(407, Short.MAX_VALUE))
        );
        panel_CurrencyLayout.setVerticalGroup(
            panel_CurrencyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_CurrencyLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel12)
                .addGap(27, 27, 27)
                .addComponent(lbl_TypeBuyCur)
                .addGap(72, 72, 72)
                .addComponent(jLabel13)
                .addGap(43, 43, 43)
                .addComponent(lbl_TypeSellCur)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 220, Short.MAX_VALUE)
                .addGroup(panel_CurrencyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_ConsultExchange)
                    .addComponent(btn_ReturnBackfromExchange))
                .addGap(140, 140, 140))
        );

        tabPanel_CounterPrincipal.addTab("Consultar Tipo de Cambio", panel_Currency);

        panel_Report.setBackground(new java.awt.Color(255, 204, 153));

        jLabel14.setText("Día");

        panel_ReportDisplay.setBackground(new java.awt.Color(255, 255, 204));
        panel_ReportDisplay.setPreferredSize(new java.awt.Dimension(680, 1000));

        javax.swing.GroupLayout panel_ReportDisplayLayout = new javax.swing.GroupLayout(panel_ReportDisplay);
        panel_ReportDisplay.setLayout(panel_ReportDisplayLayout);
        panel_ReportDisplayLayout.setHorizontalGroup(
            panel_ReportDisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 721, Short.MAX_VALUE)
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

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setText("Seleccionar fecha");

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel18.setText("Monto Total:");

        lbl_TotalDolars.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_TotalDolars.setText("000000.0");

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel20.setText("$");

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel21.setText("₡");

        lbl_TotalColons.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_TotalColons.setText("000000.0");

        btn_CreateReport.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
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

        btn_ReturnBackfromReport.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_ReturnBackfromReport.setText("Regresar");
        btn_ReturnBackfromReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ReturnBackfromReportActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_ReportLayout = new javax.swing.GroupLayout(panel_Report);
        panel_Report.setLayout(panel_ReportLayout);
        panel_ReportLayout.setHorizontalGroup(
            panel_ReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_ReportLayout.createSequentialGroup()
                .addGroup(panel_ReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_ReportLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(panel_ReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(spinner_DayReport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14)))
                    .addGroup(panel_ReportLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(panel_ReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addGroup(panel_ReportLayout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addGap(38, 38, 38)
                                .addComponent(jLabel16)))))
                .addGroup(panel_ReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_ReportLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(panel_ReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(spinner_MonthReport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19))
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
            .addGroup(panel_ReportLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_ReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 740, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_ReportLayout.createSequentialGroup()
                        .addComponent(btn_ReturnBackfromReport)
                        .addGap(32, 32, 32)
                        .addComponent(btn_CreateReport)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_ReportLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel18)
                .addGap(22, 22, 22)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_TotalDolars)
                .addGap(18, 18, 18)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_TotalColons)
                .addGap(37, 37, 37))
        );
        panel_ReportLayout.setVerticalGroup(
            panel_ReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_ReportLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel17)
                .addGroup(panel_ReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_ReportLayout.createSequentialGroup()
                        .addGap(86, 86, 86)
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
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_ReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(lbl_TotalDolars)
                    .addComponent(jLabel20)
                    .addComponent(lbl_TotalColons)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                .addGroup(panel_ReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_ReturnBackfromReport)
                    .addComponent(btn_CreateReport))
                .addGap(19, 19, 19))
        );

        tabPanel_CounterPrincipal.addTab("Reporte", panel_Report);

        panel_SearchDelivery.setBackground(new java.awt.Color(255, 204, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Tipo de Busqueda");

        cbox_SearchD.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbox_SearchD.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "Fecha de entrega", "Fecha de recibido", "Pendientes" }));

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

        panel_EnvelopeSDeliver.setBackground(new java.awt.Color(255, 255, 204));
        panel_EnvelopeSDeliver.setPreferredSize(new java.awt.Dimension(578, 1000));

        javax.swing.GroupLayout panel_EnvelopeSDeliverLayout = new javax.swing.GroupLayout(panel_EnvelopeSDeliver);
        panel_EnvelopeSDeliver.setLayout(panel_EnvelopeSDeliverLayout);
        panel_EnvelopeSDeliverLayout.setHorizontalGroup(
            panel_EnvelopeSDeliverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 618, Short.MAX_VALUE)
        );
        panel_EnvelopeSDeliverLayout.setVerticalGroup(
            panel_EnvelopeSDeliverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );

        jScrollPane2.setViewportView(panel_EnvelopeSDeliver);

        panel_PackagesSDeliver.setBackground(new java.awt.Color(255, 255, 204));
        panel_PackagesSDeliver.setPreferredSize(new java.awt.Dimension(577, 1000));

        javax.swing.GroupLayout panel_PackagesSDeliverLayout = new javax.swing.GroupLayout(panel_PackagesSDeliver);
        panel_PackagesSDeliver.setLayout(panel_PackagesSDeliverLayout);
        panel_PackagesSDeliverLayout.setHorizontalGroup(
            panel_PackagesSDeliverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 618, Short.MAX_VALUE)
        );
        panel_PackagesSDeliverLayout.setVerticalGroup(
            panel_PackagesSDeliverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );

        jScrollPane3.setViewportView(panel_PackagesSDeliver);

        panel_MagazineSDeliver.setBackground(new java.awt.Color(255, 255, 204));
        panel_MagazineSDeliver.setPreferredSize(new java.awt.Dimension(577, 1000));

        javax.swing.GroupLayout panel_MagazineSDeliverLayout = new javax.swing.GroupLayout(panel_MagazineSDeliver);
        panel_MagazineSDeliver.setLayout(panel_MagazineSDeliverLayout);
        panel_MagazineSDeliverLayout.setHorizontalGroup(
            panel_MagazineSDeliverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 618, Short.MAX_VALUE)
        );
        panel_MagazineSDeliverLayout.setVerticalGroup(
            panel_MagazineSDeliverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );

        jScrollPane4.setViewportView(panel_MagazineSDeliver);

        btn_ReturnBackfromSearch.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_ReturnBackfromSearch.setText("Regresar");
        btn_ReturnBackfromSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ReturnBackfromSearchActionPerformed(evt);
            }
        });

        jLabel23.setText("Día");

        spinner_DayReport1.setModel(new javax.swing.SpinnerNumberModel(1, 1, 31, 1));

        jLabel24.setText("Mes");

        spinner_MonthReport1.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));

        jLabel25.setText("Año");

        spinner_YearReport1.setModel(new javax.swing.SpinnerNumberModel(2015, 2015, 2030, 1));

        btn_Search.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_Search.setText("Buscar");
        btn_Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_SearchDeliveryLayout = new javax.swing.GroupLayout(panel_SearchDelivery);
        panel_SearchDelivery.setLayout(panel_SearchDeliveryLayout);
        panel_SearchDeliveryLayout.setHorizontalGroup(
            panel_SearchDeliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_SearchDeliveryLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_SearchDeliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_SearchDeliveryLayout.createSequentialGroup()
                        .addGroup(panel_SearchDeliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_SearchDeliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane3)
                                .addComponent(jScrollPane4)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 637, Short.MAX_VALUE)
                                .addGroup(panel_SearchDeliveryLayout.createSequentialGroup()
                                    .addGroup(panel_SearchDeliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addGroup(panel_SearchDeliveryLayout.createSequentialGroup()
                                            .addComponent(lbl_CodeDelieveryConsult)
                                            .addGap(47, 47, 47)
                                            .addComponent(lbl_TypeDeliveryConsult)))
                                    .addGap(18, 18, 18)
                                    .addGroup(panel_SearchDeliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(panel_SearchDeliveryLayout.createSequentialGroup()
                                            .addComponent(lbl_statusDeliveryConsult)
                                            .addGap(14, 14, 14)
                                            .addComponent(lbl_RemittentConsult)
                                            .addGap(18, 18, 18)
                                            .addComponent(lbl_dateDelivery)
                                            .addGap(90, 90, 90)
                                            .addComponent(lbl_TypeDeliveryConsult3)
                                            .addGap(24, 24, 24)
                                            .addComponent(jLabel4)
                                            .addGap(18, 18, 18)
                                            .addComponent(lbl_DescriptionDeliveryConsult)
                                            .addGap(35, 35, 35))
                                        .addGroup(panel_SearchDeliveryLayout.createSequentialGroup()
                                            .addComponent(cbox_SearchD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(panel_SearchDeliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(panel_SearchDeliveryLayout.createSequentialGroup()
                                                    .addGap(43, 43, 43)
                                                    .addComponent(jLabel5)
                                                    .addGap(102, 102, 102))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_SearchDeliveryLayout.createSequentialGroup()
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addGroup(panel_SearchDeliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(panel_SearchDeliveryLayout.createSequentialGroup()
                                                            .addComponent(jLabel23)
                                                            .addGap(31, 31, 31)
                                                            .addComponent(jLabel24)
                                                            .addGap(35, 35, 35)
                                                            .addComponent(jLabel25))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_SearchDeliveryLayout.createSequentialGroup()
                                                            .addComponent(spinner_DayReport1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                            .addComponent(spinner_MonthReport1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(spinner_YearReport1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                    .addGap(8, 8, 8)))))))
                            .addGroup(panel_SearchDeliveryLayout.createSequentialGroup()
                                .addComponent(lbl_CodeDelieveryConsult2)
                                .addGap(45, 45, 45)
                                .addComponent(lbl_TypeDeliveryConsult2)
                                .addGap(50, 50, 50)
                                .addComponent(lbl_statusDeliveryConsult2)
                                .addGap(31, 31, 31)
                                .addComponent(lbl_RemittentConsult2)
                                .addGap(26, 26, 26)
                                .addComponent(lbl_dateDelivery2)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9)
                                .addGap(26, 26, 26)
                                .addComponent(jLabel10)
                                .addGap(26, 26, 26)
                                .addComponent(jLabel11)
                                .addGap(47, 47, 47)
                                .addComponent(lbl_DescriptionDeliveryConsult2))
                            .addGroup(panel_SearchDeliveryLayout.createSequentialGroup()
                                .addComponent(lbl_CodeDelieveryConsult1)
                                .addGap(48, 48, 48)
                                .addComponent(lbl_TypeDeliveryConsult1)
                                .addGap(43, 43, 43)
                                .addComponent(lbl_statusDeliveryConsult1)
                                .addGap(30, 30, 30)
                                .addComponent(lbl_RemittentConsult1)
                                .addGap(33, 33, 33)
                                .addComponent(lbl_dateDelivery1)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8)
                                .addGap(34, 34, 34)
                                .addComponent(jLabel6)
                                .addGap(32, 32, 32)
                                .addComponent(jLabel7)
                                .addGap(29, 29, 29)
                                .addComponent(lbl_DescriptionDeliveryConsult1)))
                        .addGap(0, 103, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_SearchDeliveryLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_ReturnBackfromSearch)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_Search)))
                .addContainerGap())
        );
        panel_SearchDeliveryLayout.setVerticalGroup(
            panel_SearchDeliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_SearchDeliveryLayout.createSequentialGroup()
                .addGroup(panel_SearchDeliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_SearchDeliveryLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(panel_SearchDeliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(cbox_SearchD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panel_SearchDeliveryLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panel_SearchDeliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23)
                            .addComponent(jLabel24)
                            .addComponent(jLabel25))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel_SearchDeliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spinner_DayReport1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spinner_MonthReport1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spinner_YearReport1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(32, 32, 32)
                .addGroup(panel_SearchDeliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_CodeDelieveryConsult)
                    .addComponent(lbl_TypeDeliveryConsult)
                    .addComponent(lbl_statusDeliveryConsult)
                    .addComponent(lbl_RemittentConsult)
                    .addComponent(lbl_DescriptionDeliveryConsult)
                    .addComponent(lbl_dateDelivery)
                    .addComponent(jLabel4)
                    .addComponent(lbl_TypeDeliveryConsult3)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(panel_SearchDeliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_CodeDelieveryConsult1)
                    .addComponent(lbl_TypeDeliveryConsult1)
                    .addComponent(lbl_statusDeliveryConsult1)
                    .addComponent(lbl_RemittentConsult1)
                    .addComponent(lbl_dateDelivery1)
                    .addComponent(lbl_DescriptionDeliveryConsult1)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(panel_SearchDeliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_CodeDelieveryConsult2)
                    .addComponent(lbl_TypeDeliveryConsult2)
                    .addComponent(lbl_statusDeliveryConsult2)
                    .addComponent(lbl_DescriptionDeliveryConsult2)
                    .addComponent(lbl_dateDelivery2)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(lbl_RemittentConsult2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panel_SearchDeliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_ReturnBackfromSearch)
                    .addComponent(btn_Search))
                .addContainerGap())
        );

        tabPanel_CounterPrincipal.addTab("Búsqueda de Artículos", panel_SearchDelivery);

        jPanel1.setBackground(new java.awt.Color(255, 204, 153));

        panel_ClientPendant.setBackground(new java.awt.Color(255, 255, 204));

        javax.swing.GroupLayout panel_ClientPendantLayout = new javax.swing.GroupLayout(panel_ClientPendant);
        panel_ClientPendant.setLayout(panel_ClientPendantLayout);
        panel_ClientPendantLayout.setHorizontalGroup(
            panel_ClientPendantLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 680, Short.MAX_VALUE)
        );
        panel_ClientPendantLayout.setVerticalGroup(
            panel_ClientPendantLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 504, Short.MAX_VALUE)
        );

        jScrollPane6.setViewportView(panel_ClientPendant);

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel26.setText("Nombre");

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel27.setText("Identificación");

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel28.setText("Correo electrónico");

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel29.setText("Cant. Paquetes");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("Generate List");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btn_Regresar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_Regresar.setText("Regresar");
        btn_Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_Regresar)
                                .addGap(32, 32, 32)
                                .addComponent(jButton1))
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 682, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel26)
                        .addGap(54, 54, 54)
                        .addComponent(jLabel27)
                        .addGap(60, 60, 60)
                        .addComponent(jLabel28)
                        .addGap(72, 72, 72)
                        .addComponent(jLabel29)))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(jLabel27)
                    .addComponent(jLabel28)
                    .addComponent(jLabel29))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(btn_Regresar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabPanel_CounterPrincipal.addTab("Lista de clientes Pendientes", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tabPanel_CounterPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 765, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabPanel_CounterPrincipal)
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
        switch (typeArticle) {
            case "Paquete":
                showPackageComponents();
                break;
            case "Sobre":
                showEnvelopeComponents();
                break;
            case "Revista":
                showMagazineComponents();
                break;
            default:
                clearReceiveComponents();
                break;
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
            switch (typeArticle) {
                case "Paquete":
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
                        Package nPackage = new Package(description,remittent,
                                isFrailness, isTechnology,weight);
                        String notify= Counter.getInstance().saveDeliveryPackage(destinataryID, nPackage);
                        JOptionPane.showMessageDialog(null,"El paquete ha sido recibido");
                        JOptionPane.showMessageDialog(null,notify);
                           
                    }else{
                        JOptionPane.showMessageDialog(null, "Ingrese todas los datos solicitadas");
                    }   break;
                case "Sobre":
                    if (!(txt_Weight.getText().equals("") || txt_TypeEnvelope.getText().equals("") ||
                            txt_TypeContent.getText().equals(""))){
                        int weight = Integer.valueOf(txt_Weight.getText());
                        String typeEnvelope = lbl_TypeEnvelope.getText();
                        String typeContent = lbl_TypeContent.getText();
                        Envelope nEnvelope = new Envelope(description,remittent,
                                typeEnvelope, typeContent,weight);
                        String notify= Counter.getInstance().saveDeliveryEnvelope(destinataryID, nEnvelope);
                        JOptionPane.showMessageDialog(null,"El sobre ha sido recibido");
                        JOptionPane.showMessageDialog(null,notify);
                    }else{
                        JOptionPane.showMessageDialog(null, "Ingrese todas los datos solicitadas");
                    }   break;
                case "Revista":
                    if (!(txt_MagazineName.getText().equals("") || txt_MagazineTopic.getText().equals(""))){
                        boolean isCatalog = true;
                        String name = txt_MagazineName.getText();
                        String topic = txt_MagazineTopic.getText();
                        if (cbox_isCatalog.getSelectedItem().toString().equals("No")){
                            isCatalog = false;
                        }
                        Magazine nMagazine = new Magazine(description,remittent,
                                name, isCatalog,topic);
                        String notify= Counter.getInstance().saveDeliveryMagazine(destinataryID, nMagazine);
                        JOptionPane.showMessageDialog(null,"La revista ha sido recibida");
                        JOptionPane.showMessageDialog(null,notify);
                    }else{
                        JOptionPane.showMessageDialog(null, "Ingrese todas los datos solicitadas");
                    }   break;
                default:
                    JOptionPane.showMessageDialog(null, "Por favor seleccione una opción");
                    break;
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
        ArrayList <Package> packageList = new ArrayList<>();
        ArrayList <Magazine> magazineList = new ArrayList<>();
        ArrayList <Envelope> envelopeList = new ArrayList<>();
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
        int id = Integer.valueOf(txt_IDdrop.getText());
        Client _Client1 = Counter.getInstance().getClient(id);
        new Costs_View(packageList,magazineList,envelopeList,_Client1).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_DropDeliveryActionPerformed

    private void btn_SearchClientdropActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SearchClientdropActionPerformed
        // TODO add your handling code here:
        panel_DropDelivery.removeAll();
        if(!(txt_IDdrop.getText().equals(""))){
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
        }else{
            JOptionPane.showMessageDialog(null,"Debe ingresar la identificación");
        }
        panel_DropDelivery.updateUI();
    }//GEN-LAST:event_btn_SearchClientdropActionPerformed

    private void btn_CreateReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CreateReportActionPerformed
        // TODO add your handling code here:
        panel_ReportDisplay.removeAll();
        String day = spinner_DayReport.getValue().toString();
        String month = spinner_MonthReport.getValue().toString();
        String year = spinner_YearReport.getValue().toString();
        int totalUSd=0;
        int totalUCr=0;
        int cantDeliveries = 0;
        for (int iClient = 0; iClient != Counter.getInstance().getClient_register().size(); iClient++){
            Client client = Counter.getInstance().getClient_register().get(iClient);
            ArrayList <Package> packageList = Counter.getInstance().packages_ByDay(client,true,true,Integer.valueOf(day),Integer.valueOf(month), Integer.valueOf(year));
            ArrayList <Magazine> magazineList =Counter.getInstance().magazine_ByDay(client,true,true,Integer.valueOf(day),Integer.valueOf(month), Integer.valueOf(year));
            ArrayList <Envelope> envelopeList = Counter.getInstance().envelopes_ByDay(client,true,true,Integer.valueOf(day),Integer.valueOf(month), Integer.valueOf(year));
            totalUSd+=Counter.getInstance().chargeTotalPrice_InsideLocker(client,envelopeList, packageList, magazineList);
            totalUCr+=Counter.getInstance().chargeTotalPrice_InsideLocker(client,envelopeList, packageList, magazineList)*(WebServiceBCCR.getInstance().getExchangeSale());
            for(int iDelivery = 0; iDelivery!= packageList.size(); iDelivery++){
                createLineReportPackage(client,packageList.get(iDelivery),iDelivery+cantDeliveries);
            }
            for(int iDelivery = 0; iDelivery!= magazineList.size(); iDelivery++){
                createLineReportMagazine(client,magazineList.get(iDelivery),iDelivery+packageList.size()+cantDeliveries);
            }
            for(int iDelivery = 0; iDelivery!= envelopeList.size(); iDelivery++){
                createLineReportEnvelope(client,envelopeList.get(iDelivery),iDelivery+packageList.size()+magazineList.size()+cantDeliveries);
            }
            cantDeliveries =+ packageList.size();
            cantDeliveries =+ magazineList.size();
            cantDeliveries =+ envelopeList.size();
        }
        if(cantDeliveries ==0){
            JOptionPane.showMessageDialog(null, "No hay paquetes retirados en esta fecha");
        }
        
        panel_ReportDisplay.updateUI();
        lbl_TotalDolars.setText(String.valueOf(totalUSd));
        lbl_TotalColons.setText(String.valueOf(totalUCr));
    }//GEN-LAST:event_btn_CreateReportActionPerformed

    private void btn_ConsultExchangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ConsultExchangeActionPerformed
        // TODO add your handling code here:
        lbl_TypeBuyCur.setText(String.valueOf(WebServiceBCCR.getInstance().getExchangePurchase()));
        lbl_TypeSellCur.setText(String.valueOf(WebServiceBCCR.getInstance().getExchangeSale()));
        
    }//GEN-LAST:event_btn_ConsultExchangeActionPerformed

    private void btn_ReturnBackfromRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ReturnBackfromRegActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new ActionMenu_View().setVisible(true);
        
    }//GEN-LAST:event_btn_ReturnBackfromRegActionPerformed

    private void btn_ReturnBackfromReceiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ReturnBackfromReceiveActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new ActionMenu_View().setVisible(true);
    }//GEN-LAST:event_btn_ReturnBackfromReceiveActionPerformed

    private void btn_ReturnBackfromSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ReturnBackfromSearchActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new ActionMenu_View().setVisible(true);
        
    }//GEN-LAST:event_btn_ReturnBackfromSearchActionPerformed

    private void btn_ReturnBackfromExchangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ReturnBackfromExchangeActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new ActionMenu_View().setVisible(true);
        
    }//GEN-LAST:event_btn_ReturnBackfromExchangeActionPerformed

    private void btn_ReturnBackfromReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ReturnBackfromReportActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new ActionMenu_View().setVisible(true);
    }//GEN-LAST:event_btn_ReturnBackfromReportActionPerformed

    private void btn_SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SearchActionPerformed
        // TODO add your handling code here:
        if (cbox_SearchD.getSelectedItem().toString().equals(" ")){
            JOptionPane.showMessageDialog(null, "Debe seleccionar un tipo de búsqueda");
        }else{
            panel_EnvelopeSDeliver.removeAll();
            panel_MagazineSDeliver.removeAll();
            panel_PackagesSDeliver.removeAll();
            String day = spinner_DayReport1.getValue().toString();
            String month = spinner_MonthReport1.getValue().toString();
            String year = spinner_YearReport1.getValue().toString();
            int totalPackages =0;
            int totalEnvelopes = 0;
            int totalMagazines = 0;
            switch(cbox_SearchD.getSelectedItem().toString()){
                case "Fecha de entrega":
                {
                    for (int iClient = 0; iClient != Counter.getInstance().getClient_register().size(); iClient++){
                        Client client = Counter.getInstance().getClient_register().get(iClient);
                        ArrayList <Package> packageList = Counter.getInstance().packages_ByDay(client,true,true,Integer.valueOf(day),Integer.valueOf(month), Integer.valueOf(year));
                        ArrayList <Magazine> magazineList =Counter.getInstance().magazine_ByDay(client,true,true,Integer.valueOf(day),Integer.valueOf(month), Integer.valueOf(year));
                        ArrayList <Envelope> envelopeList = Counter.getInstance().envelopes_ByDay(client,true,true,Integer.valueOf(day),Integer.valueOf(month), Integer.valueOf(year));
                        
                       // if(packageList.size()==0||magazineList.size()==0||envelopeList.size()==0 ){
                            takeOutEachElementsEnvelope(envelopeList,totalEnvelopes);
                            takeOutEachElementsPackage(packageList,totalPackages);
                            takeOutEachElementsMagazine(magazineList,totalMagazines);
                            totalPackages += packageList.size();
                            totalEnvelopes += envelopeList.size();
                            totalMagazines += magazineList.size();
                       // }
                        
                    }
                    
                } break;
                case "Fecha de recibido":
                {
                    for (int iClient = 0; iClient != Counter.getInstance().getClient_register().size(); iClient++){
                        Client client = Counter.getInstance().getClient_register().get(iClient);
                        ArrayList <Package> packageList = Counter.getInstance().packages_ByDay(client,false,false,Integer.valueOf(day),Integer.valueOf(month), Integer.valueOf(year));
                        ArrayList <Magazine> magazineList =Counter.getInstance().magazine_ByDay(client,false,false,Integer.valueOf(day),Integer.valueOf(month), Integer.valueOf(year));
                        ArrayList <Envelope> envelopeList = Counter.getInstance().envelopes_ByDay(client,false,false,Integer.valueOf(day),Integer.valueOf(month), Integer.valueOf(year));
                        //if(packageList.size()==0||magazineList.size()==0||envelopeList.size()==0 ){
                            takeOutEachElementsEnvelope(envelopeList,totalEnvelopes);
                            takeOutEachElementsPackage(packageList,totalPackages);
                            takeOutEachElementsMagazine(magazineList,totalMagazines); 
                            totalPackages += packageList.size();
                            totalEnvelopes += envelopeList.size();
                            totalMagazines += magazineList.size();
                       // }
                    }
                       
                }break;
                
                case "Pendientes":
                {
                    
                        ArrayList <Package> packageList = Counter.getInstance().non_retired_packages();
                        ArrayList <Magazine> magazineList=Counter.getInstance().non_retired_magazine();
                        ArrayList <Envelope> envelopeList=Counter.getInstance().non_retired_envelope();
                       // if(packageList.size()==0||magazineList.size()==0||envelopeList.size()==0 ){
                            takeOutEachElementsEnvelope(envelopeList,0);
                            takeOutEachElementsPackage(packageList,0);
                            takeOutEachElementsMagazine(magazineList,0);                            
                       // }
                    
            
                } break;
                
            }
        }
        panel_EnvelopeSDeliver.updateUI();
        panel_MagazineSDeliver.updateUI();
        panel_PackagesSDeliver.updateUI();
        
    }//GEN-LAST:event_btn_SearchActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        panel_ClientPendant.removeAll();
        ArrayList <Client> clientsPendant=Counter.getInstance().clients_pending_payment();
        for (int iClient = 0; iClient !=clientsPendant.size(); iClient++){
            takeOutEachClient(clientsPendant,0);
        }    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RegresarActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new ActionMenu_View().setVisible(true);
    }//GEN-LAST:event_btn_RegresarActionPerformed
    private void  takeOutEachClient(ArrayList<Client> clientsPendant, int pTotalPendants){
        for (int iDeliver=0; iDeliver!=clientsPendant.size();iDeliver++){
            createLineDisplayPendantClient(clientsPendant.get(iDeliver),iDeliver+pTotalPendants);
            pTotalPendants++;
        }
    }
    private void createLineDisplayPendantClient(Client client , int pTotalClient){
        String name=client.get_name();
        String ID= String.valueOf(client.get_ID());
        String email=client.get_email();
        String cantPackages=String.valueOf(client.get_locker().get_cantdeliveries());
        ArrayList<String> packageInfo = new ArrayList<>(asList(name,ID,email,cantPackages));
        createDropLinePendant(packageInfo,pTotalClient,panel_ClientPendant);
    }
        
    private void createDropLinePendant(ArrayList<String> packageInfo,int pTotalClient,JPanel panel){    
    ////Variables para editar el margen en el que se colocan
           
            int firstMargenX = 15;
            int firstMargenY = 15;
            int widthLbl = 140;
            int heightLbl = 20;
            int spaceBetweenLblY = 8;
                
            JLabel lbl_name = new JLabel(packageInfo.get(0));
            JLabel lbl_ID = new JLabel(packageInfo.get(1));
            JLabel lbl_email = new JLabel(packageInfo.get(2));
            JLabel lbl_cantPendant = new JLabel(packageInfo.get(3));


            lbl_name.setBounds(firstMargenX+widthLbl*0,firstMargenY+(spaceBetweenLblY+heightLbl)*pTotalClient,widthLbl,heightLbl);
            lbl_ID.setBounds(firstMargenX+widthLbl*1,firstMargenY+(spaceBetweenLblY+heightLbl)*pTotalClient,widthLbl,heightLbl);
            lbl_email.setBounds(firstMargenX+widthLbl*2,firstMargenY+(spaceBetweenLblY+heightLbl)*pTotalClient,widthLbl,heightLbl);
            lbl_cantPendant.setBounds((firstMargenX+widthLbl*4)-3,firstMargenY+(spaceBetweenLblY+heightLbl)*pTotalClient,widthLbl,heightLbl);

            panel.add(lbl_name);
            panel.add(lbl_ID);
            panel.add(lbl_email);
            panel.add(lbl_cantPendant);
            panel.updateUI();
    
    }
    private void  takeOutEachElementsEnvelope(ArrayList<Envelope> envelopesDeliveries, int pTotalEnvelope){
        for (int iDeliver=0; iDeliver!=envelopesDeliveries.size();iDeliver++){
            createLineDisplayE(envelopesDeliveries.get(iDeliver),iDeliver+pTotalEnvelope);
        }
    }
    private void  takeOutEachElementsPackage(ArrayList<Package> packagesDeliveries, int pTotalPackage){
         for (int iDeliver=0; iDeliver!=packagesDeliveries.size();iDeliver++){
            createLineDisplayP(packagesDeliveries.get(iDeliver),iDeliver+pTotalPackage);
        }   
    }
    private void  takeOutEachElementsMagazine(ArrayList<Magazine> magazinesDeliveries, int pTotalMagazine){
          for (int iDeliver=0; iDeliver!=magazinesDeliveries.size();iDeliver++){
            createLineDisplayM(magazinesDeliveries.get(iDeliver),iDeliver+pTotalMagazine);
        }    
    }
    private void createLineDisplayE(Envelope envelope,int iDeliver){
        String code=String.valueOf(envelope.get_code());
        String typeDeliver="Sobre";
        String typeEnvelope=envelope.get_typeEnvelope();
        String remittent=envelope.get_remittent();
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        String dateIn = dateFormat.format(envelope.get_date().getTime());
        String typeContent=envelope.get_typeContent();
        String weight=String.valueOf(envelope.get_weight());
        String description=envelope.get_description();
        String status="";
        if(envelope.get_status()){
            status="pendiente";
        }else{
            status="entregado";
        }
        ArrayList<String> packageInfo = new ArrayList<>(asList(code,typeDeliver,status,remittent,dateIn,weight,typeContent,typeEnvelope,description));
        createDropLineSearch(packageInfo,iDeliver,panel_EnvelopeSDeliver);
        
        
    }
    private void createLineDisplayP(Package pPackage,int iDeliver){
        
        String code=String.valueOf(pPackage.get_code());
        String typeDeliver="Paquete";
        String isTecnological=String.valueOf(pPackage.get_technological());
        String remittent=pPackage.get_remittent();
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        String dateIn = dateFormat.format(pPackage.get_date().getTime());
        String isFragile=String.valueOf(pPackage.get_frailness());
        String weight=String.valueOf(pPackage.get_weight());
        String description=pPackage.get_description();
        String status;
        if(pPackage.get_status()){
            status="pendiente";
        }else{
            status="entregado";
        }
        ArrayList<String> packageInfo = new ArrayList<>(asList(code,typeDeliver,status,remittent,dateIn,weight,isTecnological,isFragile,description));
        createDropLineSearch(packageInfo,iDeliver,panel_PackagesSDeliver);
    }
    private void createLineDisplayM(Magazine magazine,int iDeliver){
        String code=String.valueOf(magazine.get_code());
        String typeDeliver="Revista";
        String isCatalog=String.valueOf(magazine.get_catalog());
        String remittent=magazine.get_remittent();
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        String dateIn = dateFormat.format(magazine.get_date().getTime());
        String topic=magazine.get_topic();
        String name=magazine.get_name();
        String description=magazine.get_description();
        String status;
        if(magazine.get_status()){
            status="pendiente";
        }else{
            status="entregado";
        }
        ArrayList<String> packageInfo = new ArrayList<>(asList(code,typeDeliver,status,remittent,dateIn,isCatalog,topic,name,description));
        createDropLineSearch(packageInfo,iDeliver,panel_MagazineSDeliver);
    }   

        private void  createDropLineSearch(ArrayList<String> packageInfo,int iDelivery,JPanel panel){
        ////Variables para editar el margen en el que se colocan
            
            int firstMargenX = 15;
            int firstMargenY = 15;
            int widthLbl = 70;
            int heightLbl = 25;
            int spaceBetweenLblY = 10;
                
            JLabel lbl_code = new JLabel(packageInfo.get(0));
            JLabel lbl_deliveryType = new JLabel(packageInfo.get(1));
            JLabel lbl_isCommited = new JLabel(packageInfo.get(2));
            JLabel lbl_Remittent = new JLabel(packageInfo.get(3));
            JLabel lbl_DateIn = new JLabel(packageInfo.get(4));
            JLabel lbl_Specific1= new JLabel(packageInfo.get(5));
            JLabel lbl_Specific2= new JLabel(packageInfo.get(6));
            JLabel lbl_Specific3= new JLabel(packageInfo.get(7));
            JLabel lbl_Description = new JLabel(packageInfo.get(8));

            lbl_code.setBounds(firstMargenX+widthLbl*0,firstMargenY+(spaceBetweenLblY+heightLbl)*iDelivery,widthLbl,heightLbl);
            lbl_deliveryType.setBounds(firstMargenX+widthLbl*1,firstMargenY+(spaceBetweenLblY+heightLbl)*iDelivery,widthLbl,heightLbl);
            lbl_isCommited.setBounds(firstMargenX+widthLbl*2,firstMargenY+(spaceBetweenLblY+heightLbl)*iDelivery,widthLbl,heightLbl);
            lbl_Remittent.setBounds(firstMargenX+widthLbl*3,firstMargenY+(spaceBetweenLblY+heightLbl)*iDelivery,widthLbl,heightLbl);
            lbl_DateIn.setBounds(firstMargenX+widthLbl*4,firstMargenY+(spaceBetweenLblY+heightLbl)*iDelivery,widthLbl,heightLbl);
            lbl_Specific1.setBounds(firstMargenX+widthLbl*5,firstMargenY+(spaceBetweenLblY+heightLbl)*iDelivery,widthLbl,heightLbl);
            lbl_Specific2.setBounds(firstMargenX+widthLbl*6,firstMargenY+(spaceBetweenLblY+heightLbl)*iDelivery,widthLbl,heightLbl);
            lbl_Specific3.setBounds(firstMargenX+widthLbl*7,firstMargenY+(spaceBetweenLblY+heightLbl)*iDelivery,widthLbl,heightLbl);
            lbl_Description.setBounds(firstMargenX+widthLbl*8,firstMargenY+(spaceBetweenLblY+heightLbl)*iDelivery,widthLbl,heightLbl);

            panel.add(lbl_code);
            panel.add(lbl_deliveryType);
            panel.add(lbl_isCommited);
            panel.add(lbl_Remittent);
            panel.add(lbl_DateIn);
            panel.add(lbl_Specific1);
            panel.add(lbl_Specific2);
            panel.add(lbl_Specific3);
            panel.add(lbl_Description);
            panel.updateUI();
    }

    
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
    private void createLineReportPackage(Client client,Package pPackage, int iDelivery){
        String code = String.valueOf(pPackage.get_code());
        String deliveryType = "Paquete";
        String tax = String.valueOf(pPackage.getTax());
        //String discount = String.valueOf(Counter.getInstance().disscount(pPackage.getTax(),client.get_ID()));
        String disscount = String.valueOf(client.disscount(pPackage.getTax()));
        String totalCRC = String.valueOf((Counter.getInstance().chargeIndividualPrice(pPackage.get_code(),client.get_ID()))*(WebServiceBCCR.getInstance().getExchangeSale()));
        String totalUSD = String.valueOf(Counter.getInstance().chargeIndividualPrice(pPackage.get_code(),client.get_ID()));
        String details = Counter.getInstance().show_tax_delivery(pPackage)+Counter.getInstance().show_disscount(client,pPackage.getTax());
        ArrayList<String> packageInfo = new ArrayList<>(asList(code,deliveryType,tax,disscount,totalCRC,totalUSD,details));
        createLineReport(packageInfo,iDelivery);
        
    }
    private void createLineReportMagazine(Client client,Magazine pMagazine, int iDelivery){
        String code = String.valueOf(pMagazine.get_code());
        String deliveryType = "Revista";
        String tax = String.valueOf(pMagazine.getTax());
//        String discount = String.valueOf(Counter.getInstance().disscount(pMagazine.getTax(),client.get_ID()));
        String disscount = String.valueOf(client.disscount(pMagazine.getTax()));
        String totalCRC = String.valueOf((Counter.getInstance().chargeIndividualPrice(pMagazine.get_code(),client.get_ID()))*(WebServiceBCCR.getInstance().getExchangeSale()));
        String totalUSD = String.valueOf(Counter.getInstance().chargeIndividualPrice(pMagazine.get_code(),client.get_ID()));
        String details = Counter.getInstance().show_tax_delivery(pMagazine)+Counter.getInstance().show_disscount(client,pMagazine.getTax());
        ArrayList<String> magazineInfo = new ArrayList<>(asList(code,deliveryType,tax,disscount,totalCRC,totalUSD,details));
        createLineReport(magazineInfo,iDelivery);
    }
    private void createLineReportEnvelope(Client client,Envelope pEnvelope, int iDelivery){
        String code = String.valueOf(pEnvelope.get_code());
        String deliveryType = "Sobre";
        String tax = String.valueOf(pEnvelope.getTax());
//        String discount = String.valueOf(Counter.getInstance().disscount(pEnvelope.getTax(),client.get_ID()));
        String disscount = String.valueOf(client.disscount(pEnvelope.getTax()));
        String totalCRC = String.valueOf((Counter.getInstance().chargeIndividualPrice(pEnvelope.get_code(),client.get_ID()))*(WebServiceBCCR.getInstance().getExchangeSale()));
        String totalUSD = String.valueOf(Counter.getInstance().chargeIndividualPrice(pEnvelope.get_code(),client.get_ID()));
        String details = Counter.getInstance().show_tax_delivery(pEnvelope)+Counter.getInstance().show_disscount(client,pEnvelope.getTax());
        ArrayList<String> envelopeInfo = new ArrayList<>(asList(code,deliveryType,tax,disscount,totalCRC,totalUSD,details));
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
        Aerostore.add_client(304900953,"Byron", "bmiranda@gmail.com", 12345678, "paraiso cartago", "H","18/11/1995");
        Aerostore.add_client(116080577,"GOKU", "yorleymaria96@gmail.com", 12345678, "paraiso cartago", "H","18/11/1995");
//        Aerostore.add_client(304900951,"Chichimara", "yorleymaria96@gmail.com", 12345678, "paraiso cartago", "F","18/11/1995");
//        //Aerostore.add_client(304900952,"Liryel", "bmiranda@.com", 12345678, "paraiso cartago", "H","18/11/1995");
//        //Aerostore.changeType(304900952);
        Magazine deliver= new Magazine("revista de cocina mediterranea", "yor","cocina mediterranea", false, "cocina");
        Aerostore.saveDeliveryMagazine(116080577, deliver);
        Package deliver1=new Package("computadora mac","yorley",true,true,40);
        Aerostore.saveDeliveryPackage(304900951, deliver1);
//        Package deliver2=new Package("almohadas","yorley",true,true,60);
//        //Aerostore.saveDeliveryPackage(116080577, deliver2);
        ArrayList<Integer> h= new ArrayList<>();
        h.add(1);
        h.add(2);
        h.add(3);
        Aerostore.retrieve_packages(h,116080577);
        
        
//        Aerostore.chargeTotalPrice_InsideLocker(304900950);
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ConsultExchange;
    private javax.swing.JButton btn_CreateReport;
    private javax.swing.JButton btn_DropDelivery;
    private javax.swing.JButton btn_Receive;
    private javax.swing.JButton btn_Regresar;
    private javax.swing.JButton btn_ReturnBackfromExchange;
    private javax.swing.JButton btn_ReturnBackfromReceive;
    private javax.swing.JButton btn_ReturnBackfromReg;
    private javax.swing.JButton btn_ReturnBackfromReport;
    private javax.swing.JButton btn_ReturnBackfromSearch;
    private javax.swing.JButton btn_Search;
    private javax.swing.JButton btn_SearchClientdrop;
    private javax.swing.JComboBox cbox_SearchD;
    private javax.swing.JComboBox cbox_TypeReceivedArticle;
    private javax.swing.JCheckBox cbox_selectAll;
    private javax.swing.JButton jButton1;
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
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
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
    private javax.swing.JPanel panel_ClientPendant;
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
    private javax.swing.JSpinner spinner_DayReport1;
    private javax.swing.JSpinner spinner_MonthReport;
    private javax.swing.JSpinner spinner_MonthReport1;
    private javax.swing.JSpinner spinner_YearReport;
    private javax.swing.JSpinner spinner_YearReport1;
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
