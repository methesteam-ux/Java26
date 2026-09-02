package grammar;

import java.util.Scanner;

public class While01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		
		System.out.print("숫자를 입력하세요:");
		int a = sc.nextInt();
		
		while (a != 0) {
			sum += a;
			
			System.out.print("숫자를 입력하세요:");
			a = sc.nextInt();
		}
		
		System.out.println("지금까지 입력한 숫자의 합은 " + sum + "입니다.");
	}

}
