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
public class WoodQuiz extends Quiz {
        //public String [] question;
        //protected String[] correctAnswer;
        protected String[][] QandA;
        private int[] binarysort;
        private int arrcount;
        private Integer a;
        public int page;
        QuizScreen quizgui = new QuizScreen();
        public WoodQuiz(){
         arrcount = 0;
         a = null;
         binarysort = new int[10];
         page = 4;
         //this is a 2d array to set up questions correctanswers and two incorrect answers
        
         //to input your own answer put them in the first array row/container
         //the correct answer must be put in the second row/container and must be in the same index as the question in referes to (in its own row.container)
         //the next two rows or containers are your chosen incorrect answers these work the same as the previous rows/containers
         //the last row/container is what radio button you want your correct answer to be in this must be either a,b or c other wise you will get an error
         //all containers must contain 20 values
         QandA = new String[][]{{" What type of wood comes from evergreen trees?","_______ grow very quickly?","Scots pine is an example of what type of wood?","Which type of wood is generally used in making ladders?","________ is generally used for all inside work?","Which type of softwood is know for being able to resist infestation?","Which type of softwood is know for its ability to resist splitting?","Which type of wood is generally used for saunas/ steam rooms?","Which type of Hardwood is generally used for furniture?","Which hardwood is known for having a cross grain structure?","Which hardwood is known for being both strong and tough?","Which hardwood is mainly used in laminating?","Which manufactured wood is made from wood fibres glued togehter?","How is plywood made?","hardboard is mainly used in making what?","How is Chipboard made?","Ash is an example of what type of wood?","Plywood is an example of waht type of wood?","What type of wood comes from decidioud trees?","Which type of wood is the cheapest?"},
             {"Softwood","Softwoods","Softwood","Doughlas Fir","Scots pine","Ceder","Spruce","Ceder","Oak","Elm","Beech","Ash","Medium density fibreboard","By gluing togehter pieces of softwood","Wardrobes","Gluing together wood particles under heat and pressure","Hardwood","Manufactured","Hardwood","Manufactures"},
             {"1","2","3","4","wrong 5","wrong 6","wrong 7","wrong 8","wrong 9","wrong 10","wrong 11","wrong 12","wrong 13","wrong 14","wrong 15","wrong 16","wrong 17","wrong 18","wrong 19","wrong 20"},
             {"1","2","3","4","wrong 5","wrong 6","wrong 7","wrong 8","wrong 9","wrong 10","wrong 11","wrong 12","wrong 13","wrong 14","wrong 15","wrong 16","wrong 17","wrong 18","wrong 19","wrong 20"},
             {"b","a","a","c","a","c","b","a","c","c","b","c","b","a","a","b","b","c","a","c"}};
         //question = new String[]{"b","a","a","c","a","c","b","a","c","c","b","c","b","a","a","b","b","c","a","c"};
        // correctAnswer = new String[]{"b","a","a","c","a","c","b","a","c","c","b","c","b","a","a","b","b","c","a","c"};
        }
    
    
        public void choseRandomQuestion(){
             
       //loop will run untill counter reaches 9
          for(int counter = 0; counter < 10; counter++)
          {
              //initilizes obj
               obj = new QuestionObj();
               //saves the values of the question going to be asked
               //values being declared inside loop as they are not needed outside loop there for they will not be there outside of the loop
              int i = 0;
              //randomValue and binarayValue claims its not being used because it cannot see inside the do while loop
              //randomValue stores value revieved from rand.next
              int randomValue = 0;
              //binaryValue stores value recieved from binarySecarch
              int binaryValue = 0;
              //gets random value to select question from array this one is not really needed but for some reason the first value dose not always get chosen
              randomValue = rand.nextInt(20);
              
                do
                {
                    //using if statement because i doesnt seem to reset out side of if statement there for same questions are being asked
                    if(i != 0)
                    {
                     //resets do loop counter to 0
                        i= 0;
                    }
                    //binary value set to 1
                    binaryValue = 1;
                    //this will run only once during the entirety of both loops as this is to only put first value in the array 
                    if(counter == 0 && a == null)
                    {
                        //sets do loop counter to 1 to exit the loop
                        i=1;
                        //sets a to 1 this value is used as a fail safe
                        a = 1;
                        //selects first random value
                        randomValue = rand.nextInt(20);
                        //stores random value in binarysort array to get ready to be sorted this value is used in the process of checking if question already exsits in array
                        binarysort[counter] = randomValue;
                        //stores same value in chosenquestions this value is used to chose the actual question
                        chosenquestions[counter] = randomValue;
                        //question, answer, incorrect answer1, incorrect answer 2, radion button selection gets taking out of QandA array and stored in object
                        obj.setquestion(QandA[0][chosenquestions[counter]]);
                        obj.setanswer(QandA[1][chosenquestions[counter]]);
                        obj.setincorrect1(QandA[2][chosenquestions[counter]]);
                        obj.setincorrect2(QandA[3][chosenquestions[counter]]);
                        obj.setrad(QandA[4][chosenquestions[counter]]);
                        //store values from object into object arraylist 
                        objArr.add(obj);
                    }
                    //after the first loop around this will run
                    else
                    {
                        //getting binarysort ready for checking 
                        Arrays.sort(binarysort);
                        //cheking binarysort to see if value of temp alrady exsits if it exsists the value in tempbin will be a positive number
                        //if value does not exsist then value in tempbin will be negitive
                        binaryValue = Arrays.binarySearch(binarysort,randomValue);
                        //if value of binaryValue is negitive the question will be put into the question list to ask user. if value is positive question will be chosen again
                        //this is a test remove comment to view what is happening in backgroun JOptionPane.showMessageDialog(null,"test" + tempbin + " " +  Arrays.toString(chosenquestions) + Arrays.toString(binarysort) + " " + temp);
                        if(binaryValue < 0)
                        {
                            //this adds the first values
                            binarysort[counter] = randomValue;
                            //number stored in temp will be stored in chosenquestion array for checking if user input matches later on
                            chosenquestions[counter] = randomValue;
                            //number in the first set of brackets is the QandA is the array row
                            //the second bracket contains chosenquestions[index number is in] is the selected question in QandA result
                            obj.setquestion(QandA[0][chosenquestions[counter]]);
                            obj.setanswer(QandA[1][chosenquestions[counter]]);
                            obj.setincorrect1(QandA[2][chosenquestions[counter]]);
                            obj.setincorrect2(QandA[3][chosenquestions[counter]]);
                            obj.setrad(QandA[4][chosenquestions[counter]]);
                            //adds objects (obj) to object arraylist(objArr)
                            objArr.add(obj);
                             //sets i to 1 to end loop
                            i = 1;
                        }
                        //else if binaryValue is more than 0 then get a new random number
                        else if(binaryValue >= 0)
                        {
                             //picks new question and stores question in RandomValue
                            randomValue = rand.nextInt(20);
                            //sets i to 0 to re-run loop and check if chosen question is already in array
                            i = 0;
                        }
                        //else display error
                        else
                        {
                            //error checking
                            JOptionPane.showMessageDialog(null,"something went wrong with choosing questions");
                        }
                    }
                   //JOptionPane.showMessageDialog(null, i);
                }while(i != 1);
            } // end of loop  
            
        //this is a test JOptionPane.showMessageDialog(null,objArr.get(0).getquestion() + " "+ objArr.get(1).getquestion() + " " + objArr.get(2).getquestion() + " array=" + randomizedQuestion[0] + " " + randomizedQuestion[1] + " " + randomizedQuestion[9]);
       //sets the object array
        quizgui.setobjarr(objArr);
        quizgui.setpage(page); 
         
    }
 
    
    
}
