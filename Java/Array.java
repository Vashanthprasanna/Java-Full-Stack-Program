package Java;
import java.util.*;
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (// TODO Auto-generated method stub
				Scanner sc = new Scanner(System.in)){
			System.out.println("Enter length : ");
			int n = sc.nextInt();
			int arr[] = new int [n];
			int sum=0;
			
			System.out.println("Enter values : ");
			for(int i=0;i<arr.length;i++) {
				arr[i] = sc.nextInt();
			}
			
			for(int i=0;i<arr.length;i++) {
				sum = sum + arr[i];
			}
			
			System.out.println("Sum : "+sum);
		}
	}

}
