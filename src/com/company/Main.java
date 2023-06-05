package com.company;

public class Main {

    public static void main(String[] args) {
        Home home = new Home.Builder()
                .withRoof("Черепица")
                .withWalls(6)
                .withWindow(4)
                .withDoors(2)
                .withFoundation("Бетон")
                .build();
    }
}
