package com.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import com.singleton.EnumExample.SingletonEnum;

public class MainClass {

	public static void main(String[] args) throws Exception {

		SingletonClass sc = SingletonClass.getInstance();

		System.out.println("sc..." + sc.hashCode());

		SingletonClass sc2 = SingletonClass.getInstance();

		System.out.println("sc2..." + sc2.hashCode());

		usingRelection();		// No solution use Enums
		usingCloning();			 // throw exception in overrided clone method
		usingSerializable();     //Use Read resolve method
		usingEnum();			//most secured but less flexibility
	
	
	}

	private static void usingEnum() throws Exception {

	SingletonEnum sc=	EnumExample.SingletonEnum.SingltonClass;
		
	SingletonClass instance1=sc.SingltonClass.getSc();
	
	System.out.println("instance1 enum hashCode:- " + instance1.hashCode());
	}

	private static void usingCloning() throws CloneNotSupportedException {
		SingletonClass instance1 = SingletonClass.getInstance();
		SingletonClass instance2 = (SingletonClass) instance1.clone();
	    System.out.println("instance1 Cloneable hashCode:- "
	                           + instance1.hashCode());
	    System.out.println("instance2 Cloneable hashCode:- "
	                           + instance2.hashCode()); 		
	}

	private static void usingSerializable() {

		SingletonClass instance1 = SingletonClass.getInstance();
		ObjectOutput out;
		try {
			out = new ObjectOutputStream(new FileOutputStream("file.text"));

			out.writeObject(instance1);
			out.close();

			// deserailize from file to object
			ObjectInput in = new ObjectInputStream(new FileInputStream("file.text"));

			SingletonClass instance2 = (SingletonClass) in.readObject();
			in.close();

			System.out.println("instance1 Serialize hashCode:- " + instance1.hashCode());
			System.out.println("instance2 Serialize hashCode:- " + instance2.hashCode());
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void usingRelection()
			throws InstantiationException, IllegalAccessException, InvocationTargetException {

		SingletonClass instanceTwo = null;

		Constructor[] constructors = SingletonClass.class.getDeclaredConstructors();
		for (Constructor constructor : constructors) {
			// Below code will destroy the singleton pattern
			constructor.setAccessible(true);
			instanceTwo = (SingletonClass) constructor.newInstance();
			break;
		}

		System.out.println("Instance1 reflection hashcode " + instanceTwo.hashCode());
	}
}
