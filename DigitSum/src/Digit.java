
public class Digit {
	public int digitSum(int n) {
		int sum=0;
		while(n!=0){
			int rem=n%10;
			sum=sum+rem;
			n/=10;
		}
		return sum;
	}

}
