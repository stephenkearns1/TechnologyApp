/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analogsection;

import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Hassan
 */
public class PlasticQuiz extends Quiz {
        //public String [] question;
        //protected String[] correctAnswer;
        protected String[][] QandA;
        private int[] binarysort;
        private String quest;
        private String Ans;
        private int arrcount;
        private Integer a;
        QuizScreen quizgui = new QuizScreen();
        public PlasticQuiz(){
         arrcount = 0;
         a = null;
         binarysort = new int[10];
         //this is a 2d array to set up questions correctanswers and two incorrect answers
        
         //to input your own answer put them in the first array row/container
         //the correct answer must be put in the second row/container and must be in the same index as the question in referes to (in its own row.container)
         //the next two rows or containers are your chosen incorrect answers these work the same as the previous rows/containers
         //the last row/container is what radio button you want your correct answer to be in this must be either a,b or c other wise you will get an error
         //all containers must contain 20 values
         QandA = new String[][]{{"Most plastics are made from what?","What type of plastics can be heated, moulded and shaped varios times?","What type of plastics are strong and resistant to heat?","Which type of plastic can not be reshaped?","What type of plastics are used in situations where resistance to heat is important?","Which Thermoplastic is mainly used in window frame construction?","Arcrylic is mainly used in the construction of what?","Which Thermoplastic is tough and impact resistant?","Which plastic is mainly used in making bottlecaps?","Nylon is an example of what type of plastic?","Polyester resin is mainly used to make what?","What type of plastic are plugs generally made of?","Melamine Formaldehyde is an example of what type of plastic? ","Plastic is a ____ made material?","Plastic is ____ proof?","Plastic takes a very long time to what?","Polyester resin is resistant to what?","Water bottles are made of waht plastic?","PvC rigid is resistant to what","Polpropylene is resistant to what?"},{"Crude oil","Thermoplastics","Thermosetting Plastic","Thermosetting plastics","Thermosetting plastic","PvC rigid","Skylights","Polyethylene","Polypropylene","Thermoplastic","Boat Hulls","Phenol Formaldehyde","Thermosetting","man","water","decompose","UV lights","Polyethylene","Acid and Akali","Heat and Acids"},{"Car oil","Thermosetting plastics","Thermoplastics","Soup","Cotton","PvC plasticised","Try lights","Poly graph","Polyperson","Thermosetting","Subway Sandwhiches","Wood","Wood","robot","grow","baby","electricity","Polyehefed","Yarn","Fluff"},{"Diesel","Cardboard","A Brick","Thermoplastics","Thermoplastics","Mould","Fly lights","Ploy pocket","Polypenny","Pizza","Lunch boxes","PvC","Thermoplastic","giraffe","bullet","eat","letuce","Splinters","Water","Dirt"},{"b","a","a","c","a","c","b","a","c","c","b","c","b","a","a","b","b","c","a","c"}};
         //question = new String[]{"b","a","a","c","a","c","b","a","c","c","b","c","b","a","a","b","b","c","a","c"};
        // correctAnswer = new String[]{"b","a","a","c","a","c","b","a","c","c","b","c","b","a","a","b","b","c","a","c"};
        }
    
    
        public void choseRandomQuestion(){
             
       
          for(int counter = 0; counter < 10; counter++){
               obj = new QuestionObj();
            //saves the values of the question going to be asked
            //values being declared inside loop as they are not needed outside loop there for they will not be there outside of the loop
              int i = 0;
              //temp claims its not being used because it cannot see inside the do while loop
              int temp = 0;
              int tempbin = 0;
              temp = rand.nextInt(20);
              String work = new String();
            do{
                //using if statement because i doesnt seem to reset out side of if statement there for same questions are being asked
                if(i != 0){
                i= 0;
                }
               
                tempbin = 1;
                
               
                
                //tempbin not needed outside array. for if statement to see if question alrady exsists more explained next time its used
                
                //this will run only once during the entirety of both loops as this is to only put first value in the array 
                if(counter == 0 && a == null){
                i=1;
                a = 1;
                temp = rand.nextInt(20);
                binarysort[counter] = temp;
                chosenquestions[counter] = temp;
                //randomizedQuestion[counter] = question[chosenquestions[counter]];
                
                //obj.setquestion(question[chosenquestions[counter]]);
                //obj.setanswer(correctAnswer[chosenquestions[counter]]);
                obj.setquestion(QandA[0][chosenquestions[counter]]);
                obj.setanswer(QandA[1][chosenquestions[counter]]);
                obj.setincorrect1(QandA[2][chosenquestions[counter]]);
                obj.setincorrect2(QandA[3][chosenquestions[counter]]);
                obj.setrad(QandA[4][chosenquestions[counter]]);
                objArr.add(obj);
                }
                else{
                //getting binarysort ready for checking 
                Arrays.sort(binarysort);
                //cheking binarysort to see if value of temp alrady exsits if it exsists the value in tempbin will be a positive number
                //if value does not exsist then value in tempbin will be negitive
                tempbin = Arrays.binarySearch(binarysort,temp);
                
               
                //if value of tempbin is negitive the question will be put into the question list to ask user. if value is positive question will be chosen again
                JOptionPane.showMessageDialog(null,"test" + tempbin + " " +  Arrays.toString(chosenquestions) + Arrays.toString(binarysort) + " " + temp);
                if(tempbin < 0){
                    //this adds the first values
                   
                    binarysort[counter] = temp;
                    //JOptionPane.showMessageDialog(null,"test" + tempbin + " " +  chosenquestions + " " + temp);
                    //number stored in temp will be stored in chosenquestion array for checking if user input matches later on
                    chosenquestions[counter] = temp;
                    //number in chosenquestions[index number is in] will tell question where the question wanted is stored then the question is stored in randomizedQuestion
                    //randomizedQuestion[counter] = question[chosenquestions[counter]];
                    //randomizedQuestion[counter] = question[chosenquestions[counter]];
             
                    //obj.setquestion(work);
                    //obj.setanswer(correctAnswer[chosenquestions[counter]]);
                    obj.setquestion(QandA[0][chosenquestions[counter]]);
                    obj.setanswer(QandA[1][chosenquestions[counter]]);
                    obj.setincorrect1(QandA[2][chosenquestions[counter]]);
                    obj.setincorrect2(QandA[3][chosenquestions[counter]]);
                    obj.setrad(QandA[4][chosenquestions[counter]]);
                    objArr.add(obj);
                    //sets i to 1 to end loop
                    i = 1;
                }
                else if(tempbin >= 0){
                    //picks new question and stores question in temp
                    temp = rand.nextInt(20);
                    //sets i to 0 to re-run loop and check if chosen question is already in array
                    i = 0;
                }
                else{
                    //error checking
                JOptionPane.showMessageDialog(null,"something went wrong");
                }
                }
                //JOptionPane.showMessageDialog(null, i);
            }while(i != 1);
            } // end of loop  
            //returns value to ask user questions
        //return randomizedQuestion;
        JOptionPane.showMessageDialog(null,objArr.get(0).getquestion() + " "+ objArr.get(1).getquestion() + " " + objArr.get(2).getquestion() + " array=" + randomizedQuestion[0] + " " + randomizedQuestion[1] + " " + randomizedQuestion[9]);
       //quizgui.setarr(objArr);
         //quizgui.setarr(randomizedQuestion);
         quizgui.setobjarr(objArr);
         
         
    }
 
    
    
}
