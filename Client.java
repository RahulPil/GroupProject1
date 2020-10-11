//make a loop that takes what the user wants 
//loop exits when keyword is pressed 
//prints out the reciept which includes total, price, and items. 


import java.util.*;
public class Client {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<String> itemsList = new ArrayList<String>();
		
		// create 8-10 Item objects
		Item apple = new Item("apple", 3.99, 0.50, 2);
		Item banana = new Item("banana", 3.49, 0.25, 2);
		Item broccoli = new Item("broccoli", 1.89, 0.20, 5);
		Item carrot = new Item("carrot", 0.99, 0.15, 4);
		Item oats = new Item("oats", 8.99, 0.99, 4);
		Item potato = new Item("potato", 0.40, 0.05, 9);
		Item zucchini = new Item("zucchini", 0.76, 0.05, 5);

		System.out.println("");
		
		
		System.out.println("Welcome to the grocery!");
		System.out.println("Type 'exit' when you are done with entering items for purchase.");
		System.out.println("--------------");
		String input = "";
		while(input.equals("exit") == false){
			String userinput = scan.nextLine();
			String input = userinput.toLowerCase();
			System.out.println("You have entered: " + input);
			itemsList.add(input);
			
			switch(input){
				case "apple":
				itemsList.add(apple.getName());
				break;

				case "banana":
				itemsList.add(banana.getName());
				break;

				case "broccoli":
				itemsList.add(broccoli.getName());
				break;

				case "carrot":
				itemsList.add(carrot.getName());
				break;

				case "oats":
				itemsList.add(oats.getName());
				break;

				case "potato":
				itemsList.add(potato.getName());
				break;

				case "zucchini":
				itemsList.add(zucchini.getName());
				break;
			}
		}
		System.out.println("You have exited");
		scan.close();
	}
}
