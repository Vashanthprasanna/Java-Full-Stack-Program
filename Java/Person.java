package Java;

public class Person {
	String name ;
	int age;

	Person(String name,int age){
		this.name = name;
		this.age = age;
	}
	
	void display() {
		System.out.println(name + " " + age);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person("Arun",25);
		Person p2 = new Person("Bala",22);
		
		p.display();
		p2.display();
	}

}
