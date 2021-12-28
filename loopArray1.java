package selfProgramming;
import java.util.Scanner;
public class loopArray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		double [] sales = new double [10];
		for (int index=0; index<sales.length; index++) {
			sales[index]=input.nextDouble();
		}
		System.out.println("The data value you enter as below :");
		for (int i=0; i<sales.length; i++)
		System.out.println((i+1)+". "+sales[i]);
	}

}
