import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        System.out.println("=== Average Calculator===");
        
        System.out.print("Enter 1st number : ");
        int num1 = in.nextInt();
        
        System.out.print("Enter 2nd number : ");
        int num2 = in.nextInt();
        
        System.out.print("Enter 3rd number : ");
        int num3 = in.nextInt();
        
        int sum = num1+num2+num3;
        double average = (double) sum/3;
        
        System.out.print("Average of " +num1+ " , " +num2+ " and " + num3 + " is : " + average);
        
    }
}
