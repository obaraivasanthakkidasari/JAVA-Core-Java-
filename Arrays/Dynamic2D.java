package Arrays;

import java.util.Scanner;

public class Dynamic2D {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row length of an array:");
		int row=sc.nextInt();
		System.out.println("Enter the column length of an aray:");
		int column=sc.nextInt();
		int a[][]=new int[row][column];//Declaration& allocation
		
		System.out.println("Enter"+row*column+"Elements to store in Array:\n");
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		/*System.out.println("Enter"+row*column+"Elements to store in Array:\n");
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				System.out.println("Row ["+i+"]:Column["+j+"]:"+a[i][j]);
			}*/
		System.out.println("Elements in array are:\n");
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				System.out.println(a[i][j]+"\t");
			}
			System.out.println();
			}
		}
	}

