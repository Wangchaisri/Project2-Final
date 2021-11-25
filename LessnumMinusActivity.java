package com.example.benz3.mathforpreprimarykids;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LessnumMinusActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lessnum_minus);

        Button btn_lesson_countnum14;
        btn_lesson_countnum14=(Button)findViewById(R.id.btn_lesson_countnum14) ;
        btn_lesson_countnum14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(getApplicationContext(),MinusActivity.class);
                startActivity(intent);
            }
        });
    }
}
