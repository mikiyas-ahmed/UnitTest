package unitTesting;
import java.util.Scanner;

public class QuadraticEquastionCalculator {

	public void calculate(Double a,Double b,Double c) {
		
		if (a == 0)   
		{  
		System.out.println("The value of a cannot be 0.");  
		return;  
		}  
		Double r1,r2;
		Scanner input= new Scanner(System.in);
		Double condition= (b*b)-(4.0*a*c);
		if(condition==0) {
			r1=(-b)/2.0*a;
			System.out.println("The have only on root and the root is " + r1);  
		}
		else if(condition>0) {
			 r1 = (-b + Math.pow(condition, 0.5)) / (2.0 * a);  
			 r2 = (-b - Math.pow(condition, 0.5)) / (2.0 * a); 
			 System.out.println("The roots are " + r1 + " and " + r2);  
		}
		else {
			System.out.println("Roots are not real.");  
		}
	}

}

