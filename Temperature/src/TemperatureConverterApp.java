import java.util.Scanner;
public class TemperatureConverterApp {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double f=sc.nextDouble();
		TemperatureConverter temperatureConverter=new TemperatureConverter();
		System.out.printf("%.2f\n",temperatureConverter.convertFahrenheitToCelsius(f));
		
		
	}

}
