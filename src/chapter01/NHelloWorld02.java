package chapter01;

import java.util.Scanner;

public class NHelloWorld02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt(); // blocking
		
//		int i = 0;
//		while(i < number) {
//			System.out.println("Hello World");
//			i++;
//		}

		for(int i = 0; i < number; i++) {
			System.out.println("Hello World");
		}
		
		scanner.close();

	}

}
