package algorithms.easy;

import java.util.HashMap;

public class BetweenTwoSets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//		There will be two arrays of integers. Determine all integers that satisfy the following two conditions:
		//			1.-The elements of the first array are all factors of the integer being considered
		//		    2.-The integer being considered is a factor of all elements of the second array
		//		These numbers are referred to as being between the two arrays. Determine how many such numbers exist.
		/*
		 * Example:
		 * a = [2,6]
		 * b = [24,36]
		 * There are two numbers between the array, 6 and 12 so return 2
		 * 
		 * Example 2:
		 * a = [2,4]
		 * b = [16,32,96]
		 * There are three numbers 4,8,16, so return 3
		 * 4, 8 and 16 are the only three numbers for which each element of a is a factor 
		 * and each is a factor of all elements of b.
		 * 
		 * Constraints:
		 * a is n size a.length = n
		 * b is m size b.length = m
		 * 1<=n,m<=10
		 * 1<=a[i]<=100
		 * 1<=b[j]<=100
		 * 
		 */
		int firstSquare = 9;
		int b = 1200;
		    Double square = Math.pow(firstSquare,2); 
		    while(square<=b){
		        square = Math.pow(firstSquare,2);
		        System.out.println("first square: " + firstSquare+" square: "+square);
		        firstSquare ++;

		    }
		System.out.println(firstSquare);
		System.out.println(square);
		System.out.println(b);
		
//		
//		Integer[] a = {2,4};
//		Integer[] b = {16,32,96};
//		System.out.println(getFactors(a,b));
	}
	
	private static int getFactors(Integer[]a,Integer[]b) {
		// Lets presuppose arrays will be sorted in ascending order
		// numbers betweeen a[a.length-1] and b[0]
		int n = a.length;
		int m = b.length;
		Integer min = a[n];
		Integer max = b[m];
		Integer[] factors = new Integer[b.length];
		
		for(byte i = 0; i<b.length; i++) {
						
		}
		return 1;
	}

}
