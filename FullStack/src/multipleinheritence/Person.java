package multipleinheritence;

public abstract class Person implements IsAlive, LiveLife{
	
	public void speak() {
		System.out.println("Bolo");
	}
	
	public void breathe() {
		System.out.println("Zinda rehne k liye saans to chaiye hoga na");
	}
	
	public void message() {
		System.out.println("M mc hu jo Java kia");
	}
	
	public abstract void eat();
	//ab dekho bnda vegan bhi ho skta h and non-vegan bhi so which ever class inherits this method need to specify 
	//this by themselves

}
