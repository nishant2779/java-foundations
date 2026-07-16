import java.util.Scanner;

public class CoffeeOrder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Choose your size (small / medium / large):");
        String size = in.next();
        
        double price = 0.0;
        
        if (size.equals("small")){
            price = 2.50;
            
        }
        else if (size.equals("medium")){
            price = 3.50;
            
        }
        else if (size.equals("large")){
            price = 4.50;
        } 
        else {
            System.out.println("We don't recognize that size!");
        }
        
        if (price > 0.0) {
            System.out.println("Would you like extra flavor syrup for $0.50? (yes/no):");
            String addSyrup = in.next();
            
            if (addSyrup.equals("yes")){
                price = price + 0.50;
            }
            
            System.out.println("Your order summary is finalized.");
            System.out.println("Total balance due: $" + price);
        }
    }
}
