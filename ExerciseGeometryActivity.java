package com.example.benz3.mathforpreprimarykids;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;
public class ExerciseGeometryActivity extends AppCompatActivity {


    MediaPlayer sound;
    Button choose1, choose2,choose3,choose4;
    TextView score;
    ImageView question;
    private ExerciseGeometric mQuestion = new ExerciseGeometric();
    private String  mAnswer;
    private int mscore =0;
    private int mQuestionsLenght = mQuestion.mQuestion.length;
    Random r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise_geometry);

        r = new Random();




        choose1 = (Button) findViewById(R.id.choose1);
        choose2 = (Button) findViewById(R.id.choose2);
        choose3 = (Button) findViewById(R.id.choose3);
        choose4 = (Button)findViewById(R.id.choose4);

        score = (TextView) findViewById(R.id.score);
        question= (ImageView) findViewById(R.id.question);

        score.setText("คะแนน:"+mscore);
        updateQuestion(r.nextInt(mQuestionsLenght));
        choose1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (choose1.getText()==mAnswer){
                    Toast toast = Toast.makeText(getApplicationContext(), "                              ถูกต้องค่ะ                              ", Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.CENTER, 0, 0);
                    LinearLayout toastContentView = (LinearLayout) toast.getView();
                    ImageView imageView = new ImageView(getApplicationContext());
                    imageView.setImageResource(R.drawable.true3);
                    toastContentView.addView(imageView, 0);
                    toast.show();
                    mscore++;
                    score.setText("คะแนน:"+mscore);
                    updateQuestion(r.nextInt(mQuestionsLenght));
                    if (mscore==10) {
                        Toast.makeText(ExerciseGeometryActivity.this, "จบเกมส์", Toast.LENGTH_LONG).show();
                        gameOver();
                    }


                }else{
                    Toast toast = Toast.makeText(getApplicationContext(), "                              ผิดแล้วค่ะ                              ", Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.CENTER, 0, 0);
                    LinearLayout toastContentView = (LinearLayout) toast.getView();
                    ImageView imageView = new ImageView(getApplicationContext());
                    imageView.setImageResource(R.drawable.false1);
                    toastContentView.addView(imageView, 0);
                    toast.show();
                    gameOver();
                }
            }

        });
        choose2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (choose2.getText()==mAnswer){
                    Toast toast = Toast.makeText(getApplicationContext(), "                              ถูกต้องค่ะ                              ", Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.CENTER, 0, 0);
                    LinearLayout toastContentView = (LinearLayout) toast.getView();
                    ImageView imageView = new ImageView(getApplicationContext());
                    imageView.setImageResource(R.drawable.true3);
                    toastContentView.addView(imageView, 0);
                    toast.show();
                    mscore++;
                    score.setText("คะแนน:"+mscore);
                    updateQuestion(r.nextInt(mQuestionsLenght));
                    if (mscore==10) {
                        Toast.makeText(ExerciseGeometryActivity.this, "จบเกมส์", Toast.LENGTH_LONG).show();
                        gameOver();
                    }


                }else{
                    Toast toast = Toast.makeText(getApplicationContext(), "                              ผิดแล้วค่ะ                              ", Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.CENTER, 0, 0);
                    LinearLayout toastContentView = (LinearLayout) toast.getView();
                    ImageView imageView = new ImageView(getApplicationContext());
                    imageView.setImageResource(R.drawable.false1);
                    toastContentView.addView(imageView, 0);
                    toast.show();
                    gameOver();
                }
            }

        });
        choose3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (choose3.getText()==mAnswer){
                    Toast toast = Toast.makeText(getApplicationContext(), "                              ถูกต้องค่ะ                              ", Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.CENTER, 0, 0);
                    LinearLayout toastContentView = (LinearLayout) toast.getView();
                    ImageView imageView = new ImageView(getApplicationContext());
                    imageView.setImageResource(R.drawable.true3);
                    toastContentView.addView(imageView, 0);
                    toast.show();
                    mscore++;
                    score.setText("คะแนน:"+mscore);
                    updateQuestion(r.nextInt(mQuestionsLenght));
                    if (mscore==10) {
                        Toast.makeText(ExerciseGeometryActivity.this, "จบเกมส์", Toast.LENGTH_LONG).show();
                        gameOver();
                    }


                }else{
                    Toast toast = Toast.makeText(getApplicationContext(), "                              ผิดแล้วค่ะ                              ", Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.CENTER, 0, 0);
                    LinearLayout toastContentView = (LinearLayout) toast.getView();
                    ImageView imageView = new ImageView(getApplicationContext());
                    imageView.setImageResource(R.drawable.false1);
                    toastContentView.addView(imageView, 0);
                    toast.show();
                    gameOver();
                }
            }

        });
        choose4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (choose4.getText()==mAnswer){
                    Toast toast = Toast.makeText(getApplicationContext(), "                              ถูกต้องค่ะ                              ", Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.CENTER, 0, 0);
                    LinearLayout toastContentView = (LinearLayout) toast.getView();
                    ImageView imageView = new ImageView(getApplicationContext());
                    imageView.setImageResource(R.drawable.true3);
                    toastContentView.addView(imageView, 0);
                    toast.show();
                    mscore++;
                    score.setText("คะแนน:"+mscore);
                    updateQuestion(r.nextInt(mQuestionsLenght));
                    if (mscore==10) {
                        Toast.makeText(ExerciseGeometryActivity.this, "จบเกมส์", Toast.LENGTH_LONG).show();
                        gameOver();
                    }


                }else {
                    Toast toast = Toast.makeText(getApplicationContext(), "                              ผิดแล้วค่ะ                              ", Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.CENTER, 0, 0);
                    LinearLayout toastContentView = (LinearLayout) toast.getView();
                    ImageView imageView = new ImageView(getApplicationContext());
                    imageView.setImageResource(R.drawable.false1);
                    toastContentView.addView(imageView, 0);
                    toast.show();
                    gameOver();
                }
            }
        });
    }
    private  void  updateQuestion(int num){
        question.setImageResource(mQuestion.getQuestion(num));
        choose1.setText(mQuestion.getChoice1(num));
        choose2.setText(mQuestion.getChoice2(num));
        choose3.setText(mQuestion.getChoice3(num));
        choose4.setText(mQuestion.getChoice4(num));
        mAnswer=mQuestion.getCorrectAnswer8(num);
    }


    private void gameOver(){
        AlertDialog.Builder Showscore = new AlertDialog.Builder(this);
        Showscore.setTitle("จบเกมส์คะแนนเต็ม 10 ");
        Showscore.setIcon(R.drawable.bg);
        Showscore.setMessage("คะแนนของน้องได้ "+ mscore+" คะแนน")
                .setCancelable(false)
                .setPositiveButton("เริ่มใหม่",
                        new DialogInterface.OnClickListener(){
                            @Override
                            public  void onClick(DialogInterface dialogInterface,int i){
                                startActivity(new Intent(getApplicationContext(),ExerciseGeometryActivity.class));
                                finish();
                            }
                        })
                .setNegativeButton("ออก",
                        new DialogInterface.OnClickListener(){
                            @Override
                            public  void onClick(DialogInterface dialogInterface,int i){
                                finish();
                            }
                        });
        AlertDialog alertDialog = Showscore.create();
        alertDialog.show();;
    }


    public void onBackPressed() {
        startActivity(new Intent(this, ExerciseGeometryActivity.class));
    }


}
