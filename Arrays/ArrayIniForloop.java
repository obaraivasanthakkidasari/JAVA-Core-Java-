package Arrays;

public class ArrayIniForloop {

	public static void main(String[] args) {
		int[] numbers;//declaration
		numbers=new int[50];//Allocation
		int j=1;
		//initialization using for loop
		for(int i=0;i<numbers.length;i++) {
			numbers[i]=j;
		j++;
	}
//access/retrieve using for loop
for(int k=0;k<numbers.length;k++)
{
	System.out.println(numbers[k]);
}
//access by using for each loop
System.out.println("***ForEach***");
for(int a:numbers) {
	System.out.println(a);
}
}}
