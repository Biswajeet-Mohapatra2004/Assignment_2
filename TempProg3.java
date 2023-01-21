import java.util.Scanner;
public class TempProg3 {

	public static void main(String[] args)
	{
		//program to find the area of the triangle
		
		Scanner ref = new Scanner(System.in);
		double x1,x2,x3,y1,y2,y3;
		System.out.print("enter the Value of x1:");
		x1=ref.nextDouble();
		System.out.print("enter the Value of y1:");
		y1=ref.nextDouble();
		
		System.out.print("enter the Value of x2:");
		x2=ref.nextDouble();
		System.out.print("enter the Value of y2:");
		y2=ref.nextDouble();
		
		System.out.print("enter the Value of x3:");
		x3=ref.nextDouble();
		System.out.print("enter the Value of y3:");
		y3=ref.nextDouble();
		
		double side1,side2,side3;
		side1=((x2-x1)*(x2-x1)) + ((y2-y1)*(y2-y1));
	    double tside_1=Math.sqrt(side1);
	    
	    side2=((x3-x2)*(x3-x2)) + ((y3-y2)*(y3-y2));
	    double tside_2=Math.sqrt(side2);
	    
	    side3=((x3-x1)*(x3-x1)) + ((y3-y1)*(y3-y1));
	    double tside_3=Math.sqrt(side3);
	    
	    double side=(tside_1+tside_2+tside_3)/2;
	    double area = Math.sqrt(side*((side-tside_1)*(side-tside_2)*(side-tside_3)));		
	    
	    System.out.print("the area of the triangle is = "+area);

	}

}
