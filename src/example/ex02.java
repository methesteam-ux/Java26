package example;

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int n;
		
		System.out.print("정수를 입력하세요 : ");
		n = in.nextInt();
		
		System.out.print(n + "의 제곱은 " + n*n);
	}

}
