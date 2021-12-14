package com.LogicalPrograms;
import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		int num, flag = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number to check is Prime or not ");
		num = sc.nextInt();
	
		if(num == 1 || num == 0)
		{
			System.out.println("Its not a Prime Number");
			flag =1;
		}
		else if(num == 2)
		{
			System.out.println("Its a Even Prime Number");
		}
		else {
			for(int i= 2; i < num; i++){      
				if(num%i == 0){      
					System.out.println(num + " is not prime number");      
					flag=1;      
					break;      
				}      
			}
		}	
		if(flag == 0) { 
		   System.out.println(num + " is prime number"); 
		 }     
	}
}	


