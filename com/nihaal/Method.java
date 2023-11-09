package com.nihaal;

class A{
	
	public void test() {
		System.out.println("Test Method");
	}
	
	public int add(int a,int b) {
		int c=a+b;
		System.out.println("Add Result:"+c);
		return a=b;
	}
	
}
public class Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A a = new A();
		
		a.test();
		a.add(122, 78);

	}

}
