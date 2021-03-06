
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nidhi Rajvir
 */
public class Home extends javax.swing.JFrame {

    public int i=0;
    /**
     * Creates new form Home
     */
    public Home() {
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

        jButton_arrow = new javax.swing.JButton();
        jButton_stock = new javax.swing.JButton();
        jButton_sell = new javax.swing.JButton();
        jButton_client = new javax.swing.JButton();
        jButton_report = new javax.swing.JButton();
        jButton_logout = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton_arrow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/two arrow.png"))); // NOI18N
        jButton_arrow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_arrowActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_arrow, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, 59, -1));

        jButton_stock.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_stock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/box.png"))); // NOI18N
        jButton_stock.setText("Stock");
        jButton_stock.setPreferredSize(new java.awt.Dimension(210, 59));
        jButton_stock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_stockActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_stock, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 128, -1, -1));

        jButton_sell.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_sell.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/order.png"))); // NOI18N
        jButton_sell.setText("Place Order");
        jButton_sell.setPreferredSize(new java.awt.Dimension(210, 59));
        jButton_sell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_sellActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_sell, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 241, -1, -1));

        jButton_client.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_client.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/client.png"))); // NOI18N
        jButton_client.setText("Customer");
        jButton_client.setPreferredSize(new java.awt.Dimension(210, 59));
        jButton_client.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_clientActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_client, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 363, -1, -1));

        jButton_report.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_report.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/report.png"))); // NOI18N
        jButton_report.setText("Report");
        jButton_report.setPreferredSize(new java.awt.Dimension(210, 59));
        jButton_report.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_reportActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_report, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 481, -1, -1));

        jButton_logout.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/logout.png"))); // NOI18N
        jButton_logout.setText("Logout");
        jButton_logout.setPreferredSize(new java.awt.Dimension(210, 59));
        jButton_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_logoutActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 593, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/background4.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_stockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_stockActionPerformed
        // TODO add your handling code here:
        //open stock jframe
        new AddStock().setVisible(true);
    }//GEN-LAST:event_jButton_stockActionPerformed

    private void jButton_sellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_sellActionPerformed
        // TODO add your handling code here:
        //open sell jframe
        new PlaceOrder().setVisible(true);
    }//GEN-LAST:event_jButton_sellActionPerformed

    private void jButton_arrowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_arrowActionPerformed
        // TODO add your handling code here:
        //setting button view
        if(i==0)
        {
            jButton_stock.setLocation(84,5);
            jButton_sell.setLocation(327,5);
            jButton_client.setLocation(570,5);
            jButton_report.setLocation(813,5);
            jButton_logout.setLocation(1056,5);
            i=1;
        }
        
        else
        {
            jButton_stock.setLocation(5,117);
            jButton_sell.setLocation(5,235);
            jButton_client.setLocation(5,353);
            jButton_report.setLocation(5,471);
            jButton_logout.setLocation(5,589);
            i=0;
        }
    }//GEN-LAST:event_jButton_arrowActionPerformed

    
    
    private void jButton_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_logoutActionPerformed
        // TODO add your handling code here:
        //ask for logout confirmation
        int a=JOptionPane.showConfirmDialog(null, "Do you really want to logout?","Select",JOptionPane.YES_NO_OPTION);
        if(a==0)
        {
            setVisible(false);
            new login().setVisible(true);
        }
    }//GEN-LAST:event_jButton_logoutActionPerformed

    private void jButton_clientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_clientActionPerformed
        // TODO add your handling code here:
        //open client jframe
        new Customer().setVisible(true);
    }//GEN-LAST:event_jButton_clientActionPerformed

    private void jButton_reportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_reportActionPerformed
        // TODO add your handling code here:
        //open report jframe
        new Report().setVisible(true);
    }//GEN-LAST:event_jButton_reportActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_arrow;
    private javax.swing.JButton jButton_client;
    private javax.swing.JButton jButton_logout;
    private javax.swing.JButton jButton_report;
    private javax.swing.JButton jButton_sell;
    private javax.swing.JButton jButton_stock;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
