package example;

import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, h, m, s;
		
		Scanner in = new Scanner(System.in);

		System.out.print("초 단위 정수를 입력하세요 : ");
		n = in.nextInt();
		
		h = n/3600;
		m = n/60;
		s = n%60;
		
		System.out.println(h + "시간 " + m + "분 " + s + "초");
	}

}
