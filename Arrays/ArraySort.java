package Arrays;

import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {
		int a1[]=new int[] {3,6,2,9,5,8,1};
		for(int i=0;i<a1.length;i++)
		{
			System.out.println(a1[i]);
		}
		
			Arrays.sort(a1);
			for(int i=0;i<a1.length;i++)
			{
				System.out.println(a1[i]);
		}
		
	}

}
