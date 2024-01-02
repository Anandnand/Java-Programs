package kodnest.arraylevel3;

import java.util.Iterator;
import java.util.Scanner;

public class Program8 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array 1 length ");
		int arr1[]=new int[sc.nextInt()];
		System.out.println("The array  ");
		for(int i=0;i<arr1.length;i++) {
			arr1[i]=sc.nextInt();
			}
			    
		int arr2[]=new int[arr1.length];
		for(int i=0;i<arr1.length;i++) {
			arr2[i]=arr1[i];
			}
		
		System.out.println("the array 1 contents are ");
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]+" ");
		}
        System.out.println();
        
		System.out.println("the array 2 contents are ");
		for(int i=0;i<arr2.length;i++) {
			System.out.print(arr2[i]+" ");
			}


	}

}
