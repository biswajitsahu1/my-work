package abc;

import java.util.LinkedHashSet;

public class A {
	public static void main(String[] args) {
		String s="abccdedrer";
		System.out.println(s);
		LinkedHashSet<Character> d=new LinkedHashSet<Character>();
		int n=s.length();
		
		for(int i=0;i<n;i++) {
			d.add(s.charAt(i));
		}
		for(Character c:d) {
			System.out.print(c);
		}
	}
}
