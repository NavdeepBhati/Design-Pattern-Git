package com.singleton;

public class EnumExample {

	public enum SingletonEnum {
		SingltonClass;		
		
		public SingletonClass getSc() {
			return SingletonClass.getInstance();
		}



	}

}
