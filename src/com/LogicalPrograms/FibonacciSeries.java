package com.LogicalPrograms;
import java.util.Scanner;
public class FibonacciSeries {

	public static void main(String[] args) {
		int num;
		int previousNum = 0, currentNum = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		num = sc.nextInt();
		System.out.print("fibonacci series of " + num + " is " + previousNum + ", " + currentNum);
		for (int i = 1;i < num; i++) {
			int nextNum = previousNum + currentNum;
			previousNum = currentNum;
			currentNum = nextNum;
			System.out.print(", " + nextNum);
		}
	}

}
