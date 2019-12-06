package p2;

import p1.Base;

public class Derived extends Base {
	//inherited methods
	//setIJ(..){}
	//showIJ(){}
	
	//instance data
	protected int k;
	
	public Derived()
	{
		super();
	}
	
	//instance methods
	public void setK(int val)
	{
		//super.setIJ(10,20);
		super.i = 100;
		super.j = 200;
		this.k = val;
	}
	
	public void showK()
	{
		super.showIJ();
		System.out.println("k = "+this.k);
	}
	
}
