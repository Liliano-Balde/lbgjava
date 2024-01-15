//in a separate file instatiate (create) a couple of person objects, give them some data

package classobjectexercise;

public class App {

	public static void main(String[] args) {
		Person John = new Person();
		John.name = "John Doe";
		John.age = 30;
		John.jobTitle = "Solutions Architect";

		Person Emma = new Person();
		Emma.name = "Emma Jones";
		Emma.age = 25;
		Emma.jobTitle = "Head of Engineering";

		System.out.println(John.name);
		John.intro();

		System.out.println(Emma.name);
		Emma.intro();
	}

}
