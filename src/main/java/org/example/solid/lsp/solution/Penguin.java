package org.example.SOLID.lsp.solution;

public class Penguin extends Animal {
    private String name;

    public Penguin(String name) {
        this.name = name;
    }

    @Override
    void walk() {
        System.out.println(name + " is walking...");
    }
}
