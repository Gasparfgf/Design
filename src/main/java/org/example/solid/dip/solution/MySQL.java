package org.example.solid.dip.solution;

public class MySQL implements DataBase {
    @Override
    public void connect() {
        System.out.println("Connexion à MySQL...");
    }
}
