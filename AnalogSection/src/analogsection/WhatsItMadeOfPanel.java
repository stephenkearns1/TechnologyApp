/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analogsection;

import java.awt.CardLayout;
import java.awt.LayoutManager;
/**
 *
 * @author John
 */
public class WhatsItMadeOfPanel extends javax.swing.JPanel {

    /**
     * Creates new form WhatsItMadeOfPanel
     */
    public WhatsItMadeOfPanel() {
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

        TitleLbl = new javax.swing.JLabel();
        BabkNextLbl = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        HeadingLbl = new javax.swing.JLabel();
        QuestionTF = new javax.swing.JTextField();
        Ans3RBtn = new javax.swing.JRadioButton();
        Ans4RBtn = new javax.swing.JRadioButton();
        Ans1RBtn = new javax.swing.JRadioButton();
        SubmitBtn = new javax.swing.JButton();
        BackgroundLbl2 = new javax.swing.JLabel();
        BackgroundLbl = new javax.swing.JLabel();
        MenuBtn = new javax.swing.JButton();

        setLayout(null);

        TitleLbl.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        TitleLbl.setForeground(new java.awt.Color(255, 255, 255));
        TitleLbl.setText("This is the section for the \"Whats it made of\"");
        add(TitleLbl);
        TitleLbl.setBounds(70, 10, 316, 20);

        BabkNextLbl.setIcon(new javax.swing.ImageIcon("C:\\Users\\John\\Desktop\\resize.png")); // NOI18N
        add(BabkNextLbl);
        BabkNextLbl.setBounds(280, 260, 110, 110);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\John\\Desktop\\images (2).jpg")); // NOI18N
        add(jLabel2);
        jLabel2.setBounds(100, 30, 260, 200);

        HeadingLbl.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        HeadingLbl.setForeground(new java.awt.Color(255, 255, 255));
        HeadingLbl.setText("Question:");
        add(HeadingLbl);
        HeadingLbl.setBounds(60, 270, 80, 20);

        QuestionTF.setText("What wood is this made of?");
        QuestionTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuestionTFActionPerformed(evt);
            }
        });
        add(QuestionTF);
        QuestionTF.setBounds(130, 270, 170, 30);

        Ans3RBtn.setText("Oak");
        add(Ans3RBtn);
        Ans3RBtn.setBounds(60, 310, 70, 23);

        Ans4RBtn.setText("Fern");
        Ans4RBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ans4RBtnActionPerformed(evt);
            }
        });
        add(Ans4RBtn);
        Ans4RBtn.setBounds(140, 310, 70, 23);

        Ans1RBtn.setText("Chestnut");
        add(Ans1RBtn);
        Ans1RBtn.setBounds(220, 310, 70, 23);

        SubmitBtn.setBackground(new java.awt.Color(51, 153, 255));
        SubmitBtn.setText("Submit");
        SubmitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitBtnActionPerformed(evt);
            }
        });
        add(SubmitBtn);
        SubmitBtn.setBounds(110, 340, 130, 30);

        BackgroundLbl2.setIcon(new javax.swing.ImageIcon("C:\\Users\\John\\Desktop\\Wood-Background-Texture-452x336.jpg")); // NOI18N
        add(BackgroundLbl2);
        BackgroundLbl2.setBounds(0, 310, 450, 100);

        BackgroundLbl.setIcon(new javax.swing.ImageIcon("C:\\Users\\John\\Desktop\\Wood-Background-Texture-452x336.jpg")); // NOI18N
        add(BackgroundLbl);
        BackgroundLbl.setBounds(0, 0, 450, 310);

        MenuBtn.setText("Main menu");
        MenuBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuBtnActionPerformed(evt);
            }
        });
        add(MenuBtn);
        MenuBtn.setBounds(310, 310, 90, 23);
    }// </editor-fold>//GEN-END:initComponents

    private void MenuBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuBtnActionPerformed
        LayoutManager layout = getParent().getLayout();
        if (layout instanceof java.awt.CardLayout) {
            java.awt.CardLayout cl = (java.awt.CardLayout)layout;
            cl.show(getParent(), "WoodMainScreen");
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_MenuBtnActionPerformed

    private void QuestionTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuestionTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_QuestionTFActionPerformed

    private void Ans4RBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ans4RBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ans4RBtnActionPerformed

    private void SubmitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SubmitBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Ans1RBtn;
    private javax.swing.JRadioButton Ans3RBtn;
    private javax.swing.JRadioButton Ans4RBtn;
    private javax.swing.JLabel BabkNextLbl;
    private javax.swing.JLabel BackgroundLbl;
    private javax.swing.JLabel BackgroundLbl2;
    private javax.swing.JLabel HeadingLbl;
    private javax.swing.JButton MenuBtn;
    private javax.swing.JTextField QuestionTF;
    private javax.swing.JButton SubmitBtn;
    private javax.swing.JLabel TitleLbl;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables

} // fixed error Stephen 
