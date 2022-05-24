package part6;

import java.util.Random;
import java.util.Scanner;

// 각 월에 해당하는 영어 단어 학습 프로그램
public class MonthCAI {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		String[] monthString = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

		System.out.println("해당 월의 영어 단어를 입력하세요.");
		System.out.println("첫 글자는 대문자, 나머지는 소문자로 입력하세요.");

		int retry;
		int last = -1;
		do {
			int month;
			do {
				month = rand.nextInt(12);
			} while(month == last);
			last = month;
			
			while(true) {
				System.out.print((month + 1)+"월: ");
				String s = scan.next();
				
				if(s.equals(monthString[month])) {
					break;
				}
				System.out.println("틀렸습니다.");
			}
			System.out.print("정답입니다. 다시 한 번? 1-Yes/0-No : ");
			retry = scan.nextInt();
		} while(retry == 1);
		scan.close();
	}

}
