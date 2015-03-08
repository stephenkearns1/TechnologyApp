/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analogsection;

import java.awt.LayoutManager;

/**
 *
 * @author Stephen Kearns
 */
public class AnalogDiganosticGUIPanel extends javax.swing.JPanel {

    /**
     * Creates new form DiganosticGUIPanel
     */
    public AnalogDiganosticGUIPanel() {
        initComponents();
        this.setSize(400,450);
        
        //hide the next content
        imageChangeLbl.setVisible(false);
        changeTextLbl.setVisible(false);
        changeInfoLbl.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLbl = new javax.swing.JLabel();
        nameLbl = new javax.swing.JLabel();
        anwserLbl = new javax.swing.JLabel();
        useLbl = new javax.swing.JLabel();
        infoLbl = new javax.swing.JLabel();
        exitBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        nextBtn = new javax.swing.JButton();
        imageChangeLbl = new javax.swing.JLabel();
        changeTextLbl = new javax.swing.JLabel();
        changeInfoLbl = new javax.swing.JLabel();
        backgroundLbl = new javax.swing.JLabel();

        setLayout(null);

        titleLbl.setFont(new java.awt.Font("Apple Chancery", 1, 18)); // NOI18N
        titleLbl.setText("Analog Section");
        add(titleLbl);
        titleLbl.setBounds(140, 0, 160, 40);

        nameLbl.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        nameLbl.setForeground(new java.awt.Color(0, 102, 255));
        nameLbl.setText("Name:");
        add(nameLbl);
        nameLbl.setBounds(10, 256, 70, 30);

        anwserLbl.setText("Oscilloscope");
        add(anwserLbl);
        anwserLbl.setBounds(70, 264, 240, 16);

        useLbl.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        useLbl.setForeground(new java.awt.Color(0, 102, 255));
        useLbl.setText("Use:");
        add(useLbl);
        useLbl.setBounds(10, 310, 70, 20);

        infoLbl.setText("To observe the change of an electrical signal over time.");
        add(infoLbl);
        infoLbl.setBounds(20, 330, 370, 70);

        exitBtn.setBackground(new java.awt.Color(0, 102, 255));
        exitBtn.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        exitBtn.setText("Exit");
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });
        add(exitBtn);
        exitBtn.setBounds(225, 399, 150, 40);

        backBtn .setOpaque(false);
        backBtn .setContentAreaFilled(false);
        backBtn.setBorderPainted(false);
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn);
        backBtn.setBounds(0, -1, 75, 40);

        nextBtn.setOpaque(false);
        nextBtn.setContentAreaFilled(false);
        nextBtn.setBorderPainted(false);
        nextBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextBtnActionPerformed(evt);
            }
        });
        add(nextBtn);
        nextBtn.setBounds(310, 0, 75, 40);

        imageChangeLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/analogsection/multimeter.jpeg"))); // NOI18N
        add(imageChangeLbl);
        imageChangeLbl.setBounds(80, 70, 440, 150);

        changeTextLbl.setText("Multimeter");
        add(changeTextLbl);
        changeTextLbl.setBounds(70, 260, 100, 20);

        changeInfoLbl.setText("used to troubleshoot electrical problems");
        add(changeInfoLbl);
        changeInfoLbl.setBounds(10, 360, 370, 16);

        backgroundLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/analogsection/DiganosticGUI.png"))); // NOI18N
        add(backgroundLbl);
        backgroundLbl.setBounds(0, 0, 400, 450);
    }// </editor-fold>//GEN-END:initComponents

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        // TODO add your handling code here:
         LayoutManager layout = getParent().getLayout();
        if (layout instanceof java.awt.CardLayout) {
            java.awt.CardLayout cl = (java.awt.CardLayout)layout;
            cl.show(getParent(), "AnalogMainScreen");
        }
    }//GEN-LAST:event_exitBtnActionPerformed

    private void nextBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextBtnActionPerformed
        // TODO add your handling code here:
        anwserLbl.setVisible(false);
        infoLbl.setVisible(false);
        imageChangeLbl.setVisible(true);
        changeTextLbl.setVisible(true);
        changeInfoLbl.setVisible(true);
        
        
    }//GEN-LAST:event_nextBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        imageChangeLbl.setVisible(false);
        changeTextLbl.setVisible(false);
         changeInfoLbl.setVisible(false);
        anwserLbl.setVisible(true);
        infoLbl.setVisible(true);
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel anwserLbl;
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel backgroundLbl;
    private javax.swing.JLabel changeInfoLbl;
    private javax.swing.JLabel changeTextLbl;
    private javax.swing.JButton exitBtn;
    private javax.swing.JLabel imageChangeLbl;
    private javax.swing.JLabel infoLbl;
    private javax.swing.JLabel nameLbl;
    private javax.swing.JButton nextBtn;
    private javax.swing.JLabel titleLbl;
    private javax.swing.JLabel useLbl;
    // End of variables declaration//GEN-END:variables
}
