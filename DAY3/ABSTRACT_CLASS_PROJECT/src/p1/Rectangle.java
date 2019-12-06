package p1;

public class Rectangle extends Shape{

	//protected int len,bre;
	
	public Rectangle(int a,int b)
	{
		super(a,b);//constructor initialization list
	}//Rectangle is ready

    public int area()
    {
    	return (super.len * super.bre);
    }
	
	public int perimeter()
	{
		return (2*(super.len + super.bre));
	}
	
	public void sayHello()
	{
		System.out.println("Hello from Rectangle Class");
	}
	
	public static void main(String[] args) {

		Shape s = new Rectangle(5,2);
		System.out.println("Area = "+s.area());
		System.out.println("Perimeter = "+s.perimeter());
	}

}
