//make a loop that takes what the user wants 
//loop exits when keyword is pressed 
//prints out the reciept which includes total, price, and items. 


import java.util.*;
public class Client {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("This is a trail");

		while(scan.nextLine() != "exit"){
			String input = scan.nextLine();
			System.out.println("You have entered " +input);

	
		}
		System.out.println("You have exited");
		
		scan.close();

	}

}
