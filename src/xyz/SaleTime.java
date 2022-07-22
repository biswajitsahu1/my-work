package xyz;

import java.util.Scanner;

public class SaleTime {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		int narr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<n;i++) {
			int sum=0;
			while(arr[i]>0) {
				int d=arr[i]%10;
				sum=sum+d;
				arr[i]=arr[i]/10;
			}
			narr[i]=sum;
		}
		for(int i:narr) {
			System.out.print(i+" ");
		}
		
	}
}
