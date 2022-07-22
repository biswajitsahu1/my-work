package xyz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;

public class Maping {
	public static void main(String[] args) {
		//Scanner sc=new Scanner(System.in);
		int [] arr= {2,2,2,3,8,8,5,5,9,9,9,9};
		//sort in a sequence
		Arrays.sort(arr);
		//remove duplicate element
		HashSet<Integer> mp = new HashSet<Integer>();
		for(int i=0;i<arr.length;i++) {
			mp.add(arr[i]);
		}
		//linkedHashSet convert to arrayList bcz access by the index number
		List<Integer> narr=new ArrayList<>(mp);
		//creating arraylist to store the frequency
		List<Integer> freq = new ArrayList<Integer>();
		
		for(int i=0;i<narr.size();i++) {
			int count=0;
			for(int j=0;j<arr.length;j++) {
				if(narr.get(i)==arr[j]) {
					count++;
				}
			}
			freq.add(count);
		}
		//maximum number of frequency
		int m=Collections.max(freq);
		
		int sum=0;
		//addition operation
		for(int i=0;i<freq.size();i++) {
			sum=sum+(m-freq.get(i));
		}
		System.out.println(sum);
	}
}