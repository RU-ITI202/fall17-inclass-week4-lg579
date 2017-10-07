
public class FunWithMath {
		private static final int NULL = 0;
		public static int firstNum;
		public static int secondNum;
		public static int sum;
		public static int difference;
		public static int product;
		public static int metersGiven;
		
		
	public FunWithMath() {
		firstNum=NULL;
		secondNum=NULL;
	}
	
	
	public static int Sum(int first, int second) {
		firstNum =first;
		secondNum=second;
		sum = firstNum+secondNum;
		return sum;
		
	}
	
	public static int Difference(int first, int second) {
		firstNum = first;
		secondNum=second;
		difference=first-second;
		return difference;
		
	}
	
	
	public static int Product(int first, int second) {
		firstNum = first;
		secondNum=second;
		product=first*second;
		return product;
		
		
	}
	
	public static String Converter(int meters) {
		metersGiven=meters;
		double miles = metersGiven* .000621371192;
		double feet = metersGiven * 3.2808;
		double inches = metersGiven* 39.3701;
		return ("In miles: "+miles+". In feet: "+feet+ ". In inches: "+inches);
		
	}
	
	
	
}
