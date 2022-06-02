package com.syntax.groupProject01;

public class Task11 {

	public static void main(String[] args) {
//Write a program to print out duplicate elements from an Array of Strings
		
		String[] array= {"Dog","Cat","Snake","Bird","Cat"};
		int i=0;
		int j=0;
				
		for(i=0; i<array.length; i++) {
			for(j=i+1; j<array.length; j++) {
				if(array[i].equals(array[j])) {
					System.out.println(array[i]);
					break;
				}
			}
		}
				
	}

}
