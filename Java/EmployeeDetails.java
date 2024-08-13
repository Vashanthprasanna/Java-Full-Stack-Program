package Java;

public class EmployeeDetails {

	int employeeId;
	String employeeName;
	float employeeSalary;
	EmployeeDetails (int employeeId, String employeeName, float employeeSalary){
		this. employeeId = employeeId;
		this. employeeName = employeeName;
		this. employeeSalary = employeeSalary;
	}

		void display () {
			System. out.println ("Employee Id : " + employeeId) ;
			System. out.println ("Employee Name : " + employeeName) ;
			System. out. println ("Employee Salary : " + employeeSalary) ;
		}
	
	public static void main(String[] args) {
		EmployeeDetails obj1 = new EmployeeDetails(1,"Arun",25000);
		obj1.display();
		EmployeeDetails obj2 = new EmployeeDetails(2,"Bala",30000); 
		obj2.display();
	}

}
