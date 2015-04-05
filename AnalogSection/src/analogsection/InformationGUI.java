/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analogsection;

/**
 *
 * @author Stephen
 */
public class InformationGUI extends javax.swing.JFrame {

    /**
     * Creates new form InformationGUI
     */
    public InformationGUI() {
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

        headingLbl = new javax.swing.JLabel();
        exitBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        infoTf = new javax.swing.JTextField();
        nextBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        backgroundLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        headingLbl.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        headingLbl.setForeground(new java.awt.Color(0, 102, 255));
        headingLbl.setText("Details:");
        getContentPane().add(headingLbl);
        headingLbl.setBounds(10, 180, 280, 31);

        exitBtn.setBackground(new java.awt.Color(0, 102, 255));
        exitBtn.setText("Exit ");
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });
        getContentPane().add(exitBtn);
        exitBtn.setBounds(200, 400, 190, 23);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 150, 0, 0);

        jLabel2.setFont(new java.awt.Font("Apple Chancery", 1, 18)); // NOI18N
        jLabel2.setText(" Information");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(150, 0, 150, 40);

        infoTf.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        infoTf.setText("A capacitor (originally known as a condenser) is a passive two-terminal \n");
        getContentPane().add(infoTf);
        infoTf.setBounds(10, 210, 380, 180);

        nextBtn .setOpaque(false);
        nextBtn  .setContentAreaFilled(false);
        nextBtn  .setBorderPainted(false);
        getContentPane().add(nextBtn);
        nextBtn.setBounds(330, 0, 70, 40);

        backBtn .setOpaque(false);
        backBtn .setContentAreaFilled(false);
        backBtn .setBorderPainted(false);
        getContentPane().add(backBtn);
        backBtn.setBounds(0, -1, 33, 40);

        backgroundLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/analogsection/InformationGUI.png"))); // NOI18N
        getContentPane().add(backgroundLbl);
        backgroundLbl.setBounds(0, 0, 400, 450);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_exitBtnActionPerformed

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
            java.util.logging.Logger.getLogger(InformationGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InformationGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InformationGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InformationGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InformationGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel backgroundLbl;
    private javax.swing.JButton exitBtn;
    private javax.swing.JLabel headingLbl;
    private javax.swing.JTextField infoTf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton nextBtn;
    // End of variables declaration//GEN-END:variables
}
