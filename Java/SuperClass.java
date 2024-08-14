package Java;

class A{
	int a=10;
	A(String name){
		System.out.println("Welcome "+name);
	}
	void method1() {
		System.out.println("I am super class");
	}
}

class B extends A{
	B(){
		super("VK");
	}
	void method2() {
		System.out.println("super class : "+super.a);
		super.method1();
	}
}


public class SuperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b = new B();
		b.method2();
	}

}
