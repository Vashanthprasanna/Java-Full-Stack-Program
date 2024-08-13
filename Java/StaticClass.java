package Java;

public class StaticClass {
	void disp() {
		System.out.println("Instance function");
	}
	
	static void disp2() {
		System.out.println("Static function");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticClass sc = new StaticClass();
		sc.disp();
		
		StaticClass.disp2();
	}

}
