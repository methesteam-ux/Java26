package example;

import java.util.Scanner;

public class ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int n;
		boolean c1, c2, c3;
		
		System.out.print("정수를 입력하세요 : ");
		n = in.nextInt();
		
		c1 = ((n%4 == 0) && (n%5 == 0));
		c2 = ((n%4 == 0) || (n%5 == 0));
		c3 = (((n%4 == 0) && (n%5 != 0)) || ((n%4 != 0) && (n%5 == 0)));
		
		System.out.println("입력된 정수가 4와 5로 나누어지는가? " + c1);
		System.out.println("입력된 정수가 4 또는 5로 나누어지는가? " + c2);
		System.out.println("입력된 정수가 4또는 5로 나누어지지만 두 수 모두로는 나누어지지 않는가? " + c3);
	}

}
