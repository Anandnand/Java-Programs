package kodnest.arraylevel1;

import java.util.Scanner;

public class Program1 {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the length of the array");
			int arr[]=new int[sc.nextInt()];
			
			for(int i=0;i<arr.length;i++) {
				System.out.println("Enter the "+i+" integers");
				arr[i]=sc.nextInt();
			}
			
			System.out.println("Array contents are");
			    
			    for (int a : arr) {
				a+=5;
				System.out.print(a+" ");
				
			}
			
		}

	}


