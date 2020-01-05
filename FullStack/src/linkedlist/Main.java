package linkedlist;

import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> country = new LinkedList<>();
		country.add("India");
		country.add("US");
		country.add("England");
		country.add("Poland");
		country.add("Germany");
		country.add("Russia");
		new Main().printList(country);
		country.add(1, "Czech"); //agar hume india aur us k beech koi aur country add krni h to
		new Main().printList(country);
		country.set(2, "Brazil"); //changing value at a particular index
		new Main().printList(country);
		//country.remove(); //it will remove the first element
		country.remove(3);
		new Main().printList(country); //it will remove with particular index

		//System.out.println(country);

	}
	void printList(LinkedList<String> list) {
		for(String element: list) {
			System.out.println("Element: "+element);
		}
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!");
	}

}
