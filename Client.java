//make a loop that takes what the user wants 
//loop exits when keyword is pressed 
//prints out the reciept which includes total, price, and items. 


import java.util.*;
public class Client {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<ItemOrder> receipt = new ArrayList<ItemOrder>();
		Set<Item> stock = new HashSet<Item>();
		
		// create 8 Item objects and adds them to the stock Set
		stock.add(new Item("apple", 3.99, 0.50, 2));
		stock.add(new Item("banana", 3.49, 0.25, 2));
		stock.add(new Item("broccoli", 1.89, 0.20, 5));
		stock.add(new Item("carrot", 0.99, 0.15, 4));
		stock.add(new Item("oats", 8.99, 0.99, 4));
		stock.add(new Item("potato", 0.40, 0.05, 9));
		stock.add(new Item("zucchini", 0.76, 0.05, 5));
		stock.add(new Item("orange", 0.49, .05, 6));

		System.out.println();
		
		System.out.println("Welcome to the grocery!");
		System.out.println("To add items type 'add' and follow the prompts.");
		System.out.println("To remove items type 'remove' and follow the prompts.");
		System.out.println("To view the stock, type 'stocklist'.");
		System.out.println("Type 'exit' when you are done with entering items for purchase.");
		System.out.println("--------------");
		System.out.println("Currently in stock: " + stock);
		String input = scan.next();
		while(!input.equals("exit")){
			//handles adding new items to receipt
			if (input.equalsIgnoreCase("add")) {
				System.out.println("What would you like to add? ");
				input = scan.next();
				boolean found = false;
				for (Item food : stock) {
					if (food.getName().equalsIgnoreCase(input)) {
						found = true;
						System.out.println("How many would you like to add? ");
						int count = scan.nextInt();
						boolean inOrder = false;
						for (ItemOrder order : receipt) {
							if (order.getItem().getName().equalsIgnoreCase(input)) {
								order.setCount(order.getCount()+count);
								inOrder = true;
							}
						}
						if (!inOrder) receipt.add(new ItemOrder(food,count));
						System.out.println("Added " + count + " " + input);
					}
				}
				if (!found) System.out.println("Invalid input, food not found.");
			}
			//handles removing items from receipt
			else if (input.equalsIgnoreCase("remove")) {
				System.out.println("What would you like to remove? ");
				input = scan.next();
				boolean found = false;
				for (ItemOrder order : receipt) {
					if (order.getItem().getName().equalsIgnoreCase(input)) {
						found = true;
						System.out.println("How many would you like to remove? ");
						int count = scan.nextInt();
						order.setCount(Math.max(order.getCount()-count,0));
						System.out.println("Removed " + count + " " + input);
					}
				}
				if (!found) System.out.println("Invalid input, food not found. Add or remove? ");
			}
			//prints out available options
			else if (input.equalsIgnoreCase("stocklist")){
				System.out.println("stock: " + stock);
			}
			else if (input.equalsIgnoreCase("exit")) break;
			else {
				System.out.println("Invalid input");
			}
			input = scan.next();
		}
		System.out.println();
		System.out.println("You have exited.");
		System.out.println();
		System.out.println("You purchased: ");
		double total = 0.0;
		for(ItemOrder order : receipt) {
			int itemCount = order.getCount();
			if (itemCount > 0) {
				if (itemCount >= order.getItem().bulkCount) total += order.getItem().getDiscountedPrice()*itemCount;
				else total += order.getItem().getPrice();
				System.out.printf(order.getItem().getName() + "(" + itemCount + "): $%.2f", itemCount * order.getItem().getDiscountedPrice());
				System.out.println();
			}
		}
		System.out.printf("Total cost: $%.2f", total);
		scan.close();
	}
}
