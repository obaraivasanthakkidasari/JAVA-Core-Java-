package Arrays;

public class TwoArray {

	public static void main(String[] args) {
		int[][] myarr;
		myarr=new int[2][2];
		myarr[0][0]=10;//first row-first column
		myarr[0][1]=20;//first row-second column
		myarr[1][0]=30;//second row-first column
		myarr[1][1]=40;//first row-first column
		System.out.println(myarr[0][0]+"\t");
		System.out.println(myarr[0][1]);
		System.out.println(myarr[1][0]+"\t");
		System.out.println(myarr[1][1]);
		System.out.println("Retrive by using for loop");
		for(int i=0;i<2;i++) {//used to move cursor 
			for(int j=0;j<2;j++) {//used to move cursor
				System.out.println(myarr[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
