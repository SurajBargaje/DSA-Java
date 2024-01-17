import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of radius");
        int radius = sc.nextInt();
        double area = (Math.PI)*(Math.pow(radius, 2));
        System.out.print("Area of Circle is :- ");
        System.out.println(area);
        sc.close();

    }
}