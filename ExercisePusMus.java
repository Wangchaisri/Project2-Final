package com.example.benz3.mathforpreprimarykids;

public class ExercisePusMus {
    Integer[] mQuestion1 ={
            R.drawable.bqar_w1,
            R.drawable.cw34,
            R.drawable.chick90,
            R.drawable.frami9,
            R.drawable.cola9,
            R.drawable.hip9,
            R.drawable.monk8,
            R.drawable.giraf7,
            R.drawable.zebr8,
            R.drawable.cow4,

    };
    private String mChoices1[][]={
            {"3 ตัว","4 ตัว","5 ตัว","6 ตัว"},
            {"4 ตัว","5 ตัว","6 ตัว","7 ตัว"},
            {"1 ตัว","2 ตัว","3 ตัว","4 ตัว"},
            {"7 ตัว","8 ตัว","9 ตัว","10 ตัว"},
            {"2 ตัว","4 ตัว","6 ตัว","8 ตัว"},

            {"1 ตัว","2 ตัว","3 ตัว","4 ตัว"},
            {"2 ตัว","3 ตัว","4 ตัว","5 ตัว"},
            {"2 ตัว","3 ตัว","4 ตัว","5 ตัว"},
            {"1 ตัว","2 ตัว","3 ตัว","4 ตัว"},
            {"1 ตัว","2 ตัว","3 ตัว","4 ตัว"},



    };

    private  String mCorrectAnswers1[]={ "5 ตัว","6 ตัว","1 ตัว","8 ตัว","2 ตัว","4 ตัว","2 ตัว","3 ตัว","3 ตัว","2 ตัว",};
    public  Integer getQuestion(int a){
        Integer question1 =mQuestion1[a];
        return question1;
    }
    public  String getChoice1(int a){
        String choice =mChoices1[a][0];
        return choice;
    }
    public  String getChoice2(int a){
        String choice =mChoices1[a][1];
        return choice;
    }
    public  String getChoice3(int a){
        String choice =mChoices1[a][2];
        return choice;
    }
    public  String getChoice4(int a){
        String choice =mChoices1[a][3];
        return choice;
    }
    public String getCorrectAnswer1(int a){
        String answer =mCorrectAnswers1[a];
        return answer;
    }
}
