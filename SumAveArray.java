package selfProgramming;
import java.util.Scanner;
public class SumAveArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double [] sales = new double[10];
		int index;
		double sum, average;
		
		Scanner sc = new Scanner (System.in);
		sum=0;
		
		for (index=0; index<sales.length; index++) {
			System.out.print("Enter the "+(index+1)+". value :");
			sales[index] = sc.nextDouble();
			sum = sum + sales[index];
		}
		
		System.out.println("Sum of the index value : "+ sum);
		
		if (sales.length != 0) {
		    average = sum / sales.length;
		System.out.println("Average of the index value : "+average);
		}
		else
		    average = 0.0;

	}

}
