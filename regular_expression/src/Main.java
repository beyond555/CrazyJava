
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String t="abc.efg.hij";
		String [] str=t.split(".");//. means anything in regular_expressiong
		System.out.println("with . ");
		for(String s:str)
			System.out.println(s);
		System.out.println("with //. ");
		String [] str1=t.split("//.");//. means anything in regular_expressiong
		for(String s:str1)
			System.out.println(s);
	}
}
