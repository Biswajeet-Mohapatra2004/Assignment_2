import java.util.Scanner;
public class TempProg2 {

	public static void main(String[] args) {
         		
           Scanner sc = new Scanner(System.in);
           
           System.out.println("Enter the Number of eggs: ");
           int eggs = sc.nextInt();
           
           int gross = eggs/144;
           
           int egg_remain=eggs-gross*144;
           
           int dozen = egg_remain/12;
           
           int egg_left=egg_remain-(dozen*12);
           System.out.println("Your number of eggs is "+gross+" , "+dozen+" dozens and "+egg_left);
	}

}
