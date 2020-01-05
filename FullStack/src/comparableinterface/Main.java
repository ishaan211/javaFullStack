package comparableinterface;
//for sorting of custom objects

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

class Names implements Comparable<Names>{
	private String name; //this will already be avaliable to us (x)

	public Names(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Names arg0) { //Names is basically jiske saath hume name ko compare krna h (y)
		// TODO Auto-generated method stub
		if(name.length() == arg0.name.length()) {
			return 0;
		}else if(name.length() < arg0.name.length()) {
			return -1;
		}else {
			return 1;
		}
	}

	@Override
	public String toString() {
		return name;
	}
	
	
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String x = "a";
		String y = "b";
		x.compareTo(y);*/
		List<Object> element = new LinkedList<>(); //an object type can contain anything in java
		element.add(new Names("Ishaan"));
		element.add(new Names("Steve"));
		element.add(new Names("Richard"));
		element.add(new Names("Gilfoyle"));
		element.add(new Names("Dunn"));
		element.add("String");
		element.add("a");
		element.add("#");
		element.add(2.4f);
		element.add(7);

		Main m = new Main();
		m.printList(element);
		
		//Collections.sort(element); //to sort data should be of same dt, so sorting won't work here
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!");
		m.printList(element); //basec on the length sorting will be done, to change the order replace -1 with 1 n viceversa

	}
	void printList(List<Object> list) {
		ListIterator<Object> itr = list.listIterator();
		while(itr.hasNext()) {
			System.out.println("Element: "+itr.next());
		}
	}

}
