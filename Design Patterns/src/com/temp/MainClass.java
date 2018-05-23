package com.temp;

public class MainClass {

	public static void main(String[] args) {

		/*
		 * Parent pc = new Child();
		 * 
		 * GrandParent gpc = new Child();
		 * 
		 * 
		 * System.out.println(gpc.descp); System.out.println(pc.descp);
		 * System.out.println(); System.out.println(gpc.getDescp());
		 * System.out.println(pc.getDescp());
		 * 
		 * 
		 * 
		 * String s= new String("Jva"); s.concat("World");
		 */
		System.out.println();
		System.out.println(name());

	}

	@SuppressWarnings("finally")
	private static int name() {

		try {
			return 5 / 0;
		} catch (Exception e) {
			return 1;
		} finally {
			
			System.out.println("After finally");
			return 5;
		}

	}
}
