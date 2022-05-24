package part6;

import java.util.Scanner;

// 선형탐색 가장 뒤에 있는 요소.
public class LinearSearchBottom {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("요소 : ");
		int x = scan.nextInt();
		
		int[] list = new int[x];
		for(int i = 0; i < x; i++) {
			System.out.print("list["+i+"] = ");
			int a = scan.nextInt();
			list[i] = a;
		}
		System.out.print("찾을 숫자 : ");
		int search = scan.nextInt();
		
		int j;
		for(j = x-1; j >= 0; j--) {
			 if(list[j] == search) {
				 break;
			 }
		}
		if(j >= 0) {
			System.out.println("그 값은 list["+j+"]에 있습니다.");
		} else {
			System.out.println("해당 값이 존재하지 않습니다.");
		}
		
		scan.close();
	}

}
