package garage;

public class Newapp {

	public static void main(String[] args) {
		Vehicle testcar = new Car("Car", "Land", "Ford GT500", 2005, true);
		Vehicle car2 = new Car("Car", "Land", "Ford mustang", 2005, true);
		System.out.println(testcar);
		System.out.println(car2);
	}
}
