package main;

import models.User;
import models.UserAbove18;
import models.UserUnder18;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        User user = User.builder()
                .balance(100)
                .id(1)
                .birthday(new Date(2 / 12 / 1996))
                .email("jvnasbvs@fjnvbasj.com")
                .name("Eugene")
                .surname("Barsukov")
                .password("oefjqjeo")
                .build();
        System.out.println(user);

        User newUserUnder18 = UserUnder18.builder()
                .balance(150)
                .surname("Romanchuk")
                .name("Roman")
                .email("jnvw@jnviwa.com")
                .birthday(new Date(2 / 17 / 2010))
                .id(2)
                .build();
        System.out.println(newUserUnder18);

        User newUserAbove18 = UserAbove18.builder()
                .balance(200)
                .id(3)
                .name("Igor")
                .surname("Manchik")
                .birthday(new Date(2 / 11 / 2009))
                .email("fnw@wnvwon.com")
                .build();
        System.out.println(newUserAbove18);
    }
}