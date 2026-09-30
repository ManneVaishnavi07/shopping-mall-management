package tasks3;

public class palindromeornot {
	    public static void main(String[] args) {

	        int n = 545;
	        int temp = n;
	        int rev = 0;

	        while (n > 0) {
	            int r = n % 10;
	            rev = rev * 10 + r;
	            n = n / 10;
	        }

	        if (rev == temp)
	            System.out.println("Palindrome");
	        else
	            System.out.println("Not Palindrome");
	    }
	}
