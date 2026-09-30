package tasks2;

public class elseifcondition {

	public static void main(String[] args) {
	 int marks=70;
	 {
		 if(marks<100 && marks>=90)
		 {
			 System.out.println("Grade A");
		 }
		 else if(marks<90 && marks>=80)
		 {
			 System.out.println("Grade B"); 
		 }
		 else if(marks<80 && marks>=70)
		 {
			 System.out.println("Grade B");
		 }
		 else if(marks<70 && marks>=60)
		 {

			 System.out.println("Grade C");
		 }
		 else
		 {

			 System.out.println("Fail");
		 }

	 }

	}

}
