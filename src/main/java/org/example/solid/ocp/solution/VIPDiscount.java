package org.example.solid.ocp.solution;

public class VIPDiscount implements Discount {
    @Override
    public double calculate(double amount) {
        return amount * 0.2;
    }
}
