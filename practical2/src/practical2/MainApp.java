package practical2;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 =new Car();
		c1.brand="porsche";
		c1.modelName="911 turbo";
		
		c1.start();
		c1.moveForward();
		c1.speedup();
		c1.speeddown();
		c1.turnLeft();
		c1.moveForward();
		c1.stop();
		c1.moveBackward();
		c1.turnRight();
		c1.moveForward();
		c1.speedup();
		c1.speeddown();
		c1.stop();
		
		Car c2 =new Car();
		c1.brand="Mustang";
		c1.modelName="gt";
		/*Phone p1=new Phone();
		p1.brand="Samsung";
		p1.model="Glaxy M32";
		p1.ram=4;
		p1.storage=128;
		p1.rating=4.7;
		p1.displayDetails();
		Phone p2=new Phone();
		p2.rating=3.5;
		p2.showRatings();
		*/
	}

}
