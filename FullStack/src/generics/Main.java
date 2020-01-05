package generics;

class Data{
	private Object obj;

	public Data(Object obj) {
		//super();
		this.obj = obj;
	}

	public Object getObj() {
		return obj;
	}

	@Override
	public String toString() {
		return "Data [obj=" + obj + "]";
	}
	
	
}

class Generic<T>{
	private T data; //it means abhi hume type pta nhi h, the object can be of any type

	public Generic(T data) {
		//super();
		this.data = data;
	}

	public T getData() {
		return data;
	}

	@Override
	public String toString() {
		return "Generic [data=" + data + "]";
	}
	
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Data d = new Data("Some String");
		String var = (String) d.getObj();// here casting is important coz we need to convert object type to string type
		System.out.println(var);*/
		
		Generic<String> g = new Generic<>("Some data"); 
		//so agar hum yahan diamond k andar string likh dete h to hume type casting ki zrurat nhi padegi
		//iska 2nd faaeda h type safety, agar hum usme string ki jagah int pass krenge to error aaega 
		String d = g.getData();
		System.out.println(d);

	}

}
