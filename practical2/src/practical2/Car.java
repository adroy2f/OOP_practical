package practical2;

public class Car {
	Integer modelNo;
	String brand;
	String modelName;
	
	void moveForward()
	{
		System.out.println("Moving forward...");
	}
	
	void moveBackward()
	{
		System.out.println("Taking reverse...");
	}
	
	void start()
	{
		System.out.println("Engine started");
	}
	void stop()
	{
		System.out.println("Breaks applied"); 
	}
	void turnRight()
	{
		System.out.println("Turning Right");
	}
	void turnLeft()
	{
		System.out.println("Turninging left");
	}
	void speedup()
	{
		System.out.println("accelerating");
	}
	void speeddown()
	{
		System.out.println("slowing down");
	}
}
