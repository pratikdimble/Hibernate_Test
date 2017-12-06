package com.pratik;



public class Emp {

	private int eid;
	private String ename;
	private float esalary;
	private String ecity;
	
	public Emp(){
		
		System.out.println("o-param-constructor ");
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}

	public float getEsalary() {
		return esalary;
	}
	public void setEsalary(float esalary) {
		this.esalary = esalary;
	}
  
	public String getEcity() {
		return ecity;
	}
	public void setEcity(String ecity) {
		this.ecity = ecity;
	}


	@Override
	public String toString() {
		return "Emp [eid=" + eid + ", ename=" + ename + ", esalary=" + esalary + ", ecity=" + ecity + "]";
	}
	
}
