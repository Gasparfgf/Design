package org.example.solid.dip.solution;

public class Main {
    public static void main(String[] args) {
        PostgreSQL postgreSQL = new PostgreSQL();
        Application application = new Application(postgreSQL);
        application.start();
    }
}
