package Java;

public class Classvar {
	int b = 20; //Instance or Object Variable
	static int c = 30; //Static or Class Variable
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int a = 10; //Local Variable
			System. out.println ("Local Variable : " + a) ;
			Classvar obj = new Classvar () ;
			System. out.println (obj.b) ;
			System.out.println (Classvar.c);
		}
	}

