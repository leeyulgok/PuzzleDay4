package part6;

import java.util.Random;
import java.util.Scanner;

// 배열의 모든 요소를 1~10의 난수로 채울 것 (모든 요소가 중복돼서는 안된다.)
public class ArrayRandY {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		System.out.print("요소 : ");
		int x = scan.nextInt();
		int[] list = new int[x];
		
		for(int i = 0; i < x; i++) {
			int j;
			do {
				j = 0;
				list[i] = 1 + rand.nextInt(10);
				for(; j < i; j++) {
					if(list[j] == list[i]) {
						break;
					}
				}
			} while(j < i);
		}
		
		for(int i = 0; i < x; i++) {
			System.out.println("list["+i+"] = " + list[i]); 
		}
		scan.close();
	}

}
