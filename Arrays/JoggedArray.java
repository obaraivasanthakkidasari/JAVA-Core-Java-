package Arrays;

public class JoggedArray {
	public static void main(String[] args) {
		int arr[][]=new int[3][];//Declaring 2-D array with 2 rows
		//making the above array Jagged
		arr[0]=new int[3];//First row has three columns
		arr[1]=new int[2];//Second row has 2 columns
		       arr[2]=new int[5];
		//Initializing array
		int count=0;
		for(int i=0;i<arr.length;i++)
			for(int j=0;j<arr[i].length;j++)
				arr[i][j]=count++;
		//Displaying the value of 2D jagged array
		System.out.println("Contents of 2D jagged Array");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++)
				System.out.println(arr[i][j]+"");
			System.out.println();
		}
	}
}
