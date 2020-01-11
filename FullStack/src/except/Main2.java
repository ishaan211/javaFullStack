package except;

//import sun.tools.tree.FinallyStatement;

//sequence of catch block matters here

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x, y = 5;
		try {
			System.out.println("this stmt will get executed"); //kyu ??
			//x = 10/0; //partial execution bhi nhi hogi
			x = (y=10*10)/0;
			System.out.println("this stmt will not get executed"); //kyu ??
		}catch(ArithmeticException e) {
			System.out.println("Arithmetic exp");
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("Inside exception block");
		}finally {
			System.out.println("This will always get printed");
		}
		System.out.println();
		System.out.println(y);
	}

}
