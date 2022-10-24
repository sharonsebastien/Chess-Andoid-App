package com.example.chess_game;

import static com.example.chess_game.R.drawable.background_2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.opengl.Visibility;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.HashMap;

public class Chessboard extends AppCompatActivity {
    LinearLayout cancel, restart, add_time, history;
    ImageButton img,Quit,back_home,player_image1,player_image2;

    Button button;
    int count=0;
    DBHandler handler = new DBHandler(this,"movesDB2",null,1);

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
    String idMatrix[][] = {
            {"A1","A2","A3","A4","A5","A6","A7","A8"},
            {"B1","B2","B3","B4","B5","B6","B7","B8"},
            {"C1","C2","C3","C4","C5","C6","C7","C8"},
            {"D1","D2","D3","D4","D5","D6","D7","D8"},
            {"E1","E2","E3","E4","E5","E6","E7","E8"},
            {"F1","F2","F3","F4","F5","F6","F7","F8"},
            {"G1","G2","G3","G4","G5","G6","G7","G8"},
            {"H1","H2","H3","H4","H5","H6","H7","H8"},
    };
    static HashMap<String, Integer> hashMap = new HashMap<String, Integer>();

    boolean whiteTurn = true;
    TextView name1,name2;
    TextView time1,time2;
    int counter = 0;
    boolean result ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chessboard);




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

                                Toast.makeText(Chessboard.this, "White's Turn ", Toast.LENGTH_SHORT).show();
                                return;
                            }

                            if(chessMatrix[finalI + 1][finalJ].equals("EE")) {
                                chessMatrix[finalI + 1][finalJ] = chessMatrix[finalI][finalJ];
                                chessMatrix[finalI][finalJ] = "EE";

                                String b = idMatrix[finalI][finalJ]+" TO "+idMatrix[finalI + 1][finalJ]+", ";
                                Toast.makeText(Chessboard.this, ""+b, Toast.LENGTH_SHORT).show();
                                handler.addMovements(new Movements(1,b));
                                count++;
                            } else {
                                String itemType = String.valueOf(chessMatrix[finalI + 1][finalJ].toCharArray()[0]);
                                if(itemType.equals("W")) {
                                    chessMatrix[finalI + 1][finalJ] = chessMatrix[finalI][finalJ];
                                    chessMatrix[finalI][finalJ] = "EE";

                                    String b = idMatrix[finalI][finalJ]+" TO "+idMatrix[finalI + 1][finalJ]+", ";
                                    Toast.makeText(Chessboard.this, ""+b, Toast.LENGTH_SHORT).show();
                                    handler.addMovements(new Movements(1,b));
                                    count++;
                                }
                            }
                            if((finalI + 1) == 7) {
                                Toast.makeText(Chessboard.this, "Black Win's", Toast.LENGTH_SHORT).show();

                            }
                            whiteTurn = !whiteTurn;
                        } else if(clickType.equals("W")){
                            if(!whiteTurn) {
                                Toast.makeText(Chessboard.this, "Black's Turn", Toast.LENGTH_SHORT).show();
                                return;
                            }

                            if(chessMatrix[finalI - 1][finalJ].equals("EE")) {
                                chessMatrix[finalI - 1][finalJ] = chessMatrix[finalI][finalJ];
                                chessMatrix[finalI][finalJ] = "EE";

                                String b = idMatrix[finalI][finalJ]+" TO "+idMatrix[finalI - 1][finalJ]+", ";
                                Toast.makeText(Chessboard.this, ""+b, Toast.LENGTH_SHORT).show();
                                handler.addMovements(new Movements(1,b));
                                count++;
                            } else {
                                String itemType = String.valueOf(chessMatrix[finalI - 1][finalJ].toCharArray()[0]);
                                if(itemType.equals("B")) {
                                    chessMatrix[finalI - 1][finalJ] = chessMatrix[finalI][finalJ];
                                    chessMatrix[finalI][finalJ] = "EE";

                                    String b = idMatrix[finalI][finalJ]+" TO "+idMatrix[finalI - 1][finalJ]+", ";
                                    Toast.makeText(Chessboard.this, ""+b, Toast.LENGTH_SHORT).show();
                                    //handler.addMovements(new Movements(1,b));
                                    count++;
                                }
                                if((finalI - 1) == 0) {
                                    Toast.makeText(Chessboard.this, "White Win's", Toast.LENGTH_SHORT).show();
                                }
                            }
                            whiteTurn = !whiteTurn;
                        }
                        else if(clickType.equals("E")){
                            Toast.makeText(Chessboard.this, "Empty Cell", Toast.LENGTH_SHORT).show();
                        }

                        render();
                    }
                });
            }
        }

        render();


        handler.close();





        img = findViewById(R.id.menu_item);
        name1 = findViewById(R.id.display_name1);
        name2 = findViewById(R.id.display_name2);
        time1 = findViewById(R.id.display_time1);
        time2 = findViewById(R.id.display_time2);
        Quit = findViewById(R.id.quit);
        back_home = findViewById(R.id.back_home);

        player_image1 = findViewById(R.id.player_image1);
        player_image2 = findViewById(R.id.player_image2);

        SharedPreferences sh = getSharedPreferences("myuserdetails", MODE_PRIVATE);
        String n1 = sh.getString("name1", "");
        String n2 = sh.getString("name2", "");
        String t1 = sh.getString("time", "");
        String t2 = sh.getString("time", "");
        name1.setText(n1.toUpperCase());
        name2.setText(n2.toUpperCase());





        back_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Chessboard.this,ENTER_DETAIL.class);
                startActivity(intent);
            }
        });


        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showdailog();
            }
        });
        Quit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.exit(0);
            }
        });

        new CountDownTimer(50000, 1000) {

            @Override
            public void onTick(long l) {
                time1.setText(String.valueOf(counter));
                time2.setText(String.valueOf(counter));
                counter++;
            }

            @Override
            public void onFinish() {
                time2.setText("finished");
                time1.setText("finished");
            }
        }.start();


    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("my","DEST");
        handler.remove();
    }

    public void render() {
        for(int i=0;i<chessMatrix.length;i++) {
            for(int j=0;j<chessMatrix[i].length;j++) {
                boardMatrix[i][j].setImageResource(hashMap.get(chessMatrix[i][j]));
            }
        }
    }


    private void showdailog() {
        final Dialog dialog = new Dialog(this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.dialog_items);
        restart = dialog.findViewById(R.id.re);
        cancel = dialog.findViewById(R.id.cn);
        add_time = dialog.findViewById(R.id.at);
        history =dialog.findViewById(R.id.ht);


        restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Chessboard.this, "this is restart", Toast.LENGTH_SHORT).show();
            }
        });
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.cancel();
            }
        });
        add_time.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Chessboard.this, "this is add time", Toast.LENGTH_SHORT).show();
            }
        });
        history.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder s= new StringBuilder("");
                for(int i=1;i<=count;i++){
                    s.append(handler.getMovements(i));
                }
                Log.d("myT", String.valueOf(s));
                Intent intent = new Intent(getApplicationContext(),ShowMovesActivity.class);
                intent.putExtra("key1", (CharSequence) s);
                startActivity(intent);

            }
        });
        dialog.show();
        dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.getWindow().getAttributes().windowAnimations = R.style.dailog_animation;
        dialog.getWindow().setGravity(Gravity.BOTTOM);
    }



}



