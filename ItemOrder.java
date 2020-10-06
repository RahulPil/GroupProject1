/* 
... also implement an ItemOrder class that represents a 
shopper’s desire to purchase a given item in a 
given quantity, such as five boxes of tissues. 
You might wish to implement bulk-discounted items, 
uch as two boxes of tissues for $4, which would bring 
the cost of the given item order of 2+2+1
----
Methods to implement: 

*/ 

public class ItemOrder {
	private Item item;
	private int count;
	
	//CONSTRUCTORS
	ItemOrder(Item item, int count) {
		this.item = item;
		this.count = count;
	}
	ItemOrder(Item item) {
		this(item, 1);
	}
	
	//SETTERS
	public void setItem(Item item) {
		this.item = item;
	}
	
	public void setCount(int count) {
		this.count = count;
	}
	
	//GETTERS
	public Item getItem() {
		return item;
	}
	
	public int getCount() {
		return count;
	}
	
	public double getOrderCost() {
		if(item.getBulkCount() <= count) return item.getDiscountedPrice()*count;
		return item.getPrice()*count;
	}
	
}
