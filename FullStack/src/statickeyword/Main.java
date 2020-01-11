package statickeyword;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//TestStatic obj1 =  new TestStatic();
		System.out.println(TestStatic.getStaticVar());
		TestStatic.setStaticVar(12);
		System.out.println(TestStatic.getStaticVar());
		System.out.println();
		//TestStatic obj2 = new TestStatic();
		System.out.println(TestStatic.getStaticVar());
		TestStatic.setStaticVar(34);
		System.out.println(TestStatic.getStaticVar());
		System.out.println();
		//TestStatic obj3 = new TestStatic();
		System.out.println(TestStatic.getStaticVar());
	}

}
