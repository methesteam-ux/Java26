package example;

import java.util.Scanner;

public class ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("양의 정수를 입력하세요 : ");
		int num = new Scanner(System.in).nextInt();
		
		if (isPrime(num)) {
			System.out.println(num + "는 소수입니다.");
		} else {
			System.out.println(num + "는 소수가 아닙니다.");
		}
	}

	static boolean isPrime(int n) {
		for (int i = 2; i <= n/2; i++) {
			if ((n > 1) & (n%i == 0)) {
				return false;
			}
		}
		return true;
	}
}
