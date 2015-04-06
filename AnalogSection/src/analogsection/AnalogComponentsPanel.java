/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analogsection;

import static analogsection.InformationGUIAllSections.infoSelected;
import java.awt.LayoutManager;
import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author Stephen
 */

public class AnalogComponentsPanel extends javax.swing.JPanel {

    /**
     * Creates new form AnalogComponentsPanel
     */
    
    Information analogInfo;
    Information digitalInfo;
    private ArrayList <String> info;
    private int count,imgSelector,imgSelectorDigital,i;
    private String infoDisplayed;
    private ImageIcon ImgDisplayedLbl;
    public AnalogComponentsPanel() {
        initComponents();
        this.setSize(400,450);
    
        imageChangeLbl.setVisible(false);
        analogInfo = new Information();
        digitalInfo = new Information();
        infoDisplayed = "";
        count =0;
        imgSelector = 0;
  
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        detailsLbl = new javax.swing.JLabel();
        infoLbl = new javax.swing.JLabel();
        exitBtn = new javax.swing.JButton();
        imageChangeLbl = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        nextBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        backgroundLbl = new javax.swing.JLabel();

        setLayout(null);

        detailsLbl.setBackground(new java.awt.Color(255, 255, 255));
        detailsLbl.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        detailsLbl.setForeground(new java.awt.Color(51, 153, 255));
        detailsLbl.setText("Details:");
        add(detailsLbl);
        detailsLbl.setBounds(10, 220, 110, 30);

        infoLbl.setFont(new java.awt.Font("Lucida Grande", 1, 10)); // NOI18N
        infoLbl.setText("A capacitor (originally known as a condenser) is a passive two-terminal  ");
        add(infoLbl);
        infoLbl.setBounds(10, 210, 380, 130);

        exitBtn.setBackground(new java.awt.Color(0, 153, 255));
        exitBtn.setText("Exit");
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });
        add(exitBtn);
        exitBtn.setBounds(220, 390, 150, 40);

        imageChangeLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/analogsection/transistor.gif"))); // NOI18N
        add(imageChangeLbl);
        imageChangeLbl.setBounds(90, 50, 280, 140);

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
        nextBtn.setBounds(310, 0, 90, 40);
        add(jLabel1);
        jLabel1.setBounds(0, 50, 380, 180);

        backgroundLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/analogsection/InformationGUI.png"))); // NOI18N
        add(backgroundLbl);
        backgroundLbl.setBounds(-2, 0, 400, 450);
    }// </editor-fold>//GEN-END:initComponents

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        // TODO add your handling code here:
        LayoutManager layout = getParent().getLayout();
        if (layout instanceof java.awt.CardLayout) {
            java.awt.CardLayout cl = (java.awt.CardLayout)layout;
            cl.show(getParent(), "AnalogInfoMainScreen");
        }
    }//GEN-LAST:event_exitBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        imageChangeLbl.setVisible(false);
      
        infoLbl.setVisible(true);
    }//GEN-LAST:event_backBtnActionPerformed

    private void nextBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextBtnActionPerformed
        // TODO add your handling code here:
        imageChangeLbl.setVisible(true);
     
        infoLbl.setVisible(false);
        
        infoSelected = Information.getInfoType();
        //error check 
        System.out.println(infoSelected);
        if (infoSelected == 1) {
           // * anonymous inner class, to set the info.
           // * anonymous inner class creates an extra class file, which can slow the programs startup, by the extra memory needed
           // * anonymous inner class extends the class of the object being constructed and has a "This." 
           // * referance to the instance of the object constructed
           
            // Referance: http://stackoverflow.com/questions/924285/efficiency-of-java-double-brace-initialization
            

              ArrayList <String> info = new ArrayList<String>() {{
                        add("A capacitor stores and releases charge");
                        add("Electrons are used in batteries");
                        add("There are many different electronic signals");
                        add("ADC are used to convert analog signals to digital repersentation");
                        add("Resistors are like shiedls");
                        add("Resistors are measured in ohms");
                        add("breadbords are used for creating circuits");
                        add("fgtd");
                        add("ggffg");
                        add("gfddrf");
                  }};

//info = new String[]{"A capacitor stores and releases charge", 
              //"Electrons are used in batteries", "There are many different electronic signals",
              //"ADC are used to convert analog signals to digital repersentation", 
              //"Resistors are like shiedls", "Resistors are measured in ohms",
              //"breadbords are used for creating circuits", "fgtd", "ggffg", "gfddrf"};
            analogInfo.setInfo(info);
            
            if (count < 10 && imgSelector < 10) {
                //imgSelector = 0;
                analogInfo.setImageUsed(imgSelector);
                analogInfo.setUrls();
                ImgDisplayedLbl = analogInfo.AddImageUsingURLS();
                imgSelector++;
                //Information.setCount(count = 0);
                analogInfo.setCount(count);
                count++;
                imageChangeLbl.setIcon(ImgDisplayedLbl);
                infoDisplayed = analogInfo.DisplayInfo();
                infoLbl.setText(infoDisplayed);

            }

        } else if (infoSelected == 2) {
                 //digital part
            //working 
            
             //add information here 
            // anonymous inner class, to set the info
              ArrayList <String> info = new ArrayList<String>() {{
                        add("D");
                        add("I");
                        add("G");
                        add("I");
                        add("T");
                        add("A");
                        add("L");
                        add("wo");
                        add("rk");
                        add("ing");
                  }};
           
            digitalInfo.setInfo(info);
             //Information.setCount(count = 0);
            // infoDisplayed = Information.DisplayInfo();
            if (count < 10 && imgSelectorDigital < 53) {
                digitalInfo.setImageUsed(imgSelectorDigital);
                digitalInfo.setUrls();
                ImgDisplayedLbl = digitalInfo.AddImageUsingURLS();
                imgSelectorDigital++;
                //Information.setCount(count = 0);
                digitalInfo.setCount(count);
                count++;
                imageChangeLbl.setIcon(ImgDisplayedLbl);
                infoDisplayed = digitalInfo.DisplayInfo();
                infoLbl.setText(infoDisplayed);

               
            }
     
    }//GEN-LAST:event_nextBtnActionPerformed

    } // end of action performed 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel backgroundLbl;
    private javax.swing.JLabel detailsLbl;
    private javax.swing.JButton exitBtn;
    private javax.swing.JLabel imageChangeLbl;
    private javax.swing.JLabel infoLbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton nextBtn;
    // End of variables declaration//GEN-END:variables
}
