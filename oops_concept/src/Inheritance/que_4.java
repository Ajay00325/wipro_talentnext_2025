package Inheritance;

public class que_4 {
	public static void main(String arg[]) {
		Animal a=new Animal();
		a.eat();
		a.sleep();
		Bird b=new Bird();
		b.eat();
		b.sleep();
		b.fly();
	}

}
class Animal{
	void eat() {
		System.out.println("Animal eats the grass");
	}
	void sleep() {
		System.out.println("Animal will go to sleep");
	}
}
class Bird extends Animal{
	void eat() {
		System.out.println("Birds eats the meat");
	}
	void sleep() {
		System.out.println("Birds are sleeping in the nest");
	}
	void fly() {
		System.out.println("birds are flying in the sky");
	}
}