package com.dummytesting;

public class MoodAnalyser {

    private String message;
    public MoodAnalyser(String message){
        this.message=message;
    }
    public String analyseMood(){
       if(this.message.contains("Sad")){
           return "Sad";
       }
       else{
           return "Happy";
       }
    }
}
