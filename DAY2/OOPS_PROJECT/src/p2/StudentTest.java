package p2;

public class StudentTest {

	public static void main(String[] args) {

		Student kbv = new Student(2793,"Kavya B V",100);
		Student kav = new Student(2853,"Kavitha",50);
		
		kbv.showGrade();
		kav.showGrade();
		
		System.out.println("-----------------------------------");
		System.out.println(Student.getSubject());
	}

}


