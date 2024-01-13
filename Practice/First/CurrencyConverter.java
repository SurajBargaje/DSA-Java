import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Amount in rupees");
        while(!sc.hasNextFloat()){
            System.out.println("Invalid input. please enter an integer");
            sc.next();
        }
        float amount = sc.nextFloat();

        double usd = ((0.012*amount));
        
        
        System.out.println(amount+" Rupee = " + usd +" USD");
        sc.close();

    }
    
    
}
