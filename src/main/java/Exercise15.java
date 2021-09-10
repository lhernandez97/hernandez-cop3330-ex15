/*
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Luis Hernandez
 */

import java.util.Scanner;

public class Exercise15 {
    public static void main(String[] args) {
        //create Scanner
        Scanner in = new Scanner(System.in);
        //password that user must input
        String password = "abc$123";
        //prompt the user for a username and a password
        System.out.print("What is the username? ");
        String username = in.nextLine();
        System.out.print("What is the password? ");
        String user_pass = in.nextLine();
        //check if the user's password matches the program's password
        if(user_pass.equals(password)) {
            System.out.print("Welcome!");
        } else {
            System.out.print("I don't know you.");
        }
    }
}
