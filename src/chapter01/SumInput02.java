package chapter01;

import java.util.Scanner;

public class SumInput02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt(); // blocking
		
		int sum = 0;
		for(int i = 1; i <= number; i++) {
			sum = sum + i;
		}
		
		System.out.println(number + "까지 합은 "+ sum + "입니다.");
		scanner.close();	

	}

}
