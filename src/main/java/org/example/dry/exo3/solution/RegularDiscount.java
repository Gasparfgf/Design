package org.example.dry.exo3.solution;

public class RegularDiscount implements Discount {
    @Override
    public double calculateDiscount(double price) {
        return price * 0.1;
    }
}
