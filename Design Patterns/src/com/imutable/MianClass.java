package com.imutable;

import java.util.ArrayList;
import java.util.List;

public class MianClass {

	public static void main(String[] args) {
		
		
		String str= "str1";
		int i = 10;
		
		 List<Employee> li= new ArrayList();

		 Employee e1= new Employee("name1", 1);
		 Employee e2= new Employee("name2", 2);
		 
		 li.add(e1);
		 li.add(e2);
		 
		Immutable im = new Immutable(str, i, li);
		
		System.out.println(im.toString());
		
		
		
		List<Employee> li2 = im.getLi();

	//	li2.clear();
		 Employee e3= new Employee("name3", 3);
		 Employee e4= new Employee("name4", 4);
		
			Employee e= li2.get(0);
			 
			e.setAddress(1000);
			e.setName("change");
	li2.add(e3);
	li2.add(e4);
		
		System.out.println("li2...... "+li2);
		
		System.out.println("After adding "+im.toString());

		
		
	}

}
