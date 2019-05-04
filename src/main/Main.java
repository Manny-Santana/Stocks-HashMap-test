package main;

import java.util.*;

import classes.Stock;

public class Main {

	public static void main(String[] args) {
		
		/*Program that takes stock data as an input 
		 * in the form of a Stock object and adds it to a hashmap 
		 * for constant time search. 
		 */
		
		//stock data
		Stock google = new Stock("GOOG", 1000.00);
		Stock amazon = new Stock("AMZN", 2000.00);
		Stock facebook = new Stock("FACE", 900.00);
		
		//stock array to be put into a map
		Stock[] array = {google,amazon,facebook};
		
		//initialize map
		Map<String, Stock> stockMap = new HashMap<>();
		
		//input data into the map
		for(Stock stock: array) {
			stockMap.put(stock.getSymbol(), stock);
		}
		
		//initialize set to get key values
		//to make sure we were able to put the symbols in the map
		Set<String> keys = stockMap.keySet();
		
		//print keys for testing
		System.out.println("Keys");
		for(String k: keys)
			System.out.println(k);
		
		//ASK FOR INPUT
		System.out.println("Please input a value to seach for eg: GOOG.. ");
		
		//Scan for input
		Scanner sc = new Scanner(System.in);
		//assign input value to search value
		String searchVal = sc.nextLine();
		
		//stock value to be found
		Stock foundStock = stockMap.get(searchVal);
		
		// check if its null - if not display values
		if(foundStock != null) {
			System.out.println("Searcning for stock: " + searchVal);
			System.out.println("The stock was found: " + foundStock);
			
		}// if its is null - notify user of failure.
		else 
			System.out.println("The stock was not found!");
		sc.close();
			
		
		
		
		
		
		
		

	}

}
