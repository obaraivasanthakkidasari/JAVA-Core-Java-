package Strings;
import java.util.Scanner;
public class ComparisionTest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); {
	System.out.println("Enter Your Password");
			String password=sc.next();
			if(password.equalsIgnoreCase("test@123"))
			System.out.println("Welcome to usa");
			else
				System.out.println("Welcome are not to usa");
		}
	}
}
