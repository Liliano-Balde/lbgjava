//Create a loop that populates an ineteger array with values, outputing them at each iteration, 
//Then create another loop that iterates throught the array changing the values at each point to equal itself 10 times outputing them at each iteration 


package arrays;

public class exercise2 {
	
	public static void main(String[] args) {
	
		int[] myArray = new int[10];
		
		
		for(int i = 0; i < myArray.length; i++) {
			
			myArray[i] = i + 1;
			
			System.out.println(myArray[i]);
			
		}
		
		for(int i = 0; i < myArray.length; i++) {
			
			myArray[i] = myArray[i] * 100;
			
			System.out.println(myArray[i]);
			
		}
		
	}

}
