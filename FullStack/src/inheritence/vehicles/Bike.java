package inheritence.vehicles;

import inheritence.parent.Vehicle;

public class Bike extends Vehicle{
	
	private String handle;
	
	public Bike() {
		super();  //it is actually call to the default constructor of parent class...hover on it to see the path
		this.handle = "short";
	}

	public Bike(String handle,String engine, int wheels, int seats, int fuelTank, String lights) {
		super(engine,wheels,seats,fuelTank,lights);
		this.handle = handle;
	}

	public String getHandle() {
		return handle;
	}

	@Override
	public String toString() {  //ye use hota h multiple stmts ko ek saath print krvaane k liye
		return "Bike [getHandle()=" + getHandle() + ", getEngine()=" + getEngine() + ", getWheels()=" + getWheels()
				+ ", getSeats()=" + getSeats() + ", getFuelTank()=" + getFuelTank() + ", getLights()=" + getLights()
				+ "]";
	}
	
	public void run() {
		System.out.println("Running bike");
		System.out.println(toString());
	}

}
