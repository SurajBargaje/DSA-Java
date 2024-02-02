import java.util.Scanner;

public class PeriOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("Welcome to the perimeter calculator!");
        System.out.println("Enter radius");
        int radius = sc.nextInt();
        double perimeter = Math.PI*2*radius;
        System.out.println(perimeter);
        sc.close();
    }
    
}
