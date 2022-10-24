package com.example.chess_game;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import androidx.annotation.Nullable;

public class DBHandler extends SQLiteOpenHelper {
    public DBHandler(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        String create ="CREATE TABLE mymovements (sno INTEGER PRIMARY KEY,moves TEXT)";
        sqLiteDatabase.execSQL(create);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        String drop =String.valueOf("DROP TABLE IF EXISTS");
        sqLiteDatabase.execSQL(drop,new String[]{"mymovements"});
        onCreate(sqLiteDatabase);
    }

    public void addMovements(Movements m){
        SQLiteDatabase db =this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("moves",m.getMoves());
        long k = db.insert("mymovements",null,values);
        Log.d("myTag",Long.toString(k));
        db.close();
    }
    String s = "";
    public String getMovements(int sno){
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.query("mymovements",new String[]{"sno","moves"},"sno=?",new String[]{String.valueOf(sno)},
                null,null,null);

        if(cursor != null && cursor.moveToFirst()){

            s =cursor.getString(1);
            Log.d("myTag moves",cursor.getString(1));
        }else {
            Log.d("myTag","ERROR");
        }
        return s;
    }

    public void remove(){
        SQLiteDatabase db =this.getWritableDatabase();
        db.execSQL("DELETE FROM mymovements");
    }

}
