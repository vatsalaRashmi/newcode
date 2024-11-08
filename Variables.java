package basics;

public class Variables {
	
	 int a;
	 int b;
	
   void add(int a, int b)
   {
	   this.a=a;
	   this.b=b;
   }

	public static void main(String[] args) {
		Variables v1 = new Variables();
		v1.add(10, 20);
		System.out.println(v1.a+v1.b);
		
		
		
	}

}
