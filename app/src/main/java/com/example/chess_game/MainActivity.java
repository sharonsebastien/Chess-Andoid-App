package com.example.chess_game;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView tw;
LinearLayout lw;
Button play_begin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tw = findViewById(R.id.name);
        lw = findViewById(R.id.image_view);
        play_begin =findViewById(R.id.play);
        Animation image = AnimationUtils.loadAnimation(this, R.anim.image_zoom);
        lw.startAnimation(image);
        Animation move = AnimationUtils.loadAnimation(this, R.anim.chess_intro);
        tw.startAnimation(move);

        play_begin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ENTER_DETAIL.class);
                startActivity(intent);
            }
        });
    }

}
