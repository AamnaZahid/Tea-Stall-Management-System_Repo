/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant.management.system;

import java.awt.event.ActionEvent;
import static java.lang.Class.forName;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;

/**
 *
 * @author Sweet Home
 */
public class Form2 extends javax.swing.JFrame {

    /**
     * Creates new form Form2
     */
    public Form2() {
        initComponents();
    }
    int total1=0;
    DefaultTableModel model;
    int qty1;
    String item1;
    int price1;
    int order_id1=0;
    int Item_num=0;
    int grt=0;
    //int lastdb;
    
String ordb="jdbc:oracle:thin:@localhost:1521/XE";
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txttea = new javax.swing.JRadioButton();
        txtmasalatea = new javax.swing.JRadioButton();
        txtgreentea = new javax.swing.JRadioButton();
        txtcardimumtea = new javax.swing.JRadioButton();
        txtkashmeritea = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        totaltxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        paymenttxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        balancetxt = new javax.swing.JTextField();
        quantity_Jpanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        qtyt = new javax.swing.JSpinner();
        addbtn = new javax.swing.JButton();
        printbtn = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        Optionstxt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 102, 153));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("T E A    S T A L L    M A N A G E M E N T   S Y S T E M ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(250, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 641, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(190, 190, 190))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txttea.setBackground(new java.awt.Color(255, 255, 255));
        txttea.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txttea.setForeground(new java.awt.Color(0, 102, 153));
        txttea.setText("Tea ");
        txttea.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txttea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtteaActionPerformed(evt);
            }
        });

        txtmasalatea.setBackground(new java.awt.Color(255, 255, 255));
        txtmasalatea.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtmasalatea.setForeground(new java.awt.Color(0, 51, 153));
        txtmasalatea.setText(" Masala Tea");

        txtgreentea.setBackground(new java.awt.Color(255, 255, 255));
        txtgreentea.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtgreentea.setForeground(new java.awt.Color(0, 51, 153));
        txtgreentea.setText(" Green Tea ");
        txtgreentea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtgreenteaActionPerformed(evt);
            }
        });

        txtcardimumtea.setBackground(new java.awt.Color(255, 255, 255));
        txtcardimumtea.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtcardimumtea.setForeground(new java.awt.Color(0, 51, 153));
        txtcardimumtea.setText(" Cardimum Tea");

        txtkashmeritea.setBackground(new java.awt.Color(255, 255, 255));
        txtkashmeritea.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtkashmeritea.setForeground(new java.awt.Color(0, 102, 153));
        txtkashmeritea.setText("kashmiri Tea");
        txtkashmeritea.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtkashmeritea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtkashmeriteaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtcardimumtea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtgreentea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txttea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtmasalatea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtkashmeritea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(134, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(txttea, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtkashmeritea, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(txtgreentea, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtcardimumtea, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtmasalatea, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(93, Short.MAX_VALUE))
        );

        Table.setBackground(new java.awt.Color(51, 0, 51));
        Table.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Table.setForeground(new java.awt.Color(255, 255, 255));
        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order no", "Item_num", "Item", "Qty", "Price", "Total"
            }
        ));
        Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Table);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 204));
        jLabel1.setText("Total");

        totaltxt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        totaltxt.setForeground(new java.awt.Color(0, 102, 153));
        totaltxt.setName("totaltxt"); // NOI18N
        totaltxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totaltxtActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 153));
        jLabel3.setText("Payment");

        paymenttxt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        paymenttxt.setForeground(new java.awt.Color(0, 102, 153));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 153));
        jLabel4.setText("Balance");

        balancetxt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        balancetxt.setForeground(new java.awt.Color(0, 102, 153));
        balancetxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                balancetxtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                            .addGap(16, 16, 16)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(totaltxt, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(10, 10, 10))))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(paymenttxt, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(balancetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)))))
                .addContainerGap(238, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(totaltxt, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(paymenttxt, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(balancetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(73, Short.MAX_VALUE))
        );

        jLabel5.setBackground(new java.awt.Color(153, 204, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 153));
        jLabel5.setText("Qty");

        qtyt.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        qtyt.setName("txt"); // NOI18N

        addbtn.setBackground(new java.awt.Color(153, 204, 255));
        addbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        addbtn.setForeground(new java.awt.Color(0, 102, 204));
        addbtn.setText("Add");
        addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbtnActionPerformed(evt);
            }
        });

        printbtn.setBackground(new java.awt.Color(153, 204, 255));
        printbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        printbtn.setForeground(new java.awt.Color(0, 102, 153));
        printbtn.setText("Print Invoice");
        printbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printbtnActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(153, 204, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 102, 153));
        jButton2.setText("Remove");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        Optionstxt.setBackground(new java.awt.Color(51, 255, 0));
        Optionstxt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Optionstxt.setForeground(new java.awt.Color(51, 51, 255));
        Optionstxt.setText("Options");
        Optionstxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OptionstxtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout quantity_JpanelLayout = new javax.swing.GroupLayout(quantity_Jpanel);
        quantity_Jpanel.setLayout(quantity_JpanelLayout);
        quantity_JpanelLayout.setHorizontalGroup(
            quantity_JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(quantity_JpanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(addbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(printbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(qtyt, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78)
                .addComponent(Optionstxt, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(182, 182, 182))
        );
        quantity_JpanelLayout.setVerticalGroup(
            quantity_JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(quantity_JpanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(quantity_JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(qtyt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(printbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Optionstxt, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(quantity_Jpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 14, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(quantity_Jpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtteaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtteaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtteaActionPerformed

    private void totaltxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totaltxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totaltxtActionPerformed

    private void balancetxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_balancetxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_balancetxtActionPerformed

    private void txtkashmeriteaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtkashmeriteaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtkashmeriteaActionPerformed
//public void sales()
//{
//    class.try {
//        forName("com.mysql.jdbc.driver");
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(Form2.class.getName()).log(Level.SEVERE, null, ex);
//        }
//}
    private void addbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbtnActionPerformed
        
        String query = "select order_id from ordertea";
    try (Connection conn = DriverManager.getConnection(ordb, "system", "admin");
         Statement stmt = conn.createStatement();) {
      ResultSet rs = stmt.executeQuery(query);
      
      
     while(rs.next()){
     order_id1 = rs.getInt("order_id");
     if(grt<=order_id1){
     grt = order_id1;
     }
     
     }
       /*int lastval = rs.getInt("order_num");
       System.out.println("Last value in database is: "+lastval);*/
       
  System.out.println("Last value in database is: "+grt);
    } catch (SQLException e) {
     e.printStackTrace();
    }
        if(txttea.isSelected()==true)
       {
           price1=50;
           item1="Simple Tea";
     
          order_id1= grt+1;
          System.out.println("order id is: "+order_id1);
         
           Item_num=Item_num+1;
       }
      else if(txtcardimumtea.isSelected()==true)
       {
           price1=90;
           item1="Cardimum Tea";
          
          order_id1= grt+1;
            Item_num=Item_num+1;
       }
        else if(txtmasalatea.isSelected()==true)
       {
           price1=60;
           item1="Masala Tea";
     
          order_id1= grt+1;
            Item_num=Item_num+1;
       }
        else if(txtkashmeritea.isSelected()==true)
       {
           price1=80;
           item1="Kashmiri Tea";
         
          order_id1= grt+1;
            Item_num=Item_num+1;
       }
        else if(txtgreentea.isSelected()==true)
       {
           price1=70;
           item1="Green Tea";
        
         order_id1= grt+1;
            Item_num=Item_num+1;
       }
//       try{
//        Class.forName("com.mysql.ojdbc.driver");
//        Connection con = DriverManager.getConnection("ojdbc:mysql://system:item1table","system","8080");
//          Statement st = con.createStatement();
//        st.executeUpdate("insert into item1table (item1_id) values ('1')");
//        
//           
//       }
//       catch(Exception e)
//       {
//        System.out.println(e);
//       }
//        
         qty1=Integer.parseInt(qtyt.getValue().toString());
      total1=total1+qty1*price1;
      
       model=(DefaultTableModel)Table.getModel();
       
       model.addRow(new Object[]{ order_id1, Item_num,item1, qty1,price1, total1});
       
       int sum=0;
       for(int i=0;i<Table.getRowCount();i++)
       {
         sum= sum+Integer.parseInt(Table.getValueAt(i, 5).toString());
           
       }
       totaltxt.setText(Integer.toString(total1));
        
    }//GEN-LAST:event_addbtnActionPerformed

    
    

    
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     model.removeRow(Table.getSelectedRow());int sum=0;
    
     
       for(int i=0;i<Table.getRowCount();i++)
       {
           sum= sum+Integer.parseInt(Table.getValueAt(i, 4).toString());      
       }
      totaltxt.setText(Integer.toString(sum));  
       
        totaltxt.setText(null);
        balancetxt.setText(null);
        paymenttxt.setText(null);
        this.total1 = 0;
        this.order_id1 = 0;
        
        
        
     
    }//GEN-LAST:event_jButton2ActionPerformed

    private void printbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printbtnActionPerformed
      int balance;
      int paymnt;
       String dftotal = totaltxt.getText();
     String q="Select * from itemtable1;";////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        paymnt = Integer.parseInt(paymenttxt.getText());
       
    balance = paymnt-total1;
     System.out.println(paymnt);
    balancetxt.setText(Integer.toString(balance));
    
    
    // Open a connection
      try(Connection conn = DriverManager.getConnection(ordb, "system", "admin");
         Statement stmt = conn.createStatement();
      ) {		      
         // Execute a query
         
         System.out.println("Inserting records into the table...");          
         String sql = "insert into ordertea values ("+order_id1+")";
         stmt.executeUpdate(sql);
         String sql2 = "insert into teatable values("+order_id1+",'"+item1+"',"+qty1+","+price1+",'"+dftotal+"')";
         stmt.executeUpdate(sql2);       
       
      } catch (SQLException e) {
      } 
   
      String query = "select * from teatable";
    try (Connection conn = DriverManager.getConnection(ordb, "system", "admin");
         Statement stmt = conn.createStatement();) {
      ResultSet rs = stmt.executeQuery(query);
      while (rs.next()) {
        int item_num = rs.getInt ("item_num");
        String item_name = rs.getString("item_name");
        int qty = rs.getInt("quantity");
        int price = rs.getInt("price");
        int total = rs.getInt("total");
        System.out.println(item_num + ", " + item_name + ", " + price +
                           ", " + qty + ", " + total);
      }
    } catch (SQLException e) {
     e.printStackTrace();
    }
    }//GEN-LAST:event_printbtnActionPerformed

    private void txtgreenteaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtgreenteaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtgreenteaActionPerformed

    private void TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableMouseClicked

    }//GEN-LAST:event_TableMouseClicked

    private void OptionstxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OptionstxtActionPerformed
       NewOptions NO = new NewOptions();
       NO.show();
        
    }//GEN-LAST:event_OptionstxtActionPerformed

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
            java.util.logging.Logger.getLogger(Form2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            private ActionEvent evt;
            public void run() {
                new Form2().setVisible(true);
                
               Form2 obj= new Form2();
               obj.printbtnActionPerformed(evt);
             
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Optionstxt;
    private javax.swing.JTable Table;
    private javax.swing.JButton addbtn;
    private javax.swing.JTextField balancetxt;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField paymenttxt;
    private javax.swing.JButton printbtn;
    private javax.swing.JSpinner qtyt;
    private javax.swing.JPanel quantity_Jpanel;
    private javax.swing.JTextField totaltxt;
    private javax.swing.JRadioButton txtcardimumtea;
    private javax.swing.JRadioButton txtgreentea;
    private javax.swing.JRadioButton txtkashmeritea;
    private javax.swing.JRadioButton txtmasalatea;
    private javax.swing.JRadioButton txttea;
    // End of variables declaration//GEN-END:variables
}
