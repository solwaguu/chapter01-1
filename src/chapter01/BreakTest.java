package chapter01;

public class BreakTest {

	public static void main(String[] args) {
		// 0에서 부터 합이 5000이상이 될 까지 계속 합을 하는 루틴
		int sum = 0;

//		int i = 0;
//		while(sum < 5000) {
//			sum += i;
//			i++;
//		}

//		for(int i = 0; sum < 5000; i++) {
//			sum += i;
//		}

		int i = 0;
		while(true) {
			sum += i;
			if(sum >= 5000) {
				break;
			}
			i++;
		}
		
		System.out.println( sum );
		
//		while( true ) {
//			System.out.println("1111");
//		}
	}

}
