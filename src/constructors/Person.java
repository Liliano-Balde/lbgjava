//create a person class and give it 3 fields

package constructors;

public class Person {

	private String name;
	private int age;
	private String jobTitle;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age >= 0 && age <= 100) {
			this.age = age;
		} else {
			System.out.println("Invalid age");
		}
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

//	Default constructor
	public Person() {
		this.name = "Bob The Builder";
		this.age = 99;
		this.jobTitle = "SRE Engineer";
	}

//	Antoher constructor using parameters
	public Person(String name, int age, String jobTitle) {
		this.name = name;
		this.age = age;
		this.jobTitle = jobTitle;
	}

//	constructor with parameters

//method to print intro
	void intro() {
		System.out.println("Hi there, my name is " + name + ". I'm " + age + " years old and I am a " + jobTitle
				+ ", nice to meet you!!");
	}

}
