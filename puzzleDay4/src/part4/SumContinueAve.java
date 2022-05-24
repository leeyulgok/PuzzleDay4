package part4;

import java.util.Scanner;

// 읽은 정수를 합산 (음수는 제외)
public class SumContinueAve {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 더합니다.");
		System.out.print("몇 개를 더할까요? : ");
		int total = scan.nextInt();
		
		int i;
		int sum = 0;
		int count = 0;
		for(i = 0; i < total; i++) {
			System.out.print("정수 : ");
			int x = scan.nextInt();
			if(x < 0) {
				System.out.println("음수는 더하지 않습니다.");
				continue;
			}
			sum += x;
			count++;
		}
		System.out.println("합계는 " + sum + "입니다.");
		System.out.println("평균은 " + sum/count + "입니다.");
		
		scan.close();
	}

}
