// Jack G

import java.util.Scanner;

public class example3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int target = (int)(Math.random()*101); 

        System.out.println("I'm thinking of a number between 0 and 100");
        System.out.print("Make your first guess: ");

        int guess = scan.nextInt();           
        int Count = 1;                    
        while (guess != target) {
            if (guess < target) {
                System.out.println("Too low!");
            } else {
                System.out.println("Too high!");
            }

            System.out.print("Try again: ");
            guess = scan.nextInt();          
            Count++;                     
        }

        System.out.println("You got it! The number was " + target + ".");
        System.out.println("You took " + Count + "tries");
        if (Count <= 7) {
            System.out.println("Nice! You found it in " + Count);
        } else {
            System.out.println("You took more than 7 guesses");
        }

        scan.close();
    }
}
