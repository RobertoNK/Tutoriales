import java.util.Arrays;
import java.util.Collections;

public class Hello2 {
	
	public static void main(String[] args) {
		Object [] obj = {10,2,6};
		int [] arr = new int [obj.length];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)obj[i];
		}
		System.out.println(Arrays.toString(arr));
		
	}
}