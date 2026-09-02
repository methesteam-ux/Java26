package challenge;

public class ch03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(factorial(5));
		System.out.println(factorial(1, 5));
		System.out.println(factorial(3, 5));
		System.out.println(factorial(10, 5));
	}

	public static int factorial(int x) {
		int r = 1;
		
		for (int i = 1; i <= x; i++) {
			r *= i;
		}
		
		return r;
	}
	
	public static int factorial(int x, int y) {
		int r = 1;
		
		for (int i = x; i <= y; i++) {
			r *= i;
		}
		
		return r;
	}
}
