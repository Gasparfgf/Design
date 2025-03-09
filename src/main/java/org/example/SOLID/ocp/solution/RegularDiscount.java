package org.example.SOLID.ocp.solution;

public class RegularDiscount implements Discount {
    @Override
    public double calculate(double amount) {
        return amount * 0.1;
    }
}
