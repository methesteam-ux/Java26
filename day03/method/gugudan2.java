package method;

public class gugudan2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 2; i <= 9; i++) {
			gugudan(i);
			System.out.println();
		}
	}
	
	public static void gugudan(int num) {
		System.out.println("[구구단 " + num + "단]");
		
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d x %d = %d\n", num, i, num*i);
		}
	}
}

