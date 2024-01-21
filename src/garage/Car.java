package garage;

import java.util.Objects;

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
//	comented it out so i can use the tostring

//	@Override
//	public void print() {
//		super.print();
//		System.out.println("Does it have an exhaust? : " + this.exhaust);
//	}

	@Override
	public String toString() {
		return "Car [id=" + getId() + ", type=" + getType() + ", mobility=" + getMobility() + ", detail=" + getDetail()
				+ ", year=" + getYear() + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(exhaust);
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

		Car other = (Car) obj;

		if (!super.equals(obj)) {
			return false;
		}

		if (this.exhaust != other.hasExhaust()) {
			return false;
		}

		return true;
	}

	public boolean isExhaust() {
		return exhaust;
	}

	@Override
	public int calcBill() {
		if (exhaust) {
			return 2000;
		} else {
			return 1000;
		}
	}

}