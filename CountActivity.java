package com.example.benz3.mathforpreprimarykids;

import android.content.Intent;
import android.content.res.Configuration;
import android.support.annotation.Nullable;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class CountActivity extends AppCompatActivity {

    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle actionBarDrawerToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_count);

        Button btn_1;
        btn_1=(Button)findViewById(R.id.btn_1) ;
        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(getApplicationContext(),Num1Activity.class);
                startActivity(intent);
            }
        });

        Button btn_2;
        btn_2=(Button)findViewById(R.id.btn_2) ;
        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(getApplicationContext(),Num2Activity.class);
                startActivity(intent);
            }
        });

        Button btn_3;
        btn_3=(Button)findViewById(R.id.btn_3) ;
        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(getApplicationContext(),Num3Activity.class);
                startActivity(intent);
            }
        });

        Button btn_4;
        btn_4=(Button)findViewById(R.id.btn_4) ;
        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(getApplicationContext(),Num4Activity.class);
                startActivity(intent);
            }
        });

        Button btn_5;
        btn_5=(Button)findViewById(R.id.btn_5) ;
        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(getApplicationContext(),Num5Activity.class);
                startActivity(intent);
            }
        });

        Button btn_6;
        btn_6=(Button)findViewById(R.id.btn_6) ;
        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(getApplicationContext(),Num6Activity.class);
                startActivity(intent);
            }
        });

        Button btn_7;
        btn_7=(Button)findViewById(R.id.btn_7) ;
        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(getApplicationContext(),Num7Activity.class);
                startActivity(intent);
            }
        });

        Button btn_8;
        btn_8=(Button)findViewById(R.id.btn_8) ;
        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(getApplicationContext(),Num8Activity.class);
                startActivity(intent);
            }
        });

        Button btn_9;
        btn_9=(Button)findViewById(R.id.btn_9) ;
        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(getApplicationContext(),Num9Activity.class);
                startActivity(intent);
            }
        });

        Button btn_10;
        btn_10=(Button)findViewById(R.id.btn_10) ;
        btn_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(getApplicationContext(),Num10Activity.class);
                startActivity(intent);
            }
        });

        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);

        actionBarDrawerToggle = new ActionBarDrawerToggle(CountActivity.this,

                mDrawerLayout,

                R.string.open_drawer,

                R.string.close_drawer);



    }


    @Override

    public void onConfigurationChanged(Configuration newConfig) {

        super.onConfigurationChanged(newConfig);

        actionBarDrawerToggle.onConfigurationChanged(newConfig);

    }


    @Override

    protected void onPostCreate(@Nullable Bundle savedInstanceState) {

        super.onPostCreate(savedInstanceState);

        actionBarDrawerToggle.syncState();

    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return (super.onCreateOptionsMenu(menu));
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.exit){
            startActivity(new Intent(this, MainActivity.class));
            return true;
        }


        return super.onOptionsItemSelected(item);
    }
    public void onBackPressed() {
        startActivity(new Intent(this, MainActivity.class));
    }


}
