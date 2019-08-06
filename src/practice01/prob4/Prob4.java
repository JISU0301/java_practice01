package practice01.prob4;

import java.util.Scanner;

public class Prob4 {
	public static void main (String args[]) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("문자열 입력 : ");
		String input = scanner.nextLine();
		
		for(int i=0; i<=input.length()-1; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print(input.charAt(j));
			}
			System.out.println();
		}
	}
}
