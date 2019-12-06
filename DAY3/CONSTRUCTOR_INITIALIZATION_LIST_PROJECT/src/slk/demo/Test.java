package slk.demo;

class Base
{
	protected int i,j;
	Base(int v1,int v2)
	{
		this.i = v1;
		this.j = v2;
	}
}

class Derived extends Base
{
	/*
	 * 	protected int i,j;

	 */
	//instance data
	protected int k,l;
	Derived(int a,int b,int c,int d)
	{
		super(a,b);//constructor initialization list
		this.k = c;
		this.l = d;
	}

}

class NewDerived extends Derived
{
	/*
	 * 	 	protected int i,j;
	 * //instance data
	protected int k,l;

	 */
	
	//instance data
	protected int m;
	NewDerived(int v1,int v2,int v3,int v4,int v5)
	{
		super(v1,v2,v3,v4);//constructor initialization list
		this.m = v5;
	}
}

public class Test {

	public static void main(String[] args) {
		NewDerived myobj = new NewDerived(11,12,13,14,15);
		System.out.println(myobj.i+" "+myobj.j);
		System.out.println(myobj.k+" "+myobj.l);
		System.out.println(myobj.m);


	}

}
