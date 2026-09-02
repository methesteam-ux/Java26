package grammar;

import java.util.Scanner;

public class For02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		int num;
		
		System.out.println("5개의 숫자를 입력하세요:");
		
		for (int i = 1; i <= 5; i++) {
			System.out.print("");
			num = sc.nextInt();
			
			sum += num;
		}
		
		System.out.printf("5개의 숫자의 합은 %d입니다.", sum);
	}

}
