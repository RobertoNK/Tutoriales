import java.util.Arrays;


public class Hello_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] numbers = {29,35,13};
		String []  letters = {"Renato", "Albert","Robert"};
		Arrays.sort(numbers);
		System.out.println(Arrays.toString(numbers));
		Arrays.sort(letters);
		System.out.println(Arrays.toString(letters));
		String [] many = {"Renato", "Albert","Robert","29","35","13","a"};
		Arrays.sort(many);
		System.out.println(Arrays.toString(many));

	}

}
