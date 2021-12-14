package com.LogicalPrograms;
import java.util.Scanner;
import java.util.Arrays;

public class CouponNumbers {

	public static void main(String[] args) {
		int numberOfCoupons;
		Scanner sc = new Scanner(System.in);
		System.out.println("How many Coupons you want?");
		numberOfCoupons = sc.nextInt();
		
		int[] couponsCodes;		
		couponsCodes = new int[numberOfCoupons];
		int countOfcoupons = 0;
		while (countOfcoupons < numberOfCoupons )
		{
			int randomcoupon = (int) Math.floor(Math.random() *10000);		
			boolean couponInCouponsCode = false;			
			for (int i = 0; i < couponsCodes.length; i++)
			{
				if (randomcoupon  == couponsCodes[i]) 
				{
					couponInCouponsCode = true;
				}
			}
			
			if(!(couponInCouponsCode)) {				
				couponsCodes[countOfcoupons++] = randomcoupon;
			}
		}
		System.out.println("These are "+numberOfCoupons+" coupons you want: "+ Arrays.toString(couponsCodes));
	}
}