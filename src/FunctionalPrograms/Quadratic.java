package FunctionalPrograms;
import java.util.Scanner;

public class Quadratic {

	public static void main(String[] args) {
		//Declaration
		double a, b, c;
		double x1, x2, sqrt;
		//taking value from user
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a,b,c:");
        a = sc.nextDouble() ;
        b = sc.nextDouble();
        c = sc.nextDouble();
        
        //Calculating equations
        double delta = (b*b) - (4*a*c);
        sqrt = Math.sqrt(delta);
        if(delta > 0) {
        	x1 = (-b + sqrt)/(2*a);
        	x2 = (-b - sqrt)/(2*a);
        	System.out.println("Roots are : " + x1 + " and "+ x2);
        }
        else if(delta == 0){
            System.out.println("Root is : " + (-b)/(2*a));
         }
        else {
        	System.out.println("Roots are not real.");
        }
	}

}
