
/**
 * 
 * Luis Cervantes<br>
 * 11/9/16<br>
 * This program demonstrates how methods are made without using Math class and also with
 *
 */

public class Methods {
	public static void main(String [] args) {
		
		System.out.println(String.valueOf(a (2)));	// 2 to the power of 10
		
		System.out.println(String.valueOf(b (2, 2)));	// 2 plus 2
		
		System.out.println(String.valueOf(c (9,2,2)));	// square root of 9 plus absolute value of 2 plus 2 to the power of 2
		
		System.out.println("\n");			// this is just here for ease of reading outputs
		
		System.out.println( Math.pow(3, 2) );
		System.out.println( Math.sqrt(144) );
		System.out.println( Math.abs(12) );
		System.out.println( Math.random());
		System.out.println( Math.max(10, 30) );
		System.out.println( Math.min(10, 30));
		System.out.println( Math.round(25.8) );
		System.out.println( Math.ceil(10.5) );
		System.out.println( Math.floor(10.5) );
	}
	
	// number to the power of 10
	public static double a (double x) {
		int i=0;
		double product = x;
		while (i<10) {
			product =product*x;
			i++;
		}
		return product/2;
	}
	
	// number plus another number
	public static int b (int x, int y) {
		int n = x+y;
		return n;
	}
	
	// sqrt of a number plus absolute value of number plus third number to the power of the second number
	public static double c (double x, double y, double z) {
		double t;
		 
		double squareRoot = x / 2;
	 
		do {
			t = squareRoot;
			squareRoot = (t + (x / t)) / 2;
		} while ((t - squareRoot) != 0);
			
		
		if (y < 0) {
		    y *= -1;
		}
		
		int i=0;
		double pro = z;
		while (i<y) {
			pro =pro*z;
			i++;
		}
		double total = squareRoot+y+(pro/2);
		return total;
	}
}
