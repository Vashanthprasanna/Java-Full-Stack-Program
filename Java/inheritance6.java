package Java;
class Animal1 {
    public void move() {
        System.out.println("The animal moves.");
    }
}


class Cheetah extends Animal1 {
    @Override
    public void move() {
        System.out.println("The cheetah runs.");
    }
}
public class inheritance6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Animal1 genericAnimal = new Animal1();
	        genericAnimal.move(); 

	        Cheetah cheetah = new Cheetah();
	        cheetah.move(); 
	}

}
