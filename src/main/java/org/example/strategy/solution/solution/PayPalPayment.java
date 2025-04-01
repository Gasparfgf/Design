package org.example.strategy.solution.solution;

import org.example.strategy.solution.Strategy;

public class PayPalPayment implements Strategy {
    private final String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Using paypal account in the name of " +email+ " to pay " +amount);
    }
}
