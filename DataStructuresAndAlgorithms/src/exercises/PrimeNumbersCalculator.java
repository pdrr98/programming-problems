package exercises;

public class PrimeNumbersCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] primesArray = new int[256];
		int[] primesArray = new int[78499];
		// Manually add the first 4 prime numbers as this number can interfere with
		// the algorithm simplicity
		primesArray[0]=2;
		primesArray[1]=3;
		primesArray[2]=5;
		primesArray[3]=7;
		
		int index = 4;
		int number = 10;
		while(index<primesArray.length) {
			//if is not divisable by Two or Five, and by previus prime numbers, then is a prime number
			if(divisableByTwoOrFive(number)) {
				number++;
			}
			else if(divisibleByPrimes(number,primesArray)) {
				number++;
			}else {
				primesArray[index]=number;
				index++;
				number++;
			}
		}
		
//		printArray(primesArray);
		System.out.println("Array length: "+primesArray.length);
		System.out.println("Max Number: "+primesArray[primesArray.length-1]);
		
	}//End of main method
	
	
	private static boolean divisableByTwoOrFive(int number) {
		boolean isDivisible;
		// If it ends up on 2,4,5,6,8 or 0 is divisible by two or five, so is not a prime number
		// Get the last digit of the number
		int lastDigit = number%10; 
		switch(lastDigit) {
		case 2:
		case 4:
		case 5:
		case 6:
		case 8:
		case 0:
			//Not a prime number, skip
			isDivisible = true;
			break;
		default:
			isDivisible = false;
		}
		return isDivisible;
	}//End of isPrime method
	
	
	private static boolean divisibleByPrimes(int number, int[] array) {
		boolean isDivisible = false;
		// check is array[i] its not empty
		for(int i = 0; i<array.length; i++) {
			if(array[i]==0) {
				break;
			}
			
			if(number%array[i]==0) {
				isDivisible = true;
				break;
			}		
		}
		// if the remainder of number/array[i] = 0 then is divisable, break
		return isDivisible;
	}
	
	
	private static void printArray(int[] array) {
		for(int i =0; i<array.length-1; i++) {
			System.out.print(array[i]+", ");
		}
		System.out.println("");
		System.out.println("Array length: "+array.length);
		System.out.println("Max Number: "+array[array.length-1]);
	}
	
	
}