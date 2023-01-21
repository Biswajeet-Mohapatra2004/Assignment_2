import java.util.Scanner;
// write a java program to take the user input in terms of salary and find the da hra and gross salary
// da is 40% and hra is 20% of Basic salary
public class Question3 {

	public static void main(String[] args) 
	{
		// scanner instance or object'
		Scanner sc = new Scanner(System.in);
		
		// user input
		System.out.print("Enter the basic salary of the employee: ");
		double sal=sc.nextDouble();
		
		double da=0.4*sal;
		double hra=0.2*sal;
		int gross = (int)(da+hra+sal);
		
		System.out.println("DA = "+da);
		System.out.println("HRA "+hra);
		System.out.println("gross Salary "+gross);

	}

}
