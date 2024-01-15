//create an array that will hold 10 integer values, populate the array with values the call and ouput each element

package arrays;

public class exercise1 {

	public static void main(String[] args) {
		
		int[] myArray = new int[10];
		
		
		for(int i = 0; i < myArray.length; i++) {
			
//			myArray[i] = i + 1;
			myArray[i] = i * 10;
			
			System.out.println(myArray[i]);
		}
		
	}
	
}

