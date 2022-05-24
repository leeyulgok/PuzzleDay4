package part6;

import java.util.Random;
import java.util.Scanner;

// 배열의 모든 요소를 1~10의 난수로 채우기 (인접한 요소가 중복X)
public class ArrayRandX {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		System.out.print("요소 : ");
		int x = scan.nextInt();
		int[] list = new int[x];
		
		list[0] = 1 + rand.nextInt(10);
		
		for(int i = 1; i < x; i++) {
			do {
				list[i] = 1 + rand.nextInt(10);
			} while(list[i]==list[i-1]);
		}
		
		
		for(int i = 0; i < x; i++) {
			System.out.println("list["+i+"] = " + list[i]);
		}
		scan.close();
	}

}
