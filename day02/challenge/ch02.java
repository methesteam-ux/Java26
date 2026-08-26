package challenge;

import java.util.Scanner;

public class ch02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int n;
		
		System.out.print("정수를 입력하세요 : ");
		n = in.nextInt();
		
		if (n%2 == 0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}
	}

}
