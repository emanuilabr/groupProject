package com.syntax.groupProject01;

public class Task05 {

	public static void main(String[] args) {
/*Create a 2D array of integers. Develop a program 
 * which will calculate the sum of  even and odd numbers for that array.
 */

	int [][] num={{1,2,3,4},
				 {4,5,6},
				 {10,20,30,44,33}};
				
				
		int evenSum = 0;
		int oddSum = 0;
				
				
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
					
				if (num[i][j] % 2 == 0) {
					evenSum=evenSum+num[i][j];
				} else {
					oddSum=oddSum+num[i][j];
				}
			}
		}
			
					
		System.out.println("Sum of Even numbers is " + evenSum);
		System.out.println("Sum of Odd numbers is " + oddSum);


	}

}
