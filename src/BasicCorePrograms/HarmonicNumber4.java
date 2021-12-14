package BasicCorePrograms;
import java.util.Scanner;

public class HarmonicNumber4 {

	public static void main(String[] args) {
		int n;
		double sum = 0, i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:-");
		n = sc.nextInt();
		if (n != 0) {
		for (i = 1;i <= n; i++) {
			sum = sum + (1/i);
		}
		System.out.println(n + "th Harmonic number is: " + sum);
		}
		else {
			System.out.println("Please enter number other than zero.");
		}
	}

}
