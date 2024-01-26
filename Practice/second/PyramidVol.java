import java.util.Scanner;
public class PyramidVol {   
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter length");
            int length = sc.nextInt();
            System.out.println("Enter weidth");
            int weidth = sc.nextInt();
            System.out.println("Enter height");
            int height = sc.nextInt();
    
            int volume = (length*weidth*height)/3;
            System.out.print("Volume of Pyaramid is:- ");
            System.out.println(volume);
            sc.close();
        }
        
    }
        
    
    
    

