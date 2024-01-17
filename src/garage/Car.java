package garage;

public class Car extends Vehicle {

	private boolean exhaust;

	public Car(String type, String mobility, String detail, int year, boolean exhaust) {
////		comented sets out since im using super
//		setType(type);
////		setMobility(mobility);
////		setDetail(detail);
////		setYear(year);
		super(type, mobility, detail, year);
		this.exhaust = exhaust;
	}

	public Car() {
		super();
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

//created a print method that overrides the method from the class vehicle
	@Override
	public void print() {
		super.print();
		System.out.println("Does it have an exhaust? : " + this.exhaust);
	}

}