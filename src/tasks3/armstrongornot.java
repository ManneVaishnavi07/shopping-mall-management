package tasks3;

public class armstrongornot {
	    public static void main(String[] args) {
	    	int n=407;
	    	int temp = n;
	        int sum = 0;

	        while (n > 0) {
	            int r = n % 10;
	            sum = sum + (r * r * r);
	            n = n / 10;
	        }

	        if (sum == temp)
	            System.out.println("Armstrong");
	        else
	            System.out.println("Not Armstrong");
	    }
	}


