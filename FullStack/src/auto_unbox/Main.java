package auto_unbox;
/*arrayList can contain objects only but int is primitive datatype. Iske 2 sol h
1.We create a wrapper for int
2.Make use of wrapper class which is already avaliable (better sol.)*/

import java.util.ArrayList;

class intWrapper{
	public int intValue;

	public intWrapper(int intValue) {
		//super();
		this.intValue = intValue;
	}

	public int getIntValue() {
		return intValue;
	}

	public void setIntValue(int intValue) {
		this.intValue = intValue;
	}
	
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*ArrayList<Integer> stuRoll = new ArrayList<>(); 
		stuRoll.add(25); //autoboxing - boxing taking place automatically
		System.out.println(stuRoll.get(0)); // unboxing done here automatically 
		
		Ab hum uper ki 3 lines ko manually work krvaaenge
		ArrayList<intWrapper> stuRoll = new ArrayList<>(); //since we are implementing our own wrapper class here
														   //autoboxing and unboxing should also be done manually.
		stuRoll.add(new intWrapper(12)); //boxing - we are converting a primitive data into an object
		System.out.println(stuRoll.get(0).getIntValue()); //unboxing */
		
		ArrayList<Double> demoList = new ArrayList<Double>();
		//demoList.add(24.7);
		demoList.add(Double.valueOf(12.67)); //this is what is done by java when we do autoboxing
		//System.out.println(demoList.get(0));
		System.out.println(demoList.get(0).doubleValue()); //this is done by java when we do unboxing

	}

}
