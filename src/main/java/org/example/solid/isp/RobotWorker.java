package org.example.solid.isp;

class RobotWorker implements Worker {
    public void work() {
        System.out.println("Le robot travaille !");
    }

    public void eat() {
        throw new UnsupportedOperationException("Un robot ne mange pas !");
    }
}