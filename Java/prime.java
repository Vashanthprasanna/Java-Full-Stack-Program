package Java;
import java.util.*;
public class prime {

	static boolean cal(int n) {
		if(n == 0 || n == 1) return false;
		else {
			for(int i=2;i<n;i++) {
				if(n %i ==0) return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		boolean res = cal(num);
		if(res) System.out.println("It is Prime number");
		else System.out.println("It is Not Prime number");
	}

}
