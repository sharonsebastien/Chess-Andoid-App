package com.example.chess_game;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import androidx.annotation.Nullable;

public class WinnerDBHandler extends SQLiteOpenHelper {
    public WinnerDBHandler(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        String create ="CREATE TABLE myWinners (sno2 INTEGER PRIMARY KEY,name TEXT)";
        sqLiteDatabase.execSQL(create);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        String drop =String.valueOf("DROP TABLE IF EXISTS");
        sqLiteDatabase.execSQL(drop,new String[]{"myWinners"});
        onCreate(sqLiteDatabase);
    }

    public void addWinners(WinnerData w){
        SQLiteDatabase db =this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("name",w.getName());
        long k = db.insert("myWinners",null,values);
        db.close();
    }
    String s = "";
    public String getWinners(int sno2){
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.query("myWinners",new String[]{"sno2","name"},"sno2=?",new String[]{String.valueOf(sno2)},
                null,null,null);

        if(cursor != null && cursor.moveToFirst()){

            s =cursor.getString(1);
            Log.d("myTag moves",cursor.getString(1));
        }else {
            Log.d("myTag","ERROR");
        }
        return s;
    }

    public String getAllWinners(){
        SQLiteDatabase db = this.getReadableDatabase();
        String selectQuery = "SELECT * FROM myWinners  ORDER BY sno2 DESC";

        Cursor cursor = db.rawQuery(selectQuery, null);

        String str = "";
        if(cursor.moveToFirst()) {
            do {
                str += cursor.getString(1) + "\n";
                Log.d("myTag moves",cursor.getString(1));
            } while(cursor.moveToNext());
        }
        return str;
    }


}
