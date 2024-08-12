package Java;
import java.util.*;
public class armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		String str = String.valueOf(num);
		int len = str.length();
		int sum = 0;
		for(int i=0;i<len;i++) {
			int val = str.charAt(i)-'0';
			sum = sum + (int)Math.pow(val, len);
		}
		if(num == sum) System.out.println("It is Armstrong Number");
		else System.out.println("It is Not Armstrong Number");
	}

}
