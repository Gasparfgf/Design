package org.example.dry.exo2;

import java.util.List;

/*
* Problème : le code suivant affiche une liste d'utilisateurs en répétant du code inutilement.
*  Simplifiez-le en appliquant le principe DRY.
*
* 🔹 Objectif : Remplacer la répétition des instructions par une structure plus concise.
* */
public class UserManager {
    public static void main(String[] args) {
        List<String> users = List.of("Alice", "Bob", "Charlie");

        System.out.println("Utilisateur : " + users.get(0));
        System.out.println("Utilisateur : " + users.get(1));
        System.out.println("Utilisateur : " + users.get(2));
    }
}
