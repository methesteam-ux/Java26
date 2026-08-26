package example;

import java.util.Scanner;

public class ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int n;
		
		System.out.print("0~999 사이의 정수를 입력하세요 : ");
		n = in.nextInt();
		
		System.out.println("각 자릿수의 합 = " + (n/100 + (n%100)/10 + n%10));
	}

}
