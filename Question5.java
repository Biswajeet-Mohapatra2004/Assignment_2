import java.util.Scanner;
public class Question5 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the radius of the hemisphere: ");
		double radius = sc.nextDouble();
		
		// for surface area of the hemisphere:
		double s_area=3*Math.PI*Math.pow(radius, 2);
		// for volume area of the hemisphere: 
		double vol_area=(2.0/3)*Math.PI*Math.pow(radius, 3);
		
		System.out.println("The surface area of the hemisphere: "+s_area);
		System.out.println("The volume area of the hemisphere: "+vol_area);
		

	}

}
