import java.util.Scanner;

public class TimeConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("=== Total Time Converter ===");
        System.out.print("Enter total time in seconds: ");
        int totalSeconds = input.nextInt();
        
        // Math breakdown using / and %
        int minutes = totalSeconds / 60;
        int remainingSeconds = totalSeconds % 60;
        
        System.out.println("--- Results ---");
        System.out.println(totalSeconds + " seconds is equal to " + minutes + " minutes and " + remainingSeconds + " seconds.");
    }
}
