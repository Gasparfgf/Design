package org.example.SOLID.lsp.solution;

public class Sparrow extends Animal {
    private String name;

    public Sparrow(String name) {
        this.name = name;
    }

    @Override
    void walk() {
        System.out.println(name + " walking...");
    }

    public void fly() {
        System.out.println("L'oiseau " + name + " vole !");
    }
}
