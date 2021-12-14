package FunctionalPrograms;
import java.util.Scanner;

public class Distance {

	public static void main(String[] args) {
		//Declaration
		int x, y;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of x and y:");
		x = sc.nextInt();
		y = sc.nextInt();
		
		//calculating distance
		double distance = Math.sqrt(x*x + y*y);
		System.out.println("distance from (" + x + ", " + y + ") to (0, 0) = " + distance);
	}
}