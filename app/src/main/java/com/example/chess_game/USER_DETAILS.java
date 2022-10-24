package com.example.chess_game;

public class USER_DETAILS {
    int id;
    String player_1;
    String player_2;
    String time;
    public USER_DETAILS(){

    }
    public USER_DETAILS(int i,String p1,String p2,String t){
        id = i;
        player_1 = p1;
        player_2 = p2;
        time = t;
    }
    public USER_DETAILS(String p1,String p2,String t){
        player_2 = p2;
        player_1 = p1;
        time = t;
    }
    public String getTime(){
        return time ;
    }
    public String getPlayer_1(){
        return player_1;
    }
    public String getPlayer_2(){
        return player_2;
    }
    public void setId(int i){
        id = i;
    }
    public void setPlayer_1(String p1){
        player_1 = p1;
    }
    public void setPlayer_2(String p2){
        player_2 = p2;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
