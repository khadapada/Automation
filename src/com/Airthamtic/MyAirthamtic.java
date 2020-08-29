package com.Airthamtic;

import java.util.Scanner;

public class MyAirthamtic {
	//Operations oper;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Operations add= new Addition(3,5);
		add.performAirthmatic();
		System.out.println("addition :"+ add.getResult());
		add.setA(10);
		add.performAirthmatic();
		System.out.println("addition :"+ add.getResult());

		Operations sub=new Subtraction(5,1);
		sub.performAirthmatic();
		System.out.println("subtraction :"+sub.getResult());
		sub.setA(4);
		sub.performAirthmatic();
		System.out.println("subtraction :"+sub.getResult());
		
		
		
		System.out.println("Enter the operation and values: ");
		Scanner scanner = new Scanner(System.in);
		String operation = scanner.nextLine();
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		Operations method=null;
		int result =0;
		if (operation.equalsIgnoreCase("add")) {
			method = new Addition(a,b);
					
		} else if (operation.equalsIgnoreCase("sub")) {
			method = new Subtraction(a,b);
				
		}else { System.out.println("Invalid operation "+ method); 
		//result = new Addition(0,0);
		}
		
		//if (result!=null) { 
		method.performAirthmatic();
		result=method.getResult();
		System.out.println("result - "+ result);
		//}
		
		
				
 }
}