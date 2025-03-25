package org.example.solid.dip.solution;

public class Application {
    private final DataBase dataBase;

    public Application(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    public void start() {
        dataBase.connect();
    }
}
