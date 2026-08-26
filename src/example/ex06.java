package example;

import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		double f;
		
		System.out.print("섭씨로 변환할 화씨 온도를 입력하세요 : ");
		f = in.nextDouble();
		
		System.out.println("섭씨 " + (((double) 5/(double) 9)*(f-32)) + "도");
	}

}
