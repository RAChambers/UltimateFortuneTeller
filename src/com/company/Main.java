package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Welcome to your Ultimate Fortune Teller");
        System.out.println("What is your name?");
        String firstName = userInput.nextLine();
        System.out.println("You have entered " + firstName);

        System.out.println("What is your last name?");
        String lastName = userInput.nextLine();
        System.out.println("You have entered " + lastName);

        System.out.println("and what is your age?");
        int age = userInput.nextInt();
        System.out.println("Ok, you are " + age + " years old.");

        System.out.println("Now, what is your birth month number?");
        int birthMonth = userInput.nextInt();
        System.out.println("You have entered " + birthMonth);

        System.out.println("What is your favorite primary color?  If you need a list, please enter \"HELP\"");
        String favoritePrimaryColor = userInput.nextLine();

        if (favoritePrimaryColor.equalsIgnoreCase("HELP")) {
            System.out.println("Primary colors are RED, BLUE, and YELLOW");
            System.out.println("Select your favorite primary color");}
            favoritePrimaryColor = userInput.nextLine();

            System.out.println("So " + favoritePrimaryColor + " is your primary color of choice.");

            System.out.println("How many siblings do you have?");
            int numbOfSiblings = userInput.nextInt();
            System.out.println("You have entered " + numbOfSiblings);

        System.out.println("OK.......");
        System.out.println();
        System.out.println();

        System.out.println("This is your future...");

            int yearsUntilRetirement;
            if (age % 2 == 0) {
                yearsUntilRetirement = 12;
            } else {
                yearsUntilRetirement = 14;
            }
        String vacationLocation = "";
        if (numbOfSiblings == 0) {
            vacationLocation = "Miami, Florida";
        }
        if (numbOfSiblings == 1) {
            vacationLocation = "Paris, France";
        }
        if (numbOfSiblings == 2) {
            vacationLocation = "Dubai, United Arab Emirates";
        }
        if (numbOfSiblings >= 3){
            vacationLocation = "Rome, Europe";
        }
        double bankBalance = 0.0;
        if (birthMonth > 0 && birthMonth <= 4 ) {
            bankBalance = 25000000.63;
        } else if (birthMonth > 4 && birthMonth <= 8) {
            bankBalance = 6500000.23;
        } else if (birthMonth > 8 && birthMonth <= 12 ){
            bankBalance = 10000000.77;
        }

            System.out.println(firstName + " " + lastName + ", at the age of " + age + " years old, you have " + yearsUntilRetirement + " years until retirement.\n" +
             "Good news is, you will retire with $" + bankBalance + " in the bank,\n and a vacation home in " + vacationLocation + ". Enjoy!");


        }
    }

