package except;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main o = new Main();
		o.case1(2, 2);
		o.case2(6, 3);
	}
	
	public void case1(int x,int y) {
		if(y != 0) {
			System.out.println(x/y);
		}else {
			System.out.println("Value of y was 0");
		}
	}
	
	public void case2(int x,int y) {
		try {
			System.out.println(x/y);
		}catch(Exception e) {
			System.out.println("Value of y was 0");
		}
	}

}
