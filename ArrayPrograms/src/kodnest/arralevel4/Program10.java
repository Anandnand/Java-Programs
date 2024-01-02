package kodnest.arralevel4;

import java.util.Scanner;

public class Program10 {
		public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Enter the array 1 length ");
		int arr1[]=new int[sc.nextInt()];
		System.out.println("Enter the  array 1  ");
		for(int i=0;i<arr1.length;i++) {
			arr1[i]=sc.nextInt();
			}
		
		int arr2[]=new int[arr1.length];
		System.out.println("Enter the  array 2  ");
		for(int i=0;i<arr2.length;i++) {
			arr2[i]=sc.nextInt();
			}
		
		System.out.println("=============================================================================================");
		
		System.out.println("the array 1 contents are");
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]+" ");
			}
		System.out.println();
		
		System.out.println("the array 2 contents are");
	      for(int i=0;i<arr2.length;i++) {
	    	  System.out.print(arr2[i]+" ");
			}
	     System.out.println();

	     Sum sum=new Sum();
	    int res[]=sum.printSum(arr1,arr2);
	    System.out.println("The sum of the corresponding array  elements are");
	   for (int x : res) {
		   System.out.print(x+" ");
		
	}
	    	
	    }

}
