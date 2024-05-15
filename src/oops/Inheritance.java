package oops;
class Animal{
	void eat()
	{
		System.out.println("Animal is eating");
	}
}
class Lion extends Animal{
	void roar()
	{
		System.out.println("Lion is Roaring");
	}
}
     

public class Inheritance {
public static void main(String[]args) {
	
	Lion obj=new Lion();
	obj.eat();
	obj.roar();
			
}
}
