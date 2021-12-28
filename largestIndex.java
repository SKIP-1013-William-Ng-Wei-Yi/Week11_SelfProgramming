package selfProgramming;
import java.util.Scanner;
public class largestIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double[] sales = new double[10];
		int index, maxIndex;
		double largestSale;
		Scanner sc = new Scanner (System.in);
		
		maxIndex = 0;
		System.out.println("Enter the index value as below :");
		for(int i=0; i<sales.length; i++) {
			System.out.print((i+1)+". ");
			sales[i]=sc.nextDouble();
		}
		for(index = 1; index<sales.length;index++)
			if (sales[maxIndex] < sales[index])
				maxIndex = index;
		largestSale = sales[maxIndex];
		System.out.println("The largest index : "+ largestSale);
	}

}
