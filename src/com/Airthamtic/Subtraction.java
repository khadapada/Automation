package com.Airthamtic;

public class Subtraction  extends Operations{
	
	public Subtraction(int a1,int b1) {
		super.a=a1;
		super.b=b1;
	}
		
	
	private void subtraction() {
		result=a-b;		
	}

	@Override
	protected void performAirthmatic() {
		subtraction();
	}
}
