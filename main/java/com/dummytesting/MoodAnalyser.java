package com.dummytesting;

public class MoodAnalyser {
    public static String analyseMood(String message){

       if(message.contains("Sad")){
           return "Sad";
       }
       else{
           return "Happy";
       }
    }
}
