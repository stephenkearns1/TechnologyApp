/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analogsection;

/**
 *
 * @author Sean
 */
public class InformationGUIPanel extends javax.swing.JPanel {

    /**
     * Creates new form HangmanGUIPanel
     */
    public InformationGUIPanel() {
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

        detailsLbl = new javax.swing.JLabel();
        infoLbl = new javax.swing.JLabel();
        exitBtn = new javax.swing.JButton();
        titleLbl = new javax.swing.JLabel();
        backgroundLbl = new javax.swing.JLabel();

        setLayout(null);

        detailsLbl.setBackground(new java.awt.Color(255, 255, 255));
        detailsLbl.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        detailsLbl.setForeground(new java.awt.Color(51, 153, 255));
        detailsLbl.setText("Details:");
        add(detailsLbl);
        detailsLbl.setBounds(10, 190, 110, 30);

        infoLbl.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        infoLbl.setText("A capacitor (originally known as a condenser) is a passive two-terminal  ");
        add(infoLbl);
        infoLbl.setBounds(10, 210, 380, 130);

        exitBtn.setBackground(new java.awt.Color(0, 153, 255));
        exitBtn.setText("Exit");
        add(exitBtn);
        exitBtn.setBounds(220, 390, 150, 40);

        titleLbl.setFont(new java.awt.Font("Apple Chancery", 1, 18)); // NOI18N
        titleLbl.setText("Information");
        add(titleLbl);
        titleLbl.setBounds(140, 0, 150, 40);

        backgroundLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/analogsection/InformationGUI.png"))); // NOI18N
        add(backgroundLbl);
        backgroundLbl.setBounds(-2, 0, 400, 450);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroundLbl;
    private javax.swing.JLabel detailsLbl;
    private javax.swing.JButton exitBtn;
    private javax.swing.JLabel infoLbl;
    private javax.swing.JLabel titleLbl;
    // End of variables declaration//GEN-END:variables
}