 import java.util.Scanner;
public class CylinderVol {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter radius");
            int radius = sc.nextInt();
            System.out.println("Enter height");
            int height = sc.nextInt();
    
            double volume = (Math.PI)*(Math.pow(radius,2))*height;
        
            System.out.print("Volume of Cylinder is:- ");
            System.out.println(volume);
            sc.close();
        }
        
    }
        
    
    

