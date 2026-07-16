import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("plese enter amount of usd you wanna convert to inr ");
        double usd = in.nextDouble();
        double exchangerate = 95.05;
        System.out.println(usd*exchangerate + " inr");
    }
}
