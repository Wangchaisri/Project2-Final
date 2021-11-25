package com.example.benz3.mathforpreprimarykids;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GameEasyNumberActivity extends AppCompatActivity implements View.OnClickListener{
    Button Gamescount1, Gamescount2, Gamescount3, Gamescount4, Gamescount5, Gamescount6, Gamescount7, Gamescount8;
    String[] images;
    List<String> strList;
    Button[] buttons;
    int i, evenImage, oddImage;
    int click = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_easy_number);

        Gamescount1=findViewById(R.id.gamescount7);
        Gamescount2=findViewById(R.id.gamescount18);
        Gamescount3=findViewById(R.id.gamescount12);
        Gamescount4=findViewById(R.id.gamescount17);
        Gamescount5=findViewById(R.id.gamescount14);
        Gamescount6=findViewById(R.id.gamescount16);
        Gamescount7=findViewById(R.id.gamescount13);
        Gamescount8=findViewById(R.id.gamescount15);

        images = new String[] {"one", "three", "seven", "eight","one", "three", "seven", "eight"};

        strList = Arrays.asList(images);
        Collections.shuffle(strList);    //สุ่มรูป สลับที่

        buttons = new Button[] {Gamescount1, Gamescount2, Gamescount3, Gamescount4, Gamescount5, Gamescount6, Gamescount7, Gamescount8};
        for(i=0; i <= buttons.length-1; i++){         //เราจะทำตามลูป
            buttons[i].setBackgroundResource(getImage(images[i]));
            buttons[i].setTag(i);               //ติดแท็ก
            buttons[i].setText(images[i]);
            buttons[i].setOnClickListener(this);
        }
    }

    private void setContentView(int activity_game_easy_number) {
    }

    private int getImage(String strimage) {        //รับชื่อมา
        int image=0;
        switch (strimage){
            case "one":                         //ถ้าเข้าเงื่อนไขเป็น one
                image = R.drawable.one;        //จะไปที่ drawable และที่รูป
                break;

            case "three":                         //ถ้าเข้าเงื่อนไขเป็น three
                image = R.drawable.three;        //จะไปที่ drawable และที่รูป
                break;

            case "seven":                         //ถ้าเข้าเงื่อนไขเป็น seven
                image = R.drawable.seven;        //จะไปที่ drawable และที่รูป
                break;

            case "eight":                         //ถ้าเข้าเงื่อนไขเป็น eight
                image = R.drawable.eight;        //จะไปที่ drawable และที่รูป
                break;
        }
        return  image;
    }

    @Override
    public void onClick(View v) {
        // Toast.makeText(this, "MENU", Toast.LENGTH_SHORT).show();

        int i = (int)v.getTag();        //ตรวจสอบ tag
        if(click == 0){       // ตรวจสอบเงื่อนไขว่าเลือภาพครั้งแรกมั้ย ถ้าครั้งแรกให้เป็น
            evenImage = i;
        }
        else{
            if(click%2 == 1){
                oddImage = i;       //ถ้าเข้ามาแล้วเป็น 1 เลขคี่
            }
            else if(click%2 == 0){
                evenImage = i;      //ถ้าเข้ามาแล้วเป็น 0 เลขคู่
            }
            if((oddImage != evenImage) &&       //รูปที  1 กับรูปที่ 2 จะต้องไม่ใช่ตำแหน่งเดียวกัน
                    (buttons[oddImage].getText().toString().equalsIgnoreCase(buttons[evenImage].getText().toString())))  {    //เช็คว่ารูปภาพเหมือนกันหรือเปล่า
                buttons[oddImage].setClickable(false);
                buttons[evenImage].setClickable(false);
                buttons[oddImage].setBackgroundResource(R.drawable.true3);        //เมื่อกดเลือกรูปแล้วจะแสดงรูปสีข้าวเพื่อบอกว่าเราเลือกรูปไปแล้ว
                buttons[evenImage].setBackgroundResource(R.drawable.true3);       //เมื่อกดเลือกรูปแล้วจะแสดงรูปสีข้าวเพื่อบอกว่าเราเลือกรูปไปแล้ว
            }
        }
        click++;
    }
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // R.menu.mymenu is a reference to an xml file named mymenu.xml which should be inside your res/menu directory.
//        // If you don't have res/menu, just create a directory named "menu" inside res
//        getMenuInflater().inflate(R.menu.mymenu, menu);
//        return super.onCreateOptionsMenu(menu);
//    }

//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        int id = item.getItemId();
//
//        if (id == R.id.mybutton) {
//            // do something here
//            Intent HomeIntent = new Intent(GameEasyNumberActivity.this,MenuActivity.class);
//            startActivity(HomeIntent);
//        }
//        return super.onOptionsItemSelected(item);
//    }
}

