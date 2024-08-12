package Java;
import java.util.*;
public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string : ");
		String str1 = sc.next();
		String str2 = "";
		for(int i=str1.length()-1;i>=0;i--) {
			str2 = str2 + String.valueOf(str1.charAt(i));
		}
		
		if(str1.equals(str2)) System.out.println("It is Palindrome");
		else System.out.println("It is Not Palindrome");
	}

}
