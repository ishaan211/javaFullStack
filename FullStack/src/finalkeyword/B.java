package finalkeyword;
//final variable doesn't aalow reassignment of its value

public class B extends A{
	private final int x;// = 5;

	public B(int x) {
		super();
		this.x = x;
	}

	/*public B() {
		super();
	}*/

	public int getX() {
		return x;
	}

	/*public void setX(int x) {
		this.x = x;
	}*/
	

}
