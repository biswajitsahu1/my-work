package abc;

public class E {
	public static void main(String[] args) {
		for(int i=0;i<5;i++) {
			int k=i+1;
			for(int j=1;j<i+2;j++) {
				System.out.print(k--+" ");
			}
			System.out.println();
		}
		System.out.println(Integer.MAX_VALUE/10);
	}
}

/*
1
2 1
3 2 1
4 3 2 1
5 4 3 2 1
*/