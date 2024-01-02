package kodnest.arraylevel3;

public class Search {
	 boolean isPresent(int arr[],int target) {
		for(int i=0;i<arr.length;i++) {
		if(arr[i]==target) {
			return true;
		}
		}
		return false;
	}
}


