package xyz;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class CheckNumSum {
	public static void main(String[] args) {
		List<String> x = new ArrayList<>();
		List<Integer> wd = new ArrayList<>();
		x.add("abc");
		x.add("1");
		x.add("8");
		x.add("5");
		x.add("c");
		x.add("10");
		x.add("10");
		x.add("10");
		x.add("10");
		System.out.println("given list "+x);
		//checking integer 
		for(int i=0;i<x.size();i++) {
			try {
				//if integer insert in array
				int n = Integer.parseInt(x.get(i));
				wd.add(n);
				//System.out.println("int"+x.get(i));
			} catch (Exception e) {
				//System.out.println("not-int"+x.get(i));
			}
		}
		//sorted the list
		List<Integer> n = wd.stream().sorted().collect(Collectors.toList());
		System.out.println("with repeatation "+n);
		
		//remove duplicate element
		for(int i=0;i<n.size();i++) {
			for(int j=i+1;j<n.size();j++) {
				if(n.get(i)==n.get(j)) {
					//System.out.println(i);
					//System.out.println(j);
					n.remove(i);
					n.remove(j-1);
				}
			}
		}
		System.out.println("without repeatation "+n);
		// sum of unrepeated number
		int sum=0;
		for(int i=0;i<n.size();i++) {
			sum=sum+n.get(i);
		}
		System.out.println("sum of unrepeated "+sum);
	}
}
