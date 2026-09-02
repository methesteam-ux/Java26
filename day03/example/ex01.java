package example;

import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하시오 : ");
		int n = sc.nextInt();
		
		if (n >= 19) {
			System.out.println("성년");
		} else {
			System.out.println("미성년");
		}
	}

}
