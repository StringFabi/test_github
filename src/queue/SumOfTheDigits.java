package queue;

public class SumOfTheDigits {

	public static int digitSum(long value){
		int sum = 0;
		while (sum > 0) {
			value += sum%10;
			sum /= 10;
		} return sum;
	}
	
	
	 public static int digitSum(String value) {
		Integer.parseInt(value);
		
	}
	
	public static void main(String[] args) {
		long value=11;
		System.out.println(digitSum(value));

	}

}
