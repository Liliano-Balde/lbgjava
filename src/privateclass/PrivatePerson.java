package privateclass;

public class PrivatePerson {

	private String name;

	private int age;

	private String jobTitle;

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public void setAge(int age) {
		if (age >= 0 && age <= 100) {
			this.age = age;
		} else {
			System.out.println("Invalid age");
		}
	}

	void intro() {
		System.out.println("Hi there, my name is " + name + ". I'm " + age + " years old and I am a " + jobTitle
				+ ", nice to meet you!!");
	}
}
