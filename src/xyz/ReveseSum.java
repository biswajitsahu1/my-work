package xyz;

public class ReveseSum {
	public static void main(String[] args) {
		int l1[]=new int[] {2,4,3};
		int l2[]=new int[] {5,6,4};
		String l3[]=new String[3];
		
		int r1=0,r2=0;
        for(int i=l1.length-1;i>=0;i--){
            r1=r1*10+l1[i];
            
        }
        System.out.println(r1);
        
        for(int i=l2.length-1;i>=0;i--){
        	r2=r2*10+l2[i];
        }
        System.out.println(r2);
        
        int r3=r1+r2;
        System.out.println(r3);
        
        String s=String.format("%d", r3);        
        String nr3[]=s.split("");
        
        int l=0;
        for(int i=nr3.length-1;i>=0;i--) {
        	l3[l]=nr3[i];
        	l++;
        }
        for(String i:l3) {
        	System.out.println(i);
        }
	}
}



