package Java;

class vehicle{
	void noOfEngine() {
		System. out. println ("I have one engine") ;
	}
}
class TwoWheeler extends vehicle{
	void noOfWheels () {
		System. out. println ("I have two wheels") ;
	}
}

class Bike extends TwoWheeler {
	void brandName () {
		System. out.println ("Brand Name is Honda") ;
	}
}

public class Multilevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike bike = new Bike () ;
		bike.noOfEngine();
		bike.noOfWheels () ;
		bike . brandName () ;
	}

}
