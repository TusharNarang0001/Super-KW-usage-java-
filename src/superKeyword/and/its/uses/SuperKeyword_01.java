package superKeyword.and.its.uses;
/*
 * Super can be used to refer immediate parent class instance variable
 */
class A1{
	int a=10;
}
class B1 extends A1{
	int a=20;
	void show(int a) {
		System.out.println("Child object , value of a : "+a);
		System.out.println("using this keyword , value of a : "+this.a);
		System.out.println("using super keyword , value of a : "+super.a);
	}
}

public class SuperKeyword_01 {
	public static void main(String[] args) {
		B1 b= new B1();
		b.show(30);
	}
}
