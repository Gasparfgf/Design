package org.example.dry.exo3;

/*
* Problème : Le code ci-dessous duplique la logique de calcul de réduction pour deux types de clients.
*  Réécrivez-le en respectant DRY.
*
* 🔹 Objectif : Éviter la duplication en généralisant le calcul du rabais.
* */
public class DiscountCalculator {
    public double calculateRegularDiscount(double price) {
        return price * 0.1; // 10% de réduction
    }

    public double calculateVIPDiscount(double price) {
        return price * 0.2; // 20% de réduction
    }
}
