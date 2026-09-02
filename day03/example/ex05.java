package example;

public class ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 20; i >= 12; i--) {
			for (int j = 1; j <= 9; j++) {
				for (int k = 1; k <= 9; k++) {
					if (j*j + k*k == (i-j-k)*(i-j-k)) {
						System.out.printf("(%d, %d, %d)\n", j ,k, i-j-k);
					}
				}
			}
		}
	}

}
