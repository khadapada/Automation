package com.Airthamtic;

public abstract class Operations {
	
	protected int a;
	protected int b;
	protected int c;
	protected int result;
	
	
	protected int getResult() { 
		return result;
	}
	
	
	protected abstract void performAirthmatic();
	
	protected void setA(int a) {
		this.a = a;
	}


}
