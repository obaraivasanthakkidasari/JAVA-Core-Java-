package Strings;
public class otherMethods {
	public static void main(String[] args) {
		String java="Object oriented programming ";
		System.out.println(java.contains("oriented"));
		System.out.println(java.contains("Phython"));
		String s1="Hello";
		String s2="Hello";
		String s3=s1.intern();
		String s4="";
		System.out.println(s4.isEmpty());
		String s5=String.join("$","Good","Morning","To","All");
		System.out.println(s5);
		String[]token=java.split(" ");
		for(String word:token) {
			System.out.println(word);
		}
		String s6="Java is object oriented programming language";
		String []s=s6.split(" ",4);
		for(String x:s) {
			System.out.println(x);
		}
		
	}

}
