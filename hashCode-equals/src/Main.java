class hashcode
{
	private String code;
	hashcode(String code)
	{
		this.code=code;
	}
}
//overWrite hashCode() && equals()
class HC
{
	private String code;
	HC(String code)
	{
		this.code=code;
	}
	
	public int hashCode()
	{
		System.out.println("get hashCode");
		return code.hashCode();
	}
	
	public boolean equals(Object o)
	{
		System.out.println("define equals");
		if(this==o)
			return true;
		if(o.getClass()==HC.class)
		{
			HC temp=(HC)o;
			return temp.code.equals(this.code);
		}
		return false;
	}
	
}
public class Main {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a=new String("asd");
		String b=new String("asd");
		System.out.println(a.hashCode()==b.hashCode());
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		System.out.println();
		
		hashcode c=new hashcode(a);
		hashcode d=new hashcode(b);
		System.out.println(c.hashCode()==d.hashCode());
		System.out.println(c.hashCode());
		System.out.println(d.hashCode());
		System.out.println();
		
		HC e=new HC(a);
		HC f=new HC(b);
		System.out.println(e.hashCode()==f.hashCode());
		System.out.println(e.equals(f));
	}
}
