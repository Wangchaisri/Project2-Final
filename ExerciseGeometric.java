package com.example.benz3.mathforpreprimarykids;

public class ExerciseGeometric {
    Integer[] mQuestion ={
            R.drawable.shep1,
            R.drawable.shep2,
            R.drawable.shep3,
            R.drawable.shep4,
            R.drawable.shep5,
            R.drawable.shep6,
            R.drawable.shep7,
            R.drawable.shep8,
            R.drawable.shep9,
            R.drawable.shep10,
            R.drawable.shep11,
            R.drawable.shep12,

    };
    private String mChoices[][]={
            {"ดาว","4เหลี่ยมขนมเปียกปูน","วงกลม","3เหลี่ยมด้านเท่า"},
            {"ดาว","4เหลี่ยมขนมเปียกปูน","วงกลม","3เหลี่ยมด้านเท่า"},
            {"ดาว","4เหลี่ยมขนมเปียกปูน","วงกลม","3เหลี่ยมด้านเท่า"},
            {"ดาว","4เหลี่ยมขนมเปียกปูน","วงกลม","3เหลี่ยมด้านเท่า"},

            {"ลูกศร","วงรี","5เหลี่ยม","4เหลีย่มจัสตุรัส"},
            {"ลูกศร","วงรี","5เหลี่ยม","4เหลีย่มจัสตุรัส"},
            {"ลูกศร","วงรี","5เหลี่ยม","4เหลีย่มจัสตุรัส"},
            {"ลูกศร","วงรี","5เหลี่ยม","4เหลีย่มจัสตุรัส"},

            {"บวก","หัวใจ","6เหลี่ยม","4เหลี่ยมผืนผ้า"},
            {"บวก","หัวใจ","6เหลี่ยม","4เหลี่ยมผืนผ้า"},
            {"บวก","หัวใจ","6เหลี่ยม","4เหลี่ยมผืนผ้า"},
            {"บวก","หัวใจ","6เหลี่ยม","4เหลี่ยมผืนผ้า"},

    };

    private  String mCorrectAnswers[]={ "ดาว","4เหลี่ยมขนมเปียกปูน","วงกลม","3เหลี่ยมด้านเท่า","ลูกศร","วงรี","5เหลี่ยม","4เหลี่ยมจัสตุรัส","บวก","หัวใจ","6เหลี่ยม","4เหลี่ยมผืนผ้า",};
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
