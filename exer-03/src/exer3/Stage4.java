package exer3;

public class Stage4 {

	static String city1 = "Barcelona"; 
	static String city2 = "Madrid"; 
	static String city3 = "Valencia"; 
	static String city4 = "Malaga"; 
	static String city5 = "Cadiz"; 
	static String city6 = "Santader";
	static char[] cityArray1 = new char[city1.length()];
	static char[] cityArray2 = new char[city2.length()];
	static char[] cityArray3 = new char[city3.length()];
	static char[] cityArray4 = new char[city4.length()];
	static char[] cityArray5 = new char[city5.length()];
	static char[] cityArray6 = new char[city6.length()];
	
	public static void main(String[] args) {
		
		printArray(cityArrayGen(cityArray1, city1));
		printArray(cityArrayGen(cityArray2, city2));
		printArray(cityArrayGen(cityArray3, city3));
		printArray(cityArrayGen(cityArray4, city4));
		printArray(cityArrayGen(cityArray5, city5));
		printArray(cityArrayGen(cityArray6, city6));

	}

	public static char[] cityArrayGen(char[] cityArray, String city) {
		for (int i=0; i<city.length(); i++) {
			cityArray[i] = city.charAt(i);
		}
		return cityArray;
	}
	
	public static void printArray(char[] cityArray) {
		for (int i=cityArray.length-1; i<cityArray.length && i>-1; i--) {
			System.out.println(cityArray[i]);
		}
		System.out.println();
	}
	
	
}
