package org.example.dry.exo2.solution;

import java.util.List;

public class UserManager {
    private List<User> users;

    public UserManager(List<User> users) {
        this.users = users;
    }

    public void showUsers() {
        for (User user : users) {
            System.out.println("Utilisateur : " + user.getName());
        }
    }
}
