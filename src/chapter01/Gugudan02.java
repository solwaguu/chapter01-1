package chapter01;

public class Gugudan02 {
	public static void main(String[] args) {
		for(int i = 1; i <= 9; i++){
			for(int j = 1; j <= 9; j++){
				int result = i * j;
				System.out.println(i + " X " + j + " = " + result);
			}
			System.out.println("===========================");
		}
	}
}