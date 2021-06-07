/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import Project.ConnectionProvider;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Nidhi Rajvir
 */
public class Customer extends javax.swing.JFrame {

    /**
     * Creates new form Client
     */
    public Customer() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField_cname = new javax.swing.JTextField();
        jTextField_cno = new javax.swing.JTextField();
        jTextField_cadd = new javax.swing.JTextField();
        jTextField_city = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton_save = new javax.swing.JButton();
        jButton_viewCustomer = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(600, 250));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Add Customer");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Customer Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 130, 115, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Contact Number");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 175, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Address");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 228, 115, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("City");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 276, 115, -1));

        jTextField_cname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(jTextField_cname, new org.netbeans.lib.awtextra.AbsoluteConstraints(447, 127, 250, -1));

        jTextField_cno.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(jTextField_cno, new org.netbeans.lib.awtextra.AbsoluteConstraints(447, 172, 250, -1));

        jTextField_cadd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField_cadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_caddActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField_cadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(447, 225, 250, -1));

        jTextField_city.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField_city.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_cityActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField_city, new org.netbeans.lib.awtextra.AbsoluteConstraints(447, 273, 250, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/Close.png"))); // NOI18N
        jButton1.setText("Close");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(745, 508, -1, -1));

        jButton_save.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/save.png"))); // NOI18N
        jButton_save.setText("Save");
        jButton_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_saveActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_save, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 330, -1, -1));

        jButton_viewCustomer.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_viewCustomer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/eye.png"))); // NOI18N
        jButton_viewCustomer.setText("View Customer");
        jButton_viewCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_viewCustomerActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_viewCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 380, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/bkg850.jpg"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        //close the form
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField_caddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_caddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_caddActionPerformed

    private void jTextField_cityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_cityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_cityActionPerformed

    private void jButton_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_saveActionPerformed
        // TODO add your handling code here:
        String cname= jTextField_cname.getText();
        String strcno= jTextField_cno.getText();
        String add= jTextField_cadd.getText();
        String city= jTextField_city.getText();
        int cno=Integer.parseInt(strcno);
        try
        {
            Connection con=ConnectionProvider.getCon();
            Statement st=con.createStatement();
            st.executeUpdate("insert into customer values('"+cname+"','"+cno+"','"+add+"','"+city+"')");
            JOptionPane.showMessageDialog(null,"Successfully Updated");
            setVisible(false);
            new Customer().setVisible(true);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "please enter data in correct format");
        }
    }//GEN-LAST:event_jButton_saveActionPerformed

    private void jButton_viewCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_viewCustomerActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new viewCustomer().setVisible(true);
    }//GEN-LAST:event_jButton_viewCustomerActionPerformed

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
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Customer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton_save;
    private javax.swing.JButton jButton_viewCustomer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextField_cadd;
    private javax.swing.JTextField jTextField_city;
    private javax.swing.JTextField jTextField_cname;
    private javax.swing.JTextField jTextField_cno;
    // End of variables declaration//GEN-END:variables
}