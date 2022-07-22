package xyz;

import java.util.ArrayList;
//import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class FindDuplicateElement {
	public static void main(String[] args) {
		String s = "abcabcbb";
		char arr[]=s.toCharArray();
		//sort in a sequence
		//Arrays.sort(arr);
		//remove duplicate element
		
		LinkedHashSet<Character> mp = new LinkedHashSet<Character>();
		for(int i=0;i<arr.length;i++) {
			mp.add(arr[i]);
		}
		//linkedHashSet convert to arrayList bcz access by the index number
		List<Character> narr=new ArrayList<>(mp);
		List<Character> n=new ArrayList<>();
		//System.out.println(narr);
		
		for(int i=0;i<narr.size();i++) {
			int c=0;
			for(int j=0;j<arr.length;j++) {
				if(narr.get(i)==arr[j]) {
					c++;	
				}
			}
		//System.out.println(c);
			if(c>1) {
				n.add(narr.get(i));
		}	
	}
		System.out.println(n);
	}
}
