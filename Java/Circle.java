package Java;

public class Circle {
	float radius;
	float pi = (float) Math.PI; 
	
	Circle(float radius){
		this.radius = radius;
	}
	void set() {
		this.radius = 5;
	}
	void display() {
		System.out.println("Area : " + (pi*radius*radius));
		System.out.println("Perimeter : " + (2*pi*radius));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c = new Circle(12.56f);
		c.set();
		c.display();
	}

}
