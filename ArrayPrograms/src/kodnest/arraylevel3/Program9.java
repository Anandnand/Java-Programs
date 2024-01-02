package kodnest.arraylevel3;

import java.util.Scanner;

public class Program9 {
	public static int sum(int arr[]) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
			}
	 return sum;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array length");
		int arr[]=new int[sc.nextInt()];
		System.out.println("enter the array elements");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}
		int res=sum(arr);
		System.out.println("the sum of the array elements is "+res);
		
		
	}

}
