package com.sample.scanner;
import java.util.Scanner;
public class SampleScanner {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.println("Enter string value");
		String input = scanner.nextLine();
		System.out.println(input);
		int a;
		int b;
		System.out.println("Enter integer value");
		a = scanner.nextInt();
		System.out.println("a="+a);
		float f = (float)a;
		System.out.println("Converted float value f="+f);


	}

}
