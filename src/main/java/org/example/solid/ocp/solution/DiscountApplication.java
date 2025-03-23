package org.example.SOLID.ocp.solution;

public class DiscountApplication {
    private final Discount discount;

    public DiscountApplication(Discount discount) {
        this.discount = discount;
    }

    public double applyDiscount(double amount) {
        return discount.calculate(amount);
    }
}
