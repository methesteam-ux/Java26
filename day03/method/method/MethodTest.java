package method;

import java.util.Arrays;

public class MethodTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numArr = {3, 6, 2, 4, 8};
		
		System.out.println("getIndex의 결과값 = " + getIndex(numArr, 2));
		System.out.println("getMax의 결과값 = " + getMax(numArr));
		System.out.println("getMin의 결과값 = " + getMin(numArr));
		System.out.println("getCount의 결과값 = " + getCount(numArr, 5));
		System.out.println("getSum의 결과값 = " + getSum(numArr));
		System.out.println(Arrays.toString(numArr));
		swapArray(numArr);
		System.out.println(Arrays.toString(numArr));
	}
	
	public static int getSum(int[] numArr) {
		int sum = 0;
		
		for (int i = 0; i < numArr.length; i++) {
			sum += numArr[i];
		}
		
		return sum;
	}
	
	public static int getMax(int[] numArr) {
		int max = numArr[0];
		
		for (int i = 0; i < numArr.length; i++) {
			if (max < numArr[i]) {
				max = numArr[i];
			}
		}
		
		return max;
	}
	
	public static int getMin(int[] numArr) {
		int min = numArr[0];
		
		for (int i = 0; i < numArr.length; i++) {
			if (min > numArr[i]) {
				min = numArr[i];
			}
		}
		
		return min;
	}
	
	public static int getCount(int[] numArr, int N) {
		int sum = 0;
		
		for (int i = 0; i < numArr.length; i++) {
			if (numArr[i] > N) {
				sum += 1;
			}
		}
		
		return sum;
	}
	
	public static int getIndex(int[] numArr, int N) {
		for (int i = 0; i < numArr.length; i++) {
			if (numArr[i] == i) {
				return i;
			}
		}
		return -1;
	}
	
	public static void swapArray(int[] numArr) {
		int temp;
		
		for (int i = 0; i < numArr.length/2; i++) {
			temp = numArr[i];
			numArr[i] = numArr[numArr.length-i-1];
			numArr[numArr.length-i-1] = temp;
		}
	}
}
