package BasicCorePrograms;
import java.util.Scanner;
public class QuotientAndRemainder6 {

	public static void main(String[] args) {
		int dividend, divisor;
		int quotient, remainder;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Dividend:");
		dividend = sc.nextInt();
		System.out.println("Enter the Divisor:");
		divisor = sc.nextInt();
		
		quotient = dividend/divisor;
		remainder = dividend%divisor;
		
		System.out.println("Quotient is: " + quotient);
		System.out.println("Remainder is: " + remainder);
	}

}
