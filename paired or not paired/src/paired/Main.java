package paired;

import java.util.Scanner;


public class Main {

	private static int paired(int num) {
		if (num%2 != 0) {
			return num;
		}
		else {
			return 0;
		}
	}
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter num: ");
		String readline = scan.nextLine();
		int num = Integer.parseInt(readline);
		System.out.println(paired(num));
	}
	
}
