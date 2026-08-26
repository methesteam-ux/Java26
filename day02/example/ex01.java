package example;

public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 6; i++) {
			System.out.println(" ".repeat(6-i) + "*".repeat(2*i-1) + " ".repeat(6-i));
		}
	}

}
