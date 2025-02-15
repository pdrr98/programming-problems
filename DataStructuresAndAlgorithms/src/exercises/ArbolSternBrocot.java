package exercises;

public class ArbolSternBrocot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Stern-Brocot tree generates all the positive rational numbers
		/*
		 * The first level of the tree has only one element: 1/1
		 * the second level has two fractions 1/2 and 2/1
		 * Every down level doubles the numbers of fractions from the previous one
		 * Every fractions of the tree appear in the reduced form.
		 * No rational numbers in the tree are repeated
		 * 
		 * Steps:
		 * 1.- Place 1/1 at the top of the tree
		 * 2.- For each vertex n/m draw two vertex
		 * 3.- The left daughter n/m+n
		 * 4.- The right daughter m+n/m
		 * 
		 * Generate an algorithm that computes all the vertex to a given level and print it.
		 */
		
		int n = 1;
		int m = 1;
		
		int index = 1;
		int level = 5;
		StringBuffer sb = new StringBuffer();
//		sb.append(n+"/"+m+"\n");
//		sb.append(n+"/"+m +" "+sb+"\n");
		//left = 
		while(index<=level) {
			sb.append(n+"/"+m+"\n");
			System.out.println(sb);
		}
	}

}
