package com.controlstatement.sample;

import java.util.Scanner;

public class ControlStatement {

	public static void main(String[] args) {
		int a;
		int b;
		Scanner scanner=new Scanner(System.in);
		a=scanner.nextInt();
		b=scanner.nextInt();
		if(a%2 == 0) {
			System.out.println(a+" is a Even Number");
		if(b%2 ==0) 
			System.out.println(b+" is a Even Number");

			}
		else {
		System.out.println(a+" is a Odd Number");
		System.out.println(b+" is a Odd Number");

		}
		
	}

	}
