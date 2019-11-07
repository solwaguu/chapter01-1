package chapter01;

import java.util.Scanner;

public class SumInput01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt(); // blocking
		
		int sum = 0;
		int i = 1;
		while(i <= number) {
			sum = sum + i;
			i++;
		}		
		
		System.out.println(number + "까지 합은 "+ sum + "입니다.");
		scanner.close();		
	}

}
