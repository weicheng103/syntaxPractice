package syntexPractice;

import java.math.BigDecimal;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		// if(args.length == 0 ){
		// System.out.println("args=0");
		// }else{
		// for(int i = 0; i < args.length; i++){
		// System.out.println(args[i]);
		// }
		// }
		// String str = "weicheng";
		// System.out.print(str.charAt(4));
		// Scanner scanner = new Scanner(System.in);
		// String str = "A153";
		// int len = 3;
		// double sum = 0;
		//
		// System.out.println(Character.getNumericValue(str.charAt(1)));
		// Math.pow(2, 5);
		// System.out.println(Math.pow(3, 5));
		int[] alpha = new int[26];
		for (int i = 10; i <= 35; i++) {
			alpha[i - 10] = (i / 10) + (i % 10) * 9;
		}
		for (int a : alpha) {
			System.out.print(a+" ");
		}

	}
}
