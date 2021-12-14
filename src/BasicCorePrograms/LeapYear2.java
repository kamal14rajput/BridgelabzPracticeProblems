package BasicCorePrograms;
import java.util.Scanner;

public class LeapYear2 {

	public static void main(String[] args) {
		System.out.println("Enter the Year:-");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		boolean leapYear = false;
		if(year > 999 && year < 10000) {
			if (year % 4 == 0) {
				if(year % 100 == 0) {
					if(year % 400 == 0) {
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
			System.out.println("Enter only 4 digit number.");
		}
		if(leapYear) {
			System.out.println(year + " is a leap year.");
		}else {
			System.out.println(year + " is not a leap year.");
		}
	}

}
