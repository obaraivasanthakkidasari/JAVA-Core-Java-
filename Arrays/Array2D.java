package Arrays;

public class Array2D {

	public static void main(String[] args) {
		// Creation & implementation of 2d Array
		int[][] a1=new int[3][4];
	int	count=1;
		for(int i=0;i<a1.length;i++) {
			for(int j=0;j<a1[i].length;j++) {
				a1[i][j]=count;
				count++;
			}
		}

		for(int i=0;i<a1.length;i++) {
			for(int j=0;j<a1[i].length;j++) {
				System.out.print(a1[i][j]+" ");
			}
			System.out.println( );
	}

}}
