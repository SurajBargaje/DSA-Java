import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length ");
        int length = sc.nextInt();
        System.out.println("Enter weidth ");
        int weidth = sc.nextInt();
        int area = length*weidth;
        System.out.print("Area of Rectangle is :- ");
        System.out.println(area);
        sc.close();
    
    }
    
}
