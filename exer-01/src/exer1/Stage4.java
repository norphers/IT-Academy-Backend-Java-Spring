package exer1;

public class Stage4 {

	static String name = "John";
	static String surname1 = "Doe";
	static int day = 24;
	static int month = 10;
	static int year = 1981;
	static boolean isLeapYear;
	
	public static void main(String[] args) {
		
		System.out.println("My name is " + getFullName(name, surname1));
		System.out.println("My birthday is: " + getFullBirthdate(year, month, day));
		System.out.println(isLeapYear(year));
		
		
	}
	
	public static String getFullName(String name, String surname) {
		String fullName = name + " " + surname;
		return fullName;
	}
	
	public static String getFullBirthdate(int year, int month, int day) {
		String birthday = year + "/" + month + "/" + day;
		return birthday;
	}
	
	public static String isLeapYear(int year) {
		if(year%4==0 || year%100==0 || year%400==0) {
			isLeapYear = true;
		} else {
			isLeapYear = false;
		}
		
		if(isLeapYear) {
			String messageLeapYear = year + " is a leap year"; 
			return messageLeapYear;
		} else {
			String messageNotLeapYear = year + " is not a leap year";
			return messageNotLeapYear;
		}

	}

}
