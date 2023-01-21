import java.util.Scanner;
public class Question6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final double g=32.174;
		System.out.print("Enter the number of seconds: ");
		double sec=sc.nextDouble();
		
		double dist= (1.0/2)*g*Math.pow(sec, 2);
		System.out.print("The distance travelled: "+dist);

	}

}
