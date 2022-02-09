package superKeyword.and.its.uses;
/*
 * Super can be used to refer immediate parent class Method
 */

class A2 {
	void m1() {
		System.out.println("i'm in class A2");
	}
}

class B2 extends A2 {
	void m1() {
		//super.m1();
		System.out.println("i'm in class B2 and overriding the method as well");
	}

	void show() {
		m1();
		super.m1();// Super can be used to refer immediate parent class Method
		System.out.println("I'm in class B2 ");
	}
}

public class SuperKeyword_02 {
	public static void main(String[] args) {
		B2 b2 = new B2();
		b2.show();
		
	}
}
