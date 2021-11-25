package com.example.benz3.mathforpreprimarykids;

public class ExerciseCompa {
    Integer[] mQuestion ={
            R.drawable.weght1,
            R.drawable.weght2,
            R.drawable.weght3,
            R.drawable.weght4,
            R.drawable.weght5,
            R.drawable.weght6,
            R.drawable.weght7,
            R.drawable.cmpari1,
            R.drawable.cmpari2,
            R.drawable.cmpari3,
            R.drawable.cmpari4,
            R.drawable.cmpari5,
            R.drawable.cmpari6,

    };
    private String mChoices[][]={
            {"1","2","3","4"},
            {"1","2","3","4"},
            {"1","2","3","4"},
            {"1","2","3","4"},
            {"1","2","3","4"},

            {"1","2","3","4"},
            {"1","2","3","4"},
            {"1","2","3","4"},
            {"1","2","3","4"},
            {"1","2","3","4"},

            {"1","2","3","4"},
            {"1","2","3","4"},
            {"1","2","3","4"},



    };

    private  String mCorrectAnswers[]={ "1","1","1","2","2","2","1","2","3","1","2","3","1",};
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
