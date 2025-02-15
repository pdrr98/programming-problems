package algorithms.easy;

public class FindDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Write your code here
        // int max value = 2,147,483,647
        // get n number of digits
		int n = 2034238230;
		System.out.println("Number: " + n);
        byte nDigits = numberOfDigits(n);
        int [] arrayDigits = new int[nDigits];
        int number = n;
        int result = 0;
        // Get the last digit of the number n and fill it on the array
        while(nDigits>0){
            arrayDigits[nDigits-1] = number%10;
            nDigits--;
            number =number/10;
        }
        
        //if array[i] not a zero divide by the number
        for(byte i = 0; i < arrayDigits.length; i++){
        	if((arrayDigits[i]!=0)&&(n%arrayDigits[i])==0) {
        		System.out.println("Divisable number: "+ arrayDigits[i]);
        		result ++;
        	}        
        }
        
        printArray(arrayDigits);
        System.out.println("result: " + result);
    }
	
	private static void printArray(int[] array) {
		System.out.println("");
		System.out.println("Array: ");
		for(byte i = 0; i<array.length; i++) {
			System.out.print(array[i]+", ");
		}
		System.out.println("");
	}
    
    private static byte numberOfDigits(int number){
        if(number >= 1000000000){
            return 10;
        }
        else if(number >= 100000000){
            return 9;
        }
        else if(number >= 10000000){
            return 8;
        }        
        else if(number >= 1000000){
            return 7;
        }        
        else if(number >= 100000){
            return 6;
        }        
        else if(number >= 10000){
            return 5;
        }        
        else if(number >= 1000){
            return 4;
        }        
        else if(number >= 100){
            return 3;
        }        
        else if(number >= 10){
            return 2;
        }else{
            return 1;
        }
    }

}