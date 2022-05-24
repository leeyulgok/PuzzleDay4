package part4;

import java.util.Scanner;

// 읽은 정숫값들을 합산 (0이 입력되면 종료)
public class SumBreakAve1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 더합니다.");
		System.out.print("몇 개를 더할까요? : ");
		int total = scan.nextInt();
		
		int sum = 0;
		int i;
		
		for(i = 0; i < total; i++) {
			System.out.print("정수(0으로 종료) : ");
			int x = scan.nextInt();
			if(x == 0) {
				break;
			}
			sum += x;
		}
		scan.close();
		
		System.out.println("합계는 " + sum + "입니다.");
		System.out.println("평균은 " + sum/i + "입니다.");
	}

}
