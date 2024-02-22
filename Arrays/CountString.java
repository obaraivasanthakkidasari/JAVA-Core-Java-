package Arrays;

public class CountString {
	public int count(String[] names) {
		int count=0;
		for(String s:names) {
			String value=s;
			if(value.length()>6)
				count++;
		}
		return count;
	}
	public static void main(String[] args) {
		CountString obj=new CountString();
		int count=obj.count(new String[] {"Core Java","Spring Framework","advanced java","phyton",".net"});
		System.out.println(count+"having length greater than 6");
	}
}
