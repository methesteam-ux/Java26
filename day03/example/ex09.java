package example;

public class ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		foo("안녕", 1);
		foo("안녕하세요", 1, 2);
		foo("잘 있어");
	}

	static void foo(String a, int...n) {
		System.out.print(a);
		
		for (int i: n) {
			System.out.print(" " + i);
		}
		
		System.out.println();
	}
}
