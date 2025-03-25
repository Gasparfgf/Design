package org.example.solid.ocp;

/**
 * Actuellement, on a une classe DiscountCalculator qui applique des réductions en fonction du type de client.
 * Modifie-la pour qu'on puisse ajouter de nouveaux types de réductions sans modifier le code existant.
 * ✅ Objectif : Applique OCP en utilisant l'héritage ou les interfaces.
 * */
class DiscountCalculator {
    public double calculateDiscount(String customerType, double amount) {
        if (customerType.equals("Regular")) {
            return amount * 0.1;
        } else if (customerType.equals("VIP")) {
            return amount * 0.2;
        }
        return 0;
    }
}
