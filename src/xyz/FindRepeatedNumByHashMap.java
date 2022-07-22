package xyz;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FindRepeatedNumByHashMap {
	public static void main(String[] args) {
		String str="this is a a a pen pen and and and this pan is red red coloured";
		HashMap<String, Integer> map=new HashMap<String, Integer>();
		
		String[] k=str.split(" ");
		for(int i=0;i<k.length;i++) {
			if(map.containsKey(k[i])) {
				int c=map.get(k[i]);
				map.put(k[i], c+1);
			}
			else {
				map.put(k[i], 1);
			}
		}
		Iterator itr=map.entrySet().iterator();
		while(itr.hasNext()) {
			Map.Entry me=(Map.Entry) itr.next();
			System.out.println("key is "+me.getKey()+" Value is "+me.getValue());
		}
	}
}
