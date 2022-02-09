package superKeyword.and.its.uses;
/*
 * Super keyword can be used to invoke immidiate parent class Constructor
 */

class A3 {
	A3() {
		System.out.println("i'm  class A3 Constructor");
	}
}

class B3 extends A3 {
	B3() {
		System.out.println("i'm  class B2 Constructor");
	}

}

public class SuperKeyword_03 {
	public static void main(String[] args) {
		B3 b3= new B3();
	}
}
