package com.acadgild;

import java.util.Scanner;

public class AgeMain {

	public static void main(String[] args) {
		int age;
		System.out.println("Enter the age");
		Scanner scan=new Scanner(System.in);
		age=scan.nextInt();
		if(age<0){
			try {
				throw new NegativeAgeException(age);
			} catch (NegativeAgeException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else
			System.out.println("Age is:"+age);
			
		

	}

}
