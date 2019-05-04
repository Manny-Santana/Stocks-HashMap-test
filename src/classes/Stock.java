package classes;

public class Stock {
	
	private String symbol;
	private double sharePrice;
	
	public Stock(String symbol, double price) {
		this.symbol = symbol;
		this.sharePrice = price;
		
	}

	public String getSymbol() {
		return this.symbol;
	}
	
	public double getSharePrice() {
		return this.sharePrice;
	}

	public void setSharePrice(double price) {
		this.sharePrice = price;
	}
	
	public String toString() {

		return symbol + ": " + sharePrice;
		
	}
	
	public int hashCode() {
		
		return symbol.hashCode();
		
	}
}

