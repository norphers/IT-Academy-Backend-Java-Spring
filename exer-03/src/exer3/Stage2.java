package exer3;

import java.util.Arrays;
import java.util.Scanner;

public class Stage2 {
	
	static Scanner sc = new Scanner(System.in);
	static String city1 = "Barcelona"; 
	static String city2 = "Madrid"; 
	static String city3 = "Valencia"; 
	static String city4 = "Málaga"; 
	static String city5 = "Cádiz"; 
	static String city6 = "Santader";
	static String city7 = "test"; // testing try/catch exception
	static String[] cities = new String[6];
	
	public static void main(String[] args) {
		try {
			citiesArrayGen(city1);
			citiesArrayGen(city2);
			citiesArrayGen(city3);
			citiesArrayGen(city4);
			citiesArrayGen(city5);
			citiesArrayGen(city6);
			citiesArrayGen(city7);
		} catch (Exception e) {
			System.out.println("Array is full " + e);
		}
		printArray(cities);
	}
	
	public static String[] citiesArrayGen(String city) throws Exception {
		if(cities != null) {
			for(int i=0; i<=cities.length; ) {
				if(cities[i] == null || cities[i].isEmpty()) {
					cities[i] = city;
					break;
				} 
				else {
					i++;
				}
			}
			return cities;
		} else {
			throw new Exception();
		}
	}
	
	public static void printArray(String[] stringArray) {
		Arrays.sort(stringArray);
		for(int i=0; i<stringArray.length; i++) {
			System.out.println(stringArray[i]);
		}
	}

}
