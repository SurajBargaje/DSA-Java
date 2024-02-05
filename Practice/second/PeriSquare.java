import java.util.Scanner;

public class PeriSquare{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side");
        int side = sc.nextInt();

        int peri = 4*(side);
        System.out.println(peri);
        sc.close();
    }
    
}