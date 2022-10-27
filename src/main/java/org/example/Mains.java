package org.example;

import java.util.Random;
import java.util.Scanner;

public class Mains {
    public static void main(String[] args) {
        int attempts = 3;

        Scanner input = new Scanner(System.in);
        System.out.println("Guess the number (from 0 to 10).");
        System.out.println("You have got 3 attempts");

        Random random = new Random();//alternative
        int random_num = random.nextInt(1, 10);//alternative

        for (int i = 1; i <= attempts; i++) {
            System.out.println("----------------------");
            System.out.println("Remaining attempts: " + i);


            System.out.print("Enter your number:");
            int player = input.nextInt();

            if (player == random_num) {
            System.out.println("You guessed in  " + attempts + " try");
            }
            else if (player > random_num) {
                System.out.println("Your number is less.");
            }
            else if (player < random_num) {
                System.out.println("Your number is greater.");
            }


            if (i == 3) {
                System.out.println("----------------------");
                System.out.println("You have no more attempts left. Game over");
            }
        }
    }
}
