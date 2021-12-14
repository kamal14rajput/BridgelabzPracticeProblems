package BasicCorePrograms;
import java.util.Scanner;

public class SwapNumber7 {

	public static void main(String[] args) {
		int x, y;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of x and y:-");
		x = sc.nextInt();
		y = sc.nextInt();
		
		System.out.println("Numbers Before Swapping: " + x + " " + y);
		
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("Numbers After Swapping: " + x + " " + y);
	}

}
