package org.example.solid.dip;

/**
 * Le code ci-dessous dépend directement d’une base de données MySQL.
 * Modifie-le pour qu'il respecte le DIP en utilisant une interface.
 *
 * ✅ Objectif : Injecte une dépendance au lieu de dépendre directement de MySQLDatabase.
 * */
class Application {
    private MySQLDatabase database;

    public Application() {
        this.database = new MySQLDatabase();
    }

    public void start() {
        database.connect();
    }
}

class MySQLDatabase {
    public void connect() {
        System.out.println("Connexion à MySQL...");
    }
}
