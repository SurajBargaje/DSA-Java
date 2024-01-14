import java.util.Scanner;

public class SimpleIntrest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Simple intrest calculator!");
        System.out.println("Please enter your principle amount");
        int  amount = sc.nextInt();

        System.out.println("Please enter duration in years");
        int time = sc.nextInt();

        System.out.println("please enter your rate of intrest");
        int rate =sc.nextInt();

        int intrest = ((amount*rate *time)/100);
        System.out.println("your simple intrest is " + intrest);
        System.out.println("principle amount = "+ amount);
        System.out.println("total value = "+ (intrest + amount));
        sc.close();
    }
    
}
