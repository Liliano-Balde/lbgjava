package garage;

import java.util.Objects;

public class Plane extends Vehicle {

	private boolean wings;

	public Plane(String type, String mobility, String detail, int year, boolean wings) {
		setType(type);
		setMobility(mobility);
		setDetail(detail);
		setYear(year);
		this.wings = wings;
	}

	public Plane() {
		super();
	}

	public boolean hasWings() {
		return wings;
	}

	public void setWings(boolean wings) {
		this.wings = wings;
	}

	public void settwoWheeler(boolean wings) {
		this.wings = wings;
	}

	public void planeMotto() {
		System.out.println("My" + getType() + " is a " + getDetail() + " of " + getYear()
				+ " and its motto is: Run away, turn away, run away, turn away, run away");
		;

	}

	@Override
	public String toString() {
		return "Plane [id=" + getId() + "type=" + getType() + ", mobility=" + getMobility() + ", detail=" + getDetail()
				+ ", year=" + getYear() + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(wings);

	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}

		Plane other = (Plane) obj;

		if (!super.equals(obj)) {
			return false;
		}

		if (this.wings != other.hasWings()) {
			return false;
		}

		return true;
	}
	
	public void setExhaust(boolean wings) {
		this.wings = wings;
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
