package org.example.dry.exo2.solution;

import java.util.List;

public class Main {
    public static void main(String[] args){
        User user1 = new User("Gaspar");
        User user2 = new User("Rosa");
        User user3 = new User("Francisco");

        List<User> users = List.of(user1, user2, user3);

        UserManager userManager = new UserManager(users);
        userManager.showUsers();
    }
}
