/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analogsection;
import static analogsection.Information.infoType;
import java.awt.CardLayout;
import java.awt.LayoutManager;

/**
 *
 * @author John
 */
public class WoodMainPanel extends javax.swing.JPanel {
    private Object button;

    /**
     * Creates new form WoodMainPanel
     */
    public WoodMainPanel() {
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

        jProgressBar1 = new javax.swing.JProgressBar();
        InfoLbl = new javax.swing.JLabel();
        QuizLbl = new javax.swing.JLabel();
        WhatsLbl = new javax.swing.JLabel();
        ExitBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        QuizBtn = new javax.swing.JButton();
        WhatsBtn = new javax.swing.JButton();
        HomeBtn = new javax.swing.JButton();
        BackgroundLbl = new javax.swing.JLabel();
        InfoBtn = new javax.swing.JButton();

        setLayout(null);

        InfoLbl.setIcon(new javax.swing.ImageIcon("C:\\Users\\John\\Desktop\\rsz_1rsz_1imageedit_4_4600978165.png")); // NOI18N
        add(InfoLbl);
        InfoLbl.setBounds(110, 100, 140, 70);

        QuizLbl.setIcon(new javax.swing.ImageIcon("C:\\Users\\John\\Desktop\\rsz_1rsz_1rsz_quiz.jpg")); // NOI18N
        add(QuizLbl);
        QuizLbl.setBounds(120, 180, 140, 60);

        WhatsLbl.setIcon(new javax.swing.ImageIcon("C:\\Users\\John\\Desktop\\rsz_title859716636.png")); // NOI18N
        add(WhatsLbl);
        WhatsLbl.setBounds(120, 250, 160, 70);

        ExitBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/analogsection/exit.png"))); // NOI18N
        ExitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitBtnActionPerformed(evt);
            }
        });
        add(ExitBtn);
        ExitBtn.setBounds(330, 10, 40, 41);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\John\\Desktop\\rsz_mainmenu2.gif")); // NOI18N
        jLabel2.setText("jLabel2");
        add(jLabel2);
        jLabel2.setBounds(90, 340, 160, 30);

        QuizBtn.setBackground(new java.awt.Color(255, 255, 255));
        QuizBtn.setText("To image Quiz");
        QuizBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuizBtnActionPerformed(evt);
            }
        });
        add(QuizBtn);
        QuizBtn.setBounds(120, 180, 140, 60);

        WhatsBtn.setBackground(new java.awt.Color(255, 255, 255));
        WhatsBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        WhatsBtn.setText("\"Whats It Made Of\"");
        WhatsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WhatsBtnActionPerformed(evt);
            }
        });
        add(WhatsBtn);
        WhatsBtn.setBounds(120, 250, 160, 70);

        HomeBtn.setBackground(new java.awt.Color(0, 102, 204));
        HomeBtn.setText("Previous Menu");
        HomeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeBtnActionPerformed(evt);
            }
        });
        add(HomeBtn);
        HomeBtn.setBounds(100, 340, 150, 30);

        BackgroundLbl.setIcon(new javax.swing.ImageIcon("C:\\Users\\John\\Desktop\\paddysimg.jpg.jpg")); // NOI18N
        add(BackgroundLbl);
        BackgroundLbl.setBounds(0, 0, 400, 440);

        InfoBtn.setBackground(new java.awt.Color(255, 255, 255));
        InfoBtn.setText("To Wood Info");
        InfoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InfoBtnActionPerformed(evt);
            }
        });
        add(InfoBtn);
        InfoBtn.setBounds(110, 100, 120, 50);
    }// </editor-fold>//GEN-END:initComponents

    private void InfoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InfoBtnActionPerformed
        //sends what type of information it is to the infopanel to process  
        infoType = 4;
        Information.InfoType(infoType);
        LayoutManager layout = getParent().getLayout();
        if (layout instanceof java.awt.CardLayout) {
            java.awt.CardLayout cl = (java.awt.CardLayout)layout;
            cl.show(getParent(), "WoodInfoScreen");
        }
// TODO add your handling code here:
    }//GEN-LAST:event_InfoBtnActionPerformed

    private void QuizBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuizBtnActionPerformed
            LayoutManager layout = getParent().getLayout();
        if (layout instanceof java.awt.CardLayout) {
            java.awt.CardLayout cl = (java.awt.CardLayout)layout;
            cl.show(getParent(), "WoodQuizScreen");
        }
          
          


// TODO add your handling code here:
    }//GEN-LAST:event_QuizBtnActionPerformed

    private void WhatsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WhatsBtnActionPerformed
        LayoutManager layout = getParent().getLayout();
        if (layout instanceof java.awt.CardLayout) {
            java.awt.CardLayout cl = (java.awt.CardLayout)layout;
            cl.show(getParent(), "WoodWhatsScreen");
        }

// TODO add your handling code here:
    }//GEN-LAST:event_WhatsBtnActionPerformed

    private void ExitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitBtnActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_ExitBtnActionPerformed

    private void HomeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeBtnActionPerformed
        // TODO add your handling code here:
        LayoutManager layout = getParent().getLayout();
        if (layout instanceof java.awt.CardLayout) {
            java.awt.CardLayout cl = (java.awt.CardLayout)layout;
            cl.show(getParent(), "MAIN");
        }
    }//GEN-LAST:event_HomeBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackgroundLbl;
    private javax.swing.JButton ExitBtn;
    private javax.swing.JButton HomeBtn;
    private javax.swing.JButton InfoBtn;
    private javax.swing.JLabel InfoLbl;
    private javax.swing.JButton QuizBtn;
    private javax.swing.JLabel QuizLbl;
    private javax.swing.JButton WhatsBtn;
    private javax.swing.JLabel WhatsLbl;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JProgressBar jProgressBar1;
    // End of variables declaration//GEN-END:variables

   
}
