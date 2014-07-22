import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class Main {
	public static void main(String[] args) {
		HashMap<String,Integer>h=new HashMap<String,Integer>();
		h.put("math", 92);
		h.put("english", 82);
		System.out.println(h.values());
		Iterator<Entry<String, Integer>> it1=h.entrySet().iterator();
		Iterator<String> keyIt=h.keySet().iterator();
		Iterator<Integer> valueIt=h.values().iterator();
		while(it1.hasNext())
		{
			System.out.println(it1.next());
		}
		it1=h.entrySet().iterator();
		while(it1.hasNext())
		{
			Entry<String, Integer> e=it1.next();
			System.out.println("key:"+e.getKey()+",v:"+e.getValue());
		}
		while(keyIt.hasNext())
		{
			System.out.println(keyIt.next());
		}
		while(valueIt.hasNext())
		{
			System.out.println(valueIt.next());
		}
	}
}
