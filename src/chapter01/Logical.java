package chapter01;

public class Logical {

	public static void main(String[] args) {
		// 논리연산자는 이항연산자인데...
		// 각항이 true, false의 변수나 연산이어야 한다.
		int a = 7;
		int b = 3;
		
		// || : or(논리합)
		// true  || false => true
		//   1    +   0   => 1
		// true  || true  => true
		// false || true  => true
		// false || false => false

		// && : and(논리곱)
		// true  || false => false
		//   1    *   0   => 0
		// true  || true  => true
		// false || true  => false
		// false || false => false

		System.out.println(a == b || a > b);
		System.out.println(a == b && a > b);

		System.out.println(a != b || a > b);
		System.out.println(a != b && a > b);
		
		// !: not : 단항연산자 연산결과의 반대 
		System.out.println(!(a > b));
	}

}
