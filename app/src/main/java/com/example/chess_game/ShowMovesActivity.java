package com.example.chess_game;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.widget.TextView;

public class ShowMovesActivity extends AppCompatActivity {
    TextView textView;
    DBHandler handler = new DBHandler(this,"movesDB2",null,1);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_moves);


        textView = findViewById(R.id.textview);
        textView.setMovementMethod(new ScrollingMovementMethod());
        Intent intent = getIntent();
        String str = intent.getStringExtra("key1");
        textView.setText(str);
    }

}