package com.dummytesting;

public class MoodAnalyser {

    private String message;
    public MoodAnalyser(String message){
        this.message=message;
    }
    public String analyseMood(){
        try{
            if(this.message.contains("Sad")){
                return "Sad";
            }
            else{
                return "Happy";
            }
        }catch(NullPointerException e){

            return "Happy";
        }

    }
}
