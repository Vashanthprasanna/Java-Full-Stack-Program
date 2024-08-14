package Java;
class Animal {
    public void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}

// Cat.java
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The cat barks.");
    }
}
public class inheritance1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Animal genericAnimal = new Animal();
	        genericAnimal.makeSound();

	        Cat cat = new Cat();
	        cat.makeSound();
	}

}
