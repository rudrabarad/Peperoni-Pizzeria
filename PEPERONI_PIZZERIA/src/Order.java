
import javax.swing.JOptionPane;
import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RUDRA
 */
public class Order extends javax.swing.JFrame {

    /**
     * Creates new form Order
     */
    public Order() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        TABLE_1 = new javax.swing.JRadioButton();
        TABLE_3 = new javax.swing.JRadioButton();
        TABLE_2 = new javax.swing.JRadioButton();
        TABLE_5 = new javax.swing.JRadioButton();
        TABLE_4 = new javax.swing.JRadioButton();
        TABLE_10 = new javax.swing.JRadioButton();
        TABLE_9 = new javax.swing.JRadioButton();
        TABLE_8 = new javax.swing.JRadioButton();
        TABLE_7 = new javax.swing.JRadioButton();
        TABLE_6 = new javax.swing.JRadioButton();
        jLabel16 = new javax.swing.JLabel();
        MEMBERSHIP_ = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        HOME_DELIVERY = new javax.swing.JCheckBox();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        TAX = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();
        STARTERS_ = new javax.swing.JComboBox();
        ADD_STA_ = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        BILL_TABLE_ = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        SUB_TOTAL = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        HD_CHARGE_ = new javax.swing.JTextField();
        MEMBERSHIP_DIS_ = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        GRAND_TOTAL_ = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        SAVE_2 = new javax.swing.JButton();
        TAX_ = new javax.swing.JTextField();
        SAVE_1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel17 = new javax.swing.JLabel();
        SIDE_ORDERS_ = new javax.swing.JComboBox();
        ADD_SO_ = new javax.swing.JButton();
        PASTA_ = new javax.swing.JComboBox();
        jLabel18 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        ADD_PASTA_ = new javax.swing.JButton();
        PIZZA_ = new javax.swing.JComboBox();
        ADD_PIZ_ = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel20 = new javax.swing.JLabel();
        DESSERT_ = new javax.swing.JComboBox();
        ADD_DES_ = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel15 = new javax.swing.JLabel();
        DELETE_ITEM_ = new javax.swing.JButton();
        CLEAR_ = new javax.swing.JButton();
        TYPE_OF_ORDER = new javax.swing.JComboBox();
        jLabel24 = new javax.swing.JLabel();
        EXIT_ = new javax.swing.JButton();
        SAVE_ = new javax.swing.JButton();
        CUSTOMER_NAME_ = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Cambria Math", 1, 36)); // NOI18N
        jLabel2.setText("        CUSTOMER INFO");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setFont(new java.awt.Font("Cambria Math", 0, 28)); // NOI18N
        jLabel3.setText("Customer Name :");

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Cambria Math", 1, 24)); // NOI18N
        jButton1.setText("PRINT");
        jButton1.setBorder(null);

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Cambria Math", 1, 24)); // NOI18N
        jButton2.setText("EXIT");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Cambria Math", 0, 28)); // NOI18N
        jLabel6.setText("Membership :");

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        TABLE_1.setText("1");

        TABLE_3.setText("3");

        TABLE_2.setText("2");

        TABLE_5.setText("5");

        TABLE_4.setText("4");

        TABLE_10.setText("10");

        TABLE_9.setText("9");

        TABLE_8.setText("8");

        TABLE_7.setText("7");

        TABLE_6.setText("6");

        jLabel16.setFont(new java.awt.Font("Cambria Math", 0, 26)); // NOI18N
        jLabel16.setText("TABLE NUMBER");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(TABLE_1)
                        .addGap(18, 18, 18)
                        .addComponent(TABLE_2)
                        .addGap(18, 18, 18)
                        .addComponent(TABLE_3)
                        .addGap(18, 18, 18)
                        .addComponent(TABLE_4)
                        .addGap(18, 18, 18)
                        .addComponent(TABLE_5))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(TABLE_6)
                        .addGap(18, 18, 18)
                        .addComponent(TABLE_7)
                        .addGap(18, 18, 18)
                        .addComponent(TABLE_8)
                        .addGap(18, 18, 18)
                        .addComponent(TABLE_9)
                        .addGap(18, 18, 18)
                        .addComponent(TABLE_10)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TABLE_1)
                            .addComponent(TABLE_3)
                            .addComponent(TABLE_2)
                            .addComponent(TABLE_5)
                            .addComponent(TABLE_4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TABLE_6)
                            .addComponent(TABLE_8)
                            .addComponent(TABLE_7)
                            .addComponent(TABLE_10)
                            .addComponent(TABLE_9)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel16)))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        MEMBERSHIP_.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        MEMBERSHIP_.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECT", "NONE", "SILVER", "GOLD", "PLATINUM" }));
        MEMBERSHIP_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MEMBERSHIP_ActionPerformed(evt);
            }
        });

        jTextArea1.setBackground(new java.awt.Color(248, 248, 248));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Cambria", 0, 17)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText(" #  OUR DELIVERY CHARGES:\n 1. Minimum order of Rs.1400 (before \n     discount) is required & for that \n     Rs.70 standard delivery charge.\n 2. Free delivery for orders above \n     Rs.2100");
        jScrollPane1.setViewportView(jTextArea1);

        jLabel7.setFont(new java.awt.Font("Cambria Math", 0, 28)); // NOI18N
        jLabel7.setText("HOME DELIVERY ");

        HOME_DELIVERY.setBackground(new java.awt.Color(255, 255, 255));
        HOME_DELIVERY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HOME_DELIVERYActionPerformed(evt);
            }
        });

        TAX.setBackground(new java.awt.Color(255, 255, 255));
        TAX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TAXActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Cambria Math", 0, 28)); // NOI18N
        jLabel8.setText("TAX (10%)");

        STARTERS_.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECT" }));
        STARTERS_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                STARTERS_ActionPerformed(evt);
            }
        });

        ADD_STA_.setBackground(new java.awt.Color(255, 255, 255));
        ADD_STA_.setText("Add");
        ADD_STA_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADD_STA_ActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        BILL_TABLE_.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item_Id", "Item_Name", "Price", "Qty", "Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        BILL_TABLE_.setRequestFocusEnabled(false);
        BILL_TABLE_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BILL_TABLE_MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(BILL_TABLE_);

        jLabel10.setFont(new java.awt.Font("Cambria Math", 1, 36)); // NOI18N
        jLabel10.setText("     PEPERONI PIZZERIA");

        jLabel13.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        jLabel13.setText("........all we Knead is LOVE !");

        jLabel14.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        jLabel14.setText("VISIT AGAIN");

        SUB_TOTAL.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel12.setFont(new java.awt.Font("Cambria Math", 0, 24)); // NOI18N
        jLabel12.setText("THANKYOU ");

        HD_CHARGE_.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        MEMBERSHIP_DIS_.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        jButton6.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        jButton6.setText("Membership Discount :");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton14.setBackground(new java.awt.Color(255, 255, 255));
        jButton14.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        jButton14.setText("GRAND TOTAL");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        GRAND_TOTAL_.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/eat-pizzaandmerry.png"))); // NOI18N
        jLabel21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton7.setBackground(new java.awt.Color(255, 255, 255));
        jButton7.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        jButton7.setText("Home Delivery Charge :");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        SAVE_2.setBackground(new java.awt.Color(255, 255, 255));
        SAVE_2.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        SAVE_2.setText("SUBTOTAL :");
        SAVE_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SAVE_2ActionPerformed(evt);
            }
        });

        TAX_.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        SAVE_1.setBackground(new java.awt.Color(255, 255, 255));
        SAVE_1.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        SAVE_1.setText("TAX (10%) :");
        SAVE_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SAVE_1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel14))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(SAVE_1, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton14, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TAX_, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                    .addComponent(GRAND_TOTAL_)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jButton6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(MEMBERSHIP_DIS_, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(221, 221, 221)
                                        .addComponent(HD_CHARGE_, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(SAVE_2))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(SUB_TOTAL, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SUB_TOTAL, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SAVE_2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(HD_CHARGE_, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MEMBERSHIP_DIS_, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TAX_, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SAVE_1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(GRAND_TOTAL_, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/peperoni_logo.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Cambria Math", 0, 26)); // NOI18N
        jLabel4.setText("          STARTERS");

        jLabel17.setFont(new java.awt.Font("Cambria Math", 0, 26)); // NOI18N
        jLabel17.setText("              SIDE ORDERS");

        SIDE_ORDERS_.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECT" }));
        SIDE_ORDERS_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SIDE_ORDERS_ActionPerformed(evt);
            }
        });

        ADD_SO_.setBackground(new java.awt.Color(255, 255, 255));
        ADD_SO_.setText("Add");
        ADD_SO_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADD_SO_ActionPerformed(evt);
            }
        });

        PASTA_.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECT" }));
        PASTA_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PASTA_ActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Cambria Math", 0, 26)); // NOI18N
        jLabel18.setText("                PASTA");

        ADD_PASTA_.setBackground(new java.awt.Color(255, 255, 255));
        ADD_PASTA_.setText("Add");
        ADD_PASTA_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADD_PASTA_ActionPerformed(evt);
            }
        });

        PIZZA_.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECT" }));
        PIZZA_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PIZZA_ActionPerformed(evt);
            }
        });

        ADD_PIZ_.setBackground(new java.awt.Color(255, 255, 255));
        ADD_PIZ_.setText("Add");
        ADD_PIZ_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADD_PIZ_ActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Cambria Math", 0, 26)); // NOI18N
        jLabel19.setText("     PIZZA");

        jLabel20.setFont(new java.awt.Font("Cambria Math", 0, 26)); // NOI18N
        jLabel20.setText(" DESSERT");

        DESSERT_.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECT" }));
        DESSERT_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DESSERT_ActionPerformed(evt);
            }
        });

        ADD_DES_.setBackground(new java.awt.Color(255, 255, 255));
        ADD_DES_.setText("Add");
        ADD_DES_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADD_DES_ActionPerformed(evt);
            }
        });

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/order-peperoni.png"))); // NOI18N

        DELETE_ITEM_.setBackground(new java.awt.Color(255, 255, 255));
        DELETE_ITEM_.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        DELETE_ITEM_.setText("DELETE ITEM");
        DELETE_ITEM_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DELETE_ITEM_ActionPerformed(evt);
            }
        });

        CLEAR_.setBackground(new java.awt.Color(255, 255, 255));
        CLEAR_.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        CLEAR_.setText("CLEAR");
        CLEAR_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CLEAR_ActionPerformed(evt);
            }
        });

        TYPE_OF_ORDER.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECT", "ONLINE ORDER", "TAKEAWAY" }));
        TYPE_OF_ORDER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TYPE_OF_ORDERActionPerformed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Cambria Math", 0, 28)); // NOI18N
        jLabel24.setText("Type  Of  Order :");

        EXIT_.setBackground(new java.awt.Color(255, 255, 255));
        EXIT_.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        EXIT_.setText("EXIT");
        EXIT_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EXIT_ActionPerformed(evt);
            }
        });

        SAVE_.setBackground(new java.awt.Color(255, 255, 255));
        SAVE_.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        SAVE_.setText("SAVE");
        SAVE_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SAVE_ActionPerformed(evt);
            }
        });

        CUSTOMER_NAME_.setFont(new java.awt.Font("Cambria Math", 0, 26)); // NOI18N
        CUSTOMER_NAME_.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel5.setFont(new java.awt.Font("Cambria Math", 0, 28)); // NOI18N

        jLabel23.setFont(new java.awt.Font("Cambria Math", 0, 28)); // NOI18N

        jLabel25.setFont(new java.awt.Font("Cambria Math", 0, 28)); // NOI18N

        jLabel26.setFont(new java.awt.Font("Cambria Math", 0, 28)); // NOI18N
        jLabel26.setText("DATE :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(HOME_DELIVERY)
                                        .addGap(31, 31, 31)
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(TAX))
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel26)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(20, 20, 20)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(43, 43, 43))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(SIDE_ORDERS_, 0, 162, Short.MAX_VALUE)
                                        .addGap(18, 18, 18)
                                        .addComponent(ADD_SO_))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(PASTA_, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(18, 18, 18)
                                        .addComponent(ADD_PASTA_))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(STARTERS_, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(18, 18, 18)
                                        .addComponent(ADD_STA_)))
                                .addGap(45, 45, 45))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(DESSERT_, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(ADD_DES_)))
                                .addGap(45, 45, 45))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel18)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(PIZZA_, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(ADD_PIZ_)))
                                .addGap(49, 49, 49))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(CUSTOMER_NAME_, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel24)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGap(223, 223, 223)
                                    .addComponent(TYPE_OF_ORDER, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(35, 35, 35))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(38, 38, 38))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(30, 30, 30)
                                .addComponent(MEMBERSHIP_, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel15)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(62, 62, 62))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(73, 73, 73)))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(DELETE_ITEM_, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(SAVE_, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(EXIT_, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(CLEAR_))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)))
                .addGap(162, 162, 162)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(jLabel9))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(134, 134, 134)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CLEAR_, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EXIT_, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SAVE_, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DELETE_ITEM_, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel5))
                            .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                            .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CUSTOMER_NAME_))
                        .addGap(713, 713, 713))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(STARTERS_, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ADD_STA_))))
                                .addGap(23, 23, 23)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(SIDE_ORDERS_, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ADD_SO_))
                                .addGap(27, 27, 27)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(PASTA_, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ADD_PASTA_))))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(PIZZA_, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ADD_PIZ_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(DESSERT_, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ADD_DES_)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(TYPE_OF_ORDER, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(MEMBERSHIP_, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TAX, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(HOME_DELIVERY, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(5, 5, 5)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(226, 226, 226))))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 692, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    Connection con;
    Statement st;
    ResultSet rs;

    private void sub_total()
    { // TO DISPLAY THE SUB TOTAL
         int rowcount=BILL_TABLE_.getRowCount();
         double sum=0;
         for (int i=0;i<rowcount;i++)
         {
           sum=sum+Double.parseDouble(""+BILL_TABLE_.getValueAt(i,4));
        }
         SUB_TOTAL.setText(""+sum);
      // TO CHECK WEATHER HOME DELIVERY IS AVAILABLE OR NOT   
         double sb=Double.parseDouble(SUB_TOTAL.getText());
         if (TYPE_OF_ORDER.getSelectedIndex()==1 && sb>1400)
         {
            HOME_DELIVERY.setEnabled(true);
        }
         else 
         {
            HOME_DELIVERY.setEnabled(false) ; HD_CHARGE_.setText(" 0 ");
         }
      // TO DISPLAY THE APPLIED TAX CHARGE 
        double tax;
         tax= (sb*10)/100 ;
         TAX_.setText(" "+tax);
      // TO DISPLAY THE HOME DELIVERY CHARGE   
         if (HOME_DELIVERY.isSelected()==false)
            HD_CHARGE_.setText("0");
         else HD_CHARGE_.setText("70");
         if (sb>2100)
            HD_CHARGE_.setText("0");
         
      // TO DISPLAY THE MEMEBERSHIP DISCOUNT
        double dis;
         if (MEMBERSHIP_.getSelectedIndex()==0)
            {  
            MEMBERSHIP_DIS_.setText(" 0 ");
            }
         else if (MEMBERSHIP_.getSelectedIndex()==1)
                 {  
                    MEMBERSHIP_DIS_.setText(" 0 ");
                 }
         else if (MEMBERSHIP_.getSelectedIndex()==2)
                 {  
                    dis=(sb*3)/100;
                    MEMBERSHIP_DIS_.setText(""+dis);
                 }
         else if (MEMBERSHIP_.getSelectedIndex()==3)
                 {  
                    dis=(sb*5)/100;
                    MEMBERSHIP_DIS_.setText(""+dis);         
                 }
         else if (MEMBERSHIP_.getSelectedIndex()==4)
                 {  
                    dis=(sb*10)/100;
                    MEMBERSHIP_DIS_.setText(""+dis);
                 }

      // TO DISPLAY THE GRAND TOTAL   
         sb=Double.parseDouble(SUB_TOTAL.getText());
         tax=Double.parseDouble(TAX_.getText());
         double hd=Double.parseDouble(HD_CHARGE_.getText());
         dis=Double.parseDouble(MEMBERSHIP_DIS_.getText());
        Double gt;
         gt=sb+tax+hd-dis;
         GRAND_TOTAL_.setText(" "+gt);
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed


    }//GEN-LAST:event_jButton2ActionPerformed


    private void MEMBERSHIP_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MEMBERSHIP_ActionPerformed


    }//GEN-LAST:event_MEMBERSHIP_ActionPerformed


    private void STARTERS_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_STARTERS_ActionPerformed


    }//GEN-LAST:event_STARTERS_ActionPerformed

    private void ADD_STA_ActionPerformed(java.awt.event.ActionEvent evt) {
    // WHEN THIS BUTTON IS CLICKED SELECTED STARTER IS ADDED TO BILL     
       try
       {
        DefaultTableModel t1=(DefaultTableModel) BILL_TABLE_.getModel();
        int q=1;
            int p = 0;
            double amt = 0;
        Object v=STARTERS_.getSelectedItem();
        rs=st.executeQuery("select * from menu where Item_Name='"+v+"';");
        while (rs.next())
            {
              Object row[]={rs.getString(1),rs.getString(2),rs.getString(3),q};
                t1.addRow(row);
            }
        int r=t1.getRowCount();
        for (int i=0;i<r;i++)
            {
              p=Integer.parseInt(""+t1.getValueAt(i,2));
              amt=p*q;
              t1.setValueAt(amt,i,4);
            }
        }
       catch (Exception e) {System.out.println(e.toString());}
        sub_total();

    }
    private void SIDE_ORDERS_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SIDE_ORDERS_ActionPerformed

        // TODO add your handling code here:

    }//GEN-LAST:event_SIDE_ORDERS_ActionPerformed

    private void ADD_SO_ActionPerformed(java.awt.event.ActionEvent evt) {
    // WHEN THIS BUTTON IS CLICKED SELECTED SIDE ORDER IS ADDED TO BILL
       try
       {
        DefaultTableModel t1=(DefaultTableModel) BILL_TABLE_.getModel();
        int q=1;
            int p = 0;
            double amt = 0;
        Object v=SIDE_ORDERS_.getSelectedItem();
        rs=st.executeQuery("select * from menu where Item_Name='"+v+"';");
        while (rs.next())
            {
              Object row[]={rs.getString(1),rs.getString(2),rs.getString(3),q};
                t1.addRow(row);
            }
        int r=t1.getRowCount();
        for (int i=0;i<r;i++)
            {
              p=Integer.parseInt(""+t1.getValueAt(i,2));
              amt=p*q;
              t1.setValueAt(amt,i,4);
            }
        }
       catch (Exception e) {System.out.println(e.toString());}
        sub_total();
    }
    private void PASTA_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PASTA_ActionPerformed

        // TODO add your handling code here:

    }//GEN-LAST:event_PASTA_ActionPerformed

    private void ADD_PASTA_ActionPerformed(java.awt.event.ActionEvent evt) {
    // WHEN THIS BUTTON IS CLICKED SELECTED PASTA IS ADDED TO BILL
       try
       {
        DefaultTableModel t1=(DefaultTableModel) BILL_TABLE_.getModel();
        int q=1;
            int p = 0;
            double amt = 0;
        Object v=PASTA_.getSelectedItem();
        rs=st.executeQuery("select * from menu where Item_Name='"+v+"';");
        while (rs.next())
            {
              Object row[]={rs.getString(1),rs.getString(2),rs.getString(3),q};
                t1.addRow(row);
            }
        int r=t1.getRowCount();
        for (int i=0;i<r;i++)
            {
              p=Integer.parseInt(""+t1.getValueAt(i,2));
              amt=p*q;
              t1.setValueAt(amt,i,4);
            }
        }
       catch (Exception e) {System.out.println(e.toString());}
        sub_total();
    }
    private void PIZZA_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PIZZA_ActionPerformed

        // TODO add your handling code here:

    }//GEN-LAST:event_PIZZA_ActionPerformed

    private void ADD_PIZ_ActionPerformed(java.awt.event.ActionEvent evt) {
    // WHEN THIS BUTTON IS CLICKED SELECTED PIZZA IS ADDED TO BILL
       try
       {
        DefaultTableModel t1=(DefaultTableModel) BILL_TABLE_.getModel();
        int q=1;
            int p = 0;
            double amt = 0;
        Object v=PIZZA_.getSelectedItem();
        rs=st.executeQuery("select * from menu where Item_Name='"+v+"';");
        while (rs.next())
            {
              Object row[]={rs.getString(1),rs.getString(2),rs.getString(3),q};
                t1.addRow(row);
            }
        int r=t1.getRowCount();
        for (int i=0;i<r;i++)
            {
              p=Integer.parseInt(""+t1.getValueAt(i,2));
              amt=p*q;
              t1.setValueAt(amt,i,4);
            }
        }
       catch (Exception e) {System.out.println(e.toString());}
        sub_total();
    }
    private void DESSERT_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DESSERT_ActionPerformed

        // TODO add your handling code here:

    }//GEN-LAST:event_DESSERT_ActionPerformed

    private void ADD_DES_ActionPerformed(java.awt.event.ActionEvent evt) {
    // WHEN THIS BUTTON IS CLICKED SELECTED DESSERT IS ADDED TO BILL  
       try
       {
        DefaultTableModel t1=(DefaultTableModel) BILL_TABLE_.getModel();
        int q=1;
            int p = 0;
            double amt = 0;
        Object v=DESSERT_.getSelectedItem();
        rs=st.executeQuery("select * from menu where Item_Name='"+v+"';");
        while (rs.next())
            {
              Object row[]={rs.getString(1),rs.getString(2),rs.getString(3),q};
                t1.addRow(row);
            }
        int r=t1.getRowCount();
        for (int i=0;i<r;i++)
            {
              p=Integer.parseInt(""+t1.getValueAt(i,2));
               amt=p*q;
              t1.setValueAt(amt,i,4);
            }
        }
       catch (Exception e) {System.out.println(e.toString());}
        sub_total();
    }

    private void BILL_TABLE_MouseClicked(java.awt.event.MouseEvent evt) {
        /* WHEN ANY ITEM OF BILL TABLE IS SELECTED THEN DIALOG BOX APPEARS
         ASKING THE USER QUATITY OF THE SELECTED ITEM */
       DefaultTableModel t1=(DefaultTableModel) BILL_TABLE_.getModel();
       int r=BILL_TABLE_.getSelectedRow();
       int q=Integer.parseInt(JOptionPane.showInputDialog("ENTER QTY :")+"");
        t1.setValueAt(q, r, 3);
       int p=Integer.parseInt((""+t1.getValueAt(r, 2)));
       t1.setValueAt(p*q, r, 4);
        sub_total();
    }

    private void DELETE_ITEM_ActionPerformed(java.awt.event.ActionEvent evt) {
    // WHEN THIS BUTTON IS CLICKED SELECTED ITEM IS DELETED FROM BILL
       DefaultTableModel t1=(DefaultTableModel) BILL_TABLE_.getModel();
       int r=BILL_TABLE_.getSelectedRow();
        t1.removeRow(r);
        sub_total();
    }
    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed


    }//GEN-LAST:event_jButton14ActionPerformed

    private void CLEAR_ActionPerformed(java.awt.event.ActionEvent evt) {
    /* TO SET ALL THE TEXT FIELDS,COMBO BOX, RADIO BUTTONS
       AND CHECK BOX TO DEFAULT AND TO CLEAR THE BILL TABLE */
       CUSTOMER_NAME_.setText(" ");
       SUB_TOTAL.setText(" ");
       TAX_.setText(" ");
       HD_CHARGE_.setText(" ");
       MEMBERSHIP_DIS_.setText(" ");
       GRAND_TOTAL_.setText(" ");
       TABLE_1.setSelected(false);  TABLE_1.setEnabled(false);
       TABLE_2.setSelected(false);  TABLE_2.setEnabled(false);
       TABLE_3.setSelected(false);  TABLE_3.setEnabled(false);
       TABLE_4.setSelected(false);  TABLE_4.setEnabled(false);
       TABLE_5.setSelected(false);  TABLE_5.setEnabled(false);
       TABLE_6.setSelected(false);  TABLE_6.setEnabled(false);
       TABLE_7.setSelected(false);  TABLE_7.setEnabled(false);
       TABLE_8.setSelected(false);  TABLE_8.setEnabled(false);
       TABLE_9.setSelected(false);  TABLE_9.setEnabled(false);
       TABLE_10.setSelected(false); TABLE_10.setEnabled(false);
       TYPE_OF_ORDER.setSelectedIndex(0);
       MEMBERSHIP_.setSelectedIndex(0);
       STARTERS_.setSelectedIndex(0);
       SIDE_ORDERS_.setSelectedIndex(0);
       PASTA_.setSelectedIndex(0);
       PIZZA_.setSelectedIndex(0);
       DESSERT_.setSelectedIndex(0);
       HOME_DELIVERY.setSelected(false); HOME_DELIVERY.setEnabled(false);
        TAX.setSelected(true);
       DefaultTableModel t1=(DefaultTableModel) BILL_TABLE_.getModel();
       int r=BILL_TABLE_.getRowCount();
       for (int i=0;i<r;i++)
       {
            t1.removeRow(0);
        }

       // TO SET ORDER ID FOR ORDER
       try 
       {
         int i=1;
         rs=st.executeQuery("SELECT * FROM orders;");
         while(rs.next())
                i++;
       }
       catch (Exception e) {System.out.println(e.toString());}
    }

    private void TYPE_OF_ORDERActionPerformed(java.awt.event.ActionEvent evt) {
    // WHEN ONLINE ORDER IS SELCTED     
       if (TYPE_OF_ORDER.getSelectedIndex()==1)
       { 
         TABLE_1.setSelected(false);  TABLE_1.setEnabled(false);
         TABLE_2.setSelected(false);  TABLE_2.setEnabled(false);
         TABLE_3.setSelected(false);  TABLE_3.setEnabled(false);
         TABLE_4.setSelected(false);  TABLE_4.setEnabled(false);
         TABLE_5.setSelected(false);  TABLE_5.setEnabled(false);
         TABLE_6.setSelected(false);  TABLE_6.setEnabled(false);
         TABLE_7.setSelected(false);  TABLE_7.setEnabled(false);
         TABLE_8.setSelected(false);  TABLE_8.setEnabled(false);
         TABLE_9.setSelected(false);  TABLE_9.setEnabled(false);
         TABLE_10.setSelected(false); TABLE_10.setEnabled(false);
        }
    // WHEN TAKEAWAY ORDER IS SELECTED   
       else if (TYPE_OF_ORDER.getSelectedIndex()==2)
       {
            HOME_DELIVERY.setEnabled(false);
            HOME_DELIVERY.setSelected(false);
            TABLE_1.setEnabled(true);
            TABLE_2.setEnabled(true);
            TABLE_3.setEnabled(true);
            TABLE_4.setEnabled(true);
            TABLE_5.setEnabled(true);
            TABLE_6.setEnabled(true);
            TABLE_7.setEnabled(true);
            TABLE_8.setEnabled(true);
            TABLE_9.setEnabled(true);
            TABLE_10.setEnabled(true);
            HD_CHARGE_.setText(" 0 ");
        }
    }

    private void TAXActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void HOME_DELIVERYActionPerformed(java.awt.event.ActionEvent evt) {
    // WHEN THIS CHECK BOX IS SELECTED RESP. HOME DELIVERY CHARGE IS DISPLAYED   
       double sb=Double.parseDouble(SUB_TOTAL.getText());
        double hd;
       if (sb>=1400 && sb<2100)
            HD_CHARGE_.setText("70");
        sub_total();
    }

    private void formWindowOpened(java.awt.event.WindowEvent evt) {
    // THIS MAKES CONNECTION BETWEEN Net Beans AND MySQL      
       try
       {
         //Class.forName("com.mysql.jdbc.Driver");
         con=DriverManager.getConnection("jdbc:mysql://db4free.net:3306/peperonipizzeria","curiorimor","curiorimor");
         st=con.createStatement();
        

    // TO SET ORDER ID FOR ORDER
         int i=1;
         rs=st.executeQuery("SELECT * FROM orders;");
         while(rs.next())
                i++;
         jLabel25.setText("OId-0"+i);

    // TO SET DATE TO ORDER
         long d=System.currentTimeMillis();
         SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
         String s=sdf.format(d);
            jLabel23.setText(s);
        }
       catch (Exception e) {System.out.println(e.toString());}

    // CONTROLS SET TO DEFAULT AT RUN TIME  
        HOME_DELIVERY.setEnabled(false);
        TABLE_1.setEnabled(true);
        TABLE_2.setEnabled(true);
        TABLE_3.setEnabled(true);
        TABLE_4.setEnabled(true);
        TABLE_5.setEnabled(true);
        TABLE_6.setEnabled(true);
        TABLE_7.setEnabled(true);
        TABLE_8.setEnabled(true);
        TABLE_9.setEnabled(true);
        TABLE_10.setEnabled(true);
        TAX.setSelected(true);

    try
    {
    // TO IMPORT ALL THE STARTERS FROM MENU      
      rs=st.executeQuery("SELECT Item_Name from menu where Item_Id like'ST%'");
      while(rs.next())
      {
         String item=rs.getString(1);
                STARTERS_.addItem(item);
            }
    // TO IMPORT ALL THE SIDE ORDERS FROM MENU
      rs=st.executeQuery("SELECT Item_Name from menu where Item_Id like'SO%'");
      while(rs.next())
       {
         String item=rs.getString(1);
                SIDE_ORDERS_.addItem(item);
            }
    // TO IMPORT ALL THE PASTAS FROM MENU
      rs=st.executeQuery("SELECT Item_Name FROM menu where Item_Id like'PA%'");
      while(rs.next())
       {
         String item=rs.getString(1);
                PASTA_.addItem(item);
            }
    // TO IMPORT ALL THE PIZZAS FROM MENU  
      rs=st.executeQuery("SELECT Item_Name FROM menu where Item_Id like'PI%'");
      while(rs.next())
       {
         String item=rs.getString(1);
                PIZZA_.addItem(item);
            }
    // TO IMPORT ALL THE DESERTS FROM MENU
      rs=st.executeQuery("SELECT Item_Name FROM menu where Item_Id like'D%'");
      while(rs.next())
       {
         String item=rs.getString(1);
                DESSERT_.addItem(item);
            }
        }
    catch (Exception e) {System.out.println(e.toString());}
    }                                 

    private void EXIT_ActionPerformed(java.awt.event.ActionEvent evt) {
    // WHEN THIS BUTTON IS CLICKED ADMIN PAGE IS DISPLAYED
       Admin_Page ap=new Admin_Page();
        ap.setVisible(true);
        this.dispose();
    }

    private void SAVE_ActionPerformed(java.awt.event.ActionEvent evt) {
    // TO SAVE ALL THE INFORMATION REGARDING ORDER  
       try
       {
        Object oid=jLabel25.getText();
        String dt=jLabel23.getText();
        long d=System.currentTimeMillis();
        SimpleDateFormat sdf=new SimpleDateFormat("hh:mm:ss");
        String tm=sdf.format(d);
        String n=CUSTOMER_NAME_.getText();
        Object o=TYPE_OF_ORDER.getSelectedItem();
        Object m=MEMBERSHIP_.getSelectedItem();  
            String hd;
        if (HOME_DELIVERY.isSelected())
        {
             hd="YES";
            }
        else hd="NO";
        String t="YES";
        double sb=Double.parseDouble(SUB_TOTAL.getText());
        double tc=Double.parseDouble(TAX_.getText());
        double hdc=Double.parseDouble(HD_CHARGE_.getText());
        double md=Double.parseDouble(MEMBERSHIP_DIS_.getText());
        double gt=Double.parseDouble(GRAND_TOTAL_.getText());
        st.executeUpdate("insert into orders values('"+oid+"','"+dt+"','"+tm+
                         "','"+n+"' ,'"+o+"', '"+m+"','"+hd+"','"+t+"', '"+sb+
                         "','"+tc+"','"+hdc+"','"+md+"','"+gt+"');");
        }
       catch (Exception e) {System.out.println(e.toString());} 

    // TO SAVE ALL THE ORDERED ITEMS 
       try 
       {
        DefaultTableModel t1=(DefaultTableModel) BILL_TABLE_.getModel();
        int r=t1.getRowCount();
        for(int i=0;i<r;i++)
         {
           String o=jLabel25.getText();
           Object id=t1.getValueAt(i,0);
           Object na=t1.getValueAt(i,1);
           Object p=t1.getValueAt(i,2);
           Object qty=t1.getValueAt(i,3);
           Object amt=t1.getValueAt(i,4);
           st.executeUpdate("insert into ordered_items values ('"+o+"','"+id+
                            "','"+na+"',"+p+","+qty+","+amt+");");
            }
        }
       catch (Exception e) {System.out.println(e.toString());}

       JOptionPane.showMessageDialog(rootPane,
      "Thankyou for Order ! Your Order is placed successfully :) ");


      try
      {
       // TO SET ORDER ID FOR ORDER
         int i=1;
         rs=st.executeQuery("SELECT * FROM orders;");
         while(rs.next())
                i++;
         jLabel25.setText("OId-0"+i);

    // TO SET DATE TO ORDER
         long d=System.currentTimeMillis();
         SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
         String s=sdf.format(d);
            jLabel23.setText(s);
        }
       catch (Exception e) {System.out.println(e.toString());}

    // CONTROLS SET TO DEFAULT AT RUN TIME
        CUSTOMER_NAME_.setText(" ");
       SUB_TOTAL.setText(" ");
       TAX_.setText(" ");
       HD_CHARGE_.setText(" ");
       MEMBERSHIP_DIS_.setText(" ");
       GRAND_TOTAL_.setText(" ");
       TABLE_1.setSelected(false);  TABLE_1.setEnabled(false);
       TABLE_2.setSelected(false);  TABLE_2.setEnabled(false);
       TABLE_3.setSelected(false);  TABLE_3.setEnabled(false);
       TABLE_4.setSelected(false);  TABLE_4.setEnabled(false);
       TABLE_5.setSelected(false);  TABLE_5.setEnabled(false);
       TABLE_6.setSelected(false);  TABLE_6.setEnabled(false);
       TABLE_7.setSelected(false);  TABLE_7.setEnabled(false);
       TABLE_8.setSelected(false);  TABLE_8.setEnabled(false);
       TABLE_9.setSelected(false);  TABLE_9.setEnabled(false);
       TABLE_10.setSelected(false); TABLE_10.setEnabled(false);
       TYPE_OF_ORDER.setSelectedIndex(0);
       MEMBERSHIP_.setSelectedIndex(0);
       STARTERS_.setSelectedIndex(0);
       SIDE_ORDERS_.setSelectedIndex(0);
       PASTA_.setSelectedIndex(0);
       PIZZA_.setSelectedIndex(0);
       DESSERT_.setSelectedIndex(0);
       HOME_DELIVERY.setSelected(false); HOME_DELIVERY.setEnabled(false);
        TAX.setSelected(true);
       DefaultTableModel t1=(DefaultTableModel) BILL_TABLE_.getModel();
       int r=BILL_TABLE_.getRowCount();
       for (int i=0;i<r;i++)
       {
            t1.removeRow(0);
        }

    try
    {
    // TO IMPORT ALL THE STARTERS FROM MENU
      rs=st.executeQuery("SELECT Item_Name from menu where Item_Id like'ST%'");
      while(rs.next())
      {
         String item=rs.getString(1);
                STARTERS_.addItem(item);
            }
    // TO IMPORT ALL THE SIDE ORDERS FROM MENU
      rs=st.executeQuery("SELECT Item_Name from menu where Item_Id like'SO%'");
      while(rs.next())
       {
         String item=rs.getString(1);
                SIDE_ORDERS_.addItem(item);
            }
    // TO IMPORT ALL THE PASTAS FROM MENU
      rs=st.executeQuery("SELECT Item_Name FROM menu where Item_Id like'PA%'");
      while(rs.next())
       {
         String item=rs.getString(1);
                PASTA_.addItem(item);
            }
    // TO IMPORT ALL THE PIZZAS FROM MENU
      rs=st.executeQuery("SELECT Item_Name FROM menu where Item_Id like'PI%'");
      while(rs.next())
       {
         String item=rs.getString(1);
                PIZZA_.addItem(item);
            }
    // TO IMPORT ALL THE DESERTS FROM MENU
      rs=st.executeQuery("SELECT Item_Name FROM menu where Item_Id like'D%'");
      while(rs.next())
       {
         String item=rs.getString(1);
                DESSERT_.addItem(item);
            }
        }
    catch (Exception e) {System.out.println(e.toString());}

    }

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked


    }//GEN-LAST:event_jLabel1MouseClicked


    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated


    }//GEN-LAST:event_formWindowActivated


    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

        //sub_total();

    }//GEN-LAST:event_jButton6ActionPerformed


    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed

        // TODO add your handling code here:

    }//GEN-LAST:event_jButton7ActionPerformed


    private void SAVE_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SAVE_1ActionPerformed

        // TODO add your handling code here:

    }//GEN-LAST:event_SAVE_1ActionPerformed


    private void SAVE_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SAVE_2ActionPerformed

        // TODO add your handling code here:

    }//GEN-LAST:event_SAVE_2ActionPerformed

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
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Order().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ADD_DES_;
    private javax.swing.JButton ADD_PASTA_;
    private javax.swing.JButton ADD_PIZ_;
    private javax.swing.JButton ADD_SO_;
    private javax.swing.JButton ADD_STA_;
    private javax.swing.JTable BILL_TABLE_;
    private javax.swing.JButton CLEAR_;
    private javax.swing.JTextField CUSTOMER_NAME_;
    private javax.swing.JButton DELETE_ITEM_;
    private javax.swing.JComboBox DESSERT_;
    private javax.swing.JButton EXIT_;
    private javax.swing.JTextField GRAND_TOTAL_;
    private javax.swing.JTextField HD_CHARGE_;
    private javax.swing.JCheckBox HOME_DELIVERY;
    private javax.swing.JComboBox MEMBERSHIP_;
    private javax.swing.JTextField MEMBERSHIP_DIS_;
    private javax.swing.JComboBox PASTA_;
    private javax.swing.JComboBox PIZZA_;
    private javax.swing.JButton SAVE_;
    private javax.swing.JButton SAVE_1;
    private javax.swing.JButton SAVE_2;
    private javax.swing.JComboBox SIDE_ORDERS_;
    private javax.swing.JComboBox STARTERS_;
    private javax.swing.JTextField SUB_TOTAL;
    private javax.swing.JRadioButton TABLE_1;
    private javax.swing.JRadioButton TABLE_10;
    private javax.swing.JRadioButton TABLE_2;
    private javax.swing.JRadioButton TABLE_3;
    private javax.swing.JRadioButton TABLE_4;
    private javax.swing.JRadioButton TABLE_5;
    private javax.swing.JRadioButton TABLE_6;
    private javax.swing.JRadioButton TABLE_7;
    private javax.swing.JRadioButton TABLE_8;
    private javax.swing.JRadioButton TABLE_9;
    private javax.swing.JCheckBox TAX;
    private javax.swing.JTextField TAX_;
    private javax.swing.JComboBox TYPE_OF_ORDER;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
    private static class ActionListner {

        public ActionListner() {
        }
    }

    private static class ActionEvent {

        public ActionEvent() {
        }
    }

    private static class Timer {

        public Timer(int i, ActionListner actionListner) {
        }

        private void start() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
}
