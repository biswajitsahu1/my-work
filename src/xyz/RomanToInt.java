package xyz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RomanToInt {
	public static int con(char ch) {
		if(ch=='M') {
			return 1000;
		}
		if(ch=='D') {
			return 500;
		}
		if(ch=='C') {
			return 100;
		}
		if(ch=='L') {
			return 50;
		}
		if(ch=='X') {
			return 10;
		}
		if(ch=='V') {
			return 5;
		}
		if(ch=='I') {
			return 1;
		}
		else {
			return 0;
		}
	}
	public static void main(String[] args) {
		System.out.println("input:");
		Scanner sc=new Scanner(System.in);
		String st =sc.nextLine();
		String str=st.toUpperCase();
		
		List<Character> arr= new ArrayList<>();
		List<Integer> arI=new ArrayList<Integer>();
		
		for(char ch : str.toCharArray()) {
			arr.add(ch);
		}
		
		for(int i=0;i<arr.size();i++) {
			
			RomanToInt x =new RomanToInt();
			arI.add(con(arr.get(i)));
			
		}
		
		System.out.println(arI);
	}
}
