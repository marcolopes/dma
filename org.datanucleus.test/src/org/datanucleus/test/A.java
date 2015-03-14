package org.datanucleus.test;

public class A {

	private String id;
	private String c1;
	private String c2;

	public A(String id, String c1, String c2){
		super();
		this.id = id;
		this.c1 = c1;
		this.c2 = c2;
	}


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}


	public String getC1() {
		return c1;
	}

	public void setC1(String c1) {
		this.c1 = c1;
	}


	public String getC2() {
		return c2;
	}

	public void setC2(String c2) {
		this.c2 = c2;
	}



	public String toString() {
		return "ID=" + id +
				", Column 1=" + c1 +
				", Column 2=" + c2;
	}


}
