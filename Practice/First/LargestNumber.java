import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        while (!sc.hasNextInt()){
            System.out.println("Invalid input. please enter a valid input");
            sc.next();
        }
        int num1 = sc.nextInt();

        System.out.println("Enter second number");
        while (!sc.hasNextInt()){
            System.out.println("Invalid Input. Please enter an integer");
        sc.next();
        }
        int num2 =sc.nextInt();


        if (num1>num2){
            System.out.println("Gretest number is " + num1);
        }
        else
        if (num1<num2) 
            System.out.println("Gretest number is " + num2);
        else{
            System.out.println("Both are equal");
        }
        sc.close();

    }
}
