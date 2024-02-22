package Strings;
public class NewString {
	public static void main(String[] args) {
		String s1="Hello";
		String s2="Hello";
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	if(s1==s2)
		System.out.println("Both Objects are same");
	else
	System.out.println("Both objects are different");
	
	String s3=new String("Hello");
	String s4=new String("Hello");
	System.out.println(s3.hashCode());
	System.out.println(s4.hashCode());
if(s3==s4)
	System.out.println("Both Objects are same");
else
System.out.println("Both objects are different");

	
	}
}
