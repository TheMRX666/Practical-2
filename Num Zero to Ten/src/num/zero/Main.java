package num.zero;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter num:");
		int num = scan.nextInt();
		if(num >= 0 && num <=10) {
			System.out.println("Позитивне число менше 10 або нуль");
		}
		else {
			System.out.println("Позитивне число більше 10 або негативне");
		}
	}
	
}
