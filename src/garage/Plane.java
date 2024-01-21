package garage;

public class Plane extends Vehicle {

	private boolean wings;

	public Plane(String type, String mobility, String detail, int year, boolean wings) {
		setType(type);
		setMobility(mobility);
		setDetail(detail);
		setYear(year);
		this.wings = wings;
	}

	public boolean hasWings() {
		return wings;
	}

	public void setWings(boolean wings) {
		this.wings = wings;
	}

	public void planeMotto() {
		System.out.println("My" + getType() + " is a " + getDetail() + " of " + getYear()
				+ " and its motto is: Run away, turn away, run away, turn away, run away");
		;

	}

	@Override
	public String toString() {
		return "Car [type=" + getType() + ", mobility=" + getMobility() + ", detail=" + getDetail() + ", year="
				+ getYear() + "]";
	}

	@Override
	public int calcBill() {
		if (wings) {
			return 2000;
		} else {
			return 1000;
		}
	}

}
