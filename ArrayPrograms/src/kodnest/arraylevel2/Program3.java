package kodnest.arraylevel2;

import java.util.Scanner;

public class Program3 {
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
			if(x>=0) {
				System.out.println("The positive elements are"+x);
				
			}
			
		}
	}

}
