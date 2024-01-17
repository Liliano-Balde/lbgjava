package garage;

public class Vehicle {

	private String type;
	private String mobility;
	private String detail;
	private int year;

//	default constructor
	public Vehicle() {
//		added super on a separate exercise
		super();
	}

//	constructor with with 3 attributes only: typ, mob and yr
	public Vehicle(String type, String mobility, String detail, int year) {
//		added super on a separate exercise
		super();
		this.type = type;
		this.mobility = mobility;
		this.detail = detail;
		this.year = year;

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

//existing print method for override exercise
	public void print() {
		System.out.println("Type :" + this.type);
		System.out.println("Mobility :" + this.mobility);
		System.out.println("Year :" + this.year);
		System.out.println("Detail :" + this.detail);
	}

}
