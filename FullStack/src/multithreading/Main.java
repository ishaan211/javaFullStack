package multithreading;
//creating thread by extending thread class

class MyCounter extends Thread{
	
	private int threadNo;

	public MyCounter(int threadNo) {
		//super();
		this.threadNo = threadNo;
	}
	
	@Override
	public void run() {
		countMe();
	}
	
	public void countMe() {
		for(int i=1;i<=9;i++) {
			try {
				sleep(500); //time is in milli-sec
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			System.out.println("The value of i is: "+i+" and the thread no is: "+threadNo);
		}
	}
	
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyCounter c1 = new MyCounter(1);
		MyCounter c2 = new MyCounter(2);
		long startTime = System.currentTimeMillis();
		c1.start(); //Run method should be called by JVM
		System.out.println("!!!!!!!!!!!!!!!!!!!!");
		c2.start(); //using this c1 and c2 will start to occur simultaneously thus achieving multithreading
		try {
			Thread.sleep(4505);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		long endTime = System.currentTimeMillis();
		System.out.println("Total time reqd to process: "+(endTime-startTime));
	}

}
