package listinterface;
//During fast access ArrayList is best
//During fast operations LinkedList is best

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

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
		
		ArrayList<String> obj = new ArrayList<String>();
		obj.add("One");
		obj.add("Two");
		obj.add("Three");
		obj.add("Four");
		obj.add("Five");
		new Main().printList(obj);

	}

	void printList(List<String> list) { //since yahan pe hum list use krr rhe h it supports all kinda lists
		// TODO Auto-generated method stub
		for(String element: list) {
			System.out.println("Element: "+element);
		}
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		
	}

}
