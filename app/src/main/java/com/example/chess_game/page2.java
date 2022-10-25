package com.example.chess_game;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class page2 extends AppCompatActivity {
    Button next,about,how;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);

        next =(Button) findViewById(R.id.buttonnext);
        how =(Button) findViewById(R.id.buttonhow);
        about =(Button) findViewById(R.id.buttonabt);


        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(page2.this,ENTER_DETAIL.class);
                startActivity(intent);
            }
        });
        how.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(page2.this,LEARN_GAME.class);
                startActivity(intent);
            }
        });
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(page2.this,ABOUT.class);
                startActivity(intent);
            }
        });

    }
}