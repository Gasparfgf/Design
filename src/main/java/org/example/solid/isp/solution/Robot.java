package org.example.solid.isp.solution;

public class Robot implements Workable {
    @Override
    public void work() {
        System.out.println("Le robot travaille !");
    }
}
