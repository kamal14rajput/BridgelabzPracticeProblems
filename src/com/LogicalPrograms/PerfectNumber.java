package com.LogicalPrograms;
import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number to Check:");
		num = sc.nextInt();
		int sumOfDivisor = 0;
		for (int i = 1; i < num; i++) {
			if (num%i == 0)
			{
				sumOfDivisor += i; 
			}
		}
		if(sumOfDivisor == num)
		{
			System.out.println(num+ " is Perfect Number");
		}
		else
		{
			System.out.println(num + " is Not Perfect Number");
		}
	}
}