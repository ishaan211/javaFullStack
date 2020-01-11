package statickeyword;

public class TestStatic {
	//int staticVar = 0; //pehele ye kro
	private static int staticVar = 0;

	public static int getStaticVar() {
		return staticVar;
	}

	public static void setStaticVar(int staticVar) {
		/*this*/TestStatic.staticVar = staticVar;
	}
	
	

}
