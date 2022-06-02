package com.syntax.groupProject01;

public class Task09 {

	public static void main(String[] args) {
//Maximum and minimum number in the array?
		
		int[] array= {21,52,13,58,49,165,147};
				
		int max=array[0];
		int min=array[0];
				
		for(int i=0;i<array.length;i++) {
			if(array[i]<min)min=array[i];
			if(array[i]>max)max=array[i];
		}
		System.out.println("The smallest value in the array is "+min);
		System.out.println("The largest value in the array is "+max);
				
				

	}

}
