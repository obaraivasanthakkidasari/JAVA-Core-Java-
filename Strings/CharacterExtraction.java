package Strings;
public class CharacterExtraction {
	public static void main(String[] args) {
		String s1="Good Morning";
		char ch=s1.charAt(5);
		System.out.println(ch);
		//System.out.println(s1.charAt(68));//Generate Exception
		String s2="Java is object oriented programming language";
		int sindex=24;
		int eindex=31;
		char[] ch1=new char[eindex-sindex];
		int chindex=0;
		s2.getChars(sindex, eindex, ch1, chindex);
		System.out.println(ch1);
		String s3="Java is good";
		byte[]b=s3.getBytes();
		for(byte x:b) {
			System.out.println((char)x);
		}
		String s4="James Goosling";
		char[] c=s4.toCharArray();
		for(char a:c) {
			System.out.println(a);
		
		}
	}
}

