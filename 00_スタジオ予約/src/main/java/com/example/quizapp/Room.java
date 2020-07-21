package main.java.com.example.quizapp;

import java.util.List;

public class Room {

    private String roomName;               //名前
    private int size;                      //部屋のサイズ
    private boolean reservation = false;   //予約状況
    private List<String> equipments;       //予約された機材

    //コンストラクタ
    public Room(String roomName, int size){
        this.roomName = roomName;
        this.size = size;
    }

    // toStringメソッド
    public String toString(){
        return this.roomName + "：" + this.size + "：" + this.reservation;
    }

    // 部屋を予約する
    public void setReservation(){
        this.reservation = true;
    }
}
