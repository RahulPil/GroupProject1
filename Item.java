/* 
 * Group Project #1
 * Group 6 (Anders, Julian, Rahul, Rosie, Sean, Vatsal)
 * CS 211
 * Due: 10/12/2020
 * Quarter: Fall 2020
 * 
 * Item class creates an Item object
 */ 
public class Item {
	// field
	private String name;
	private double price; 
	private double discount;
	public int bulkCount;
	
	//CONSTRUCTORS
	// constructs item object
    	public Item(String name, double price, double discount, int bulkCount) {
		this.name = name; 
		this.price = price;
		this.discount = discount;
		this.bulkCount = bulkCount;
	}
	// item default constructor
	public Item() {
		this("", 0, 0, 0);
	}

    	//SETTERS
	// mutator sets the item object name
    	public void setName(String name) {
		this.name = name;
	}
	// mutator sets the item object price
	public void setPrice(double price) {
		this.price = price;
	}
	// mutator sets the item object bulk discount amount
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	// mutator sets the item object bulk discount quantity requirement
	public void setBulkCount(int bulkCount) {
		this.bulkCount = bulkCount;
	}
	
	//GETTERS
	// accessor returns the item object name
	public String getName() {
		return name;
	}
	// accessor returns the item object price
	public double getPrice() {
		return price;
	}
	// accessor returns the item object bulk discount amount
	public double getDiscount() {
		return discount;
	}
	// accessor returns the item object price after discount
	public double getDiscountedPrice() {
		return this.price - this.discount;
	}
	// accessor returns the item object bulk discount quantity requirement
	public int getBulkCount() {
		return bulkCount;
	}
	// accessor returns the item object name
	public String toString() {
		return name;
	}
	// accessor returns boolean based on whether the item name is equal to another
	public boolean equals(Item item) {
		return this.getName().equalsIgnoreCase(item.getName());
	}
}
