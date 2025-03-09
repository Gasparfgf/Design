package org.example.SOLID.ocp.solution;

public class RegularDiscount implements Discount {
    private double amount;

    public RegularDiscount(double amount) {
        this.amount = amount;
    }

    @Override
    public double calculate() {
        return amount * 0.1;
    }
}
