package challenge;

import java.util.Scanner;

public class ch02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int result, n;
		
		System.out.print("팩토리얼 값을 구할 정수 : ");
		n = sc.nextInt();
		
		result = factorial(n);
		System.out.println(result);
	}

	public static int factorial(int x) {
		int r = 1;
		
		for (int i = 1; i <= x; i++) {
			r *= i;
		}
		
		return r;
	}
}
