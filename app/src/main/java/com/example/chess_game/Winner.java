package com.example.chess_game;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Winner extends AppCompatActivity {
    TextView player_name;
    Button whistory;
    WinnerDBHandler whandler = new WinnerDBHandler(this,"WinnerDB",null,1);
    DBHandler handler = new DBHandler(this,"movesDB2",null,1);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_winner);
        whistory = findViewById(R.id.whistory);

        player_name = findViewById(R.id.player_name);
        Intent intent = getIntent();
        String str = intent.getStringExtra("keyP");
        player_name.setText(str);

        whistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("myT", String.valueOf(whandler.getAllWinners()));
                Intent intent = new Intent(getApplicationContext(),ShowWinnersActivity.class);
                intent.putExtra("wlist", whandler.getAllWinners());
                startActivity(intent);

            }
        });

    }
    protected void onDestroy() {
        super.onDestroy();
        Log.d("my","DEST");
        handler.remove();
    }
}