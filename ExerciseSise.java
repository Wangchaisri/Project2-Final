package com.example.benz3.mathforpreprimarykids;

public class ExerciseSise {
    private String[] mQuestiontext1 ={
            "หมีอะไร",
            "แพนด้าคือตัวไหน",
            "หมาอะไร",
            "หมูอะไร",
            "หนูอะไร",
            "หมัดอะไร",
            "นกอะไร"
    };


    Integer[] mQuestion1 ={
            R.drawable.copa1,
            R.drawable.copa2,
            R.drawable.copa3,
            R.drawable.copa4,
            R.drawable.copa5,
            R.drawable.copa6,
            R.drawable.copa7,

    };
    private String mChoices1[][]={
            {"หมีแพนด้า","กระต่าย","นกฟรามิงโก้","ม้าลาย"},
            {"หมีโคอะล่า","แรกคูณ","ช้าง","หมีแพนด้า"},
            {"สิงโต","แรกคูณ","แกะ","ลิง"},
            {"หมีขาว","ม้าลาย","กบ","ลิง"},
            {"ยีราฟ","หมีโคอะล่า","หมีขาว","นกฟรามิงโก้"},
            {"นกฟรามิงโก้","ยีราฟ","กบ","แกะ"},
            {"หมีโคอะล่า","กระต่าย","ม้าลาย","แกะ"},
    };

    private  String mCorrectAnswers1[]={ "หมีแพนด้า","ช้าง","แรกคูณ","หมีขาว","นกฟรามิงโก้","ยีราฟ","แกะ",};
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

    public String getQuestiontext1(int a){
        String question =mQuestiontext1[a];
        return question;}

    public int getFullscore(){
        int fullscore =mQuestiontext1.length ;
        return  fullscore;
    }
}
