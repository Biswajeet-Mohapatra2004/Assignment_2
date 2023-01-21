import java.util.Scanner;
/*the distance between two city's in km is input through the keyboard . write a java program to convert and 
 * print this distance in meters, feet , inches , and centimeters
 */
public class Question2 {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the distance in KM: ");
		int dist = sc.nextInt();
		
		//conversions
		int meter = dist*1000;
		double feet = dist*3280.8339;
		double inch=dist*39370.0787;
		int cm = dist*100000;
		
		System.out.println(dist+" KM is "+meter+" meters");
		System.out.println(dist+" KM is "+feet+" feet");
		System.out.println(dist+" KM is "+inch+" inch");
		System.out.println(dist+" KM is "+cm+" centimeter");

	}

}
