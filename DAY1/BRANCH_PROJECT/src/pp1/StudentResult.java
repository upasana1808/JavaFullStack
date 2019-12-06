package pp1;

public class StudentResult {

	public static void main(String[] args) {

		int sub1=33,sub2=10,sub3=9;
		
		int sum = (sub1+sub2+sub3);
		
		double avg = (double)(sum/3);
		
		if((avg > 80) && (avg<=100))
			System.out.println("Distinction");
		else if ((avg>60) && (avg<=80))
			System.out.println("First Division");
		else if ((avg>40) && (avg<=60))
			System.out.println("Second Division");
		else
			System.out.println("Failed");
	}

}
