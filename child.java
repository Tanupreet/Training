class player
{
	int a;
	player(int a)
	{
	this.a=a;
	}
}
	
	class animal extends player
	{
		int b;
		
		animal(int a, int b)
		{
			super(a);
			this.b=b;
		}
		void show()
		{
			System.out.println("player id="+a);
			System.out.println("animal id="+b);
		}
	}
	class child{
public static void main(String args[])
{
animal obj=new animal(4,8);
obj.show();
}
}