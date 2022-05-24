package part6;

import java.util.Random;
import java.util.Scanner;

// 배열의 나열 순서 섞기
public class Shuffle {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		System.out.print("요소 : ");
		int x = scan.nextInt();
		int[] list = new int[x];
		
		for(int i = 0; i < x; i++) {
			System.out.print("list["+i+"] = ");
			int a = scan.nextInt();
			list[i] = a;
		}
		System.out.println("요소를 섞었습니다.");
		
		for(int i = 0; i < 2 * x; i++) {
			int idx1 = rand.nextInt(x);
			int idx2 = rand.nextInt(x);
			int t = list[idx1];
			list[idx1] = list[idx2];
			list[idx2] = t;
		}
		
		for(int i = 0; i < x; i++) {
			System.out.println("list["+i+"] = " + list[i]);
		}
	}

}
