package com.example.chessboard;

import androidx.annotation.LongDef;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
    ImageView boardMatrix[][] = new ImageView[8][8];
    String chessMatrix[][] = {
            {"BE","BH","BC","BK","BQ","BC","BH","BE"},
            {"BP","BP","BP","BP","BP","BP","BP","BP"},
            {"EE","EE","EE","EE","EE","EE","EE","EE"},
            {"EE","EE","EE","EE","EE","EE","EE","EE"},
            {"EE","EE","EE","EE","EE","EE","EE","EE"},
            {"EE","EE","EE","EE","EE","EE","EE","EE"},
            {"WP","WP","WP","WP","WP","WP","WP","WP"},
            {"WE","WH","WC","WQ","WK","WC","WH","WE"},
    };
    static HashMap<String, Integer> hashMap = new HashMap<String, Integer>();

    boolean whiteTurn = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hashMap.put("EE", R.drawable.empty);
        hashMap.put("BE", R.drawable.b_rook);
        hashMap.put("BH", R.drawable.b_knight);
        hashMap.put("BC", R.drawable.b_bishop);
        hashMap.put("BK", R.drawable.b_king);
        hashMap.put("BQ", R.drawable.b_queen);
        hashMap.put("BP", R.drawable.b_pawn);

        hashMap.put("WE", R.drawable.w_rook);
        hashMap.put("WH", R.drawable.w_knight);
        hashMap.put("WC", R.drawable.w_bishop);
        hashMap.put("WK", R.drawable.w_king);
        hashMap.put("WQ", R.drawable.w_queen);
        hashMap.put("WP", R.drawable.w_pawn);

        boardMatrix[0][0] = (ImageView) findViewById(R.id.a1);
        boardMatrix[0][1]=  (ImageView) findViewById(R.id.a2);
        boardMatrix[0][2]=  (ImageView) findViewById(R.id.a3);
        boardMatrix[0][3]=  (ImageView) findViewById(R.id.a4);
        boardMatrix[0][4]=  (ImageView) findViewById(R.id.a5);
        boardMatrix[0][5]=  (ImageView) findViewById(R.id.a6);
        boardMatrix[0][6]=  (ImageView) findViewById(R.id.a7);
        boardMatrix[0][7]=  (ImageView) findViewById(R.id.a8);

        boardMatrix[1][0] = (ImageView) findViewById(R.id.b1);
        boardMatrix[1][1]=  (ImageView) findViewById(R.id.b2);
        boardMatrix[1][2]=  (ImageView) findViewById(R.id.b3);
        boardMatrix[1][3]=  (ImageView) findViewById(R.id.b4);
        boardMatrix[1][4]=  (ImageView) findViewById(R.id.b5);
        boardMatrix[1][5]=  (ImageView) findViewById(R.id.b6);
        boardMatrix[1][6]=  (ImageView) findViewById(R.id.b7);
        boardMatrix[1][7]=  (ImageView) findViewById(R.id.b8);

        boardMatrix[2][0] = (ImageView) findViewById(R.id.c1);
        boardMatrix[2][1]=  (ImageView) findViewById(R.id.c2);
        boardMatrix[2][2]=  (ImageView) findViewById(R.id.c3);
        boardMatrix[2][3]=  (ImageView) findViewById(R.id.c4);
        boardMatrix[2][4]=  (ImageView) findViewById(R.id.c5);
        boardMatrix[2][5]=  (ImageView) findViewById(R.id.c6);
        boardMatrix[2][6]=  (ImageView) findViewById(R.id.c7);
        boardMatrix[2][7]=  (ImageView) findViewById(R.id.c8);


        boardMatrix[3][0] = (ImageView) findViewById(R.id.d1);
        boardMatrix[3][1]=  (ImageView) findViewById(R.id.d2);
        boardMatrix[3][2]=  (ImageView) findViewById(R.id.d3);
        boardMatrix[3][3]=  (ImageView) findViewById(R.id.d4);
        boardMatrix[3][4]=  (ImageView) findViewById(R.id.d5);
        boardMatrix[3][5]=  (ImageView) findViewById(R.id.d6);
        boardMatrix[3][6]=  (ImageView) findViewById(R.id.d7);
        boardMatrix[3][7]=  (ImageView) findViewById(R.id.d8);

        boardMatrix[4][0] = (ImageView) findViewById(R.id.e1);
        boardMatrix[4][1]=  (ImageView) findViewById(R.id.e2);
        boardMatrix[4][2]=  (ImageView) findViewById(R.id.e3);
        boardMatrix[4][3]=  (ImageView) findViewById(R.id.e4);
        boardMatrix[4][4]=  (ImageView) findViewById(R.id.e5);
        boardMatrix[4][5]=  (ImageView) findViewById(R.id.e6);
        boardMatrix[4][6]=  (ImageView) findViewById(R.id.e7);
        boardMatrix[4][7]=  (ImageView) findViewById(R.id.e8);


        boardMatrix[5][0] = (ImageView) findViewById(R.id.f1);
        boardMatrix[5][1]=  (ImageView) findViewById(R.id.f2);
        boardMatrix[5][2]=  (ImageView) findViewById(R.id.f3);
        boardMatrix[5][3]=  (ImageView) findViewById(R.id.f4);
        boardMatrix[5][4]=  (ImageView) findViewById(R.id.f5);
        boardMatrix[5][5]=  (ImageView) findViewById(R.id.f6);
        boardMatrix[5][6]=  (ImageView) findViewById(R.id.f7);
        boardMatrix[5][7]=  (ImageView) findViewById(R.id.f8);

        boardMatrix[6][0] = (ImageView) findViewById(R.id.g1);
        boardMatrix[6][1]=  (ImageView) findViewById(R.id.g2);
        boardMatrix[6][2]=  (ImageView) findViewById(R.id.g3);
        boardMatrix[6][3]=  (ImageView) findViewById(R.id.g4);
        boardMatrix[6][4]=  (ImageView) findViewById(R.id.g5);
        boardMatrix[6][5]=  (ImageView) findViewById(R.id.g6);
        boardMatrix[6][6]=  (ImageView) findViewById(R.id.g7);
        boardMatrix[6][7]=  (ImageView) findViewById(R.id.g8);

        boardMatrix[7][0] = (ImageView) findViewById(R.id.h1);
        boardMatrix[7][1]=  (ImageView) findViewById(R.id.h2);
        boardMatrix[7][2]=  (ImageView) findViewById(R.id.h3);
        boardMatrix[7][3]=  (ImageView) findViewById(R.id.h4);
        boardMatrix[7][4]=  (ImageView) findViewById(R.id.h5);
        boardMatrix[7][5]=  (ImageView) findViewById(R.id.h6);
        boardMatrix[7][6]=  (ImageView) findViewById(R.id.h7);
        boardMatrix[7][7]=  (ImageView) findViewById(R.id.h8);


        for(int i=0;i<boardMatrix.length;i++) {
            for(int j=0;j<boardMatrix[i].length;j++) {
                int finalI = i;
                int finalJ = j;
                boardMatrix[i][j].setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String clickType = String.valueOf(chessMatrix[finalI][finalJ].toCharArray()[0]);
                        Log.d("TAGTAG", "onClick: " + finalI + finalJ);
                        if(clickType.equals("B")) {
                            if(whiteTurn) {
                                Toast.makeText(MainActivity.this, "White's Turn", Toast.LENGTH_SHORT).show();
                                return;
                            }
                            if((finalI + 1) == 7) {
                                Toast.makeText(MainActivity.this, "Black Win's", Toast.LENGTH_SHORT).show();
                            }
                            if(chessMatrix[finalI + 1][finalJ].equals("EE")) {
                                chessMatrix[finalI + 1][finalJ] = chessMatrix[finalI][finalJ];
                                chessMatrix[finalI][finalJ] = "EE";
                            } else {
                                String itemType = String.valueOf(chessMatrix[finalI + 1][finalJ].toCharArray()[0]);
                                if(itemType.equals("W")) {
                                    chessMatrix[finalI + 1][finalJ] = chessMatrix[finalI][finalJ];
                                    chessMatrix[finalI][finalJ] = "EE";
                                }
                            }
                        } else {
                            if(!whiteTurn) {
                                Toast.makeText(MainActivity.this, "Black's Turn", Toast.LENGTH_SHORT).show();
                                return;
                            }
                            if((finalI - 1) == 0) {
                                Toast.makeText(MainActivity.this, "White Win's", Toast.LENGTH_SHORT).show();
                            }
                            if(chessMatrix[finalI - 1][finalJ].equals("EE")) {
                                chessMatrix[finalI - 1][finalJ] = chessMatrix[finalI][finalJ];
                                chessMatrix[finalI][finalJ] = "EE";
                            } else {
                                String itemType = String.valueOf(chessMatrix[finalI - 1][finalJ].toCharArray()[0]);
                                if(itemType.equals("B")) {
                                    chessMatrix[finalI - 1][finalJ] = chessMatrix[finalI][finalJ];
                                    chessMatrix[finalI][finalJ] = "EE";
                                }
                            }
                        }
                        whiteTurn = !whiteTurn;
                        render();
                    }
                });
            }
        }

        render();
    }
    public void render() {
        for(int i=0;i<chessMatrix.length;i++) {
            for(int j=0;j<chessMatrix[i].length;j++) {
                boardMatrix[i][j].setImageResource(hashMap.get(chessMatrix[i][j]));
            }
        }
    }
}