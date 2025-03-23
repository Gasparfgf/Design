package org.example.SOLID.ocp.solution;

public class Main {
    public static void main(String[] args) {
        RegularDiscount regularDiscount = new RegularDiscount();
        DiscountApplication discountApplication = new DiscountApplication(regularDiscount);

        VIPDiscount vipDiscount = new VIPDiscount();
        DiscountApplication discountApplication1 = new DiscountApplication(vipDiscount);

        System.out.println("With discount applied, regular client must pay " + discountApplication.applyDiscount(150.99));
        System.out.println("With discount applied, vip client must pay " + discountApplication1.applyDiscount(150.99));
    }
}
