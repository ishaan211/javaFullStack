package interfaces;
//interface provide complete abstraction...abstraction means where we only show declaration part
//implementation part is done somewhere else

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	Honor h = new Honor();
		int processor = h.processor();
		System.out.println(processor);
*/
		Phone p = new OnePlus();  //polymorphism is occuring here
		Phone p1 = new Honor();
		System.out.println(p.processor());
		System.out.println(p1.processor());
	}

}
