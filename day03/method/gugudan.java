package method;

import java.util.Scanner;

public class gugudan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요:");
		int num = sc.nextInt();
		
		gugudan(num);
	}
	
	public static void gugudan(int num) {
		System.out.println("[구구단 " + num + "단]");
		
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d x %d = %d\n", num, i, num*i);
		}
	}
}
