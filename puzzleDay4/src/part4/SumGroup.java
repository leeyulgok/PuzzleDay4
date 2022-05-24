package part4;

import java.util.Scanner;

// 정숫값을 그룹별로 읽어서 합산 (정수 5개 10그룹)
public class SumGroup {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 더합니다.");
		int total = 0;
		
		Outer:
		for(int i = 1; i <= 10; i++) {
			System.out.println(i+"그룹");
			for(int j = 1; j <= 5; j++) {
				System.out.print("정수 : ");
				int x = scan.nextInt();
				if(x == 99999) {
					break Outer;
				} else if(x == 88888) {
					break;
				}
				total += x;
			}
		}
		System.out.println("합계는 " + total + "입니다.");
		scan.close();
	}

}
