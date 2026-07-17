import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
      
        double costperlitre = 105.45;
      
        System.out.print("Enter the amount of which petrol u want : ");    
        double amount = in.nextDouble();
      
        double fule = amount/costperlitre;
      
        for(double i=0 ; i<fule ; i=i+0.1){
            System.out.println("petrol filled : " + i + "  cost : " + i*costperlitre);
        }
         double cost = amount;
         if(fule>=20){
             cost=cost-(0.1*amount);
         }
         System.out.println("fule filled = " + fule + " litre");
          System.out.println("total cost = " + amount);
           System.out.println("discount : 10%");
            System.out.println("net payable amount : " + cost );
    }
}
