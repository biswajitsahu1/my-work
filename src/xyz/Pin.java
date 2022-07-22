package xyz;

import java.util.Scanner;

public class Pin {
	public static void main(String[] args) {
		
	
		Scanner s=new Scanner(System.in);
		System.out.println("n1: ");
		int n1=s.nextInt();
		System.out.println("n2: ");
		int n2=s.nextInt();
		System.out.println("n3: ");
		int n3=s.nextInt();
		System.out.println("n4: ");
		int n4=s.nextInt();
		int l1=0,l2=0,l3=0;
		while(n1!=0) {
			int r=n1%10;
			l1=Math.max(r, l1);
			n1=n1/10;
		}
		System.out.println("l1:"+l1);
		
		while(n2!=0) {
			int r=n2%10;
			l2=Math.max(r, l2);
			n2=n2/10;
		}
		System.out.println("l2:"+l2);
		
		while(n3!=0) {
			int r=n3%10;
			l3=Math.max(r, l3);
			n3=n3/10;
		}
		System.out.println("l3:"+l3);
		
		int pin=(l1*l2*l3)+n4;
		System.out.println("pin: "+pin);
	}
}
