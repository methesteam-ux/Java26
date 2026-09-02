package grammar;

import java.util.Scanner;

public class For03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요:");
		int a = sc.nextInt();
		
		System.out.printf("[구구단 %d단]\n", a);
		
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%dx%d=%d\n", a, i, a*i);
		}
	}

}
