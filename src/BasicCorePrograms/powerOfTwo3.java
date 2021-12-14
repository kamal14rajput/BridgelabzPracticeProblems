package BasicCorePrograms;
import java.util.Scanner;

public class powerOfTwo3 {
	public static void main(String[] args) {
		System.out.println("Enetr the value of N:-");
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int num=1;
		if(N >= 0 && N < 31) {
			System.out.println("Table of the power of 2:");
			for(int i = 1; i <= N; i++) {
				System.out.println("2"+"^"+i+" = "+ (2*num));
				num = 2*num;
			}
		}else {
			System.out.println("Please enter the value of N between 0 to 31 only.");
		}
		System.out.println(N + " power of 2 is:- " + num );
		boolean leapYear = false;
		if(num > 999 && num < 10000) {
			if (num % 4 == 0) {
				if(num % 100 == 0) {
					if(num % 400 == 0) {
						leapYear = true;
					}
					else {
						leapYear = false;
					}
				}else {
					leapYear = true;
				}
			}else {
				leapYear = false;
			}
		}
		else {
			System.out.println(num + " is not a 4 digit number.");
		}
		if(leapYear) {
			System.out.println(num + " is a leap year.");
		}else {
			System.out.println(num + " is not a leap year.");
		}
	}

}
