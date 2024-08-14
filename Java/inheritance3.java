package Java;

class Shape {
 public double getArea() {
     return 0.0;
 }
}


class Rectangle1 extends Shape {
 private double width;
 private double height;


 public Rectangle1(double width, double height) {
     this.width = width;
     this.height = height;
 }


 @Override
 public double getArea() {
     return width * height;
 }
}
public class inheritance3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle1 rectangle = new Rectangle1(5, 10);
        System.out.println("Area of the rectangle: " + rectangle.getArea());
	}

}
