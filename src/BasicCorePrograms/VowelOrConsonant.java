package BasicCorePrograms;
import java.util.Scanner;

public class VowelOrConsonant {

	public static void main(String[] args) {
		char alphabet;
		System.out.println("Enter the Alphabet:");
		Scanner sc = new Scanner(System.in);
		alphabet = sc.next().charAt(0);
		
		switch(alphabet) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println(alphabet + " is a Vowel");
			break;
		default:
			System.out.println(alphabet + " is a Consonant");
			
		}
	}

}
