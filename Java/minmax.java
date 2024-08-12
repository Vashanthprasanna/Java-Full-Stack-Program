package Java;
import java.util.*;
public class minmax {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter num 1 :  ");
			int a = sc.nextInt();
			System.out.println("Enter num 2 :  ");
			int b = sc.nextInt();
			if(a>b) System.out.println(b +" is Minimum & " +a + " is Maximum ");
			else System.out.println(a + " is Minimum & "+b +" is Maximum ");
		}
		

	}

}
