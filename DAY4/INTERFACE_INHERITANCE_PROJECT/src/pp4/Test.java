package pp4;

import pp2.Derived;
import pp3.OurImpl;

public class Test {

	public static void main(String[] args) {

		Derived ref;//null
		
		ref = new OurImpl();
		
		ref.fun1();
		System.out.println("---------------------");
		ref.fun2();
		System.out.println("---------------------");
		System.out.println(Derived.COMPNAME);
		System.out.println("---------------------");
		System.out.println(Derived.lOCATION);
	}
	

}
