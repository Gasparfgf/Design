package org.example.solid.isp.solution;

public class Main {
    public static void main(String[] args) {
        Robot robot = new Robot();
        Human human = new Human();

        robot.work();
        human.work();
        human.eat();
    }
}
