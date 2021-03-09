package com.company;

import java.util.Scanner;

public class Chat_bot {
    final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        greet("Peter", "2020");
        remindName();
        guessAge();
        count();
        test();
        // ...

    }

    static void greet(String assistantName, String birthYear) {// chat-bot input information
        System.out.println("Hello! My name is " + assistantName + ".");
        System.out.println("I was created in " + birthYear + ".");
        System.out.println("Please, remind me your name.");
    }

    static void remindName() {//this method returns username with Scanner's help
        String name = scanner.nextLine();
        System.out.println("What a great name you have, " + name + "!");
    }

    static void guessAge() {
        //through the utilisation of special age counting formula, chat-bot guesses the age of the user
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");
        int rem3 = scanner.nextInt();
        int rem5 = scanner.nextInt();
        int rem7 = scanner.nextInt();
        int age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105;
        System.out.println("Your age is " + age + "; that's a good time to start programming!");
    }

    static void count() {//this is a counter from zero to the special number, entered from input
        System.out.println("Now I will prove to you that I can count to any number you want.");
        int num = scanner.nextInt();
        for (int i = 0; i <= num; i++) {
            System.out.printf("%d!\n", i);
        }
    }

    static void test() {
        //the test that includes a loop, that enables entering of a right answer
        System.out.println("Let's test your programming knowledge.");

        System.out.println("Why do we use methods?");
        System.out.println("1. To repeat a statement multiple times.");
        System.out.println("2. To decompose a program into several small subroutines.");
        System.out.println("3. To determine the execution time of a program.");
        System.out.println("4. To interrupt the execution of a program.");
        int a = scanner.nextInt();
        while (a!=2){
            System.out.println("Please, try again.");
            a=scanner.nextInt();
        }
        if (a==2){
            end();//in the case of guessing the option, we are launching this method of the chat-bot

        }

    }

    static void end() {
        System.out.println("Congratulations, have a nice day!");
    }
}

