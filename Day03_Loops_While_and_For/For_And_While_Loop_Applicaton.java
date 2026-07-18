import java.util.Scanner;
import java.util.Random;

public class LoopProject {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean running = true;

        System.out.println("=== Welcome to the Java Loop Project ===");

      
        while (running) {
            System.out.println("\nSelect an option:");
            System.out.println("1. Print a Multiplication Table (Uses 'for' loop)");
            System.out.println("2. Play Number Guessing Game (Uses 'while' loop)");
            System.out.println("3. Exit");
            System.out.print("Enter choice (1-3): ");
            
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter a number for the table: ");
                    int tableNum = scanner.nextInt();
                    System.out.println("--- Multiplication Table for " + tableNum + " ---");
                    
                   
                    for (int i = 1; i <= 10; i++) {
                        System.out.println(tableNum + " x " + i + " = " + (tableNum * i));
                    }
                    break;

                case 2:
                    int targetNumber = random.nextInt(20) + 1; 
                    int userGuess = 0;
                    System.out.println("--- Guess the Number (Between 1 and 20) ---");

      
                    while (userGuess != targetNumber) {
                        System.out.print("Enter your guess: ");
                        userGuess = scanner.nextInt();

                        if (userGuess < targetNumber) {
                            System.out.println("Too low! Try again.");
                        } else if (userGuess > targetNumber) {
                            System.out.println("Too high! Try again.");
                        } else {
                            System.out.println("🎉 Correct! You guessed the secret number!");
                        }
                    }
                    break;

                case 3:
                    System.out.println("Thank you for using the application. Goodbye!");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid option. Please pick a number from 1 to 3.");
            }
        }
    }
}
