package com.example.chess_game;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;


import android.app.Dialog;
import android.app.WallpaperManager;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

public class ENTER_DETAIL extends AppCompatActivity {
Button image1,image2,image3,image4,Submit;
LinearLayout background_image,background_image2;
EditText player1,player2,theme;
Button time1,time2,time3;
    int time = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_detail);
        ActionBar actionBar = getSupportActionBar();

        image1 = (Button) findViewById(R.id.i1);
        image2 = (Button) findViewById(R.id.i2);
        image3 = (Button) findViewById(R.id.i3);
        image4 = (Button) findViewById(R.id.i4);
        Submit = (Button) findViewById(R.id.subbtn);

        background_image = (LinearLayout) findViewById(R.id.imageback);

        player1 = findViewById(R.id.player_1);
        player2 = findViewById(R.id.player_2);
        time1 = findViewById(R.id.minute_10);
        time2 = findViewById(R.id.minute_20);
        time3 = findViewById(R.id.minute_30);

        //creating object of database
        User_Database db = new User_Database(this);
        USER_DETAILS details = new USER_DETAILS();


        //shared preference
        SharedPreferences sh = getSharedPreferences("myuserdetails", MODE_PRIVATE);
        SharedPreferences.Editor myedit = sh.edit();

        image1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                background_image.setBackground(getResources().getDrawable(R.drawable.chess1));
            }
        });
        image2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                background_image.setBackground(getResources().getDrawable(R.drawable.chess5));
            }
        });
        image3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                background_image.setBackground(getResources().getDrawable(R.drawable.chess3));
            }
        });
        image4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                background_image.setBackground(getResources().getDrawable(R.drawable.chess4));
            }
        });
        time1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                time = 10;
                myedit.putString("time", "1");
                details.setTime(time1.getText().toString());

            }
        });
        time2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                time = 20;
                myedit.putString("time", time2.getText().toString());
                details.setTime(time2.getText().toString());
            }
        });
        time3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                time = 30;
                myedit.putString("time", time3.getText().toString());
                details.setTime(time3.getText().toString());
            }
        });
        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                myedit.putString("name1", player1.getText().toString());
                myedit.putString("name2", player2.getText().toString());


                    details.setPlayer_1(player1.getText().toString());
                    details.setPlayer_2(player2.getText().toString());

                    myedit.apply();
                    db.add_details(details);
                    Intent intent = new Intent(ENTER_DETAIL.this, ShowDetails.class);
                    startActivity(intent);
                }


        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.about_game,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

         switch (item.getItemId()){
             case R.id.about :
                 Intent intent = new Intent(ENTER_DETAIL.this,ABOUT.class);
                 startActivity(intent);
                 break;
             case R.id.learn:
                 Intent intent1 = new Intent(ENTER_DETAIL.this,LEARN_GAME.class);
                 startActivity(intent1);
         }
         return true;
    }



}
