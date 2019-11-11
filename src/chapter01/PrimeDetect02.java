package chapter01;

import java.util.Scanner;

public class PrimeDetect02 {

	public static void main(String[] args) {
		
		int j = 1;
		while( j <= 500000 ) {
			int num = j;

  	        int i = 2;
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
				System.out.println(num);
			} 
			
			j++;
		}		
		
		
		
	}
}
