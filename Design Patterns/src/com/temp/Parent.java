package com.temp;

public class Parent extends GrandParent {

	String descp = "Hello Par";

	public String getDescp() {
		return super.descp + "   "+descp ;
	}

}
