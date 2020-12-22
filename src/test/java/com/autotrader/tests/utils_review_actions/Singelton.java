package com.autotrader.tests.utils_review_actions;

public class Singelton {
    // Making the constructor private so we limit creating objects from this class
    private Singelton(){

    }
    // Making the String private so that we can only reach this using getter method
    private static String word;

    // creating a getter method to allow users to reach private String above

    public static String getWord(){
        if( word == null){

            System.out.println("Word does not hav value");
            word = "Something";
        }else {
            System.out.println("Word right know has value is: " +word);
        }
        return word;


    }


}
