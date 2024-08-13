package Java;

public class Employee {
	String name;
	String jobtittle;
	double salary;
	Employee(String name,String jobtittle,double salary)
	{
		this.name = name;
		this.jobtittle = jobtittle;
		this.salary = salary;
	}
	public void display()
	{
		System.out.println(name);
		System.out.println(jobtittle);
		System.out.println(salary);
	}
	public void updatesalary(double salary)
	{
		this.salary = salary;
	}

	public static void main(String[] args) {
		Employee obj = new Employee("VK","Engineer",35000);
		obj.updatesalary(10000.00);
		obj.display();
	}

}