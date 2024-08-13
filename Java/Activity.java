package Java;
import java.util.*;

class Student{
	
	int regno;
	String studName;
	int sum = 0;
	int avg = 0;
	String grade ="";
	
	int arr[] = new int[5];
	
	Student(int regno,String name) {
		this.regno = regno;
		this.studName = name;
	}
	
	void getMarks() {
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter Mark : ");
			arr[i] = sc.nextInt();
		}
	}
	
	void sum() {
		for(int i=0;i<arr.length;i++) {
			sum = sum + arr[i];
		}
		avg = (sum/arr.length);
		if (avg >= 90) {
            grade = "A";
        } else if (avg >= 80) {
            grade = "B";
        } else if (avg >= 70) {
            grade = "C";
        } else if (avg >= 60) {
            grade = "D";
        } else {
            grade = "E";
        }
	}
	
	void display() {
		System.out.println("\nReg no : " + regno);
		System.out.println("Name : " + studName);
		System.out.println("Marks Scored : ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println(" \nSum : " + sum);
		System.out.println("Average : " + avg);
		System.out.println("Grade : " + grade);
		
	}
	
}

public class Activity {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student obj = new Student(1,"VK");
		obj.getMarks();
		obj.sum();
		obj.display();
		
	}
}
