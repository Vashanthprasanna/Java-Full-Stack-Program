package Java;
import java.util.*;
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int empid;
		String empname;
		float empsalary;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Id : ");
		empid = sc.nextInt();
		System.out.println("Enter name : ");
		empname = sc.next();
		System.out.println("Enter salary : ");
		empsalary = sc.nextFloat();
		
		System.out.println("Enter Id : "+empid);
		System.out.println("Enter name : "+empname);
		System.out.println("Enter salary : "+empsalary);
		sc.close();
	}

}
