package com.kodilla.testing;

import com.kodilla.testing.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUserName();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        SimpleUser simpleUser2 = new SimpleUser("theForumUser2");

        String result2 = simpleUser2.getUserName();

        if (result2.equals("theForumUser2")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        System.out.println("Pierwsze dwa testy jednostkowe.");
    }
}
