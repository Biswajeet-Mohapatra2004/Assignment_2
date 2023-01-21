import java.util.Scanner;
public class TempProg1 {

	public static void main(String[] args) {
		// write a java program to take credentials from a user and display those data on the screen;
		
		// creating a instance to the scanner class
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name=sc.next();
		
		System.out.print("Enter your regd no: ");
		long regdno=sc.nextLong();
		
		System.out.println("Name:- "+name);
		System.out.println("RegdNo:- "+regdno);

	}

}
