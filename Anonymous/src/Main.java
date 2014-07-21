abstract class Anonoymous
{
	public abstract void showLocolVariable();
}
interface Add
{
	public void add(int a,int b);
}
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String local="local variable";
		Anonoymous a=new Anonoymous() {
			
			@Override
			public void showLocolVariable() {
				System.out.println(local);
			}
		};
		final int A=3,B=4;
		Add b=new Add() {
			
			@Override
			public void add(int a, int b) {
				// TODO Auto-generated method stub
				System.out.println(a+b);
			}
		};
		a.showLocolVariable();
		b.add(A, B);
	}
}
