package main.java.com.example.quizapp;

import java.util.ArrayList;
import java.util.List;

public class Controller {

    private List<Room> rooms = new ArrayList<>();

    // Roomを作成する
    public void createRooms(String roomName,int size){
        Room room = new Room(roomName,size);
        rooms.add(room);
    }

    // Roomを表示する
    public void showRooms(){
        System.out.println("部屋一覧を表示します。");

        for(Room str:rooms){
            System.out.println(str);
        }
    }

    // 部屋を予約する
    public void reservation(int num){
        rooms.get(num-1).setReservation();
        System.out.println(rooms.get(num-1));
    }
}
