import java.util.Scanner;

public class Upper {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        // String n =s.toUpperCase();
        // System.out.println(n);

        char ch = s.trim().charAt(0);
        if (ch>='a' && ch<='z'){
            System.out.println("Lowercase");
        }else{
            System.out.println("Uppercase");
        }
        sc.close();
    }
}
