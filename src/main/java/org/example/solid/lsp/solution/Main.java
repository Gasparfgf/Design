package org.example.SOLID.lsp.solution;

public class Main {
    public static void main(String[] args) {
        Penguin penguin = new Penguin("Penguin");
        Sparrow sparrow = new Sparrow("Sparrow");

        penguin.walk();
        sparrow.walk();
        sparrow.fly();
    }
}
