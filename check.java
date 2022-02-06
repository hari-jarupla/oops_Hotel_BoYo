package main;

public class check {
    public static void main(String[] args) {
        String roomID = String.valueOf(System.currentTimeMillis()%1000);
        System.out.println(roomID);
    }
}
