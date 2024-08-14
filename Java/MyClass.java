package Java;

class Vehicle1{
	void noofengine() {
		System.out.println("I have one engine");
	}
}
class TwoWheeler1 extends Vehicle1{
	void display() {
		System.out.println("I have 2 wheels");
	}
}
class Bike1 extends TwoWheeler1{
	void brandname() {
		System.out.println("Brand name is Honda");
	}
}
class Scooty extends TwoWheeler1{
	void brandname() {
		System.out.println("Brand name is Activa");
	}
}


public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike1 b=new Bike1();
		b.brandname();
		b.display();
		b.noofengine();
		
		Scooty s=new Scooty();
		s.brandname();
		s.display();
		s.noofengine();
		}

}