package org.example.SOLID.dip.solution;

public class Application {
    private DataBase dataBase;

    public Application(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    public void start() {
        dataBase.connect();
    }
}
