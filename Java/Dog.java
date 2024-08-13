package Java;

public class Dog {
	String name;
	String breed;
	
	Dog(String name,String breed){
		this.name = name;
		this.breed = breed;
	}
	
	void setters() {
		this.name = "jack";
		this.breed = "rotwiller";
	}
	
	void display() {
		System.out.println(name + " " + breed);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d = new Dog("berry","Pomerian");
		Dog d2 = new Dog("john","shepered");
		d.display();
		d2.setters();
		d2.display();
	}

}
