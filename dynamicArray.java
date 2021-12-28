package selfProgramming;
import java.util.Scanner;
public class dynamicArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// from note slide 13
		int arraySize;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the size of the array : ");
		arraySize = input.nextInt();
		
		int[] list = new int [arraySize];
		
		for(int i=0; i<list.length; i++ ) {
			System.out.print("Please enter the "+(i+1)+". int value : ");
			list[i]=input.nextInt();
		}
		input.close();
		System.out.println("The value data you enter as below");
		for(int x=0; x<list.length; x++) {
			System.out.println((x+1)+". "+list[x]);
		}
		
	}

}
