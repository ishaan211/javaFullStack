package genericmethod;

import java.util.ArrayList;
import java.util.List;

class Data{
	public <E> void printList(List<E> list) {
		for(E element: list) {
			System.out.println(element);
		}
	}
	public <E> void printArray(E[] arr) {
		for(E element: arr) {
			System.out.println(element);
		}
	}
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(12);
		list.add(15);
		list.add(11);
		list.add(71);
		Data d = new Data();
		//System.out.println();
		System.out.println("Printing integer list");
		d.printList(list);
		
		List<String> list2 = new ArrayList<>();
		list2.add("one");
		list2.add("two");
		list2.add("three");
		list2.add("four");
		list2.add("five");
		System.out.println();
		System.out.println("Printing String list");
		d.printList(list2);
		
		String[] strArr = {"one", "two", "three"};
		Integer[] intArr = {1,2,3};
		System.out.println();
		System.out.println("Printing String array");
		d.printArray(strArr);
		System.out.println();
		System.out.println("Printing integer array");
		d.printArray(intArr);
	}

}
