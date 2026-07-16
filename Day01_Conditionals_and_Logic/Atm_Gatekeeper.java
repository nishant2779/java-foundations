import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
       double balance = 500;
       System.out.println("your account balance is :  $" + balance);
       
        System.out.print("Enter the amount you want to withdrawl : ");
       double withdrawl = in.nextDouble();
       
       if(withdrawl > balance){
           System.out.println("==insuffisient money in the account to complete this transaction--");
         }
           else if(withdrawl % 10 !=0){
               System.out.println("Error : we only have $10 bills avilabilable "); 
           }
               
               else{
                    balance = balance - withdrawl;
                   System.out.println("===Transaction successful===");
                   }
            System.out.println("Remaining Balance: $" + balance);
        
    }
}
