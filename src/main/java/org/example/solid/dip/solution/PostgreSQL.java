package org.example.SOLID.dip.solution;

public class PostgreSQL implements DataBase {
    @Override
    public void connect() {
        System.out.println("Connexion à PostgreSQL...");
    }
}
