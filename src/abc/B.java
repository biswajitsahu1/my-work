package abc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class B {
	public static void main(String[] args) {
	List<Integer> arr=new ArrayList<>();
	arr.add(1);
	arr.add(5);
	Iterator<Integer> it=arr.listIterator();
	while (it.hasNext()) {
		System.out.println(it.next());
		}
	}
	
}
