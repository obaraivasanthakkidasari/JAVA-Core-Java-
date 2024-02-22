package Strings;
public class RegionTest {
	public static void main(String[] args) {
		String s1="Hello World";
		String s2="World";
		boolean b=s1.regionMatches(6, s2, 0, 3);
		System.out.println(b);
		/*
		 * 6 is the index position of s1 string
		 * s2 is the capared string
		 * 0 is the s2 indexposition.
		 * 3 number of character wants to compare
		 */
		String s3="hello";
		boolean b1=s1.regionMatches(true, 0, s3, 0,3);
		System.out.println(b1);
		//true indicates ingore the character case.
		String s4="All is Well";
		System.out.println(s4.startsWith("all"));
		System.out.println(s4.endsWith("Well"));
		String s5="Hello";
		String s6="Hi";
		System.out.println(s5.compareTo(s6));
		System.out.println(s6.compareTo(s5));
		System.out.println(s5.compareTo(s5));
	}
}
