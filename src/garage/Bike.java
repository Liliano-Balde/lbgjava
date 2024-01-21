package garage;

import java.util.Objects;

public class Bike extends Vehicle {

	private boolean twoWheeler;

	public Bike(String type, String mobility, String detail, int year, boolean twoWheeler) {
//		setType(type);
//		setMobility(mobility);
//		setDetail(detail);
//		setYear(year);
		super(type, mobility, detail, year);
		this.twoWheeler = twoWheeler;
	}

	public Bike() {
		super();
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

	@Override
	public String toString() {
		return "Motorbike [id=" + getId() + ", type=" + getType() + ", mobility=" + getMobility() + ", detail="
				+ getDetail() + ", year=" + getYear() + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(twoWheeler);

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

		Bike other = (Bike) obj;

		if (!super.equals(obj)) {
			return false;
		}

		if (this.twoWheeler != other.IstwoWheeler()) {
			return false;
		}

		return true;
	}

	public void setExhaust(boolean twoWheeler) {
		this.twoWheeler = twoWheeler;
	}

	@Override
	public int calcBill() {
		if (twoWheeler) {
			return 2000;
		} else {
			return 1000;
		}
	}

}