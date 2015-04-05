/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analogsection;



import java.awt.LayoutManager;
import java.util.ArrayList;
import javax.swing.ImageIcon;


/**
 *
 * @author Stephen 
 */

/*

* When chosing different panels the infolbl has to be reset and the info counter has to be reset so the first slide of info is reset 


                                                  ***  What to do ***

* Just add your information into the info array in the next button, which will then send the info to the information class 

* You will get an NullPointerException error when trying to run your section, without the images added to the resource folder

* Also The info text and image in the labels are not being reset when panels are changed, this will have to be fixed. 


*/
public class AnalogInformationGUIPanel extends javax.swing.JPanel {

    /**
     * Creates new form HangmanGUIPanel
     */
    
    // variables
    Information analogInfo;
    Information digitalInfo;
    Information plasticInfo;
    Information woodInfo;
    Information analogComp;
    Information analogSignals;
    Information analogDiag;
    private String infoDisplayed;
    private int count,imgSelector,imgSelectorDigital,imgSelectorPlastic,imgSelectorWood,imgSelectorAnaComp,imgSelectorAnaSignals,imgSelectorDiagTools ,imgSelectorDigit,i ;
    protected static int infoSelected;
    private String[] arrayTest;
    private ArrayList <String> info;
  //  private Image displayedImg;
    private ImageIcon ImgDisplayedLbl;
    public AnalogInformationGUIPanel() {
        initComponents();
        this.setSize(400,450);
        imageChangeLbl.setVisible(false);
        analogInfo = new Information();
        digitalInfo = new Information();
        plasticInfo = new Information();
        woodInfo = new Information();
        analogComp = new Information();
        analogDiag = new Information();
        analogSignals = new Information(); 
        infoDisplayed = "";
        count = 0;
        imgSelector = 0;
        infoLbl.setText("");
        imgSelectorDigital = 10;
        imgSelectorPlastic = 21;
        imgSelectorWood = 32;
        imgSelectorAnaComp = 43;
        imgSelectorAnaSignals = 54;
        imgSelectorDiagTools = 65;
        imgSelectorDigit = 87;
        
        
    
        
        
        
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
        exitBtn = new javax.swing.JButton();
        titleLbl = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        nextBtn = new javax.swing.JButton();
        imageChangeLbl = new javax.swing.JLabel();
        infoLbl = new javax.swing.JLabel();
        backgroundLbl = new javax.swing.JLabel();

        setLayout(null);

        detailsLbl.setBackground(new java.awt.Color(255, 255, 255));
        detailsLbl.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        detailsLbl.setForeground(new java.awt.Color(51, 153, 255));
        detailsLbl.setText("Details:");
        add(detailsLbl);
        detailsLbl.setBounds(10, 190, 110, 30);

        exitBtn.setBackground(new java.awt.Color(0, 153, 255));
        exitBtn.setText("Exit");
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });
        add(exitBtn);
        exitBtn.setBounds(220, 390, 150, 40);

        titleLbl.setFont(new java.awt.Font("Apple Chancery", 1, 18)); // NOI18N
        titleLbl.setText("Information");
        add(titleLbl);
        titleLbl.setBounds(140, 0, 150, 40);

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
        add(imageChangeLbl);
        imageChangeLbl.setBounds(90, 50, 280, 140);
        add(infoLbl);
        infoLbl.setBounds(10, 266, 380, 120);

        backgroundLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/analogsection/InformationGUI.png"))); // NOI18N
        add(backgroundLbl);
        backgroundLbl.setBounds(-2, 0, 400, 450);
    }// </editor-fold>//GEN-END:initComponents

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
//        * A series of if statements checking which panel to go back to,
//        * The imgSelector variable will determine which
//        * Screen to terevers back to.
        
        //Resets the image holder label to have no imageIco when reset
        imageChangeLbl.setIcon(null);
        
        //resets the text to nothing when the information is exited
        infoLbl.setText("");
        if (Information.getInfoType() == 1) {
            LayoutManager layout = getParent().getLayout();
            if (layout instanceof java.awt.CardLayout) {
                java.awt.CardLayout cl = (java.awt.CardLayout) layout;
                cl.show(getParent(), "AnalogInfoMainScreen");
            }
        }//end of condition
        else if (Information.getInfoType() == 2) {
            LayoutManager layout = getParent().getLayout();
            if (layout instanceof java.awt.CardLayout) {
                java.awt.CardLayout cl = (java.awt.CardLayout) layout;
                cl.show(getParent(), "DigitalSectionGUI");
            }
        }
        else if(Information.getInfoType() == 3){
          LayoutManager layout = getParent().getLayout();
          if (layout instanceof java.awt.CardLayout) {
            java.awt.CardLayout cl = (java.awt.CardLayout)layout;
            cl.show(getParent(), "PlasticMainGUI");
           }
      }else if(Information.getInfoType() == 4){
            LayoutManager layout = getParent().getLayout();
         if (layout instanceof java.awt.CardLayout) {
            java.awt.CardLayout cl = (java.awt.CardLayout)layout;
            cl.show(getParent(), "WoodMainPanel");
           }
      }else if(Information.getInfoType() == 5){
            LayoutManager layout = getParent().getLayout();
         if (layout instanceof java.awt.CardLayout) {
            java.awt.CardLayout cl = (java.awt.CardLayout)layout;
            cl.show(getParent(), "AnalogInfoMainScreen");
           }
      }else if(Information.getInfoType() == 6){
            LayoutManager layout = getParent().getLayout();
         if (layout instanceof java.awt.CardLayout) {
            java.awt.CardLayout cl = (java.awt.CardLayout)layout;
            cl.show(getParent(), "AnalogInfoMainScreen");
           }
      }else if(Information.getInfoType() == 7){
           LayoutManager layout = getParent().getLayout();
        if (layout instanceof java.awt.CardLayout) {
            java.awt.CardLayout cl = (java.awt.CardLayout)layout;
            cl.show(getParent(), "AnalogMainScreen");
        }
      }
       
    }//GEN-LAST:event_exitBtnActionPerformed

    private void nextBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextBtnActionPerformed

     
        imageChangeLbl.setVisible(true);
        infoSelected = Information.getInfoType();
        //error check 
        System.out.println(infoSelected);
        if (infoSelected == 1) {
           // * anonymous inner class, to set the info.
            // * anonymous inner class creates an extra class file, which can slow the programs startup, by the extra memory needed
            // * anonymous inner class extends the class of the object being constructed and has a "This." 
            // * referance to the instance of the object constructed

            // Referance: http://stackoverflow.com/questions/924285/efficiency-of-java-double-brace-initialization
            ArrayList<String> info = new ArrayList<String>() {
                {
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
                }
            };

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
            ArrayList<String> info = new ArrayList<String>() {
                {
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
                }
            };

            digitalInfo.setInfo(info);
            //Information.setCount(count = 0);
            // infoDisplayed = Information.DisplayInfo();
            if (count < 10 && imgSelectorDigital < 21) {
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

                // break;
            }

        } else if (infoSelected == 3) {
            //plastic part
            //set info here 
            ArrayList<String> info = new ArrayList<String>() {
                {
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
                }
            };

            plasticInfo.setInfo(info);
            //Information.setCount(count = 0);
            // infoDisplayed = Information.DisplayInfo();
            if (count < 10 && imgSelectorPlastic < 32) {
                plasticInfo.setImageUsed(imgSelectorPlastic);
                plasticInfo.setUrls();
                ImgDisplayedLbl = plasticInfo.AddImageUsingURLS();
                imgSelectorPlastic++;
                //Information.setCount(count = 0);
                plasticInfo.setCount(count);
                count++;
                imageChangeLbl.setIcon(ImgDisplayedLbl);
                infoDisplayed = plasticInfo.DisplayInfo();
                infoLbl.setText(infoDisplayed);

            }

        } else if (infoSelected == 4) {
            //wood part
            //add info here 
            ArrayList<String> info = new ArrayList<String>() {
                {
                    add("W");
                    add("O");
                    add("O");
                    add("D");
                    add("G");
                    add("o");
                    add("E");
                    add("s");
                    add("here");
                    add("!1!!!!");
                }
            };
            woodInfo.setInfo(info);
            //Information.setCount(count = 0);
            // infoDisplayed = Information.DisplayInfo();
            if (count < 10 && imgSelectorWood < 43) {
                woodInfo.setImageUsed(imgSelectorWood);
                woodInfo.setUrls();
                ImgDisplayedLbl = woodInfo.AddImageUsingURLS();
                imgSelectorWood++;
                //Information.setCount(count = 0);
                woodInfo.setCount(count);
                count++;
                imageChangeLbl.setIcon(ImgDisplayedLbl);
                infoDisplayed = woodInfo.DisplayInfo();
                infoLbl.setText(infoDisplayed);
            }
        } else if (infoSelected == 5) {
           // * anonymous inner class, to set the info.
            // * anonymous inner class creates an extra class file, which can slow the programs startup, by the extra memory needed
            // * anonymous inner class extends the class of the object being constructed and has a "This." 
            // * referance to the instance of the object constructed

            // Referance: http://stackoverflow.com/questions/924285/efficiency-of-java-double-brace-initialization
            ArrayList<String> info = new ArrayList<String>() {
                {
                    add("W");
                    add("O");
                    add("R");
                    add("K");
                    add("I");
                    add("N");
                    add("G");
                    add("F");
                    add("I");
                    add(":)");
                }
            };

//info = new String[]{"A capacitor stores and releases charge", 
            //"Electrons are used in batteries", "There are many different electronic signals",
            //"ADC are used to convert analog signals to digital repersentation", 
            //"Resistors are like shiedls", "Resistors are measured in ohms",
            //"breadbords are used for creating circuits", "fgtd", "ggffg", "gfddrf"};
            analogComp.setInfo(info);

            if (count < 10 && imgSelectorAnaComp < 53) {
                //imgSelector = 0;
                analogComp.setImageUsed(imgSelectorAnaComp);
                analogComp.setUrls();
                ImgDisplayedLbl = analogComp.AddImageUsingURLS();
                imgSelectorAnaComp++;
                //Information.setCount(count = 0);
                analogComp.setCount(count);
                count++;
                imageChangeLbl.setIcon(ImgDisplayedLbl);
                infoDisplayed = analogComp.DisplayInfo();
                infoLbl.setText(infoDisplayed);

            }

        } else if (infoSelected == 6) {
                 //digital part
            //working 

            //add information here 
            // anonymous inner class, to set the info
            ArrayList<String> info = new ArrayList<String>() {
                {
                    add("W");
                    add("O");
                    add("R");
                    add("K");
                    add("I");
                    add("N");
                    add("G");
                    add("F");
                    add("I");
                    add(":)");
                }
            };

            analogSignals.setInfo(info);
            //Information.setCount(count = 0);
            // infoDisplayed = Information.DisplayInfo();
            if (count < 10 && imgSelectorAnaSignals < 65) {
                analogSignals.setImageUsed(imgSelectorAnaSignals);
                analogSignals.setUrls();
                ImgDisplayedLbl = analogSignals.AddImageUsingURLS();
                imgSelectorAnaSignals++;
                //Information.setCount(count = 0);
                analogSignals.setCount(count);
                count++;
                imageChangeLbl.setIcon(ImgDisplayedLbl);
                infoDisplayed = analogSignals.DisplayInfo();
                infoLbl.setText(infoDisplayed);

                // break;
            }

        }//end of slector if
        else if (infoSelected == 7) {
                 //digital part
            //working 

            //add information here 
            // anonymous inner class, to set the info
            ArrayList<String> info = new ArrayList<String>() {
                {
                    add("W");
                    add("O");
                    add("R");
                    add("K");
                    add("I");
                    add("N");
                    add("G");
                    add("F");
                    add("I");
                    add(":)");
                }
            };

            analogDiag.setInfo(info);
            //Information.setCount(count = 0);
            // infoDisplayed = Information.DisplayInfo();
            
            //not working 
            if (count < 10 && imgSelectorDiagTools  < 74) {
                analogDiag.setImageUsed(imgSelectorDiagTools);
                analogDiag.setUrls();
                ImgDisplayedLbl = analogDiag.AddImageUsingURLS();
                imgSelectorDiagTools++;
                //Information.setCount(count = 0);
                analogDiag.setCount(count);
                count++;
                imageChangeLbl.setIcon(ImgDisplayedLbl);
                infoDisplayed = analogDiag.DisplayInfo();
                infoLbl.setText(infoDisplayed);

                // break;
            }

        }//end of slector if

        arrayTest = Information.getArray();
        // checker to see if the array has been filled with digital   
        if (arrayTest == null) {
            System.out.println("The array is empty: Values havent been taken");
        }
             //throwing processException error due to the info selector always being == 0
        // so the data is never sent to the array for processing 
//                if (count < 9) {
//                    count++;
//                    Information.setCount(count);
//                    infoDisplayed = Information.DisplayInfo();
//                    infoLbl.setText(infoDisplayed);
//                }
//                
//                //image selection routine
//              if(imgSelector < 9){
//                  imgSelector++;
//                  analogInfo.setImageUsed(imgSelector);
//                  analogInfo.setUrls();
//                  ImgDisplayedLbl = analogInfo.AddImageUsingURLS();
//                  imageChangeLbl.setIcon(ImgDisplayedLbl);
//                
//                  
//                  }

//            } 
//       else if (infoSelected == 3) {
//        //Wood part
//       // analogInfo
//
//        if (count < 9) {
//            count++;
//            Information.setCount(count);
//            infoDisplayed = Information.DisplayInfo();
//            infoLbl.setText(infoDisplayed);
//        }
//    } else {
//        //plastic info part
//        //analogInfo
//
//        if (count < 9) {
//            count++;
//            Information.setCount(count);
//            infoDisplayed = Information.DisplayInfo();
//            infoLbl.setText(infoDisplayed);
//        }
//    }
   //     }// end of outter if
        System.out.println("index:" + count + "Message:" + infoDisplayed);
    }//GEN-LAST:event_nextBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        
        if (infoSelected == 1) {
            if (count > 0 && imgSelector > 0) {
                count--;
                imgSelector--;
                analogInfo.setCount(count);
                analogInfo.setImageUsed(imgSelector);
                analogInfo.setUrls();
                infoDisplayed = analogInfo.DisplayInfo();
                ImgDisplayedLbl = analogInfo.AddImageUsingURLS();
                infoLbl.setText(infoDisplayed);
                imageChangeLbl.setIcon(ImgDisplayedLbl);
            }

//        if(imgSelector > 0){
//                  imgSelector--;
//                  analogInfo.setImageUsed(imgSelector);
//                  analogInfo.setUrls();
//                  ImgDisplayedLbl = analogInfo.AddImageUsingURLS();
//                  imageChangeLbl.setIcon(ImgDisplayedLbl);
//                
//                  
//                  }
        } else if (infoSelected == 2) {
            if (count > 0 && imgSelectorDigital > 9) {
                count--;
                imgSelectorDigital--;
                digitalInfo.setCount(count);
                digitalInfo.setImageUsed(imgSelectorDigital);
                digitalInfo.setUrls();
                infoDisplayed = digitalInfo.DisplayInfo();
                ImgDisplayedLbl = digitalInfo.AddImageUsingURLS();
                infoLbl.setText(infoDisplayed);
                imageChangeLbl.setIcon(ImgDisplayedLbl);
            }
        }//end of else if 
        else if (infoSelected == 3) {
            if (count > 0 && imgSelectorPlastic > 20) {
                count--;
                imgSelectorPlastic--;
                plasticInfo.setCount(count);
                plasticInfo.setImageUsed(imgSelectorPlastic);
                plasticInfo.setUrls();
                infoDisplayed = plasticInfo.DisplayInfo();
                ImgDisplayedLbl = plasticInfo.AddImageUsingURLS();
                infoLbl.setText(infoDisplayed);
                imageChangeLbl.setIcon(ImgDisplayedLbl);
            }
        } else if (infoSelected == 4) {
            if (count > 0 && imgSelectorWood > 33) {
                count--;
                imgSelectorWood--;
                woodInfo.setCount(count);
                woodInfo.setImageUsed(imgSelectorWood);
                woodInfo.setUrls();
                infoDisplayed = woodInfo.DisplayInfo();
                ImgDisplayedLbl = woodInfo.AddImageUsingURLS();
                infoLbl.setText(infoDisplayed);
                imageChangeLbl.setIcon(ImgDisplayedLbl);
            }
        } else if (infoSelected == 5) {
            if (count > 0 &&  imgSelectorAnaComp > 42) {
                count--;
                imgSelectorAnaComp--;
                analogComp.setCount(count);
                analogComp.setImageUsed(imgSelectorAnaComp);
                analogComp.setUrls();
                infoDisplayed = analogComp.DisplayInfo();
                ImgDisplayedLbl = analogComp.AddImageUsingURLS();
                infoLbl.setText(infoDisplayed);
                imageChangeLbl.setIcon(ImgDisplayedLbl);
                }
           }else if (infoSelected == 6) {
            if (count > 0 && imgSelectorAnaSignals > 54) {
                count--;
                imgSelectorAnaSignals--;
                analogSignals.setCount(count);
                analogSignals.setImageUsed(imgSelectorAnaSignals);
                analogSignals.setUrls();
                infoDisplayed = analogSignals.DisplayInfo();
                ImgDisplayedLbl = analogSignals.AddImageUsingURLS();
                infoLbl.setText(infoDisplayed);
                imageChangeLbl.setIcon(ImgDisplayedLbl);
            }
           }else if (infoSelected == 7) {
            if (count > 0 && imgSelectorDiagTools > 63) {
                count--;
                imgSelectorDiagTools--;
                analogDiag.setCount(count);
                analogDiag.setImageUsed(imgSelectorDiagTools);
                analogDiag.setUrls();
                infoDisplayed = analogDiag.DisplayInfo();
                ImgDisplayedLbl = analogDiag.AddImageUsingURLS();
                infoLbl.setText(infoDisplayed);
                imageChangeLbl.setIcon(ImgDisplayedLbl);
            }
           }else{
           System.out.print("An error occourd");
           }
        
         
          

        System.out.println("index:"+count + "Message:" + infoDisplayed);
            
        
        
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel backgroundLbl;
    private javax.swing.JLabel detailsLbl;
    private javax.swing.JButton exitBtn;
    private javax.swing.JLabel imageChangeLbl;
    private javax.swing.JLabel infoLbl;
    private javax.swing.JButton nextBtn;
    private javax.swing.JLabel titleLbl;
    // End of variables declaration//GEN-END:variables
}
