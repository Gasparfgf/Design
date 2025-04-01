package org.example.strategy.solution;

public class CryptoPayment implements Strategy {
    private final String walletAddress;

    public CryptoPayment(String walletAddress) {
        this.walletAddress = walletAddress;
    }

    @Override
    public void pay(double amount) {
        System.out.println("🪙 Paiement de " + amount + "€ en crypto (wallet : " + walletAddress + ")");
    }
}
