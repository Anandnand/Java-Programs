
public class Operator {
	public static void main(String[] args) {
		int res=subtractNumber(20,5);
		int res1=multiplyNumber(4,5); 
		double res2=divisionNumber(22,7);
		int res3=findNumber(10,3);
		
		System.out.println(res);
		System.out.println(res1);
		System.out.printf("%.2f\n",res2);
		System.out.println(res3);
		
		
	}
	
	public static int subtractNumber(int num1,int num2) {
		return num1-num2;
		
	}
	public static int multiplyNumber(int num1,int num2) {
		return num1*num2;
		
	}
	public static double divisionNumber(int num1,int num2) {
		return num1/num2;
	   
	}
	public static int findNumber(int num1,int num2) {
		return num1%num2;
}
}