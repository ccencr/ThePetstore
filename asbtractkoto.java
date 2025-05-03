package abs;
import java.util.Scanner;
public class Abs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
int a, b, pow;
char choice;
char again;
do {
System.out.print("enter the first number");
	a = scan.nextInt();
	System.out.println("enter the second number");
	b = scan.nextInt();
	System.out.println(" A. Absolute value");
	System.out.println("B. Power ");
	System.out.println("C. Min ");
	System.out.println("D. Max ");
	System.out.println("E. Square root");
	System.out.println("F. Sum ");
	System.out.println("G. Difference ");
	System.out.println("Choose Option: ");
	choice = scan.next().charAt(0);
	
	switch (choice) { case 'A':
		
		System.out.println(" Absolute Value"  +a +  Math.abs(a) );
		System.out.println(" Absolute Value"  +b +  Math.abs(b) );
		 break;
	case 'B' :
		System.out.println("enter the power");
		pow = scan.nextInt();
		System.out.println(   " to the power of " + a + Math.pow(pow, a));
		System.out.println(  "to the power of " + b + Math.pow(pow, b));	
	break;
	case 'C':
		double c = Math.min(a, b);
		System.out.println("The minimun is " + c);
		break;
	case 'D':
		double D = Math.max(a, b);
		System.out.println("The maximum is " + D);
		break;
	case 'E':
		
		System.out.println("The Square root for the first number is  " + Math.sqrt(a));
		System.out.println("The Square root for the second number is  " + Math.sqrt(b));
		break;	
		
	case 'F':
		double  F = ( a + b);
		System.out.println(" The sum is " + F);
		break;
	case 'G' :
		double G = ( a - b);
		System.out.println("The difference " + G );
		break;
		default:
		System.out.println("wrong choice");
	}
	
	System.out.println("Try again Y/N");
	again = scan.next().charAt(0);
	
	}while (again == 'Y' );
	scan.close();
	
	
	
	
	

		
	
		
		
}
	
	
	}
	
	
	


