package practice01.prob3;

import java.util.Scanner;

public class Prob3 {
	public static void main (String args[]) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("수를 입력하세요 : ");
		
		int x = scanner.nextInt();
		int sum = 0;
		
		if(x%2==0) {
			for(int i=0; i<=x; ++i) {
				if(i%2==0)
					sum += i;
			}
		}else {
			for(int i=0; i<=x; ++i) {
				if(i%2==1)
					sum += i;
			}
		}
		System.out.println("결과값 : " + sum);
	}
}
