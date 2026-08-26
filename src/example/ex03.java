package example;

import java.util.Scanner;
import java.lang.Math;

public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		double r, h;
		
		System.out.print("원기둥의 밑면 반지름은? ");
		r = in.nextDouble();
		
		System.out.print("원기둥의 높이는? ");
		h = in.nextDouble();
		
		System.out.println("원기둥의 부피는 " + Math.PI*r*r*h);
	}

}
