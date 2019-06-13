/*
 * This program will keep the user guessing until user guesses "5"
 * User can also stop the guessing by using the keyword ```break```.
 */

import java.util.Scanner;

public class KeepGuessing {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int secretNumber, guess = 0;//guess is initialized to 0
        String answer;
        boolean breakFlag = true;

        secretNumber = 5;

        System.out.println("I'm thinking of a number between 1 and 1000");
        System.out.print("Enter the number or type \'break\' to stop: ");

        answer = keyboard.next();
        breakFlag = answer.contains("break");
        if (!breakFlag)
            guess = Integer.parseInt(answer);

        while ( !breakFlag && (guess != secretNumber ))
        {
            System.out.println("\nYou are wrong. Try again.");
            System.out.println("Enter the number or type \'break\' to stop: ");

            answer = keyboard.next();

            if (answer.contains("break")) {
                breakFlag = true;
                break;
            }

            guess = Integer.parseInt(answer);
        }

        if (breakFlag)
            System.out.println("Try again next time.");
        else
            System.out.println("You are correct. You win a prize!");

        keyboard.close();
    }
}