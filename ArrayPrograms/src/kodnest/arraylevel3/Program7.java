package kodnest.arraylevel3;

import java.util.Scanner;

public class Program7 {
	public static int arraySum(int arr3[] ) {
	  int sum=0;
	  for(int i=0;i<arr3.length;i++) {
		  sum=sum+arr3[i];
	  }
	  return sum;
	}

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	
	System.out.println("Enter the array 1 length ");
	int arr1[]=new int[sc.nextInt()];
	System.out.println("Enter the  array 1  ");
	for(int i=0;i<arr1.length;i++) {
		arr1[i]=sc.nextInt();
		}
	System.out.println("Enter the array 2 length");
	int arr2[]=new int[sc.nextInt()];
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
     
      System.out.println("==========================================================================================");
      
      int arr3length=arr1.length+arr2.length;
      int arr3[]=new int[arr3length];
      
      for(int i=0;i<arr1.length;i++) {
  		  arr3[i]=arr1[i];
  		}      
      for(int i=0;i<arr2.length;i++) {
  		  arr3[arr1.length+i]=arr2[i];
  		}      
    
      System.out.println("the array 3 contents are");
      for(int i=0;i<arr3length;i++) {   	  
    	System.out.print(arr3[i]+" ");
    	}   
      System.out.println();
      System.out.println("The sum of two arrays is");
     int res=arraySum(arr3);
    System.out.println(res);
      
	}
}
