package challenge;

import java.util.Scanner;

public class ch01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int result, n;
		
		System.out.print("팩토리얼 값을 구할 정수 : ");
		n = sc.nextInt();
		
		result = 1;
		while (n > 0) {
			result *= n;
			n -= 1;
		}
		
		System.out.println(result);
	}

}
