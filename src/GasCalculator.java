
public class GasCalculator {
	public static double numOfGallons;
	public static double pricePer;
	public static double total;
	
	
	
	public static double GasCalculator(int gallons, double price) {
		numOfGallons=  gallons;
		pricePer = price;
		total = (double) numOfGallons*pricePer;
		return total;
	
	}
	
	
	
	
	
	
	
}
