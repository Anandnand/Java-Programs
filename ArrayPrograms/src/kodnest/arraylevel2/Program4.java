package kodnest.arraylevel2;
import java.util.Scanner;
public class Program4 {
	
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the length of the array");
			int []arr=new int[sc.nextInt()];	
			
			for(int i=0;i<arr.length;i++) {
				System.out.println("enter the "+i+" integers");
				arr[i]=sc.nextInt();
			}
			
			System.out.println("Array contents are");
			
			for (int x : arr) {
				System.out.println(x);
				
			}
			
			System.out.println("=======================================================");
			
			System.out.println("enter the index to be swapped");
			int m=sc.nextInt();
			int n=sc.nextInt();
	       
			int temp=arr[m];
	        arr[m]=arr[n];
	        arr[n]=temp;
	        
	       for (int a : arr) {
	    	   System.out.print(a +" ");
			
		}
			
		
		}
}
