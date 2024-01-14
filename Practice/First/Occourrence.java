import java.util.Scanner;

public class Occourrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number which has repetative digit");
        long num = sc.nextLong();
        System.out.println("Enter which digit you want to check for occourrence");
        int num1 = sc.nextInt();
        int count = 0;
        while(num!=0){
            // int a = 
            long temp = num%10;
            num = num/10;
            if (temp == num1){
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }

    
}