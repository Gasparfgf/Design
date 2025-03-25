package org.example.solid.lsp.solution;

public class Sparrow extends Animal implements Flyable {
    private String name;

    public Sparrow(String name) {
        this.name = name;
    }

    @Override
    void walk() {
        System.out.println(name + " walking...");
    }

    @Override
    public void fly() {
        System.out.println("L'oiseau " + name + " vole !");
    }
}
