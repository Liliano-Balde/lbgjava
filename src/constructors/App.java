//in a separate file instatiate (create) a couple of person objects, give them some data

package constructors;

public class App {

	public static void main(String[] args) {
		Person John = new Person();
		John.setName("John Doe");
		John.setAge(30);
		John.setJobTitle("Solutions Architect");

		Person Emma = new Person();
		Emma.setName("Emma Jones");
		Emma.setAge(25);
		Emma.setJobTitle("Head of Engineering");

		System.out.println(John.getName());
		John.intro();

		System.out.println(Emma.getName());
		Emma.intro();

		Person bobTheBuilder = new Person();
		bobTheBuilder.intro();

		Person romario = new Person("Romario", 20, "Security Analsyt");
		romario.intro();

		Person Joao = new Person("Joao", 45, "Security Analsyt");
		Joao.intro();

	}

}
