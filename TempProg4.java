import java.util.Scanner;
public class TempProg4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of minutes: ");
		double min = sc.nextDouble();
		
		int years = (int)(min/525960);
		double days=(int)(min/1440)%365;
		
		System.out.println(min+" minutes is equal to "+years+" years and "+days+" days.");
	}

}
