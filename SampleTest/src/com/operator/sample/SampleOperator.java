package com.operator.sample;

public class SampleOperator {

	public static void main(String[] args) {
				int x=20;
				int y=40;
				System.out.println(x++);
				System.out.println(x);
				System.out.println(--x+y);
				System.out.println(x*y); 
				System.out.println(~x);
				System.out.println(~y);
				System.out.println(~x+~y);
				System.out.println(10+100-25/30+200);
				System.out.println(x<<y);
				System.out.println(x>>y);
				System.out.println(x);
				System.out.println(x+y>>3);
				System.out.println(60%8);
				System.out.println(x+y>>3);
				System.out.println(~~~-11);
				System.out.println(x<y&&x>y);
				System.out.println(x>y&x<y);
				System.out.println(x>y||x<y);
				System.out.println(x<y|x>y);		
				int a=2;
				int b=7;
				int min=(a<b)?a:b;
				System.out.println(min);
				int max=(a>b)?a:b;
				System.out.println(max);
				a+=7;
				b-=9;
				System.out.println(a);
				System.out.println(b);
				b-=5;
				b+=15;
				b*=10;
				b/=10;
				System.out.println(b);
				long h=123423546;
				long j=2346546;
				long k;
				k=(long)(h+j);
				System.out.println(k);
				
				
	}

}
