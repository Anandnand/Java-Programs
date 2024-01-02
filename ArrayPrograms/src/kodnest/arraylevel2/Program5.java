package kodnest.arraylevel2;
import java.util.Scanner;
public class Program5{
	
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the length of the array");
			int []arr=new int[sc.nextInt()];	
			
			for(int i=0;i<arr.length;i++) {
				System.out.println("enter the "+i+" integers");
				arr[i]=sc.nextInt();
			}
			System.out.println("=======================================================");
			
			System.out.println("Array contents are in forward manner");
			
			for (int x : arr) {
				System.out.print(x+" ");	
			}
			System.out.println("=======================================================");
			
			System.out.println("Array contents in reverse manner ");
			
			for (int i=arr.length;i>=0;i--) {
				System.out.print(arr[i]+" ");
				
			}
		}
		
}