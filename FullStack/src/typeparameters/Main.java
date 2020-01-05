package typeparameters;
/*Name conventions are:
 * T - Type
 * E - Element
 * K - Key
 * N - Number
 * V - Value*/

class Data<K,V>{
	private K key;
	private V value;
	
	public Data(K key, V value) {
	//	super();
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
	public <E,N> void disp(E element, N number) {
		System.out.println("Element: "+element+" Number: "+number);
	}
	
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data<Integer, String> d = new Data<>(1,"Ishaan");
		System.out.println("Key: "+d.getKey()+" Value: "+d.getValue());
		d.disp("Ishaan", 02);
	}

}
