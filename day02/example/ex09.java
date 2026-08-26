package example;

import java.util.Scanner;

public class ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int m, c, n;
		
		System.out.print("전공 이수 학점 : ");
		m = in.nextInt();
		
		System.out.print("교양 이수 학점 : ");
		c = in.nextInt();
		
		System.out.print("일반 이수 학점 : ");
		n = in.nextInt();
		
		if ((m+c+n >= 140) && (m >= 70) && ((c >= 30) && (n >= 30)) || (c+n >= 80)) {
			System.out.println("졸업 가능");
		} else {
			System.out.println("졸업 불가");
		}
	}

}
