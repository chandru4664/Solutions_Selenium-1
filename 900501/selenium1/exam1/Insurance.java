package selenium1.exam1;

public class Insurance {

	private int insNum;
	private String name;
	private double price;
	
	public Insurance() {
		super();
	}
	
	public Insurance(int insNum, String name, double price) {
		super();
		this.insNum = insNum;
		this.name = name;
		this.price = price;
	}
	public int getInsNum() {
		return insNum;
	}
	public void setInsNum(int insNum) {
		this.insNum = insNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Insurance [insNum=" + insNum + ", name=" + name + ", price=" + price + "]";
	}
	
}
