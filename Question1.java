import java.util.Scanner;
public class Question1 {

	public static void main(String[] args) 
	{
		// write a java program that reads a fahrenheit degree in a double value from the console , the 
		// convert it into celsius and displays the result.
		
		// scanner instance
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the temperature in farenheit: ");
		int temp_f = sc.nextInt();
		
		double temp_c = (5.0/9) * (temp_f-32);
		System.out.println("the temperature in degree celsius is = "+temp_c);
		
		
		
		

	}

}
