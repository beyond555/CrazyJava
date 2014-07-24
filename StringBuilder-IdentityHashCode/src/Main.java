
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="asd";
		System.out.println(System.identityHashCode(a));
		a+="dsa";
		System.out.println(System.identityHashCode(a));
		StringBuilder b=new StringBuilder("asd");
		System.out.println(System.identityHashCode(b));
		b.append("dsa");
		System.out.println(System.identityHashCode(b));
	}
}
