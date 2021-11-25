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
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle actionBarDrawerToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_number;
        btn_number=(Button)findViewById(R.id.btn_number) ;
        btn_number.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(getApplicationContext(),NumberActivity.class);
                startActivity(intent);
            }
        });

        Button btn_plusnminus;
        btn_plusnminus=(Button)findViewById(R.id.btn_plusnminus) ;
        btn_plusnminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(getApplicationContext(),PlusnminusActivity.class);
                startActivity(intent);
            }
        });

        Button btn_size;
        btn_size=(Button)findViewById(R.id.btn_size) ;
        btn_size.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(getApplicationContext(),SizeActivity.class);
                startActivity(intent);
            }
        });

        Button btn_times;
        btn_times=(Button)findViewById(R.id.btn_times) ;
        btn_times.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(getApplicationContext(),TimesActivity.class);
                startActivity(intent);
            }
        });

        Button btn_geometry;
        btn_geometry=(Button)findViewById(R.id.btn_geometry) ;
        btn_geometry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(getApplicationContext(),GeometryActivity.class);
                startActivity(intent);
            }
        });

        Button btn_comparison;
        btn_comparison=(Button)findViewById(R.id.btn_comparison) ;
        btn_comparison.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(getApplicationContext(),ComparisonActivity.class);
                startActivity(intent);
            }
        });

//        Button btn_game;
//        btn_game=(Button)findViewById(R.id.btn_game) ;
//        btn_game.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent =new Intent(getApplicationContext(),JubKooActivity.class);
//                startActivity(intent);
//            }
//        });

        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);

        actionBarDrawerToggle = new ActionBarDrawerToggle(MainActivity.this,

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



//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu_main, menu);
//        return (super.onCreateOptionsMenu(menu));
//    }



}


