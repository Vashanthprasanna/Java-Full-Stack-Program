package Java;
class Vehicle2 {
    public void drive() {
        System.out.println("Driving the vehicle.");
    }
}

// Car.java
class Car extends Vehicle2 {
    @Override
    public void drive() {
        System.out.println("Repairing a car.");
    }
}
public class inheritance2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle2 genericVehicle = new Vehicle2();
        genericVehicle.drive();

        Car car = new Car();
        car.drive();
	}

}
