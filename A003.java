<<<<<<< HEAD
package syntexPractice;
=======
package syntaxPractice;
>>>>>>> da2a247cc4f705523805bfff29d631a8f122293c

import java.util.Scanner;

public class A003 {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		int day = scanner.nextInt();
		int s = (month * 2 + day) % 3;
		
		if( s % 3 == 0)
			System.out.println("普通");
		if( s % 3 == 1)
			System.out.println("吉");
		if( s % 3 == 2)
			System.out.println("大吉");
	}
}
