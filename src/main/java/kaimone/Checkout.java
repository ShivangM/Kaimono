/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kaimone;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author nano
 */
public class Checkout extends javax.swing.JFrame {

    String name = "";
    String total = "";
    int totalAmount = 0;
    double totalTax,netAmount;
    
    public Checkout() {
        super("Kaimono | Bye Groceries Online!");
        initComponents();
        
        try{
            conn con = new conn();
            String sql = "SELECT * FROM cur_user";
            String sql2 = "select sum(item_netprice) as total_sum from user_cart";
            Statement s = con.c.createStatement();
            
            ResultSet rs = s.executeQuery(sql);
            
            rs.next();
            name = rs.getString("username");
            
            rs = s.executeQuery(sql2);
            rs.next();
            totalAmount = rs.getInt("total_sum");
            total = "Rs." + String.valueOf(totalAmount);
        }
        catch(Exception e){
            e.getStackTrace();
        }
        
        this.username.setText(name);
        this.atbp.setText(total);
        
        totalTax = totalAmount*0.18;
        netAmount = totalAmount + totalTax;
        this.tax.setText("Rs. " + String.valueOf(totalTax));
        this.net.setText("Rs. " + String.valueOf(netAmount));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPanel = new javax.swing.JPanel();
        Nav = new javax.swing.JPanel();
        KaimonoH = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        Logout = new javax.swing.JLabel();
        username = new javax.swing.JLabel();
        MyCart = new javax.swing.JPanel();
        cartlable = new javax.swing.JLabel();
        Checkout = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        Settings = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        Feedbacks = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        Confirm = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        Back = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        Heading = new javax.swing.JLabel();
        seprator = new javax.swing.JSeparator();
        rateus = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        add = new javax.swing.JTextArea();
        dts = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        phoneNumber = new javax.swing.JTextField();
        atbp = new javax.swing.JLabel();
        net = new javax.swing.JLabel();
        tax = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MainPanel.setBackground(new java.awt.Color(153, 153, 255));
        MainPanel.setForeground(new java.awt.Color(255, 255, 255));

        Nav.setBackground(new java.awt.Color(51, 0, 204));

        KaimonoH.setBackground(new java.awt.Color(153, 153, 255));
        KaimonoH.setFont(new java.awt.Font("Baloo Da 2", 0, 24)); // NOI18N
        KaimonoH.setForeground(new java.awt.Color(255, 255, 255));
        KaimonoH.setText("Kaimono");

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        Logout.setFont(new java.awt.Font("Baloo Da 2", 0, 14)); // NOI18N
        Logout.setForeground(new java.awt.Color(255, 255, 255));
        Logout.setText("Logout");
        Logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogoutMouseClicked(evt);
            }
        });

        username.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        username.setForeground(new java.awt.Color(255, 255, 255));
        username.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        username.setText("Username");

        MyCart.setBackground(new java.awt.Color(51, 0, 204));
        MyCart.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        MyCart.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MyCart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MyCartMouseClicked(evt);
            }
        });

        cartlable.setForeground(new java.awt.Color(255, 255, 255));
        cartlable.setText("My Cart");

        javax.swing.GroupLayout MyCartLayout = new javax.swing.GroupLayout(MyCart);
        MyCart.setLayout(MyCartLayout);
        MyCartLayout.setHorizontalGroup(
            MyCartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MyCartLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(cartlable)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        MyCartLayout.setVerticalGroup(
            MyCartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MyCartLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cartlable, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                .addContainerGap())
        );

        Checkout.setBackground(new java.awt.Color(51, 0, 204));
        Checkout.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        Checkout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Checkout");

        javax.swing.GroupLayout CheckoutLayout = new javax.swing.GroupLayout(Checkout);
        Checkout.setLayout(CheckoutLayout);
        CheckoutLayout.setHorizontalGroup(
            CheckoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CheckoutLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        CheckoutLayout.setVerticalGroup(
            CheckoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CheckoutLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                .addContainerGap())
        );

        Settings.setBackground(new java.awt.Color(51, 0, 204));
        Settings.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        Settings.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Settings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SettingsMouseClicked(evt);
            }
        });

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Settings");

        javax.swing.GroupLayout SettingsLayout = new javax.swing.GroupLayout(Settings);
        Settings.setLayout(SettingsLayout);
        SettingsLayout.setHorizontalGroup(
            SettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SettingsLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SettingsLayout.setVerticalGroup(
            SettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SettingsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                .addContainerGap())
        );

        Feedbacks.setBackground(new java.awt.Color(51, 0, 204));
        Feedbacks.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        Feedbacks.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Feedbacks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FeedbacksMouseClicked(evt);
            }
        });

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Feedbacks");

        javax.swing.GroupLayout FeedbacksLayout = new javax.swing.GroupLayout(Feedbacks);
        Feedbacks.setLayout(FeedbacksLayout);
        FeedbacksLayout.setHorizontalGroup(
            FeedbacksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FeedbacksLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel12)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        FeedbacksLayout.setVerticalGroup(
            FeedbacksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FeedbacksLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout NavLayout = new javax.swing.GroupLayout(Nav);
        Nav.setLayout(NavLayout);
        NavLayout.setHorizontalGroup(
            NavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NavLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(NavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Feedbacks, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, NavLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(NavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(KaimonoH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator1))
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, NavLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(Logout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(34, 34, 34))
                    .addComponent(MyCart, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Checkout, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Settings, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, NavLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(username, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(27, 27, 27)))
                .addGap(24, 24, 24))
        );
        NavLayout.setVerticalGroup(
            NavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NavLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(KaimonoH, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(username)
                .addGap(18, 18, 18)
                .addComponent(MyCart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Checkout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Settings, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Feedbacks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Logout)
                .addGap(17, 17, 17))
        );

        Confirm.setBackground(new java.awt.Color(51, 0, 204));
        Confirm.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Confirm.setFont(new java.awt.Font("Baloo Da 2", 0, 12)); // NOI18N
        Confirm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ConfirmMouseClicked(evt);
            }
        });

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("CONFIRM");

        javax.swing.GroupLayout ConfirmLayout = new javax.swing.GroupLayout(Confirm);
        Confirm.setLayout(ConfirmLayout);
        ConfirmLayout.setHorizontalGroup(
            ConfirmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ConfirmLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabel10)
                .addContainerGap(64, Short.MAX_VALUE))
        );
        ConfirmLayout.setVerticalGroup(
            ConfirmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ConfirmLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(9, 9, 9))
        );

        Back.setBackground(new java.awt.Color(51, 0, 204));
        Back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Back.setFont(new java.awt.Font("Baloo Da 2", 0, 12)); // NOI18N
        Back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackMouseClicked(evt);
            }
        });

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("BACK");

        javax.swing.GroupLayout BackLayout = new javax.swing.GroupLayout(Back);
        Back.setLayout(BackLayout);
        BackLayout.setHorizontalGroup(
            BackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackLayout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jLabel11)
                .addContainerGap(77, Short.MAX_VALUE))
        );
        BackLayout.setVerticalGroup(
            BackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                .addContainerGap())
        );

        Heading.setFont(new java.awt.Font("Baloo Da 2", 0, 36)); // NOI18N
        Heading.setForeground(new java.awt.Color(255, 255, 255));
        Heading.setText("Checkout");

        seprator.setBackground(new java.awt.Color(255, 255, 255));
        seprator.setForeground(new java.awt.Color(255, 255, 255));

        rateus.setFont(new java.awt.Font("Baloo Da 2", 0, 14)); // NOI18N
        rateus.setForeground(new java.awt.Color(255, 255, 255));
        rateus.setText("Delivery Time Slot :");

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Address:");

        add.setBackground(new java.awt.Color(255, 255, 255));
        add.setColumns(20);
        add.setFont(new java.awt.Font("Baloo Da 2", 0, 12)); // NOI18N
        add.setForeground(new java.awt.Color(0, 0, 0));
        add.setRows(5);
        add.setText("Please enter your complete adress.");
        add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(add);

        dts.setBackground(new java.awt.Color(255, 255, 255));
        dts.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10AM - 12PM", "12PM -  2PM", "2PM - 6PM", "6PM - 8PM" }));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Amount to be paid: ");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Taxes (GST):");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Net Amount to be Paid:");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Phone Number:");

        phoneNumber.setBackground(new java.awt.Color(153, 153, 255));
        phoneNumber.setFont(new java.awt.Font("Baloo Da 2", 0, 12)); // NOI18N
        phoneNumber.setForeground(new java.awt.Color(255, 255, 255));
        phoneNumber.setText("Phone Number");
        phoneNumber.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        phoneNumber.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                phoneNumberMouseClicked(evt);
            }
        });
        phoneNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneNumberActionPerformed(evt);
            }
        });

        atbp.setForeground(new java.awt.Color(255, 255, 255));
        atbp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        atbp.setText("jLabel6");

        net.setForeground(new java.awt.Color(255, 255, 255));
        net.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        net.setText("jLabel6");

        tax.setForeground(new java.awt.Color(255, 255, 255));
        tax.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tax.setText("jLabel6");

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addComponent(Nav, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(Confirm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)
                        .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(Heading)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainPanelLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(MainPanelLayout.createSequentialGroup()
                                .addComponent(rateus)
                                .addGap(126, 126, 126)
                                .addComponent(dts, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(MainPanelLayout.createSequentialGroup()
                                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(MainPanelLayout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(131, 131, 131)
                                        .addComponent(atbp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jLabel1)
                                    .addComponent(seprator, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(MainPanelLayout.createSequentialGroup()
                                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel3))
                                        .addGap(112, 112, 112)
                                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tax, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(net, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(MainPanelLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(153, 153, 153)
                                .addComponent(phoneNumber)))))
                .addGap(53, 53, 53))
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(Heading)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(seprator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(atbp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tax))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(net))
                .addGap(11, 11, 11)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(phoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rateus)
                    .addComponent(dts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Back, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Confirm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(15, 15, 15))
            .addComponent(Nav, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutMouseClicked

        try{
            conn con = new conn();
            Statement s = con.c.createStatement();
            String query = "delete from cur_user";
            String query2 = "delete from user_cart";
            s.executeUpdate(query);
            s.executeUpdate(query2);

        }catch (Exception e){
            e.getStackTrace();
        }

        JOptionPane.showMessageDialog(this, "Sucessfully Logout!", "Logout", JOptionPane.PLAIN_MESSAGE);

        LoginPage l = new LoginPage();
        this.setVisible(false);
        l.setVisible(true);
    }//GEN-LAST:event_LogoutMouseClicked

    private void MyCartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MyCartMouseClicked
        MyCart mc = new MyCart();
        this.setVisible(false);
        mc.setVisible(true);
    }//GEN-LAST:event_MyCartMouseClicked

    private void SettingsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SettingsMouseClicked
        AccSettings s = new AccSettings();
        this.setVisible(false);
        s.setVisible(true);
    }//GEN-LAST:event_SettingsMouseClicked

    private void FeedbacksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FeedbacksMouseClicked
        Feedback f = new Feedback();
        this.setVisible(false);
        f.setVisible(true);
    }//GEN-LAST:event_FeedbacksMouseClicked

    private void ConfirmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConfirmMouseClicked
        if(phoneNumber.getText().isEmpty() || add.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please enter complete infromation!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else{
            int confirm = JOptionPane.showConfirmDialog(null, ("Confrim order of Rs." + netAmount + " ?"),"Confirmation", JOptionPane.YES_NO_OPTION);
            
            if(confirm == 0){
                try{
                    conn con = new conn();

                    //Creating account

                    String sql = "insert into orders values(?, ?, ?, ?, ?, ?, ?)";
                    PreparedStatement st = con.c.prepareStatement(sql);
                    st.setString(1, String.valueOf(totalAmount));
                    st.setString(2, String.valueOf(totalTax));
                    st.setString(3, String.valueOf(netAmount));
                    st.setString(4, this.phoneNumber.getText());
                    st.setString(5, String.valueOf(dts.getSelectedItem()));
                    st.setString(6, add.getText());
                    st.setString(7, name);


                    st.executeUpdate();
                }
                catch(Exception e2){
                    e2.getStackTrace();
                }
                
                JOptionPane.showMessageDialog(null, "Your Order has been placed! Thank you for using Kaimono.");
                JOptionPane.showMessageDialog(null, "You will get further details on your phone number.");
            }
            else{
                JOptionPane.showMessageDialog(null, "Order Canceled");
                this.phoneNumber.setText("Phone Number");
                this.add.setText("Please enter you complete address.");
            }
        
        }
    }//GEN-LAST:event_ConfirmMouseClicked

    private void BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseClicked
        MainMenu mm = new MainMenu();
        this.setVisible(false);
        mm.setVisible(true);
    }//GEN-LAST:event_BackMouseClicked

    private void phoneNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneNumberActionPerformed

    private void addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseClicked
        this.add.setText("");
    }//GEN-LAST:event_addMouseClicked

    private void phoneNumberMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_phoneNumberMouseClicked
        this.phoneNumber.setText("");
    }//GEN-LAST:event_phoneNumberMouseClicked

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
            java.util.logging.Logger.getLogger(Checkout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Checkout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Checkout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Checkout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Checkout().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Back;
    private javax.swing.JPanel Checkout;
    private javax.swing.JPanel Confirm;
    private javax.swing.JPanel Feedbacks;
    private javax.swing.JLabel Heading;
    private javax.swing.JLabel KaimonoH;
    private javax.swing.JLabel Logout;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JPanel MyCart;
    private javax.swing.JPanel Nav;
    private javax.swing.JPanel Settings;
    private javax.swing.JTextArea add;
    private javax.swing.JLabel atbp;
    private javax.swing.JLabel cartlable;
    private javax.swing.JComboBox<String> dts;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel net;
    private javax.swing.JTextField phoneNumber;
    private javax.swing.JLabel rateus;
    private javax.swing.JSeparator seprator;
    private javax.swing.JLabel tax;
    private javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables
}
