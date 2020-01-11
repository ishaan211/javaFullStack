package innerclass;

public class Door {
	
	private Lock lock;
	
	class Lock{
		private boolean lock;
	}

	public Door(Lock lock) {
		super();
		this.lock = lock;
	}
	

}
