/*
* Implémenter le Pattern Strategy
👉 Contexte : Vous devez implémenter un système de paiement où
*           l’utilisateur peut choisir entre carte bancaire, PayPal et crypto-monnaie.
* */

package org.example.strategy;

public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.setPaymentStrategy(new CreditCardPayment("1234-5678-9012-3456"));
        cart.checkout(100.0);

        cart.setPaymentStrategy(new PayPalPayment("user@example.com"));
        cart.checkout(50.0);
    }
}
