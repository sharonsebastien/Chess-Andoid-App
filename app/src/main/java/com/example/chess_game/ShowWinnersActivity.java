package com.example.chess_game;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;

public class ShowWinnersActivity extends AppCompatActivity {
    TextView winners1;
    Button home;
    WinnerDBHandler whandler = new WinnerDBHandler(this,"WinnerDB",null,1);
    DBHandler handler = new DBHandler(this,"movesDB2",null,1);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_winners);

        winners1 = findViewById(R.id.winners1);
        home = findViewById(R.id.home);

        winners1.setMovementMethod(new ScrollingMovementMethod());
        Log.d("NEW TAG", "onCreate: " + whandler.getAllWinners());
        winners1.setText(whandler.getAllWinners());

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ShowWinnersActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }

}