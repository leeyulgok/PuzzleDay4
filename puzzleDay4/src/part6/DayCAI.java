package part6;

import java.util.Random;
import java.util.Scanner;

// 요일 영어 단어 학습 프로그램.
public class DayCAI {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		String[] dayKorean = {"월", "화", "수", "목", "금", "토", "일"};
		String[] dayString = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
		
		System.out.println("요일 명을 영어로 입력하세요.(첫글자는 대문자, 나머지는 소문자)");
		
		int retry;
		int last = -1;
		do {
			int day;
			do {
				day = rand.nextInt(7);
			} while(day == last);
			last = day;
			
			while(true) {
				System.out.print(dayKorean[day] + "요일 : ");
				String s = scan.next();
				if(s.equals(dayString[day])) {
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
