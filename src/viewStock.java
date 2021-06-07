
import Project.ConnectionProvider;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nidhi Rajvir
 */
public class viewStock extends javax.swing.JFrame {

    String name="";
    /**
     * Creates new form viewStock
     */
    public viewStock() {
        initComponents();
        fillcombo();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton_close = new javax.swing.JButton();
        jComboBox_mname = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(600, 250));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Stock List");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(321, 41, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Medicine Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, -1, 20));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Company name", "Batch number", "Price", "Quantity", "expiry date"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 826, 50));

        jButton_close.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/Close.png"))); // NOI18N
        jButton_close.setText("Close");
        jButton_close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_closeActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_close, new org.netbeans.lib.awtextra.AbsoluteConstraints(745, 508, -1, -1));

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
        getContentPane().add(jComboBox_mname, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, 200, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/bkg850.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_closeActionPerformed
        // TODO add your handling code here:
        //close the form
        setVisible(false);
        new AddStock().setVisible(true);
    }//GEN-LAST:event_jButton_closeActionPerformed

    private void jComboBox_mnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_mnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_mnameActionPerformed

    private void fillcombo()
    {
        try
        {
            String sql="select * from stock";
            Connection con=ConnectionProvider.getCon();
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
    private void jComboBox_mnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboBox_mnameKeyPressed
        // TODO add your handling code here:
        
        if(evt.getKeyCode()== KeyEvent.VK_ENTER)
        {
            name=(String) jComboBox_mname.getSelectedItem();
            try
        {
            Connection con=ConnectionProvider.getCon();
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("SELECT * FROM stock where product_name='"+name+"';");
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Connection error");
        }
        }
    }//GEN-LAST:event_jComboBox_mnameKeyPressed

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
            java.util.logging.Logger.getLogger(viewStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewStock().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_close;
    private javax.swing.JComboBox<String> jComboBox_mname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}