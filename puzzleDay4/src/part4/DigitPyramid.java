package part4;

import java.util.Scanner;

// 숫자 피라미드
public class DigitPyramid {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 : ");
		int x = scan.nextInt();
		
		for(int i = 1; i <= x; i++) {
			for(int j = 0; j < x-i; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j < 2*i-1; j++) {
				if(i >= 10) {
					System.out.print(i%10);
				} else {					
					System.out.print(i);
				}
			}
			System.out.println();
		}
		
		scan.close();
	}

}
