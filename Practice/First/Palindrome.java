import java.util.Scanner;

class palindrome{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int num = Integer.valueOf(s);
        int temp = num;
       
         
        int reverse = 0;
        while (num!=0){
            int digit = num%10;
            reverse = reverse *10 + digit;
            num /= 10;
           
        }
       if(reverse==temp){
        System.out.println("Number is Palindrome");
       }
       else{
        System.out.println("Given number is not palindrome");
       }
       sc.close();
      
         
    }
}