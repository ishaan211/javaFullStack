package iterators;
//there is no advantage of iterator over foreach loop, so better do foreach loop

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> country = new LinkedList<>();
		country.add("India");
		country.add("US");
		country.add("England");
		country.add("Poland");
		country.add("Germany");
		country.add("Russia");
		new Main().printList(country);
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!");
		country.sort(null); //sort krne k liye
		new Main().printList(country);
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!");
		Collections.reverse(country); //reverse sorting k liye
		new Main().printList(country);

	}
	/*void printList(List<String> list) {
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println("Element: "+itr.next());
		}
	}*/
	void printList(List<String> list) {
		ListIterator<String> itr = list.listIterator();
		while(itr.hasNext()) {
			System.out.println("Element: "+itr.next());
		}
	}

}
