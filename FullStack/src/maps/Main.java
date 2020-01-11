package maps;

//import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

class Code implements Comparable<Code>{
	private String k;
	private String v;
	
	public Code(String k, String v) {
		//super();
		this.k = k;
		this.v = v;
	}

	public String getK() {
		return k;
	}

	public String getV() {
		return v;
	}

	@Override
	public String toString() {
		return "Code [k=" + k + ", v=" + v + "]";
	}
	
	public int compareTo(Code arg0) {
		String code1 = k.concat(v);
		String code2 = arg0.getK()+arg0.getV();
		return code1.compareTo(code2);
	}
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Code,String> stu = new TreeMap<>(); //the order of the map isn't guranteed
		stu.put(new Code("1","3"), "Ishaan");
		stu.put(new Code("3","5"), "Wick");
		stu.put(new Code("4","7"), "James");
		stu.put(new Code("1","3"), "Bond");
		
		for(Map.Entry<Code, String> entry: stu.entrySet()) {
			System.out.println("Key: "+entry.getKey()+" Value: "+entry.getValue());
		}
		
		/*for(Integer key: stu.keySet()) {
			System.out.println("Key: "+key+" Value: "+stu.get(key));
		}*/
		System.out.println(stu.get(3));
	}

}
