/* 
 * Group Project #1
 * Group 6 (Anders, Julian, Rahul, Rosie, Sean, Vatsal)
 * CS 211
 * Due: 10/12/2020
 * Quarter: Fall 2020
 * 
 * ItemOrder Class creates a ItemOrder object that represents a shopper's 
 * order in purchasing a item in a given quantity. 
 */ 

public class ItemOrder {
	// field
	private Item item;
	private int count;
	
	// CONSTRUCTORS
	ItemOrder(Item item, int count) {
		this.item = item;
		this.count = count;
	}
	// deafult constructor
	ItemOrder(Item item) {
		this(item, 1);
	}
	
	// SETTERS
	// mutator method sets the ItemOrder object's Item
	public void setItem(Item item) {
		this.item = item;
	}
	// mutator method sets the ItemOrder object's quantity
	public void setCount(int count) {
		this.count = count;
	}
	
	// GETTERS
	// accessor for ItemOrder object's Item
	public Item getItem() {
		return item;
	}
	// accessor for ItemOrder object's quantity
	public int getCount() {
		return count;
	}
	// method calculates and returns the ItemOrder's price
	public double getOrderCost() {
		if(item.getBulkCount() <= count) return item.getDiscountedPrice()*count;
		return item.getPrice()*count;
	}
}
