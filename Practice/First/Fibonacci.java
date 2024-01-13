import java.util.Scanner;

public class Fibonacci{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        while(!sc.hasNextInt()){
            System.out.println("Invalid input. please enter an integer");
            sc.next();
        }
        int n = sc.nextInt();

        int first = 0;
        int second = 1;
        

        for (int i=1;i<=n;i++){
        
            System.out.println(first +" ");
            int next = first +second;

            first =second;
            second = next;
        }
        sc.close();;

    }
}