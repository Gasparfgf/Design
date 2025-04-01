package org.example.strategy.solution.solution;

import org.example.strategy.solution.Strategy;

public class CreditCardPayment implements Strategy {
    private final String creditCardNumber;

    public CreditCardPayment(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Using credit card number " + creditCardNumber + " to pay " +amount);
    }
}
