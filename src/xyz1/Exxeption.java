package xyz1;

public class Exxeption {
	public static void main(String[] args) {
		try {
			int i=2/0;
		}
		catch (NullPointerException e1) {
			System.out.println("artima");
		}
		catch (Exception e) {
			System.out.println("exception 2");
		}
		finally {
			System.out.println("f1");
		}
			System.out.println("caught");
		}
	
}
