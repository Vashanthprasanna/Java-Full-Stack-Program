package Java;

public class Constructors {
String name;
	Constructors(String name){
		this (10, 20) ;
		this. name = name;
		this. greeting () ;
	}
	
	Constructors(int a , int b){
		System. out.println ("Sum : " + (a + b) ) ;
	}
	
	void greeting () {
		System. out.println ("Welcome " + name) ;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructors obj = new Constructors("VK");
	}

}

