package com.example.benz3.mathforpreprimarykids;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LessnumPlusActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lessnum_plus);

        Button btn_btn_befornumpls;
        btn_btn_befornumpls=(Button)findViewById(R.id.btn_befornumpls) ;
        btn_btn_befornumpls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(getApplicationContext(),ExercisePlusMinusActivity.class);
                startActivity(intent);
            }
        });
    }
}
