package ThreadPriorities;

public class que_1 extends Thread {

	public static void main(String[] args) {
		que_1 t = new que_1();
		t.start();

	}
	
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println(i);
			if(i == 5) {
				try {
					Thread.sleep(5000);
				} catch(InterruptedException ie) {
					System.out.println("Interrupted ExceptionL " + ie);
				}
			}
		}
	}

}