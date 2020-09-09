package exer1;

public class Stage3 {
	
	static int leapYear = 1948;
	int year;
	int leapYears[];
	static boolean isLeapYear;
	
	public static void main(String[] args) throws Exception 
	{	
		int birthyear = 1987;
		
		System.out.println(isLeapYear(birthyear));
		
		System.out.print("Number of leap years between " + leapYear + " and " + birthyear + ": ");
		System.out.println(calculNumberOfLeapYears(birthyear));
		
		System.out.print("List of leap years: ");
		printLeapYears(leapYearsSince(birthyear));
	
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
	
	public static int[] leapYearsSince(int year) {
		int arraySize= calculNumberOfLeapYears(year);
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
	
	public static String isLeapYear(int year) {
		if(year%4==0 || year%100==0 || year%400==0) {
			isLeapYear = true;
		} else {
			isLeapYear = false;
		}
		
		if(isLeapYear) {
			String messageLeapYear = year + " is a leap Year"; 
			return messageLeapYear;
		} else {
			String messageNotLeapYear = year + " is not a leap Year";
			return messageNotLeapYear;
		}

	}

}
