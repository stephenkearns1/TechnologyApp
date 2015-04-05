/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analogsection;

import java.awt.LayoutManager;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Hassan
 */
public class QuizScreen extends javax.swing.JPanel {
     protected String answer, question, userAns, sentance; 
    protected String[] userAnswer;
    private static String[] randomizedQuestion;
    protected int correct, incorrect;
    private boolean chckRightorWrong;
    public QuestionObj obj;
    public static ArrayList <QuestionObj> objArr;
    int counter , random;
    int btntrack;
    protected Random rand;
    String gamemode;
    String message;
    int CompPlays;
    AILogic myAILogic = new AILogic();
    
        
    /**
     * Creates new form QuizGUIPanel
     */
    public QuizScreen() {
        initComponents();
        this.setSize(400,450);
         obj = new QuestionObj();
        objArr = new ArrayList<>();
        
        randomizedQuestion = new String[10];
        counter = 0;
        userAnswer = new String[10];
        btntrack = 0;
        random = 0;
        rand = new Random();
        CompPlays = 1;
        message = "";
    }
    
     public void setobjarr(ArrayList<QuestionObj> objArr){
        QuizScreen.objArr = objArr;
       
    }
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        headingLbl = new javax.swing.JLabel();
        difficultyCB = new javax.swing.JComboBox();
        jTextField1 = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        exitBtn = new javax.swing.JButton();
        titleLbl = new javax.swing.JLabel();
        backgroundLbl = new javax.swing.JLabel();

        setLayout(null);

        headingLbl.setText("Question:");
        add(headingLbl);
        headingLbl.setBounds(10, 120, 80, 14);

        difficultyCB.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        difficultyCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Easy", "Medium", "Hard" }));
        difficultyCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                difficultyCBActionPerformed(evt);
            }
        });
        add(difficultyCB);
        difficultyCB.setBounds(310, 10, 70, 30);

        jTextField1.setText("please press start to begin");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        add(jTextField1);
        jTextField1.setBounds(10, 140, 380, 60);

        buttonGroup1.add(jRadioButton1);
        add(jRadioButton1);
        jRadioButton1.setBounds(140, 240, 170, 21);

        buttonGroup1.add(jRadioButton2);
        add(jRadioButton2);
        jRadioButton2.setBounds(140, 290, 180, 21);

        buttonGroup1.add(jRadioButton3);
        add(jRadioButton3);
        jRadioButton3.setBounds(140, 340, 180, 21);

        jLabel1.setText("Chose one of the following anwser's then press next to submit:");
        add(jLabel1);
        jLabel1.setBounds(20, 210, 320, 14);

        jButton2.setText("Start");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2);
        jButton2.setBounds(110, 390, 150, 40);

        jButton1.setBackground(new java.awt.Color(0, 102, 255));
        jButton1.setText("submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(110, 390, 150, 40);

        exitBtn .setOpaque(false);
        exitBtn .setContentAreaFilled(false);
        exitBtn .setBorderPainted(false);
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });
        add(exitBtn);
        exitBtn.setBounds(0, 0, 70, 40);

        titleLbl.setFont(new java.awt.Font("Apple Chancery", 1, 18)); // NOI18N
        titleLbl.setForeground(new java.awt.Color(255, 255, 255));
        titleLbl.setText("Analog Quiz");
        add(titleLbl);
        titleLbl.setBounds(140, 0, 200, 40);

        backgroundLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/analogsection/QuizGUI3.png"))); // NOI18N
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
          Quiz playQuiz = new Quiz();
           int i =0;
         //objArr = playQuiz.getarrlist();
        //String[] temp = playQuiz.choseRandomQuestion();
        
        
           //JOptionPane.showMessageDialog(null,objArr.get(0).getquestion()+ objArr.get(1).getquestion());
           if(counter < 10){
            random = rand.nextInt(3);
               
            if(jRadioButton1.isSelected()){
           userAnswer[counter] = "a";
          
           }
           else if(jRadioButton2.isSelected()){
           userAnswer[counter] = "b";
            
           }
           else if(jRadioButton3.isSelected()){
           userAnswer[counter] = "c";
           }
            else{
                   jTextField1.setText("please select a radio buttion " + objArr.get(counter).getquestion());
                    counter = -1;
                 }
           
           if(counter < 9){
           jTextField1.setText(objArr.get(counter + 1).getquestion());
        if(objArr.get(counter + 1).getrad().equals("a")){
        jRadioButton1.setText(objArr.get(counter + 1).getanswer());
        jRadioButton2.setText(objArr.get(counter + 1).getincorrect1());
        jRadioButton3.setText(objArr.get(counter + 1).getincorrect2());
        }
        else if(objArr.get(counter + 1).getrad().equals("b")){
        jRadioButton2.setText(objArr.get(counter + 1).getanswer());
        jRadioButton1.setText(objArr.get(counter + 1).getincorrect1());
        jRadioButton3.setText(objArr.get(counter + 1).getincorrect2());
        }
        else if(objArr.get(counter + 1).getrad().equals("c")){
         jRadioButton3.setText(objArr.get(counter + 1).getanswer());
        jRadioButton2.setText(objArr.get(counter + 1).getincorrect1());
        jRadioButton1.setText(objArr.get(counter + 1).getincorrect2());
        }
        else{
        JOptionPane.showMessageDialog(null, "something has gone wrong one of the devlopers has assigned the answer to an invalid value");
        }
           }
           
           counter++;
           if(counter >= 9){
           jButton1.setText("get results");
            
             
           }
           }
           else{
       playQuiz.setAnswer(userAnswer);
       playQuiz.setobj(objArr);
       playQuiz.checkAnwsers();
       correct = playQuiz.getcorrect();
       incorrect = playQuiz.getIncorrect();
       message = myAILogic.getMessage();
       jTextField1.setText("The number of correct anwsers is:" + " "+correct + " " + "The number of incorrect question is:" + " "+ incorrect + "and " + message);
        jRadioButton3.setText("");
        jRadioButton2.setText("");
        jRadioButton1.setText("");
       //JOptionPane.showMessageDialog(null,"The number of correct anwsers is:" + " "+correct + " " + "The number of incorrect question is:" + " "+ incorrect);
           
         if(CompPlays == 1){
            gamemode = difficultyCB.getSelectedItem().toString().toLowerCase();
            myAILogic.setGamemode(gamemode);
            myAILogic.calRight();
            myAILogic.whatQuestions();
            CompPlays ++;
           }
         
        
           }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        jButton2.setVisible(false);
        jTextField1.setText(objArr.get(counter).getquestion());
        if(objArr.get(counter).getrad().equals("a")){
        jRadioButton1.setText(objArr.get(counter).getanswer());
        jRadioButton2.setText(objArr.get(counter).getincorrect1());
        jRadioButton3.setText(objArr.get(counter).getincorrect2());
        }
        else if(objArr.get(counter).getrad().equals("b")){
        jRadioButton2.setText(objArr.get(counter).getanswer());
        jRadioButton1.setText(objArr.get(counter).getincorrect1());
        jRadioButton3.setText(objArr.get(counter).getincorrect2());
        }
        else if(objArr.get(counter).getrad().equals("c")){
         jRadioButton3.setText(objArr.get(counter).getanswer());
        jRadioButton2.setText(objArr.get(counter).getincorrect1());
        jRadioButton1.setText(objArr.get(counter).getincorrect2());
        }
        else{
        JOptionPane.showMessageDialog(null, "something has gone wrong one of the devlopers has assigned the answer to an invalid value");
        }
        
       
            
        
        
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void difficultyCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_difficultyCBActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_difficultyCBActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroundLbl;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox difficultyCB;
    private javax.swing.JButton exitBtn;
    private javax.swing.JLabel headingLbl;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel titleLbl;
    // End of variables declaration//GEN-END:variables
}
