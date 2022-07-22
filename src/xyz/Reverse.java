package xyz;

import java.util.Scanner;


public class Reverse {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
//		StringBuilder str1=new StringBuilder();
//		str1.append(str);
//		str1=str1.reverse();
//		System.out.println(str1);
		for(int i=str.length()-1;i>=0;i--) {
			System.out.print(str.charAt(i));
		}
	}
}
