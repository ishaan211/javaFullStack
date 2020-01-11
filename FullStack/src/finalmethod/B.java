package finalmethod;
//final variable doesn't allow reassignment of its value

public class B extends A{
	private final int x = 1;// = 5;

	/*public B(int x) {
		super();
		this.x = x;
	}*/

	public B() {
		super();
	}

	public int getX() {
		return x;
	}

	/*public void setX(int x) {
	this.x = x;
	}*/

	
	public void india() {
		// TODO Auto-generated method stub
		System.out.println("Namaste");
	}
	

}
