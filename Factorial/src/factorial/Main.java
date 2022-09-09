package factorial;


public class Main {
	
	private static int fact(int num) {

	  int result = 1;
	  for (int i = 1; i <= num; i++) {
	     result = result * i;
	  }
	  return result;
	}
	
	public static void main(String[] args) {
		int min = 0;
		int max = 6;
		for(int i = 0; i <1; i++) {
			int num = (int) (Math.random()*(max-min)) + min;
			System.out.println(fact(num));
		}
	}
}
