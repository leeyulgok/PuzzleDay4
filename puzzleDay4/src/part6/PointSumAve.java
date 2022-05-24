package part6;

import java.util.Scanner;

// 점수를 입력 받아서 합계, 평균, 최고점, 최저점을 표시.
public class PointSumAve {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("사람 수 : ");
		int x = scan.nextInt();
		int[] point = new int[x];
		int total = 0;
		
		int i;
		for(i = 0; i < x; i++) {
			System.out.print(i+1 + "번의 점수 : ");
			int a = scan.nextInt();
			point[i] = a;
			total += a;
		}
		int max = point[0];
		int min = point[0];
		
		for(int j = 1; j < x; j++) {
			if(point[j] > max) {
				max = point[j];
			}
			if(point[j] < min) {
				min = point[j];
			}
		}
		
		System.out.println("합계는 " + total + "입니다.");
		System.out.println("평균은 " + total/i + "입니다.");
		System.out.println("최고점은 " + max + "입니다.");
		System.out.println("최저점은 " + min + "입니다.");
		
		scan.close();
	}

}
