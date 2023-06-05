package com.company;

public class Home {
    String roof;
    int walls;
    int window;
    int doors;
    String foundation;

    public static class Builder{
        private Home newHome;

        public Builder withRoof(String roof){
            newHome.roof = roof;
            return this;
        }

        public Builder withWalls(int walls){
            newHome.walls = walls;
            return this;
        }

        public Builder withWindow(int window){
            newHome.window = window;
            return this;
        }

        public Builder withDoors(int doors){
            newHome.doors = doors;
            return this;
        }

        public Builder withFoundation(String foundation){
            newHome.foundation = foundation;
            return this;
        }

        public Home build(){
            return newHome;
        }
    }
}