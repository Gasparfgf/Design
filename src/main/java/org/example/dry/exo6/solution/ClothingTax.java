package org.example.dry.exo6.solution;

public class ClothingTax implements Tax{
    @Override
    public double calculate(double price) {
        return price * 1.10;
    }
}
