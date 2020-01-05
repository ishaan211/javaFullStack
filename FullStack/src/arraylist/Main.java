package arraylist;

import java.util.ArrayList;

public class Main {
	static ArrayList<String> listNames = new ArrayList<>(); //yahan pe string ki jagah kuch b daal skte ho
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		listNames.add("Ishaan");
		listNames.add("John");
		listNames.add("Wick");
		listNames.add("Mr");
		listNames.add("Robot");
		listNames.add("RiHe");
		//System.out.println(listNames.get(0));
		//System.out.println(listNames); saara print krvaane k liye
		Main obj = new Main();
		obj.displayList(listNames);
		//obj.removeNameByPos(0);
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		//obj.displayList(listNames);
		//obj.modifyName(2, "Bond"); //ye replace krne k liye
		int position = obj.search("RiHe");
		//obj.displayList(listNames);
		System.out.println(position);
		
		if(position != -1) {
			obj.modifyName(position, "Shivali");
			obj.displayList(listNames);
		}else {
			System.out.println("Invalid Entry");
		}
	}
	void displayList(ArrayList<String> names) {
		for(String name: names) {
			System.out.println(name);
		}
	}
	void removeNameByPos(int position) {
		listNames.remove(position);
	}
	void removeNameByStr(String name) {
		listNames.remove(name);
	}
	void modifyName(int position, String newName) {
		listNames.set(position, newName);
	}
	int search(String name) {
		return listNames.indexOf(name);
	}

}
