package basics;

abstract class Abs1
{
	abstract void add();
}

public class AbsAndConc extends Abs1{
	
	void sub()
	{
	  System.out.println("sub");
	}

	public static void main(String[] args)
	{
		AbsAndConc a1= new AbsAndConc();
		a1.add();
		a1.sub();

	}

	
	void add() {
		System.out.println("1");
		
		
	}

}
