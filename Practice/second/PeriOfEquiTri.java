import java.util.Scanner;

public class PeriOfEquiTri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int side = sc.nextInt();
        int peri = 3*side;
        System.out.println(peri);
        sc.close();
    }
    
}
