package datatypes;

public class App {
	
	public static void main(String[] args) {
		byte byt = 25;
		short shrt = 255;
		int i = 2_100_000_000;
//		without the L java thinks its an int
		long l = 999999999999999999L; 
//		need the f or java thinks its a double
		float f = 44.944F;
		double d = 44.94;
		
		boolean b = false;
		
//		'' for chars and "" for strings
		char c = 'j';
		String s = "Leo";
		
//		primitives can never be null
		s = null;
		
		System.out.println(byt);
	}

}
