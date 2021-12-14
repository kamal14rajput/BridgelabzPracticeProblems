package BasicCorePrograms;
import java.util.Scanner;

public class PrimeFactor5 {

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:-");
		num = sc.nextInt();
		if(num > 1) {
			System.out.println("Prime factors of number " + num + ":");
			for(int i = 2; i <= num; i++) {
				while(num%i == 0) {
					System.out.println(i);
					num = num/i;
				}
			}
		}
		else {
			System.out.println("Please enter number greater than 1.");
		}
	}
}
