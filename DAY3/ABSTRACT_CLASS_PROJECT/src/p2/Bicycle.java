package p2;

public class Bicycle extends Vehicle{

	public void start()
	{
		System.out.println("By pedalling.........");
	}
	public void stop()
	{
		System.out.println("By applying brakes.........");
	}
	public static void main(String[] args) {
		
		Vehicle v = new Bicycle();
		v.start();
		v.stop();
	}

}
