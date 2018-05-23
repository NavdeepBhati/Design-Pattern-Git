package com.singleton;

import java.io.Serializable;

public class SingletonClass extends SuperClass implements Serializable {

	static SingletonClass sc = new SingletonClass();

	String str = "str";
	int i = 10;

	private SingletonClass() {
	}

	 protected Object readResolve()
	    {
	        return sc;
	    }
	
	public static SingletonClass getInstance()  {

		if (sc == null) {

			sc = new SingletonClass();
		}

		return sc;

	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	@Override
	public String toString() {
		return "SingletonClass [str=" + str + ", i=" + i + "]";
	}

	
	/*@Override
	  protected Object clone() throws CloneNotSupportedException 
	  {
	    throw new CloneNotSupportedException("Cloning not allowed");
	  }
	*/
}
