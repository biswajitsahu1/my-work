package xyz;

import java.util.Scanner;

public class PalendromNumber {
	private static StringBuilder rev;

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println(str);
		String rev = new String();
		int k=0;
		for(int i=str.length();i>=0;i--)
			
		if(str.compareTo(rev)>0) {
			System.out.println("palendrom number");
		}
		else
			System.out.println("not a palendrom number");
	}
}
