package com.acadgild;

public class NegativeAgeException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public NegativeAgeException(int num) {
		
		getMsg(num);
	}

	public void getMsg(int num){
		
		System.out.println("Age "+num+" is negative.Please enter valid age");
	}
}
