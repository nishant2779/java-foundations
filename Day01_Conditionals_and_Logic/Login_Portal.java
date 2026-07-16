import java.util.Scanner;

public class PinLockout {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        int correctPin = 1234;
        boolean loggedIn = false;
        
        for (int i = 1; i <= 3; i++) {
            System.out.println("Attempt " + i + ": Enter your 4-digit PIN:");
            int guess = reader.nextInt();
            
            if (guess == correctPin) {
                System.out.println("Access Granted! Welcome to your account.");
                
                loggedIn = true; 
                break;
            } else {
                System.out.println("Incorrect PIN.");
            }
        }
  
        if (loggedIn == false) {
            System.out.println("Your account has been locked due to 3 failed attempts!");
        }
    }
}
