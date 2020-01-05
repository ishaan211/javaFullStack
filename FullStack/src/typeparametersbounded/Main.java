package typeparametersbounded;

class Data<K extends Integer,V extends Main>{
	private K key;
	private V value;
	
	public Data(K key, V value) {
		//super();
		this.key = key;
		this.value = value;
	}
	public K getKey() {
		return key;
	}
	public V getValue() {
		return value;
	}
	@Override
	public String toString() {
		return "Data [key=" + key + ", value=" + value + "]";
	}
	public <E extends Character, N extends Number> void disp(E element, N number) { //extends number likh dene se sirf integer value hi aaegi, this would act as a restriction
		System.out.println("Element: "+element+" Number: "+number);
	}
	
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data<Integer, Main> d = new Data<>(1, new Main());
		d.disp('$',23);
		d.getValue().test();
		System.out.println(d.getKey());
	}
	public void test() {
		System.out.println("Testing.....");
	}

}
