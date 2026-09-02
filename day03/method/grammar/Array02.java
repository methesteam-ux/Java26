package grammar;

import java.util.Scanner;

public class Array02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n;
		double sum = 0, average;
		
		System.out.print("학생 수 : ");
		int a = sc.nextInt();
		
		int[] g = new int[a];
		
		System.out.print("5명의 성적 :");
		for (int i = 0; i < a; i++) {
			System.out.print(" ");
			n = sc.nextInt();
			
			g[i] = n;
			sum += n;
		}
		
		average = sum / g.length;
		
		System.out.println(">> 합계: " + sum);
		System.out.println(">> 평균: " + average);
	}

}
