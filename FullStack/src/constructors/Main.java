package constructors;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new Car("closed","on","seated",10);
		//c.setSpeed(10);
		//System.out.println(c.getSpeed());
		/*c.setDoors("closed");
		c.setDriver("seated");
		c.setEngine("on");
		c.setSpeed(10);*/
		System.out.println(c.run());
	}

}
