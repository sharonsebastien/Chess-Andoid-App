package com.example.chess_game;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ShowDetails extends AppCompatActivity {
Button start;
TextView player1,player2,time1,Theme;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_details);
LinearLayout image_linear = findViewById(R.id.liner_image);
        start = (Button) findViewById(R.id.startbtn);
        player1 =  findViewById(R.id.play1);
        player2 =  findViewById(R.id.play2);
        time1 =  findViewById(R.id.timesh);
        Theme =  findViewById(R.id.theme);
        SharedPreferences sh = getSharedPreferences("myuserdetails",MODE_PRIVATE);
        String name1 = sh.getString("name1","");
        String name2 = sh.getString("name2","");
        String time = sh.getString("time","");
        time1.setText(time);
        player1.setText(name1);
        player2.setText(name2);

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation image = AnimationUtils.loadAnimation(ShowDetails.this, R.anim.start_game);
                image_linear.startAnimation(image);
                Intent intent = new Intent(ShowDetails.this,Chessboard.class);
                startActivity(intent);
            }
        });

    }
}