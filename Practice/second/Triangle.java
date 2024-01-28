import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter height of trianle");
        int height = sc.nextInt();
        System.out.println("Enter length of base ");
        int base = sc.nextInt();
        int area = (height*base)/2;
        System.out.print("Area of trianle is :- ");
        System.out.println(area);
        sc.close();
    
    }
    
}
