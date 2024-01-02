package kodnest.arralevel4;

public class Sum {
	public int[] printSum(int arr1[],int arr2[]) {
		int res[]=new int[arr1.length];
		
		for(int i=0;i<res.length;i++) {
			res[i]=arr1[i]+arr2[i];
		}
		return res;
	}

}
