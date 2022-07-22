package xyz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class FindDuplicate {
	public static void main(String[] args) {
		String str="abcabcbb";
		char arr[]=str.toCharArray();
		List<Character> n=new ArrayList<>();
		for(char i:arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		Arrays.sort(arr);
		for(char i:arr) {
			System.out.print(i+" ");
		}
		LinkedHashSet<Character> mp = new LinkedHashSet<>();
		for(int i=0;i<arr.length;i++) {
			mp.add(arr[i]);
		}
		System.out.println(mp.size());
	}
}
