package part6;

import java.util.Scanner;

// 배열의 모든 요소에 값을 읽어서 초깃값 형식으로 표시
public class PrintArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("요소 수 : ");
		int x = scan.nextInt();
		int[] list = new int[x];
		
		for(int i = 0; i < x; i++) {
			System.out.print("list["+i+"] = ");
			int a = scan.nextInt();
			list[i] = a;
		}
		System.out.print("list = {");
		for(int i = 0; i < list.length; i++) {
			if(list.length-1 == i) {				
				System.out.print(list[i]);
			} else {
				System.out.print(list[i] + ", ");
			}
		}
		System.out.print("}\n");
		scan.close();
	}

}
