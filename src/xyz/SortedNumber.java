package xyz;

import java.util.Scanner;

public class SortedNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j]>arr[j+1]) {
					int tamp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=tamp;
				}
			}
		}
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}
}
