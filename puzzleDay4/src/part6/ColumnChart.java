package part6;

import java.util.Random;
import java.util.Scanner;

// 배열의 모든 요소에 난수를 대입한 후 막대 그래프로 표시.
public class ColumnChart {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		System.out.print("요소 수 : ");
		int x = scan.nextInt();
		int[] list = new int[x];
		
		for(int i = 0; i < list.length; i++) {
			list[i] = 1 + rand.nextInt(10);
		}
		for(int i = 10; i >= 1; i--) {
			for(int j = 0; j < x; j++) {
				if(list[j] >= i) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		System.out.println("\n--------------------------");
		for(int i = 0; i < list.length; i++) {
			if(i >= 10) {
				System.out.print(i%10 + " ");
			} else {				
				System.out.print(i + " ");
			}
		}
		
		scan.close();
	}

}
