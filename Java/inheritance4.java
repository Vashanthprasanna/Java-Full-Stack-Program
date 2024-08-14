package Java;
class Employee1 {
    public void work() {
        System.out.println("Employee is working.");
    }

    public double getSalary() {
        return 50000.0;
    }
}


class HRManager extends Employee1 {
    @Override
    public void work() {
        System.out.println("HR Manager is managing employees.");
    }

    public void addEmployee(String employeeName) {
        System.out.println("Adding new employee: " + employeeName);
    }
}
public class inheritance4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    HRManager hrManager = new HRManager();
        
        hrManager.work();
        
        System.out.println("Salary: " + hrManager.getSalary());

        hrManager.addEmployee("John Doe");
	}

}
