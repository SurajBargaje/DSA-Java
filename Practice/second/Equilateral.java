import java.util.Scanner;

public class Equilateral{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of side");
        int a = sc.nextInt();

        double area = (Math.sqrt(3)/4)*(Math.pow(a, 2));
        System.out.print("Area of Equilateral triangle is :- ");
        System.out.println(area);
        sc.close(); 
    }
}