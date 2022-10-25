package com.example.chess_game;

public class WinnerData {
    private int sno2;
    private String name;

    public WinnerData(int sno2,String name) {
        this.sno2=sno2;
        this.name = name;
    }

    public int getSno2() {
        return sno2;
    }

    public void setSno2(int sno2) {
        this.sno2 = sno2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
