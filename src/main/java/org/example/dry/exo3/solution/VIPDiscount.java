package org.example.dry.exo3.solution;

public class VIPDiscount implements Discount{

    @Override
    public double calculateDiscount(double price) {
        return price * 0.2;
    }
}
