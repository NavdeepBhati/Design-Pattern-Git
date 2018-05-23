package com.temp;

public class Child extends Parent {

	String descp=" Hello Child";
	
	public String getDescp() {
		return super.descp + "   "+descp ;
	}

}
