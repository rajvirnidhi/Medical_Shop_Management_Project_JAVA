import Project.ConnectionProvider;
import java.awt.event.KeyEvent;
import java.sql.*;
import java.util.HashMap;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

public class PlaceOrder extends javax.swing.JFrame {

    Connection con=ConnectionProvider.getCon();
    public int final_qty,final_availqty,bno,contactno,flag=0,flag_meds=0,flag_cust=0,flag_save=0;
    public double prc,total,pay=0,gst;
    public String cust_name,cust_add,cust_city,med_name;
    
    public PlaceOrder() {
        initComponents();
        jButton_save.setVisible(false);
        
        jTextField_total.setEditable(false);
        jTextField_prc.setEditable(false);
        jTextField_availqty.setEditable(false);
        
        fillcombo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField_cname = new javax.swing.JTextField();
        jTextField_cno = new javax.swing.JTextField();
        jTextField_cadd = new javax.swing.JTextField();
        jTextField_city = new javax.swing.JTextField();
        jTextField_prc = new javax.swing.JTextField();
        jTextField_total = new javax.swing.JTextField();
        jTextField_availqty = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jButton_save = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton_printInvoice = new javax.swing.JButton();
        jTextField_qty = new javax.swing.JTextField();
        jComboBox_mname = new javax.swing.JComboBox<>();
        jButton_add = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(600, 250));
        setUndecorated(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Place order");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Customer Name");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Contact Number");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Address");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("City");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Medicine name");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Quantity");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Amount per box");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Total Amount");

        jTextField_cname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField_cname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_cnameActionPerformed(evt);
            }
        });
        jTextField_cname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_cnameKeyPressed(evt);
            }
        });

        jTextField_cno.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextField_cadd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextField_city.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextField_prc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextField_total.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextField_availqty.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Availability");

        jButton_save.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/save.png"))); // NOI18N
        jButton_save.setText("Save");
        jButton_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_saveActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "medicine", "price", "quantity", "total", "batchno", "cust_name", "contactno", "city"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton_printInvoice.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_printInvoice.setText("Print Invoice");
        jButton_printInvoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_printInvoiceActionPerformed(evt);
            }
        });

        jTextField_qty.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField_qty.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_qtyKeyPressed(evt);
            }
        });

        jComboBox_mname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBox_mname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_mnameActionPerformed(evt);
            }
        });
        jComboBox_mname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jComboBox_mnameKeyPressed(evt);
            }
        });

        jButton_add.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_add.setText("Add");
        jButton_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_addActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 623, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                        .addComponent(jButton_printInvoice))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(300, 300, 300)
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField_city, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(jTextField_cadd, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextField_cno, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextField_cname, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(306, 306, 306)
                                .addComponent(jButton_save)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField_availqty)
                            .addComponent(jTextField_prc)
                            .addComponent(jTextField_total)
                            .addComponent(jTextField_qty)
                            .addComponent(jComboBox_mname, 0, 200, Short.MAX_VALUE))))
                .addGap(87, 87, 87))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton_add)
                .addGap(381, 381, 381))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6)
                    .addComponent(jTextField_cname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox_mname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField_cno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_availqty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField_cadd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField_qty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField_city, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_prc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jButton_save))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jButton_add)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jButton_printInvoice)))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_saveActionPerformed
        // TODO add your handling code here:
        try
        {
            String cname= jTextField_cname.getText();
            cust_name=cname;
            String strcno= jTextField_cno.getText();
            String add= jTextField_cadd.getText();
            cust_add=add;
            String city= jTextField_city.getText();
            cust_city=city;
            int cno=Integer.parseInt(strcno);
            contactno=cno;
            Connection con=ConnectionProvider.getCon();
            Statement st1=con.createStatement();
            st1.executeUpdate("insert into customer values('"+cname+"','"+cno+"','"+add+"','"+city+"')");
            JOptionPane.showMessageDialog(null,"Successfully Updated");
            flag_cust=2;
            jTextField_cname.setEditable(false);
            jTextField_cno.setEditable(false);
            jTextField_cadd.setEditable(false);
            jTextField_city.setEditable(false);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "please enter data in correct format");
        }
    }//GEN-LAST:event_jButton_saveActionPerformed
    
    private void jTextField_cnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_cnameKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()== KeyEvent.VK_ENTER)
        {
            String name=jTextField_cname.getText();
            cust_name=name;
            try 
            {
                Connection con=ConnectionProvider.getCon();
                Statement st=con.createStatement();
                ResultSet rs=st.executeQuery("SELECT * FROM customer where name='"+name+"';");
                
                if(!rs.first())
                {
                    jButton_save.setVisible(true);
                    JOptionPane.showMessageDialog(null, "Customer not found! Add details");
                    flag_save=1;
                }
                else
                {
                    int cno=rs.getInt("contact_number");
                    jTextField_cno.setText(String.valueOf(cno));
                    contactno=cno;
                    
                    String add =rs.getString("address");
                    jTextField_cadd.setText(add);
                    cust_add=add;
                    
                    String city =rs.getString("city");
                    jTextField_city.setText(city);
                    cust_city=city;
                    
                    jTextField_cname.setEditable(false);
                    jTextField_cno.setEditable(false);
                    jTextField_cadd.setEditable(false);
                    jTextField_city.setEditable(false);
                    
                    flag_cust=1;
                }
            } 
            catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Not connected c_name!");
            }
        }
    }//GEN-LAST:event_jTextField_cnameKeyPressed

    private void fillcombo()
    {
        try
        {
            String sql="select * from stock";
            PreparedStatement pst=con.prepareStatement(sql);
            ResultSet rs=pst.executeQuery();
            
            while(rs.next())
            {
                String name=rs.getString("product_name");
                jComboBox_mname.addItem(name);
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Invalid");
        }
    }
    
    private void jTextField_qtyKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_qtyKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()== KeyEvent.VK_ENTER)
        {
            final_qty=Integer.parseInt(jTextField_qty.getText());
            if(flag==0)
            {
                JOptionPane.showMessageDialog(null, "Please enter medicine name!");
            }
            
            if(final_availqty < final_qty)
            {
                JOptionPane.showMessageDialog(null, "Exceeded maximum limit!\nAvailable: "+final_availqty);
                jTextField_qty.setText("");
                //final_qty=final_availqty;
            }
            
            if(final_availqty == 0)
            {
                JOptionPane.showMessageDialog(null, "Item Unavailable");
                jTextField_qty.setText("");
                //final_qty=final_availqty;
            }
            
            try
            {
                final_availqty-=final_qty;
                Statement st1=con.createStatement();
                st1.executeUpdate("UPDATE stock SET quantity = "+final_availqty+"WHERE product_name = '"+med_name+"'");
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, "Not connected qty");
            }
            
            total=final_qty*prc;
            pay=pay+total;
            jTextField_total.setText(String.valueOf(final_qty*prc));
            flag_meds=1;
        }
    }//GEN-LAST:event_jTextField_qtyKeyPressed

    private void jComboBox_mnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_mnameActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jComboBox_mnameActionPerformed

    private void jComboBox_mnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboBox_mnameKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()== KeyEvent.VK_ENTER)
        {
            String name=(String) jComboBox_mname.getSelectedItem();
            med_name=name;
                try 
                {
                    Connection con=ConnectionProvider.getCon();
                    Statement st=con.createStatement();
                    ResultSet rs=st.executeQuery("SELECT * FROM stock where product_name='"+name+"';");
                    rs.next();
                    
                    bno=rs.getInt("batch_number");
                    
                    int availqty=rs.getInt("quantity");
                    final_availqty=availqty;
                    jTextField_availqty.setText(String.valueOf(availqty));

                    prc=rs.getDouble("price");
                    jTextField_prc.setText(String.valueOf(prc));

                    flag=1;
                }

            catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Not connected!");
                }
        }
    }//GEN-LAST:event_jComboBox_mnameKeyPressed

    private void jButton_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_addActionPerformed
        // TODO add your handling code here:
        if(flag_cust!=0 && flag_meds!=0)
        {
            try
            {
                /*Statement st1=con.createStatement();
                st1.executeUpdate("insert into order values('"+med_name+"','"+prc+"','"+final_qty+"','"+total+"','"+bno+"','"+cust_name+"','"+contactno+"','"+cust_city+"')");
                */
                
                PreparedStatement pst=con.prepareStatement("insert into place_order values(?,?,?,?,?,?,?,?)");  
                pst.setString(1,med_name);
                pst.setDouble(2,prc); 
                pst.setInt(3, final_qty);
                pst.setDouble(4,total);
                pst.setInt(5,bno);
                pst.setString(6,cust_name); 
                pst.setInt(7, contactno);
                pst.setString(8,cust_city);
                int i=pst.executeUpdate();
                
                
                
                PreparedStatement pst1=con.prepareStatement("insert into invoice values(?,?,?,?,?,?,?,?,?)");  
                pst1.setString(1,med_name);
                pst1.setDouble(2,prc); 
                pst1.setInt(3, final_qty);
                pst1.setDouble(4,total);
                pst1.setInt(5,bno);
                pst1.setString(6,cust_name); 
                pst1.setInt(7, contactno);
                pst1.setString(8,cust_city);
                pst1.setDouble(9,pay);
                int j=pst1.executeUpdate();
                
                if(i==j)
                {
                    JOptionPane.showMessageDialog(null, "Added!");
                }
                
                jTextField_availqty.setText("");
                jTextField_qty.setText("");
                jTextField_prc.setText("");
                jTextField_total.setText("");
                
                DefaultTableModel df=(DefaultTableModel)jTable1.getModel();
                df.addRow(new Object[]
                {
                    med_name,prc,final_qty,total,bno,cust_name,contactno,cust_city
                });
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e+"\nNot connected!");
            }
        }
        else
        {
            if(flag_save==1 && flag_save!=2)
            {
                JOptionPane.showMessageDialog(null, "Save customer data!");
            }
            if(flag_cust==0)
            {
                JOptionPane.showMessageDialog(null, "Enter customer details");
            }
            if(flag_meds==0)
            {
                JOptionPane.showMessageDialog(null, "Enter medicine name!");
            }
        }
    }//GEN-LAST:event_jButton_addActionPerformed

    private void jTextField_cnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_cnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_cnameActionPerformed

    private void jButton_printInvoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_printInvoiceActionPerformed
        try {
            // TODO add your handling code here:
            gst= pay+((pay*18)/100);
            PreparedStatement pst=con.prepareStatement("insert into sales values(?,?,?)");
            pst.setString(1,med_name);
            pst.setDouble(2,pay);
            pst.setDouble(3, gst);
            int j=pst.executeUpdate();
            
            HashMap a= new HashMap();
            JasperDesign jdesign =JRXmlLoader.load("C:\\Users\\Nidhi Rajvir\\OneDrive\\Documents\\NetBeansProjects\\Medical Shop Management System\\src\\printinvoice.jrxml");
            JasperReport jreport = JasperCompileManager.compileReport(jdesign);
            
            JasperPrint jprint=JasperFillManager.fillReport(jreport, a, con);
            JasperViewer.viewReport(jprint);
            
        } 
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, "Not connected!");
        }
    }//GEN-LAST:event_jButton_printInvoiceActionPerformed

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
            java.util.logging.Logger.getLogger(PlaceOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlaceOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlaceOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlaceOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PlaceOrder().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_add;
    private javax.swing.JButton jButton_printInvoice;
    private javax.swing.JButton jButton_save;
    private javax.swing.JComboBox<String> jComboBox_mname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField_availqty;
    private javax.swing.JTextField jTextField_cadd;
    private javax.swing.JTextField jTextField_city;
    private javax.swing.JTextField jTextField_cname;
    private javax.swing.JTextField jTextField_cno;
    private javax.swing.JTextField jTextField_prc;
    private javax.swing.JTextField jTextField_qty;
    private javax.swing.JTextField jTextField_total;
    // End of variables declaration//GEN-END:variables
}
