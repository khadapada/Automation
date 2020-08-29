package com.Airthamtic;

public class Addition extends Operations{

	
	public Addition(int a1, int b1) {
		// TODO Auto-generated constructor stub
		super.a=a1;
		super.b=b1;
	}

	public Addition(int a1, int b1, int c1) {
		// TODO Auto-generated constructor stub
		super.a=a1;
		super.b=b1;
		super.c=c1;
	}

	private void addition() {
		result=a+b;		
	}
	
	@Override
	protected void performAirthmatic() {
		addition();
	}
}
