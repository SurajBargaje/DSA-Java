import java.util.Scanner;

public class Parallelogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter height of Parallelogram");
        int height = sc.nextInt();
        System.out.println("Enter length of base ");
        int base = sc.nextInt();
        int area = (height*base);
        System.out.print("Area of Parallelogram is :- ");
        System.out.println(area);
        sc.close();
    
    }
    
}

    

