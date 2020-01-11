package interfaces;

public class OnePlus implements Phone{

	@Override
	public String processor() {
		// TODO Auto-generated method stub
		return "SD645";
	}

	@Override
	public String os() {
		// TODO Auto-generated method stub
		return "Android";
	}

	@Override
	public int space() {   //so here we can see a restriction is applied I cannot cahnge the name from space to else
		// TODO Auto-generated method stub
		return 64;
	}

}
