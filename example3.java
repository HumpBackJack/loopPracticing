// Jack G

import java.util.Random;
import java.util.Scanner;

public class example3 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        int target = rand.nextInt(101); 

        System.out.println("I'm thinking of a number between 0 and 100.");
        System.out.print("Make your first guess: ");

        int guess = scanner.nextInt();           
        int guessesCount = 1;                    
        while (guess != target) {
            if (guess < target) {
                System.out.println("Too low!");
            } else { // guess > target
                System.out.println("Too high!");
            }

            System.out.print("Try again: ");
            guess = scanner.nextInt();          
            guessesCount++;                     
        }

        System.out.println("You got it! The number was " + target + ".");
        System.out.println("You took " + guessesCount + (guessesCount == 1 ? " guess." : " guesses."));
        if (guessesCount <= 7) {
            System.out.println("Nice! You found it in " + guessesCount);
        } else {
            System.out.println("You took more than 7 guesses");
        }

        scanner.close();
    }
}
