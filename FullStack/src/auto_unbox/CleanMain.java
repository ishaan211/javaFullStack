package auto_unbox;

import java.util.ArrayList;

public class CleanMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(15);
		System.out.println(list.get(0));
		
		ArrayList<Float> flist = new ArrayList<Float>();
		flist.add(12.5f);
		System.out.println(flist.get(0));

	}

}
