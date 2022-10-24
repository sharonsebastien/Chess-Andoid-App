package com.example.chess_game;

public class Movements {
    private int sno;
    private String moves;

    public Movements(int sno,String moves) {
        this.sno=sno;
        this.moves = moves;
    }

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public String getMoves() {
        return moves;
    }

    public void setMoves(String moves) {
        this.moves = moves;
    }


}
