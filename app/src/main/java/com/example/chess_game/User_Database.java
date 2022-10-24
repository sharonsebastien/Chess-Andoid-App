package com.example.chess_game;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class User_Database extends SQLiteOpenHelper {
    public static final int DB_VERSION = 1;
    public static final String DB_NAME = "USER_INFO";
    public static final String TABLE_NAME = "USER_DETAILS";
    public static final String id = "user_id";
    public static final String PLAYER_1 = "PLAYER1_NAME";
    public static final String PLAYER_2 = "PLAYER2_NAME";
    public static final String TIME = "TIME";
    public User_Database(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String create = " CREATE TABLE "+TABLE_NAME + "( "+id + "INTEGER PRIMARY KEY , "+PLAYER_1+"TEXT ,"+PLAYER_2+"TEXT ,"+TIME+"TEXT"+")";
        sqLiteDatabase.execSQL(create);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME);
        onCreate(sqLiteDatabase);

    }
    public void add_details(USER_DETAILS US){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cn = new ContentValues();
        cn.put(PLAYER_1,US.getPlayer_1());
        cn.put(PLAYER_2,US.getPlayer_2());
        cn.put(TIME,US.getTime());
        db.insert(TABLE_NAME,null,cn);
        db.close();
    }
}
