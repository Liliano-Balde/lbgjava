package arrays;

public class exercise3 {

	public static void main(String[] args) {
		// Example usage
		for (int i = 1; i <= 15; i++) {
			System.out.println(fizzBuzz(i));
		}
	}

	public static String fizzBuzz(int number) {
		if (number % 3 == 0 && number % 5 == 0) {
			return "FizzBuzz";
		} else if (number % 3 == 0) {
			return "Fizz";
		} else if (number % 5 == 0) {
			return "Buzz";
		} else {
			return String.valueOf(number);
		}
	}
}
