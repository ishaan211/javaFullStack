package inheritence;
//when method overriding takes place then method of child class is called and not of parent class

import inheritence.vehicles.Bike;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Bike b = new Bike();
		b.handle = "short";
		b.engine = "petrol";
		System.out.println(b.engine);*/
		Bike b = new Bike("long","diesel",2,4,40,"LED");
	//	System.out.println(b.getHandle()); //calling from bike class due to getters
		//System.out.println(b.getEngine()); //calling from vehicle class due to getters
		System.out.println(b);
		b.run();
	}

}
