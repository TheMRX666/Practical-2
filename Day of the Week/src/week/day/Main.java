package week.day;

import java.util.Scanner;

public class Main {
	
	private static String weekday(int day) {
		
		
		switch(day) {
		case 1:
			return "Monday";
		case 2:
			return "Tuesday";
		case 3:
			return "Wednesday";
		case 4:
			return "Thursday";
		case 5:
			return "Friday";
		case 6:
			return "Weekends - Saturday";
		case 7:
			return "Weekends - Sunday";
		default:
            System.out.println("You made a mistake. Try again.");
            return null;
		}
	}
	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int day = scan.nextInt();
		System.out.println(weekday(day));
	}
	
	
}
