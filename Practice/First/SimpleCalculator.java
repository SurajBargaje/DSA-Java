import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number");
        int num1 = sc.nextInt();
        System.out.println("enter 2nd number");
        int num2 = sc.nextInt();
        System.out.println("select operater from below");
        System.out.println("+ - * /");
        String opr = sc.next();


        switch (opr) {
            case "+":System.out.println(num1+ "+"+ num2 + "="+ (num1 + num2));
            
                break;
            case "-":System.out.println( num1+ "-"+ num2 + "="+ (num1 - num2));
                break;
            case "*":System.out.println( num1+ "*"+ num2 + "="+ (num1 * num2));
                break;
            case "/":
                if (num2==0){
                    System.out.println("number cannot be zero for divide");
                
                    
                }
                else{System.out.println(num1+ "/"+ num2 + "="+ (num1 / num2));
                    
                break;}
        
            default:System.out.println("Invalid input");
                break;
        }
        sc.close();
    }
    
}

