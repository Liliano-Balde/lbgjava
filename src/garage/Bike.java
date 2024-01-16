package garage;

public class Bike extends Vehicle {

	private boolean twoWheeler;

	public Bike(String type, String mobility, String detail, int year, boolean twoWheeler) {
		setType(type);
		setMobility(mobility);
		setDetail(detail);
		setYear(year);
		this.twoWheeler = twoWheeler;
	}

	public boolean IstwoWheeler() {
		return twoWheeler;
	}

	public void settwoWheeler(boolean twoWheeler) {
		this.twoWheeler = twoWheeler;
	}

	public void bikeMotto() {
		System.out.println("My" + getType() + " is a " + getDetail() + " of " + getYear()
				+ " and its motto is: Run away, turn away, run away, turn away, run away");

	}
}