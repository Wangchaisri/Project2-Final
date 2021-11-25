package com.example.benz3.mathforpreprimarykids;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LessnumActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lessnum);

        Button btn_example_number1;
        btn_example_number1=(Button)findViewById(R.id.btn_example_number1) ;
        btn_example_number1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(getApplicationContext(),CountActivity.class);
                startActivity(intent);
            }
        });

    }
}
