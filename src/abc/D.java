package abc;

public class D {
	public static void main(String[] args) {
		int n=407;
		int tamp=n;
		int r ,s=0;
		while (tamp!=0) {
			r=tamp%10;
			s=(int) (s+Math.pow(r, 3));
			tamp/=10;
		}
		if(s==n) {
			System.out.println(n+" is an anstrum number");
		}
		else {
			System.out.println(n+" is not an anstrum number");
		}
	}
}
