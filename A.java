class A
	{
	private int x=4;
	
	class B
		{
		public void show()
		{
		System.out.println("Class A's private int is"+x);
		}
		}
		public static void main(String args[])
		{
		//A obj1=new B();
		A.B obj2=new A().new B();
		
		obj2.show();
		}
	}
		