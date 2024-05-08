package com.coderscampus;

import java.util.Random;
import java.util.Scanner;

public class Assignment2Application {

	public static void main(String[] args) {
		
Scanner scanner = new Scanner(System.in);
Random random = new Random();

int theRandomNumber = random.nextInt(100) + 1;
int maxTries = 0;

System.out.println("Welcome to Guess the Number! "
        + "Can you guess the number between 1 and 100?");

while (maxTries < 5) {
    System.out.print("Pick a number between 1 and 100: ");
    String input = scanner.nextLine();
    
    int guess;
    try {
        guess = Integer.parseInt(input);
        if (guess < 1 || guess > 100) {
            System.out.println("Your guess is not between 1 and 100, please try again.");
            continue; 
        }
    } catch (NumberFormatException e) {
        System.out.println("Invalid input. Please enter a valid number.");
        continue; 
    }
    
    maxTries++;

    if (guess < theRandomNumber) {
        System.out.println("Please pick a higher number.");
    } else if (guess > theRandomNumber) {
        System.out.println("Please pick a lower number.");
    } else {
        System.out.println("Congratulations! You win!");
        return;
    }
}
System.out.println("You lose! The number to guess was: " + theRandomNumber);
}
}