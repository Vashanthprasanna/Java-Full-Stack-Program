package Java;
class Person1 {
    private String firstName;
    private String lastName;

    public Person1(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}

class Employee2 extends Person1 {
    private String jobTitle;
    private String employeeId;

    public Employee2(String firstName, String lastName, String jobTitle, String employeeId) {
        super(firstName, lastName);
        this.jobTitle = jobTitle;
        this.employeeId = employeeId;
    }

    @Override
    public String getLastName() {
        return super.getLastName() + ", " + jobTitle;
    }

    public String getEmployeeId() {
        return employeeId;
    }
}
public class inheritance7 {
    public static void main(String[] args) {
        // Creating an instance of Person
        Person1 person = new Person1("John", "Doe");
        System.out.println("Person's first name: " + person.getFirstName());
        System.out.println("Person's last name: " + person.getLastName());

        Employee2 employee = new Employee2("Jane", "Smith", "Manager", "E12345");
        System.out.println("Employee's first name: " + employee.getFirstName());
        System.out.println("Employee's last name with title: " + employee.getLastName());
        System.out.println("Employee ID: " + employee.getEmployeeId());
    }
}
