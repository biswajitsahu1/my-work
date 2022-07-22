package xyz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UniqueNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		List<Integer> tamp=new ArrayList<Integer>();
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]!=arr[i+1]) {
				tamp.add(arr[i]);	
			}
		}
		for(int i:tamp) {
			System.out.print(i+" ");
		}
	}
}