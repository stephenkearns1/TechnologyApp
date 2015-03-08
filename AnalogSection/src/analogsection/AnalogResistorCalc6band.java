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
public class AnalogResistorCalc6band extends javax.swing.JPanel {

    /**
     * Creates new form AnalogResistorCalc6band
     */
    public AnalogResistorCalc6band() {
        initComponents();
        this.setSize(400,450);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        value1CB = new javax.swing.JComboBox();
        Value2CB = new javax.swing.JComboBox();
        Value3CB = new javax.swing.JComboBox();
        Value1Lbl = new javax.swing.JLabel();
        Value2 = new javax.swing.JLabel();
        Value3 = new javax.swing.JLabel();
        Value4CB = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        Value5CB = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        Value6CB = new javax.swing.JComboBox();
        value5Lbl = new javax.swing.JLabel();
        headingLbl = new javax.swing.JLabel();
        anwserLbl = new javax.swing.JLabel();
        claculateBtn = new javax.swing.JButton();
        ResetBtn = new javax.swing.JButton();
        exitBtn = new javax.swing.JButton();
        typesCB = new javax.swing.JComboBox();
        TitleLbl = new javax.swing.JLabel();
        backgroundLbl = new javax.swing.JLabel();

        setLayout(null);

        value1CB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Black", "Brown", "Red", "Orange", "Yellow", "Green", "Blue", "Violet", "Grey", "White" }));
        add(value1CB);
        value1CB.setBounds(10, 260, 100, 27);

        Value2CB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Black", "Brown", "Red", "Orange", "Yellow", "Green", "Blue", "Violet", "Grey", "White" }));
        Value2CB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Value2CBActionPerformed(evt);
            }
        });
        add(Value2CB);
        Value2CB.setBounds(140, 260, 101, 27);

        Value3CB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Black", "Brown", "Red", "Orange", "Yellow", "Green", "Blue", "Violet", "Grey", "White", " " }));
        add(Value3CB);
        Value3CB.setBounds(270, 260, 101, 27);

        Value1Lbl.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        Value1Lbl.setForeground(new java.awt.Color(255, 255, 255));
        Value1Lbl.setText("First Value:");
        add(Value1Lbl);
        Value1Lbl.setBounds(20, 240, 80, 20);

        Value2.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        Value2.setForeground(new java.awt.Color(255, 255, 255));
        Value2.setText("Second Value:");
        add(Value2);
        Value2.setBounds(140, 240, 100, 20);

        Value3.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        Value3.setForeground(new java.awt.Color(255, 255, 255));
        Value3.setText("Third Value:");
        add(Value3);
        Value3.setBounds(270, 240, 90, 20);

        Value4CB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Black", "Brown", "Red", "Orange", "Yellow", "Green", "Blue", "Violet", "Grey", "White" }));
        add(Value4CB);
        Value4CB.setBounds(10, 310, 101, 27);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Fourth Value:");
        add(jLabel1);
        jLabel1.setBounds(20, 290, 100, 16);

        Value5CB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Black", "Brown", "Red", "Orange", "Yellow", "Green", "Blue", "Violet", "Grey", "White", " " }));
        add(Value5CB);
        Value5CB.setBounds(140, 310, 101, 27);

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Tolorence:");
        add(jLabel2);
        jLabel2.setBounds(280, 290, 80, 16);

        Value6CB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Brown", "Red", "Green", "Blue", "Violet", "Grey", "Gold", "Silver", "None", " " }));
        add(Value6CB);
        Value6CB.setBounds(270, 310, 94, 27);

        value5Lbl.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        value5Lbl.setForeground(new java.awt.Color(255, 255, 255));
        value5Lbl.setText("Fifth Value:");
        add(value5Lbl);
        value5Lbl.setBounds(150, 290, 80, 16);

        headingLbl.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        headingLbl.setForeground(new java.awt.Color(255, 255, 255));
        headingLbl.setText("Calulation:");
        add(headingLbl);
        headingLbl.setBounds(10, 340, 100, 16);

        anwserLbl.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        anwserLbl.setForeground(new java.awt.Color(255, 255, 255));
        anwserLbl.setText("= 1000 ohm");
        add(anwserLbl);
        anwserLbl.setBounds(90, 360, 240, 40);

        claculateBtn.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        claculateBtn.setForeground(new java.awt.Color(0, 102, 255));
        claculateBtn.setText("Calulate");
        add(claculateBtn);
        claculateBtn.setBounds(10, 400, 110, 40);

        ResetBtn.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        ResetBtn.setForeground(new java.awt.Color(0, 102, 255));
        ResetBtn.setText("Reset");
        ResetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetBtnActionPerformed(evt);
            }
        });
        add(ResetBtn);
        ResetBtn.setBounds(260, 400, 120, 40);

        exitBtn .setOpaque(false);
        exitBtn .setContentAreaFilled(false);
        exitBtn .setBorderPainted(false);
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });
        add(exitBtn);
        exitBtn.setBounds(0, 0, 75, 30);

        typesCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "4 Band", "5 Band", "6 Band" }));
        typesCB.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                typesCBItemStateChanged(evt);
            }
        });
        add(typesCB);
        typesCB.setBounds(280, 0, 110, 30);

        TitleLbl.setFont(new java.awt.Font("Apple Chancery", 1, 19)); // NOI18N
        TitleLbl.setForeground(new java.awt.Color(255, 255, 255));
        TitleLbl.setText("Resistor value calculator ");
        add(TitleLbl);
        TitleLbl.setBounds(70, 0, 310, 30);

        backgroundLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/analogsection/Calc6band.png"))); // NOI18N
        add(backgroundLbl);
        backgroundLbl.setBounds(0, 0, 390, 450);
    }// </editor-fold>//GEN-END:initComponents

    private void Value2CBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Value2CBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Value2CBActionPerformed

    private void typesCBItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_typesCBItemStateChanged
        // TODO add your handling code here:

        String selectedValue;
        selectedValue = typesCB.getSelectedItem().toString();

        if (selectedValue.equals("4 Band")) {
            //display 4 band screen

            LayoutManager layout = getParent().getLayout();
            if (layout instanceof java.awt.CardLayout) {
                java.awt.CardLayout cl = (java.awt.CardLayout) layout;
                cl.show(getParent(), "AnalogCalcScreen");
            }
        } else if (selectedValue.equals("5 Band")) {
            //display 5 band screen
            LayoutManager layout = getParent().getLayout();
            if (layout instanceof java.awt.CardLayout) {
                java.awt.CardLayout cl = (java.awt.CardLayout) layout;
                cl.show(getParent(), "Analog5bandCalcScreen");
            }
        } else {
            //display 6 band screen
            LayoutManager layout = getParent().getLayout();
            if (layout instanceof java.awt.CardLayout) {
                java.awt.CardLayout cl = (java.awt.CardLayout) layout;
                cl.show(getParent(), "Analog6bandCalcScreen");
            }
        }

    }//GEN-LAST:event_typesCBItemStateChanged

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        // TODO add your handling code here:
        LayoutManager layout = getParent().getLayout();
        if (layout instanceof java.awt.CardLayout) {
            java.awt.CardLayout cl = (java.awt.CardLayout)layout;
            cl.show(getParent(), "AnalogMainScreen");
        }
    }//GEN-LAST:event_exitBtnActionPerformed

    private void ResetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetBtnActionPerformed
        // TODO add your handling code here:
        AnalogResistorCalcPanel reset = new AnalogResistorCalcPanel();
        anwserLbl.setText("");
    }//GEN-LAST:event_ResetBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ResetBtn;
    private javax.swing.JLabel TitleLbl;
    private javax.swing.JLabel Value1Lbl;
    private javax.swing.JLabel Value2;
    private javax.swing.JComboBox Value2CB;
    private javax.swing.JLabel Value3;
    private javax.swing.JComboBox Value3CB;
    private javax.swing.JComboBox Value4CB;
    private javax.swing.JComboBox Value5CB;
    private javax.swing.JComboBox Value6CB;
    private javax.swing.JLabel anwserLbl;
    private javax.swing.JLabel backgroundLbl;
    private javax.swing.JButton claculateBtn;
    private javax.swing.JButton exitBtn;
    private javax.swing.JLabel headingLbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JComboBox typesCB;
    private javax.swing.JComboBox value1CB;
    private javax.swing.JLabel value5Lbl;
    // End of variables declaration//GEN-END:variables
}