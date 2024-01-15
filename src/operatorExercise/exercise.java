package operatorExercise;

public class exercise {
	
	 static int add(int a, int b) {
		 return a + b;
		 
	}
	 
	 static int sub(int a, int b) {
		 return a - b;
		 
	}
	 
	 static int mul(int a, int b) {
		 return a * b;
		 
	}
	 
	 static int div(int a, int b) {
		 return a / b;
		 
	}	 
	 
	 public static void name() {
		
	}
	 
	 public static void main(String[] args) {
		 int sum = add(10, 20);
		 int difference = sub(10, 20);
		 int product = mul(10, 20);
		 int divison = div(10, 20);
		 
		 System.out.println("The Sum is: " + add(50, 20));
		 System.out.println("The Sum is: " + sum);
		 System.out.println("The Difference is: " + difference);
		 System.out.println("The Product is: " + product);
		 System.out.println("The Divison is: " + divison);
		
	}
	 
	 
	 
}
