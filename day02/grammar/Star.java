package grammar;

import java.util.Scanner;

public class Star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("양의 숫자를 입력하세요:");
		int a = sc.nextInt();
		
		if (!(a >= 1)) {return;}
		
		System.out.println("[Star01]");
		for (int i = 1; i <= a; i++) {
			System.out.println("*".repeat(i));
		}
		System.out.println();
		
		System.out.println("[Star02]");
		for (int i = 1; i <= a; i++) {
			System.out.println("*".repeat(a-i+1));
		}
		System.out.println();
		
		System.out.println("[Star03]");
		for (int i = 1; i <= a; i++) {
			System.out.println(" ".repeat(a-i) + "*".repeat(i));
		}
		System.out.println();
		
		System.out.println("[Star04]");
		for (int i = 1; i <= a; i++) {
			System.out.println(" ".repeat(i-1) + "*".repeat(a-i+1));
		}
		System.out.println();
		
		System.out.println("[Star05]");
		for (int i = 1; i <= a; i++) {
			System.out.println(" ".repeat(a-i) + "*".repeat(2*i-1) + " ".repeat(a-i));
		}
		System.out.println();
		
		System.out.println("[Star06]");
		for (int i = 1; i <= a; i++) {
			System.out.println(" ".repeat(i-1) + "*".repeat(2*(a-i+1)-1) + " ".repeat(i-1));
		}
		System.out.println();
	}

}
