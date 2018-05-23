package com.exception;

import java.io.IOException;

class Parent {
	void msg() throws ArithmeticException, NullPointerException, IOException{
		System.out.println("parent");
	}
}


class TestExceptionChild2 extends Parent {
	void msg() throws NullPointerException, IOException {
		System.out.println("child");
	}

	public static void main(String args[]) {
		Parent p = new TestExceptionChild2();
		try {
			p.msg();
		} catch (Exception e) {
		}
	}
}
