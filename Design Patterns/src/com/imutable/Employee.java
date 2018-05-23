package com.imutable;

public class Employee implements Cloneable {

	
	String name;
	
	int address;

	
	
	@Override
	public Employee clone() {
        Employee clone = null;
       
        try{
            clone = (Employee) super.clone();
           
        }catch(CloneNotSupportedException e){
            throw new RuntimeException(e); // won't happen
        }
	
	return clone;
	
	}
	
	
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", address=" + address + "]";
	}

	public Employee(String name, int address) {
		super();
		this.name = name;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAddress() {
		return address;
	}

	public void setAddress(int address) {
		this.address = address;
	}





}
