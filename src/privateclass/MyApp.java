package privateclass;

public class MyApp {

	public static void main(String[] args) {

		PrivatePerson john = new PrivatePerson();
		john.setName("John Doe");
		john.setAge(30);
		john.setJobTitle("Solutions Architect");

		PrivatePerson emma = new PrivatePerson();
		emma.setName("Emma Jones");
		emma.setAge(25);
		emma.setJobTitle("Head of Engineering");

		System.out.println(john.getName());
		john.intro();

		System.out.println(emma.getName());
		emma.intro();
	}
}
