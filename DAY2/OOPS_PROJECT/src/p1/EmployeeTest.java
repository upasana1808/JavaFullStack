package p1;

public class EmployeeTest {

	public static void main(String[] args) {

		//create employee object first
		
		Employee e1 = new Employee(101,"Kavya",8797.87);
		
		e1.showAllDetails();
		
		System.out.println(Employee.getCompanyName());
	}

}
