package org.example.dry.exo4;

/*
* Problème : L’application affiche des logs de différentes manières, ce qui répète le code inutilement.
*  Modifiez le code pour respecter DRY.
*
* 🔹 Objectif : Créer une méthode dédiée pour éviter la duplication des System.out.println().
* */
public class Logger {
    public static void main(String[] args) {
        System.out.println("[INFO] Application démarrée");
        System.out.println("[WARNING] Mémoire faible");
        System.out.println("[ERROR] Connexion à la base de données échouée");
    }
}
