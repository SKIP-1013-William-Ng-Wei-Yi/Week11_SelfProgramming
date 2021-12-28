package class1;
import java.util.Scanner;
public class array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name0, name1, name2, name3, name4;
		String [] name = new String[5]; // do the code
		
		int [][] sales = new int[3][3];
		
		int item0, item1, item2, item3, item4;
		int[] item = new int [5];
	    int sum;
	    sum = 0;
	    Scanner input = new Scanner(System.in);
	
	    for(int p=0; p<name.length; p++) {
	    System.out.print("Please Enter the "+(p+1)+". reverse name :  ");
	    name[p]=input.next();
	    }
	    System.out.println("The costomer reverse name as below : ");
	    for(int x=0; x<name.length; x++ ) {
	 	 System.out.println((x+1)+". "+name[x]);
	    }
	    System.out.println("Enter Value for sales ");
	    for (int k=0; k<sales.length; k++) 
			   for(int y=0; y<sales.length; y++) {
				  sales[k][y] = input.nextInt();
			   }
	    
	    
	   for (int k=0; k<sales.length; k++) 
		   for(int y=0; y<sales.length; y++)
	   {
		   System.out.println("k = "+k+" y = "+y);
		   System.out.println("Value of sales is "+sales[k][y]);
	   }
	    
	    for(int j=0; j<item.length; j++ ) {
	    	System.out.println("Enter index No."+j);
	     item[j]=input.nextInt();
	     sum=sum+item[j];
	    }
	    
	    for(int i=0; i<item.length; i++) {
	    	System.out.println("Item Idex No. "+ i +" are : "+item[i]);
	    }
	    System.out.println("Sum of the item : " +sum);
	    System.out.println("Average of the item : "+sum/item.length);
	    System.out.println("\nEnter Five customer name :");
	    
	    //new
	    name0 = input.next();
	    name1 = input.next();
	    name2 = input.next();
	    name3 = input.next();
	    name4 = input.next();
	    
	    System.out.println("Customer name reverse order : ");
	    System.out.println("1. "+name0);
	    System.out.println("2. "+name1);
	    System.out.println("3. "+name2);
	    System.out.println("4. "+name3);
	    System.out.println("5. "+name4);
	    System.out.println("Enter five integers one number per line");
	        
	    item0 = input.nextInt();
	    item1 = input.nextInt();     
	         item2 = input.nextInt();
	    item3 = input.nextInt();
	    item4 = input.nextInt();
	        
	    sum = item0 + item1 + item2 + item3 + item4;
	        
	    System.out.println("The sum of the numbers = " + sum);
	    System.out.println("The numbers in reverse order are: ");
	    System.out.println(item4 + " " + item3 + " " + item2 + " " + item1 + " " + item0);
		
	}

}
