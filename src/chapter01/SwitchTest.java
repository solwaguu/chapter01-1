package chapter01;

public class SwitchTest {

	public static void main(String[] args) {
		int month = 13;
		int days = 0;
		
		if(month == 1) {
			days = 31;
		} else if(month == 2) {
			days = 28;
		} else if(month == 3) {
			days = 31;
		} else if(month == 4) {
			days = 30;
		} else if(month == 5) {
			days = 31;
		} else if(month == 6) {
			days = 30;
		} else if(month == 7) {
			days = 31;
		} else if(month == 8) {
			days = 31;
		} else if(month == 9) {
			days = 30;
		} else if(month == 10) {
			days = 31;
		} else if(month == 11) {
			days = 30;
		} else if(month == 12) {
			days = 31;
		} else {
			System.out.println("1 ~ 12 까지만 입력해 주세요.");
			return;
		}
		
		System.out.println(month +"월은 " + days + "일 까지 있습니다.");

	}

}
