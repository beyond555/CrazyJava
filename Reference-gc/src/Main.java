import java.lang.ref.WeakReference;


public class Main {
	public static void main(String[] args) {
		Integer i=new Integer(1);
		WeakReference<Integer>w1=new WeakReference<Integer>(i);
		System.gc();
		System.runFinalization();
		System.out.println(w1.get());
		i=null;
		System.out.println(w1.get());
		System.gc();
		System.runFinalization();
		System.out.println(w1.get());
	}
}
