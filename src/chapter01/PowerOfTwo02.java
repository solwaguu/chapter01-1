package chapter01;

import java.util.Scanner;

public class PowerOfTwo02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("승수: ");
		int power = scanner.nextInt();
		
		long result = 1;
		for(int i = 0; i < power; i++) {
			result = result * 2;
		}
		
		System.out.println("2의 " + power +"승은 " + result +"입니다.");
		scanner.close();
	}

}
