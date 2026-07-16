import java.util.Scanner;

public class CircleCalculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        // pi value
        double pi = 3.14; 
        
        System.out.println("Enter radius:");
        double r = s.nextDouble();
        
        // formulas
        double circumference = 2 * pi * r;
        double area = pi * r * r;
        
        // printing outputs
        System.out.println("Circumference is " + circumference);
        System.out.println("Area is " + area);
    }
}
