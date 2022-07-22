package abc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class ArrayToArrayList {

	public static void main(String[] args) {
		int arr []= {2,34,54,12,1,0,43};
		List<Integer> li=new ArrayList<>();
		for(int i=0;i<arr.length;i++) {
			li.add(arr[i]);
		}
		System.out.println(li);
		
		HashSet<Integer> has=new HashSet<Integer>(li);
		System.out.println(has);
	}

}
