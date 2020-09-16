package exer1;

import java.util.Calendar;

public class Stage2 
{
	static final int leapYear = 1948;
	int year;
	int leapYears[];
	
	public static void main(String[] args) throws Exception 
	{	
		int birthyear = 1987;
		
		System.out.print("Number of leap years between " + leapYear + " and " + birthyear + ": ");
		System.out.println(calculNumberOfLeapYears(birthyear));
	
		printLeapYears(leapYearsCalculator(leapYear));
	}
	
	public static void printLeapYears(int leapYears[]) {
		for(int i = 0; i<leapYears.length; i++) {
			if(i<leapYears.length-1) {
				System.out.print(leapYears[i] + ", ");
			} else {
				System.out.print(leapYears[i] + ".");
			}
		}
	}
	
	public static int[] leapYearsCalculator(int leapYear) {
		int currentYear = Calendar.getInstance().get(Calendar.YEAR);
		int arraySize= calculNumberOfLeapYears(currentYear); 
		int leapYears[] = new int[arraySize+1];
		for(int i = 0; i < leapYears.length; i++) {
				leapYears[i] = leapYear;
				leapYear+=4;
		}
		return leapYears;
	}
	
	public static int calculNumberOfLeapYears(int year) {
		int result = (year-leapYear)/4;
		return result;
	}
	
	public static boolean isLeapYear(int year) {
		if(year%4==0 || year%100==0 || year%400==0) {
			return true;
		} else {
			return false;
		}
	}

}
