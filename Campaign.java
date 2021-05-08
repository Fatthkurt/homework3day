package byrak;

public class Campaign {
	String name;
	String code;
	double discount;
	public Campaign() {}

	public Campaign( String name, double discount,String code) {
		super();
		this.name = name;
		this.code = code;
		this.discount = discount;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}
	

}
