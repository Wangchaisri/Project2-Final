package com.example.benz3.mathforpreprimarykids;

public class ExerciseNum {
    Integer[] mQuestion ={
            R.drawable.bae45,
            R.drawable.chick7,
            R.drawable.ele9,
            R.drawable.lion9,
            R.drawable.pi89,
            R.drawable.odnum1,
            R.drawable.odnum2,
            R.drawable.odnum3,
            R.drawable.odnum4,
            R.drawable.odnum5,
            R.drawable.odnum7,
            R.drawable.odnum8,
            R.drawable.odnum9,

    };
    private String mChoices[][]={
            {"3 ตัว","4 ตัว","5 ตัว","6 ตัว"},
            {"1 ตัว","2 ตัว","3 ตัว","4 ตัว"},
            {"4 ตัว","5 ตัว","6 ตัว","7 ตัว"},
            {"7 ตัว","8 ตัว","9 ตัว","10 ตัว"},
            {"2 ตัว","4 ตัว","6 ตัว","8 ตัว"},

            {"7 ตัว","8 ตัว","9 ตัว","10 ตัว"},
            {"3 ตัว","4 ตัว","5 ตัว","4 ตัว"},
            {"5 ตัว","7 ตัว","8 ตัว","9 ตัว"},
            {"1 ตัว","2 ตัว","3 ตัว","4 ตัว"},
            {"1 ตัว","2 ตัว","3 ตัว","4 ตัว"},

            {"3 ตัว","4 ตัว","5 ตัว","4 ตัว"},
            {"5 ตัว","7 ตัว","8 ตัว","9 ตัว"},
            {"1 ตัว","2 ตัว","3 ตัว","4 ตัว"},



    };

    private  String mCorrectAnswers[]={ "5 ตัว","3 ตัว","6 ตัว","8 ตัว","2 ตัว","10 ตัว","5 ตัว","7 ตัว","2 ตัว","1 ตัว","3 ตัว","8 ตัว","4 ตัว",};
    public  Integer getQuestion(int a){
        Integer question =mQuestion[a];
        return question;
    }
    public  String getChoice1(int a){
        String choice =mChoices[a][0];
        return choice;
    }
    public  String getChoice2(int a){
        String choice =mChoices[a][1];
        return choice;
    }
    public  String getChoice3(int a){
        String choice =mChoices[a][2];
        return choice;
    }
    public  String getChoice4(int a){
        String choice =mChoices[a][3];
        return choice;
    }
    public String getCorrectAnswer8(int a){
        String answer =mCorrectAnswers[a];
        return answer;
    }
}
