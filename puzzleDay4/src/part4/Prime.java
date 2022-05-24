package part4;

import java.util.Scanner;

// 소수 판별하기.
public class Prime {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int x;
		
		do {
			System.out.print("2보다 큰 정수 : ");
			x = scan.nextInt();
		} while(x < 2);

		scan.close();

		int i;
		for(i = 2; i < x; i++) {
			if(x%i == 0) {
				break;
			}
		}
		
		if(i == x) {
			System.out.println("소수입니다.");
		} else {			
			System.out.println("소수가 아닙니다.");				
		}
	}

}
