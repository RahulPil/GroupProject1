//implements bulk discounts
//constructor
public class Item {
	private String name;
	private double price; 
	private double discount;
	public int bulkCount;
	
	//CONSTRUCTORS
	public Item() {
		this("",0,0,0);
	}
    public Item(String name, double price, double discount, int bulkCount) {
		this.name = name; 
		this.price = price;
		this.discount = discount;
		this.bulkCount = bulkCount;
	}
    public Item(String name, double price) {
    	this(name,price,0,0);
    }
    
    //SETTERS
    public void setName(String name) {
		this.name = name;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public void setBulkCount(int bulkCount) {
		this.bulkCount = bulkCount;
	}
	
	//GETTERS
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}
	public double getDiscount() {
		return discount;
	}
	public double getDiscountedPrice() {
		return this.price - this.discount;
	}
	public int getBulkCount() {
		return bulkCount;
	}
	public String toString() {
		return name;
	}
	public boolean equals(Item item) {
		return this.getName().equalsIgnoreCase(item.getName());
	}
}