package com.example.chessboard;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageView a1,a2,a3,a4,a5,a6,a7,a8;
    ImageView b1,b2,b3,b4,b5,b6,b7,b8;
    ImageView c1,c2,c3,c4,c5,c6,c7,c8;
    ImageView d1,d2,d3,d4,d5,d6,d7,d8;
    ImageView e1,e2,e3,e4,e5,e6,e7,e8;
    ImageView f1,f2,f3,f4,f5,f6,f7,f8;
    ImageView g1,g2,g3,g4,g5,g6,g7,g8;
    ImageView h1,h2,h3,h4,h5,h6,h7,h8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        a1= findViewById(R.id.a1);
        a1.setImageResource(R.drawable.brook);

        a2= findViewById(R.id.a2);
        a2.setImageResource(R.drawable.bbishop);

        a3= findViewById(R.id.a3);
        a3.setImageResource(R.drawable.bknight);

        a4= findViewById(R.id.a4);
        a4.setImageResource(R.drawable.bqueen);

        a5= findViewById(R.id.a5);
        a5.setImageResource(R.drawable.bking);

        a6= findViewById(R.id.a6);
        a6.setImageResource(R.drawable.bknight);

        a7= findViewById(R.id.a7);
        a7.setImageResource(R.drawable.bbishop);

        a8= findViewById(R.id.a8);
        a8.setImageResource(R.drawable.brook);

        b1=findViewById(R.id.b1);
        b1.setImageResource(R.drawable.bpawn);
        b2=findViewById(R.id.b2);
        b2.setImageResource(R.drawable.bpawn);
        b3=findViewById(R.id.b3);
        b3.setImageResource(R.drawable.bpawn);
        b4=findViewById(R.id.b4);
        b4.setImageResource(R.drawable.bpawn);
        b5=findViewById(R.id.b5);
        b5.setImageResource(R.drawable.bpawn);
        b6=findViewById(R.id.b6);
        b6.setImageResource(R.drawable.bpawn);
        b7=findViewById(R.id.b7);
        b7.setImageResource(R.drawable.bpawn);
        b8=findViewById(R.id.b8);
        b8.setImageResource(R.drawable.bpawn);


        c1=findViewById(R.id.c1);
        c2=findViewById(R.id.c2);
        c3=findViewById(R.id.c3);
        c4=findViewById(R.id.c4);
        c5=findViewById(R.id.c5);
        c6=findViewById(R.id.c6);
        c7=findViewById(R.id.c7);
        c8=findViewById(R.id.c8);

        d1=findViewById(R.id.d1);
        d2=findViewById(R.id.d2);
        d3=findViewById(R.id.d3);
        d4=findViewById(R.id.d4);
        d5=findViewById(R.id.d5);
        d6=findViewById(R.id.d6);
        d7=findViewById(R.id.d7);
        d8=findViewById(R.id.d8);


        a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (b1.getDrawable() == null){
                    b1= findViewById(R.id.b1);
//                    ImageView v =findViewById(R.id.a1);
//                    String bk1= String.valueOf(v.getId());
//                    Toast.makeText(MainActivity.this, " "+bk1+"", Toast.LENGTH_SHORT).show();
//                    if(bk1=="brook")
//                    {

                        b1.setImageResource(R.drawable.brook);

                        a1.setImageResource(0);
//                    }

                }else{
                    Drawable myDrawable = a1.getDrawable();
                    String s= myDrawable.toString();
                    Toast.makeText(MainActivity.this, "Cannot move"+s+"", Toast.LENGTH_SHORT).show();

                }

            }
        });

        a2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b2.getDrawable() == null){
                    b2= findViewById(R.id.b2);
//                    ImageView v =findViewById(R.id.a1);
//                    String bk1= String.valueOf(v.getId());
//                    Toast.makeText(MainActivity.this, " "+bk1+"", Toast.LENGTH_SHORT).show();
//                    if(bk1=="brook")
//                    {
                         b2.setImageResource(R.drawable.bbishop);
                         a2.setImageDrawable(null);
//                    }

                }else{
                    Drawable myDrawable = a2.getDrawable();
                    String s= myDrawable.toString();
                    Toast.makeText(MainActivity.this, "Cannot move"+s+"", Toast.LENGTH_SHORT).show();

                }

            }
        });

        a3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b3.getDrawable() == null){
                    b3= findViewById(R.id.b3);
//                    ImageView v =findViewById(R.id.a1);
//                    String bk1= String.valueOf(v.getId());
//                    Toast.makeText(MainActivity.this, " "+bk1+"", Toast.LENGTH_SHORT).show();
//                    if(bk1=="brook")
//                    {
                    b3.setImageResource(R.drawable.bknight);
                    a3.setImageDrawable(null);
//                    }

                }else{
                    Toast.makeText(MainActivity.this, "Cannot move", Toast.LENGTH_SHORT).show();

                }

            }
        });

        a4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b4.getDrawable() == null){
                    b4= findViewById(R.id.b4);
//                    ImageView v =findViewById(R.id.a1);
//                    String bk1= String.valueOf(v.getId());
//                    Toast.makeText(MainActivity.this, " "+bk1+"", Toast.LENGTH_SHORT).show();
//                    if(bk1=="brook")
//                    {
                    b4.setImageResource(R.drawable.bqueen) ;
                    a4.setImageDrawable(null);
//                    }

                }else{
                    Toast.makeText(MainActivity.this, "Cannot move", Toast.LENGTH_SHORT).show();

                }

            }
        });

        a5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b5.getDrawable() == null){
                    b5= findViewById(R.id.b5);
                    ImageView v =findViewById(R.id.a5);
                    Toast.makeText(MainActivity.this, ""+v.getResources()+"", Toast.LENGTH_LONG).show();
                    ;
//                    String bk1= String.valueOf(v.getId());
//                    Toast.makeText(MainActivity.this, " "+bk1+"", Toast.LENGTH_SHORT).show();
//                    if(bk1=="brook")
//                    {
                    b5.setImageResource(R.drawable.bking);
                    a5.setImageDrawable(null);
//                    }

                }else{
                    Toast.makeText(MainActivity.this, "Cannot move", Toast.LENGTH_SHORT).show();

                }

            }
        });

        a6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b6.getDrawable() == null){
                    b6= findViewById(R.id.b6);
//                    ImageView v =findViewById(R.id.a1);
//                    String bk1= String.valueOf(v.getId());
//                    Toast.makeText(MainActivity.this, " "+bk1+"", Toast.LENGTH_SHORT).show();
//                    if(bk1=="brook")
//                    {

                    b6.setImageResource(R.drawable.bknight);
                    a6.setImageDrawable(null);
//                    }

                }else{
                    Toast.makeText(MainActivity.this, "Cannot move", Toast.LENGTH_SHORT).show();

                }

            }
        });

        a7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b7.getDrawable() == null){
                    b7= findViewById(R.id.b7);
//                    ImageView v =findViewById(R.id.a1);
//                    String bk1= String.valueOf(v.getId());
//                    Toast.makeText(MainActivity.this, " "+bk1+"", Toast.LENGTH_SHORT).show();
//                    if(bk1=="brook")
//                    {
                    b7.setImageResource(R.drawable.bbishop);
                    a7.setImageDrawable(null);
//                    }

                }else{
                    Toast.makeText(MainActivity.this, "Cannot move", Toast.LENGTH_SHORT).show();

                }

            }
        });

        a8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b8.getDrawable() == null){
                    b8= findViewById(R.id.b8);
//                    ImageView v =findViewById(R.id.a1);
//                    String bk1= String.valueOf(v.getId());
//                    Toast.makeText(MainActivity.this, " "+bk1+"", Toast.LENGTH_SHORT).show();
//                    if(bk1=="brook")
//                    {
                    b8.setImageResource(R.drawable.brook);
                    a8.setImageDrawable(null);
//                    }

                }else{
                    Toast.makeText(MainActivity.this, "Cannot move", Toast.LENGTH_SHORT).show();

                }

            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (c1.getDrawable() == null){
                    c1= findViewById(R.id.c1);
                    c1.setImageResource(R.drawable.bpawn);
                    b1.setImageDrawable(null);
                }else{
                    Drawable myDrawable = b1.getDrawable();
                    String s= myDrawable.toString();
                    Toast.makeText(MainActivity.this, "Cannot move"+s+"", Toast.LENGTH_SHORT).show();

                }

            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (c2.getDrawable() == null){
                    c2= findViewById(R.id.c2);
                    c2.setImageResource(R.drawable.bpawn);
                    b2.setImageDrawable(null);
                }else{
                    Toast.makeText(MainActivity.this, "Cannot move", Toast.LENGTH_SHORT).show();

                }

            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (c3.getDrawable() == null){
                    c3= findViewById(R.id.c3);
                    c3.setImageResource(R.drawable.bpawn);
                    b3.setImageDrawable(null);
                }else{
                    Toast.makeText(MainActivity.this, "Cannot move", Toast.LENGTH_SHORT).show();

                }

            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (c4.getDrawable() == null){
                    c4= findViewById(R.id.c4);
                    c4.setImageResource(R.drawable.bpawn);
                    b4.setImageDrawable(null);
                }else{
                    Toast.makeText(MainActivity.this, "Cannot move", Toast.LENGTH_SHORT).show();

                }

            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (c5.getDrawable() == null){
                    c5= findViewById(R.id.c5);
                    c5.setImageResource(R.drawable.bpawn);
                    b5.setImageDrawable(null);
                }else{
                    Toast.makeText(MainActivity.this, "Cannot move", Toast.LENGTH_SHORT).show();

                }

            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (c6.getDrawable() == null){
                    c6= findViewById(R.id.c6);
                    c6.setImageResource(R.drawable.bpawn);
                    b6.setImageDrawable(null);
                }else{
                    Toast.makeText(MainActivity.this, "Cannot move", Toast.LENGTH_SHORT).show();

                }

            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (c7.getDrawable() == null){
                    c7= findViewById(R.id.c7);
                    c7.setImageResource(R.drawable.bpawn);
                    b7.setImageDrawable(null);
                }else{
                    Toast.makeText(MainActivity.this, "Cannot move", Toast.LENGTH_SHORT).show();

                }

            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (c8.getDrawable() == null){
                    c8= findViewById(R.id.c8);
                    c8.setImageResource(R.drawable.bpawn);
                    b8.setImageDrawable(null);
                }else{
                    Toast.makeText(MainActivity.this, "Cannot move", Toast.LENGTH_SHORT).show();

                }

            }
        });



        c5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(c5.getDrawable()==null){
                    Toast.makeText(MainActivity.this, "Empty", Toast.LENGTH_SHORT).show();

                }

                else if (d5.getDrawable() == null){
                    d5= findViewById(R.id.d5);
                    ImageView v =findViewById(R.id.a5);
                    Toast.makeText(MainActivity.this, ""+v.getResources()+"", Toast.LENGTH_LONG).show();

                    d5.setImageResource(R.drawable.bpawn);
                    c5.setImageDrawable(null);
                }else{
                    Toast.makeText(MainActivity.this, "Cannot move", Toast.LENGTH_SHORT).show();

                }

            }
        });



    }
}