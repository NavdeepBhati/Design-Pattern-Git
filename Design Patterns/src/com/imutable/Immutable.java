package com.imutable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Immutable {

	private String str;

	private int i;

	private List<Employee> li;

	public Immutable(String str, int i, List<Employee> li) {
		super();
		this.str = str;
		this.i = i;
		this.li = li;
	}

	public String getStr() {
		return str;
	}

	public int getI() {
		return i;
	}

	public List<Employee> getLi() {

		List<Employee> copy = new ArrayList<Employee>();

		Iterator<Employee> itr = li.iterator();
		while (itr.hasNext()) {
			copy.add(itr.next().clone());

		}

		return copy;
	

		}

	@Override
	public String toString() {
		return "Immutable [str=" + str + ", i=" + i + ", li=" + li + "]";
	}

}
