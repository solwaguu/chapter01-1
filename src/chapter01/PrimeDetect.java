package chapter01;

import java.util.Scanner;

public class PrimeDetect {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("소수인지 판단할 숫자: ");

		int i = 2;
		int num = scanner.nextInt();
		boolean isPrime = true;
		
		while(i < num) {
			int result = num % i;
			if( result == 0) {
				isPrime = false;
				break;
			}
			i++;
		}
		
		if(isPrime) {
			System.out.println(num + "은 소수입니다.");
		} else {
			System.out.println(num + "은 소수가 아닙니다.");
		}
		
		scanner.close();
	}

}
