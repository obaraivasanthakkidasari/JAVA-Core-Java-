package Strings;

public class ImmutableTest {

	public static void main(String[] args) {
		String s1="Java";
		s1.concat("Rules");
		System.out.println(s1);//Java
		
		String s2="Good";
		s2=s2.concat("Morning");
		System.out.println(s2);

	}

}
