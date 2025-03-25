package org.example.solid.isp.solution;

class Human implements Eatable, Workable {

    @Override
    public void eat() {
        System.out.println("L'humain mange !");
    }

    @Override
    public void work() {
        System.out.println("L'humain travaille !");
    }
}