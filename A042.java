<<<<<<< HEAD
package syntexPractice;
=======
package syntaxPractice;
>>>>>>> da2a247cc4f705523805bfff29d631a8f122293c

import java.util.Scanner;

public class A042 {
	// a042: 平面圓形切割
	private static int f(int n) {
		if (n == 1)
			return 2;
		else
			return f(n - 1) + 2 * (n - 1);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (scanner.hasNext()) {
			int n = scanner.nextInt();
			System.out.println(f(n));
		}
	}
}
