package Strings;
public class SearchingTest {
	public static void main(String[] args) {
String s1="I LIKE JAVA LIKE JAVA";
System.out.println(s1.indexOf('J'));
System.out.println(s1.indexOf('J',8));
System.out.println(s1.indexOf("Like"));
System.out.println(s1.indexOf("LIKE"));
System.out.println(s1.indexOf("LIKE",7));
System.out.println(s1.indexOf('Z'));
System.out.println(s1.lastIndexOf('J'));
System.out.println(s1.lastIndexOf('J',9));
System.out.println(s1.lastIndexOf("LIKE"));
System.out.println(s1.lastIndexOf("LIKE",8));
	}
}
