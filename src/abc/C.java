package abc;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class C {
	public static void main(String[] args) {
		Map<Integer, String> mp=new HashMap<Integer, String>();
		mp.put(1, "abc");
		mp.put(2, "xyz");
		
		Iterator<Map.Entry<Integer, String>> it=mp.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<Integer, String> a=it.next();
			System.out.println(a.getKey()+"  "+a.getValue());
		}
	}
}
