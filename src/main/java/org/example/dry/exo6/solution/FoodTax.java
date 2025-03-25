package org.example.dry.exo6.solution;

public class FoodTax implements Tax{
    @Override
    public double calculate(double price) {
        return price * 1.05;
    }
}
