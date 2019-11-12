package chapter01;

public class Gugudan03 {
	public static void main(String[] args) {
		for(int i = 1; i <= 9; i++){
			for(int j = 1; j <= 9; j++){
				int result = i * j;
				System.out.print(j + " X " + i + " = " + result + "\t");
			}
			System.out.println("===========================");
		}		
	}
}
