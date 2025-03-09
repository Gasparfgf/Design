package org.example.SOLID.isp;

import org.example.SOLID.isp.Worker;

class RobotWorker implements Worker {
    public void work() {
        System.out.println("Le robot travaille !");
    }

    public void eat() {
        throw new UnsupportedOperationException("Un robot ne mange pas !");
    }
}