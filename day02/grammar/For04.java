package grammar;

import java.util.Scanner;

public class For04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		
		System.out.print("양의 숫자를 입력하세요:");
		int a = sc.nextInt();
		
		while (a <= 0) {
			System.out.print("양의 숫자가 아닙니다. 다시 입력하세요:");
			a = sc.nextInt();
		}
		
		for (int i = 1; i <= a; i++) {
			sum += i;
		}
		
		System.out.printf("1부터 %d까지의 합은 %d입니다.", a, sum);
	}

}
