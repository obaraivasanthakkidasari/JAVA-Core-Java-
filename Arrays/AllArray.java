package Arrays;

public class AllArray {

	public static void main(String[] args) {
		int[] arr= {1,3,4,7,8,9,12,45,78,34};
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				count++;
				}
			}
		System.out.println("Given Array having "+count+ "Even numbers");
	}
}
