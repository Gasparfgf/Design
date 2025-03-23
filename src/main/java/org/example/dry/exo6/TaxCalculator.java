package org.example.dry.exo6;
/*
* Optimisez
*
* 🔹 Objectif : Réduire la duplication en trouvant une approche plus générique.
* */
public class TaxCalculator {
    public double calculateFoodTax(double price) {
        return price * 1.05; // 5% de TVA
    }

    public double calculateElectronicsTax(double price) {
        return price * 1.20; // 20% de TVA
    }

    public double calculateClothingTax(double price) {
        return price * 1.10; // 10% de TVA
    }
}
