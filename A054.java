package syntaxPractice;

import java.util.Scanner;

public class A054 {
	// a054: 電話客服中心
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (scanner.hasNext()) {
			String str = scanner.nextLine();
			System.out.println(f(str));
		}
	}
}
