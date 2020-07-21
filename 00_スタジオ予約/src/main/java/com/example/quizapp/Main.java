package main.java.com.example.quizapp;

public class Main {
    public static void main(String[] args) {

        Controller con1 = new Controller();

        con1.createRooms("A",10);
        con1.createRooms("B",12);

        con1.showRooms();

        con1.reservation(1);
    }
}
