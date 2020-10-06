//implements bulk discounts
//constructor
public class Item {
	private String name;
	private double price; 
	private double discount;
	
	//CONSTRUCTORS
	public Item() {
		this("",0,0);
	}
    public Item(String name, double price, double discount) {
		this.name = name; 
		this.price = price;
		this.discount = discount;
	}
    public Item(String name, double price) {
    	this(name,price,0);
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
	
	//GETTERS
	public String getName() {
		return this.name;
	}
	public double getPrice() {
		return this.price;
	}
	public double getDiscount() {
		return this.discount;
	}
	public double getDiscountedPrice() {
		return this.price - this.discount;
	}
}
