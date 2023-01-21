import java.util.Scanner;
public class Question4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number of integer type between 0 and 1000: ");
		int user_entry=sc.nextInt();
		
		 int sum=0;
		 int t= user_entry;
		 sum=user_entry%10;
		 user_entry=user_entry/10;
		 sum=sum+(user_entry%10);
         user_entry=user_entry/10;
         sum=sum+(user_entry%10);
         
         System.out.println("The sum of the the digits of "+t+" is = "+sum);
	}

}
