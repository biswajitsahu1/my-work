package xyz;

import java.util.Scanner;

public class CheckPrime {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int c=0;
		for(int i=2;i<=n/2;i++) {
			//System.out.print(i+" ");
			if(n==1) {
				System.out.println("error");
			}
			else {
				if(n%i==0) {
					c++;
				}
			}
		}
		if(c==0) {
			System.out.println(n +" is a prime number");
		}
		else if(c>0) {
			System.out.println(n +" is a not prime number");
		}
		else {
			System.out.println("error");
		}
		
	}
}
