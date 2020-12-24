package com.dummytesting;

public class MoodAnalyser {

    private String message;
//    public MoodAnalyser(String message){
//        this.message=message;
//    }
    public String analyseMood(String message) throws MoodAnalyserException {
        this.message=message;
        return analyseMood();
    }
    public String analyseMood() throws MoodAnalyserException {
        try{
            if(message.length() ==0){
            throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.EMPTY_TYPE,"Please enter valid message");
            }
            if(message.contains("Sad")){
                return "Sad";
            }
            else{
                return "Happy";
            }
        }catch(NullPointerException e){
            throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.NULL_TYPE,"Please enter valid message");
        }

    }
}
