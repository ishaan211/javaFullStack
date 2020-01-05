package genericsadv;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

class Data<T>{
	private T var;

	public Data(T var) {
		//super();
		this.var = var;
	}

	public T getVar() {
		return var;
	}

	@Override
	public String toString() {
		return "Data [var=" + var + "]";
	}
	
	
}

public class MainAdv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Data<Object>> element = new LinkedList<>(); //an object type can contain anything in java
		element.add(new Data<Object>("Ishaan"));
		element.add(new Data<Object>(1.0));
		element.add(new Data<Object>(65.7f));
		element.add(new Data<Object>("#"));
		element.add(new Data<Object>(2));

		MainAdv m = new MainAdv();
		m.printList(element);

	}
	void printList(List<Data<Object>> list) {
		ListIterator<Data<Object>> itr = list.listIterator();
		while(itr.hasNext()) {
			System.out.println("Element: "+itr.next());
		}
	}

}
