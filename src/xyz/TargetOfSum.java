package xyz;

import java.util.Scanner;

public class TargetOfSum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter Size of array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("enter array element");
			arr[i]=sc.nextInt();
		}
		System.out.println("enter target number");
		int t=sc.nextInt();
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(arr[i]+arr[j]==t) {
					System.out.println(i+" "+j);
				}
			break;
			}
		}
	}
}
