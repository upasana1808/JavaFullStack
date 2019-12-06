package p2;

public class Car extends Vehicle{

	public void start()
	{
		System.out.println("By turning ON the ignition key.......");
	}
	public void stop()
	{
		System.out.println("By turning OFF the ignition key.......");

	}
	
	public static void main(String[] args) {

		Vehicle v = new Car();
		v.start();
		v.stop();
	}

}
