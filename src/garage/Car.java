package garage;

public class Car extends Vehicle {

	private boolean exhaust;

	public Car(String type, String mobility, String detail, int year, boolean exhaust) {
		setType(type);
		setMobility(mobility);
		setDetail(detail);
		setYear(year);
		this.exhaust = exhaust;
	}

	public boolean hasExhaust() {
		return exhaust;
	}

	public void setExhaust(boolean exhaust) {
		this.exhaust = exhaust;
	}

	public void carMotto() {
		System.out.println("My" + getType() + " is a " + getDetail() + " of " + getYear()
				+ " and its motto is: Run away, turn away, run away, turn away, run away");

	}
}