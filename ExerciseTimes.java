package com.example.benz3.mathforpreprimarykids;

public class ExerciseTimes {
    Integer[] mQuestion1 ={
            R.drawable.yan,
            R.drawable.yan1,
            R.drawable.yan3,
            R.drawable.yan4,
            R.drawable.yan7,
            R.drawable.yan9,
            R.drawable.yan10,
            R.drawable.yan12,
            R.drawable.yan13,
            R.drawable.yan15,
            R.drawable.yan16,

    };
    private String mChoices1[][]={
            {"เช้า","เที่ยง","เย็น","ค่ำ"},
            {"เช้า","สาย","บ่าย","เย็น"},
            {"เช้า","เที่ยง","เย็น","ค่ำ"},
            {"เช้า","สาย","บ่าย","เย็น"},
            {"เช้า","เที่ยง","เย็น","ค่ำ"},

            {"เช้า","สาย","บ่าย","เย็น"},
            {"เช้า","สาย","บ่าย","เย็น"},
            {"เช้า","เที่ยง","เย็น","ค่ำ"},
            {"เช้า","เที่ยง","เย็น","ค่ำ"},
            {"เช้า","สาย","บ่าย","เย็น"},
            {"เช้า","เที่ยง","เย็น","ค่ำ"},


    };

    private  String mCorrectAnswers1[]={ "เที่ยง","เช้า","เที่ยง","บ่าย","ค่ำ","เย็น","บ่าย","สาย","ค่ำ","เช้า","เช้า",};
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
