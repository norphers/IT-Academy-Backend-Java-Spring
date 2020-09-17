package exer3;

import java.util.Scanner;

public class Stage1 {

	static Scanner sc = new Scanner(System.in);
	static String city1; //Barcelona
	static String city2; //Madrid
	static String city3; //Valencia
	static String city4; //Málaga
	static String city5; //Cadiz
	static String city6; //Santander
	
	public static void main(String[] args) {
		
		city1 = setCity();
		city2 = setCity();
		city3 = setCity();
		city4 = setCity();
		city5 = setCity();
		city6 = setCity();
		System.out.println("Cities: " + city1 + ", " + city2 + ", " + city3 + ", " + city4 + ", " + city5 + ", and " + city6 + ".");
		sc.close();
	}
	
	public static String setCity() {
		System.out.println("Enter a city name: ");
		String city = sc.nextLine();
		return city;
	}

}
