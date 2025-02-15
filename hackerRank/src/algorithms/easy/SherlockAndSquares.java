package algorithms.easy;

public class SherlockAndSquares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =0;
		int b =9;
        int result = 0;
        
        int firstSquare = getFirstSquareFactor(a,b);
        
        // System.out.println("first square: " + firstSquare);
//        if(firstSquare == 0 ){
//        	System.out.println(result);
//            return 0;
//        	return;
//        }
        //Compute subsequent squares ultil b limit using the first square factor
        // System.out.println("first square: " + firstSquare);
        Double square = Math.pow(firstSquare,2); 
        while(square<=b){
            square = Math.pow(firstSquare,2);
            System.out.println("first square: " + firstSquare+" square: "+square);
            firstSquare ++;
            result++;
        }
        System.out.println(result-1);
    }
    
    private static int getFirstSquareFactor(int a, int b){
        for(int i = a; i <= b; i++){
            Double square = Math.sqrt(i);
        	System.out.println("i: "+ i + " square: "+square);
            if(square%1 == 0){
        	System.out.println("i: "+ i + " square: "+square);
                return square.intValue();
            }
        }
        return 0;
    }

}
