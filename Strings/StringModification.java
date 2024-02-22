package Strings;

public class StringModification {
	public static void main(String[] args) {
		String s1="Java is good";
		s1.substring(8);//new string created with a 
		System.out.println(s1);
		String s2="Good Morning";
	String s3=s2.substring(0,4);
	System.out.println(s3);
	String s4="Core";
	s4=s4.concat("Java");//new string created
	System.out.println(s4);
	String s5="pog pance";
	s5=s5.replace('p','d');
	System.out.println(s5);
	String s6="Rama is a good boy having good habits";
	s6=s6.replaceFirst("good","nice");
	System.out.println(s6);
	String s7="ram@gmail.com,ramesg@gmail.com";
	s7=s7.replaceAll("com","net");
	System.out.println(s7);
	String s8="James gossling";
	s8=s8.toUpperCase();
	System.out.println(s8);
	String s9="RAM";
	s9=s9.toLowerCase();
	System.out.println(s9);
	
	}
}
