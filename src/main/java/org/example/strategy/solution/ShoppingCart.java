package org.example.strategy.solution;

import org.example.strategy.solution.CreditCardPayment;
import org.example.strategy.solution.Strategy;

public class ShoppingCart {
    private Strategy strategy;

    public ShoppingCart() {
        this.strategy =  new CreditCardPayment("");
    }

    public void setPaymentStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void checkout(double v) {
        strategy.pay(v);
    }
}
