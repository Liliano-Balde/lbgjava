package garage;

import java.util.Objects;

public abstract class Vehicle implements Comparable<Vehicle> {

	private static int idCount = 1;

	private int id;
	private String type;
	private String mobility;
	private String detail;
	private int year;

//	default constructor
	public Vehicle() {
//		added super on a separate exercise
		super();
		this.id = ++idCount;
	}

//	constructor with with 3 attributes only: typ, mob and yr
	public Vehicle(String type, String mobility, String detail, int year) {
//		added super on a separate exercise
		super();
		this.id = ++idCount;
		this.type = type;
		this.mobility = mobility;
		this.detail = detail;
		this.year = year;

	}

	@Override
	public int hashCode() {
		return Objects.hash(type, mobility, detail, year);
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

		Vehicle other = (Vehicle) obj;
		return type == other.type && Objects.equals(mobility, other.mobility) && Objects.equals(detail, other.detail)
				&& Objects.equals(detail, other.detail) && Objects.equals(year, other.year);

	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getMobility() {
		return mobility;
	}

	public void setMobility(String mobility) {
		this.mobility = mobility;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	@Override
	public String toString() {
		return "Vehicle [id=" + id + ", type=" + type + ", mobility=" + mobility + ", detail=" + detail + ", year="
				+ year + "]";
	}

//	compares by type
//	@Override
//	public int compareTo(Vehicle o) {
//
//	return this.type.compareTo(o.type);
//	}

//	sorts by id DESC
//	@Override
//	public int compareTo(Vehicle o) {
//		return id - o.id;
//
//	}

//	sorts by id ASC
//	@Override
//	public int compareTo(Vehicle o) {
//		return o.id - id;
//
//	}

//	compares by year

	@Override
	public int compareTo(Vehicle o) {

		return o.year - year;
	}

	// created an abstract method callBill.
	public abstract int calcBill();

//	getters and setters for id possibly not needed as i already set it 
	public int getId() {
		return id;
	}

//	adding an id and get it to autoincrement the id as i add new vehicles 
	public void setId(int id) {
		this.id = id;
	}

	public static int getIdCount() {
		return idCount;
	}

	public static void setIdCount(int idCount) {
		Vehicle.idCount = idCount;
	}

//	implementing compareto to make my vehicles comparable and experimenting with sort 

//existing print method for override exercise

//	commented out and replaced with tostring 
//	public void print() {
//		System.out.println("Type :" + this.type);
//		System.out.println("Mobility :" + this.mobility);
//		System.out.println("Year :" + this.year);
//		System.out.println("Detail :" + this.detail);
//	}

}
