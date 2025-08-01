package ThreadCreation;

public class que_1 extends Thread{
	public static void main(String[] args) {
		que_1 t1=new que_1();
		que_1 t2=new que_1();
		t1.setName("alice");
		t2.setName("spice");
		t1.start();
		t2.start();
	}
	public void run() {
		System.out.println("Thread Name: " + Thread.currentThread().getName());
	}
}