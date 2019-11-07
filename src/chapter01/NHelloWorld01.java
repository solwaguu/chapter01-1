package chapter01;

import java.util.Scanner;

public class NHelloWorld01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt(); // blocking
		
		int i = 0;
		while(i < number) {
			System.out.println("Hello World");
			i++;
		}
		
		
		scanner.close();
	}
}
