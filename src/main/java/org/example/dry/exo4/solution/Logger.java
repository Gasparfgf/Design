package org.example.dry.exo4.solution;

public class Logger {
    private static void  showMessage(String msg) { System.out.println(msg); }

    public static void main(String[] args) {
        showMessage("[INFO] Application démarrée");
        showMessage("[WARNING] Mémoire faible");
        showMessage("[ERROR] Connexion à la base de données échouée");
    }
}
