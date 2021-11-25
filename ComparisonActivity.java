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

public class ComparisonActivity extends AppCompatActivity {

    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle actionBarDrawerToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comparison);

        Button btn_lesson_compa;
        btn_lesson_compa=(Button)findViewById(R.id.btn_lesson_compa) ;
        btn_lesson_compa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(getApplicationContext(),ComparisonLessonActivity.class);
                startActivity(intent);
            }
        });

        Button btn_exercise_compa;
        btn_exercise_compa=(Button)findViewById(R.id.btn_exercise_compa) ;
        btn_exercise_compa.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                Intent intent =new Intent(getApplicationContext(),ExerciseComparisonActivity.class);
                startActivity(intent);
            }
        });



        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);

        actionBarDrawerToggle = new ActionBarDrawerToggle(ComparisonActivity.this,

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

//
//
//    @Override
//
//    public boolean onCreateOptionsMenu(Menu menu) {
//
//        MenuInflater inflater = getMenuInflater();
//
//        inflater.inflate(R.menu.menu_main, menu);
//
//        return true;
//
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        if (actionBarDrawerToggle.onOptionsItemSelected(item))
//            return true;
//        // Handle item selection
//        return super.onOptionsItemSelected(item);
//    }

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
