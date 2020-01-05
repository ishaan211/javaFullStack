package comparableinterfacegeneric;

class Data<T extends Comparable> implements Comparable<T>{
	private T var;
	
	public Data(T var) {
		this.var = var;
	}

	public T getVar() {
		return var;
	}

	@Override
	public String toString() {
		return "Data [var=" + var + "]";
	}

	@Override
	public int compareTo(T arg0) {
		// TODO Auto-generated method stub
		
		return getVar().compareTo(arg0);
	}
	
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data<Integer> d = new Data<>(1); //part 1
		System.out.println(d.compareTo(1)); //part 2

	}

}
