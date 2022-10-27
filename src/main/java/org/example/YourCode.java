package org.example;
import java.util.Scanner;
import java.lang.Math;
//Make a game in which you need to count an integer that the computer "guessed" in the range from 0 to 10
public class YourCode {
    public static void main(String[] args) {
        int  playir, attempts = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Guess the number (from 0 to 10).");

        int random_num = (int)Math.floor(Math.random() * 1);//change name,and declare here
        do {
            attempts++;
            if (attempts == 4) {
                System.out.println("You have no more attempts left. Game over");
                break;
            }
            System.out.println("Remaining attempts: " + (4 - attempts));

            System.out.print("Enter your number:");
            playir = input.nextInt();
            if (playir > random_num){
                System.out.println("My number is less.");
            } else if (playir < random_num) {
                System.out.println("My number is greater.");
            } else {
                System.out.println("You guessed!");
            }
        } while (playir != random_num);
        System.out.println("Number of attempts: " + attempts);
    }
}