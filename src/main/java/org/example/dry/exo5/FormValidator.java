package org.example.dry.exo5;

/*
* Problème : Le code suivant vérifie si les champs d'un formulaire sont remplis correctement,
*  mais il duplique la logique de validation. Réécrivez-le en appliquant DRY.
*
* 🔹 Objectif : Regrouper la logique répétée dans une seule méthode réutilisable.
* */
public class FormValidator {
    public static boolean isValidName(String name) {
        return name != null && !name.isEmpty();
    }

    public static boolean isValidEmail(String email) {
        return email != null && !email.isEmpty();
    }

    public static boolean isValidPassword(String password) {
        return password != null && !password.isEmpty();
    }
}
