package selfProgramming;
import java.util.Scanner;
public class twoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row;

		int col = 0;
		
		int largest;

		int matrix[][] = new int[7][6];
		
		Scanner scan = new Scanner (System.in);
		for (row = 0; row < matrix.length; row++) {
		    for (col = 0; col < matrix[row].length; col++) {
			matrix[row][col] = 10;	
		System.out.print(matrix[row][col]);
		 System.out.println("\n");
		    }
		}

		for (row = 0; row < matrix.length; row++)
			  for (col = 0; col < matrix[row].length; col++)
			   matrix[row][col] = scan.nextInt();
		for (row = 0; row < matrix.length; row++)
		{
		  largest = matrix[row][0];
		  for (col = 1; col < matrix[row].length; col++)
			if (largest < matrix[row][col])
			    largest = matrix[row][col];
		  System.out.println("The largest element of row" + (row+1)+ "=" + largest);
		}     	

	}

}
