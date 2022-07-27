package fridaycode;
class Animal{
	void eat()
	{
	System.out.println("animal eat");
}
void sleep()
{
	System.out.println("Animal sleep");
}
}
class Bird extends Animal{
	void eat()
	{
		System.out.println("bird eat");
	}
	void sleep() {
		System.out.println("Bird sleep");
	}
	void fly()
	{
		System.out.println("bird fly");
	}
}
public class qqn4 {
	public static void main(String[] args)
	{
		Animal A=new Animal();
		System.out.println("animal class");
		A.eat();
		A.sleep();
		System.out.println();
		System.out.println("Bird class");
	Bird B=new Bird();
	B.eat();
	B.sleep();
	B.fly();
	}

}
