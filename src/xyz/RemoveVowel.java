package xyz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RemoveVowel {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str =sc.nextLine();
		List<Character> arr=new ArrayList<>();
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!='a' && str.charAt(i)!='e' && str.charAt(i)!='i' && str.charAt(i)!='o' && str.charAt(i)!='u' && str.charAt(i)!='A' && str.charAt(i)!='E' && str.charAt(i)!='I' && str.charAt(i)!='O' && str.charAt(i)!='U') {
				arr.add(str.charAt(i));
			}
		}
		for(int i=0;i<arr.size();i++) {
			System.out.print(arr.get(i));
		}
	}
}
