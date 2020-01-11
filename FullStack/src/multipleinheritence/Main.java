package multipleinheritence;
/*How to know whenn to use abstract class and when interface ? Smort quezen
 * when the relationship between entities is "is a" relationship then use interface
 * when the relationship between entities is "can be" relationship then use abstraction*/
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person ishaan = new Vegan();
		ishaan.speak();
		ishaan.eat();
		System.out.println();
		Person shivali = new NonVegan();
		shivali.speak();
		shivali.eat();
		System.out.println("That's how you implement multiple inheritance nibbas");
		ishaan.breathe();
		ishaan.message();
		System.out.println();
		shivali.breathe();
		shivali.message();

	}

}
