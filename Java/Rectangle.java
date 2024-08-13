package Java;

public class Rectangle {
	int width;
	int height;
	Rectangle(int width,int height)
	{
		this.width = width;
		this.height = height;
	}
	void area()
	{
		int area = width*height;
		System.out.println(area);
	}
	void perimeter()
	{
		int peri = 2*(width*height);
		System.out.println(peri);
	}

	public static void main(String[] args) {
		Rectangle obj = new Rectangle(3,12);
		obj.area();
		obj.perimeter();

	}

}