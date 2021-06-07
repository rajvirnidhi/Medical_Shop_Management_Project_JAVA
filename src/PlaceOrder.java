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
    public int final_qty,final_availqty,bno,contactno,cust_id,flag=0,flag_meds=0,flag_cust=0,flag_save=0;
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
        jButton1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jTextField_cid = new javax.swing.JTextField();
        jTextField_cname = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(600, 250));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Place order");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Customer Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Contact Number");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 138, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Address");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 179, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("City");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 220, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Medicine name");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 60, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Quantity");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 140, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Amount per box");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 180, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Total Amount");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 220, -1, -1));

        jTextField_cno.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(jTextField_cno, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 135, 200, -1));

        jTextField_cadd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(jTextField_cadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 176, 200, -1));

        jTextField_city.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(jTextField_city, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 217, 200, -1));

        jTextField_prc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(jTextField_prc, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 180, 200, -1));

        jTextField_total.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(jTextField_total, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 220, 200, -1));

        jTextField_availqty.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(jTextField_availqty, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 100, 200, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Availability");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 100, -1, -1));

        jButton_save.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/save.png"))); // NOI18N
        jButton_save.setText("Save");
        jButton_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_saveActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_save, new org.netbeans.lib.awtextra.AbsoluteConstraints(306, 258, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "medicine", "price", "quantity", "total", "batchno", "cust_name", "contactno", "city"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 353, 623, 135));

        jButton_printInvoice.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_printInvoice.setText("Print Invoice");
        jButton_printInvoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_printInvoiceActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_printInvoice, new org.netbeans.lib.awtextra.AbsoluteConstraints(642, 397, -1, -1));

        jTextField_qty.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField_qty.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_qtyKeyPressed(evt);
            }
        });
        getContentPane().add(jTextField_qty, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 140, 200, -1));

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
        getContentPane().add(jComboBox_mname, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 60, 200, -1));

        jButton_add.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_add.setText("Add");
        jButton_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_addActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_add, new org.netbeans.lib.awtextra.AbsoluteConstraints(408, 310, -1, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/Close.png"))); // NOI18N
        jButton1.setText("Close");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(745, 508, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Customer ID");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        jTextField_cid.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField_cid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_cidActionPerformed(evt);
            }
        });
        jTextField_cid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_cidKeyPressed(evt);
            }
        });
        getContentPane().add(jTextField_cid, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 60, 200, -1));

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
        getContentPane().add(jTextField_cname, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 94, 200, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/bkg850.jpg"))); // NOI18N
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    private void jButton_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_saveActionPerformed
        // TODO add your handling code here:
        try
        {
            String cid= jTextField_cid.getText();
            cust_id=Integer.parseInt(cid);
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
            jTextField_cid.setEditable(false);
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
                jTextField_total.setText("");
                
                //final_qty=final_availqty;
            }
            
            if(final_availqty == 0)
            {
                JOptionPane.showMessageDialog(null, "Item Unavailable");
                jTextField_qty.setText("");
                jTextField_total.setText("");
                //final_qty=final_availqty;
            }
            
            try
            {
                if(final_availqty > 0 && final_availqty >= final_qty)
                {
                    final_availqty-=final_qty;
                    Statement st1=con.createStatement();
                    st1.executeUpdate("UPDATE stock SET quantity = "+final_availqty+" WHERE product_name = '"+med_name+"'");
                    total=final_qty*prc;
                    pay=pay+total;
                    jTextField_total.setText(String.valueOf(final_qty*prc));
                    flag_meds=1;
                }
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e+"\nNot connected qty");
            }
            
            
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
            
            Statement st=con.createStatement();
            st.executeUpdate("delete from invoice");
            Statement st1=con.createStatement();
            st1.executeUpdate("delete from sales");
            
            new PlaceOrder().setVisible(true);
        } 
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, "Not connected!");
        }
    }//GEN-LAST:event_jButton_printInvoiceActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        //close the form
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField_cidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_cidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_cidActionPerformed

    private void jTextField_cidKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_cidKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()== KeyEvent.VK_ENTER)
        {
            String cid=jTextField_cid.getText();
            cust_id=Integer.parseInt(cid);
            try 
            {
                Connection con=ConnectionProvider.getCon();
                Statement st=con.createStatement();
                ResultSet rs=st.executeQuery("SELECT * FROM customer where cid="+cust_id);
                
                if(!rs.first())
                {
                    jButton_save.setVisible(true);
                    JOptionPane.showMessageDialog(null, "Customer not found! Add details");
                    flag_save=1;
                }
                else
                {
                    String name =rs.getString("name");
                    jTextField_cname.setText(name);
                    cust_name=name;
                    
                    int cno=rs.getInt("contact_number");
                    jTextField_cno.setText(String.valueOf(cno));
                    contactno=cno;
                    
                    String add =rs.getString("address");
                    jTextField_cadd.setText(add);
                    cust_add=add;
                    
                    String city =rs.getString("city");
                    jTextField_city.setText(city);
                    cust_city=city;
                    
                    jTextField_cid.setEditable(false);
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
    }//GEN-LAST:event_jTextField_cidKeyPressed

    private void jTextField_cnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_cnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_cnameActionPerformed

    private void jTextField_cnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_cnameKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_cnameKeyPressed

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
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton_add;
    private javax.swing.JButton jButton_printInvoice;
    private javax.swing.JButton jButton_save;
    private javax.swing.JComboBox<String> jComboBox_mname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JTextField jTextField_cid;
    private javax.swing.JTextField jTextField_city;
    private javax.swing.JTextField jTextField_cname;
    private javax.swing.JTextField jTextField_cno;
    private javax.swing.JTextField jTextField_prc;
    private javax.swing.JTextField jTextField_qty;
    private javax.swing.JTextField jTextField_total;
    // End of variables declaration//GEN-END:variables
}
