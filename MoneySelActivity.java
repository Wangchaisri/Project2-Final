package com.example.benz3.mathforpreprimarykids;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MoneySelActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_money_sel);

        Button btn_koookai1;
        btn_koookai1=(Button)findViewById(R.id.btn_koookai1) ;
        btn_koookai1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(getApplicationContext(),Money1Activity.class);
                startActivity(intent);
            }
        });


        Button btn_koookai2;
        btn_koookai2=(Button)findViewById(R.id.btn_koookai2) ;
        btn_koookai2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(getApplicationContext(),Money2Activity.class);
                startActivity(intent);
            }
        });

        Button btn_koookai5;
        btn_koookai5=(Button)findViewById(R.id.btn_koookai5) ;
        btn_koookai5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(getApplicationContext(),Money5Activity.class);
                startActivity(intent);
            }
        });

        Button btn_koookai10;
        btn_koookai10=(Button)findViewById(R.id.btn_koookai10) ;
        btn_koookai10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(getApplicationContext(),Money10Activity.class);
                startActivity(intent);
            }
        });



    }
}
