import java.util.Arrays;
import java.util.Collections;

public class Hello3 {
	
	public static void main(String args []) {
		Object [] obj = {1,40,20};
		Arrays.sort(obj);
		System.out.println(Arrays.toString(obj));
		Arrays.sort(obj, Collections.reverseOrder());
		System.out.println(Arrays.toString(obj));
		
		
	}
	
	
}
