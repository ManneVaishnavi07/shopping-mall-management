package tasks1;

public class operators {

	public static void main(String[] args) {
		
		        int a = 10;
		        int b = 3;

		        // 1. Arithmetic Operators
		        System.out.println("Arithmetic Operators:");
		        System.out.println("a + b = " + (a + b));
		        System.out.println("a - b = " + (a - b));
		        System.out.println("a * b = " + (a * b));
		        System.out.println("a / b = " + (a / b));
		        System.out.println("a % b = " + (a % b));

		        // 2. Relational Operators
		        System.out.println("\nRelational Operators:");
		        System.out.println("a > b  = " + (a > b));
		        System.out.println("a < b  = " + (a < b));
		        System.out.println("a >= b = " + (a >= b));
		        System.out.println("a <= b = " + (a <= b));
		        System.out.println("a == b = " + (a == b));
		        System.out.println("a != b = " + (a != b));

		        // 3. Logical Operators
		        System.out.println("\nLogical Operators:");
		        System.out.println("(a > 5 && b < 5) = " + (a > 5 && b < 5));
		        System.out.println("(a > 5 || b > 5) = " + (a > 5 || b > 5));
		        System.out.println("!(a > 5) = " + !(a > 5));

		        // 4. Assignment Operators
		        System.out.println("\nAssignment Operators:");
		        int c = 10;
		        c += 5;
		        System.out.println("c += 5 : " + c);

		        c -= 3;
		        System.out.println("c -= 3 : " + c);

		        c *= 2;
		        System.out.println("c *= 2 : " + c);

		        c /= 4;
		        System.out.println("c /= 4 : " + c);

		        // 5. Unary Operators
		        System.out.println("\nUnary Operators:");
		        int x = 5;
		        System.out.println("x++ = " + x++);
		        System.out.println("++x = " + (++x));
		        System.out.println("x-- = " + x--);
		        System.out.println("--x = " + (--x));

		        // 6. Ternary Operator
		        System.out.println("\nTernary Operator:");
		        int max = (a > b) ? a : b;
		        System.out.println("Maximum = " + max);
		    
	}

}
