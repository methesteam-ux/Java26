package example;

public class ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(factorial(5));
	}

	static int factorial(int n) {
		return switch (n) {
		case 2 -> 2;
		default -> n* factorial(n-1);
		};
	}
}
