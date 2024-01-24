import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first = 0;
        int second =1;
       while (!sc.hasNextInt()) {
        System.out.println("Enter a valid number"); 
        sc.next();
       }
       
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {   
            System.out.println(first+ " ");
            int next = first+ second;
            first = second;
            second = next;
        }
        sc.close();
    }
    
}
