import java.util.Arrays;

public class Hello_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] numbers = {2,4,5,6,7,10};
		System.out.println(Arrays.binarySearch(numbers, 2));
		System.out.println(Arrays.binarySearch(numbers, 5));
		System.out.println(Arrays.binarySearch(numbers, 10));
		System.out.println(Arrays.binarySearch(numbers,11)); // -7

	}

}
