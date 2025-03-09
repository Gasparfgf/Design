package org.example.SOLID.ocp.solution;

public class VIPDiscount implements Discount {
    private double amount;

    public VIPDiscount(double amount) {
        this.amount = amount;
    }

    @Override
    public double calculate() {
        return amount * 0.2;
    }
}
