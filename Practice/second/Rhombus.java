import java.util.Scanner;

public class Rhombus{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter value of diagonal p");
        int p = sc.nextInt();
        System.out.println("Please enter value of diagonal q");
        int q = sc.nextInt();

        int area = (p*q)/2;
        System.out.print("Area of rhombus is :- ");
        System.out.println(area);
        sc.close();


    }
}