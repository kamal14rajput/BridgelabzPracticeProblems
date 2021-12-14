package FunctionalPrograms;
import java.util.Scanner;

public class WindChill {

	public static void main(String[] args) {
		//declaration
		double t, v, w;
		
		//Taking value from user
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of t and v:");
        t = sc.nextDouble();
        v = sc.nextDouble();
        
        if(t < 50 && v < 120 && v > 3) {
        	w = 35.74 + 0.6215*t + (0.4275*t - 35.75) * Math.pow(v, 0.16);
        	System.out.println("Temperature = " + t);
        	System.out.println("Wind speed  = " + v);
        	System.out.println("Wind chill  = " + w);
        }
        else {
        	System.out.println("Please enter valid values.");
        }
	}

}
