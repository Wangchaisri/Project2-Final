package com.example.benz3.mathforpreprimarykids;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LessonNumberActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_number);


        Button btn_befornum;
        btn_befornum=(Button)findViewById(R.id.btn_befornum) ;
        btn_befornum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(getApplicationContext(),ExerciseNumberActivity.class);
                startActivity(intent);
            }
        });


        Button btn_afternum;
        btn_afternum=(Button)findViewById(R.id.btn_afternum) ;
        btn_afternum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(getApplicationContext(),ExerciseAfNumActivity.class);
                startActivity(intent);
            }
        });

    }
}

