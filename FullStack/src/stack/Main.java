package stack;

import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> obj = new Stack<>();
		obj.push(0);
		obj.push(1);
		obj.push(2);
		obj.push(3);
		obj.push(4);
		obj.push(5);
		obj.pop();
		
		if(obj.isEmpty()) {
			System.out.println("Stack is empty");
		}else {
			System.out.println("Stack is not empty");
		}
		
		for(Integer temp: obj) {
			System.out.println(temp);
		}
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!1");
		System.out.println(obj.peek()); //to check top of the stack
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!1");
		System.out.println(obj.search(0));
	}

}
