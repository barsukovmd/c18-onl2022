package main;

import models.User;

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
                .build();
        System.out.println(user);
    }
}