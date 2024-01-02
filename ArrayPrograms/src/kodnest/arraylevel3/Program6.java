package kodnest.arraylevel3;

import java.util.Scanner;

public class Program6 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array length");
		int arr[]=new int[sc.nextInt()];
		System.out.println(" the numbers are");
		for(int i=0;i<arr.length;i++) {
		 arr[i]=sc.nextInt();
		}
		
//		System.out.println("Array contents are");
//		for (int x : arr) {
//			System.out.println(arr[x]+" ");
//	}	
		
		System.out.println("Enter the target number");
		int target =sc.nextInt();
		Search search=new Search();
		boolean res=search.isPresent(arr,target);
		if(res==true) {
			System.out.println("The value is avalaible in the array");
		}else {
			System.out.println("The value is not avalaible in the array");
		}
		
	}

}
