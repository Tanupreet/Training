interface Car
{
	public void run();
}

public class audi implements Car
{
	public void run()
	{
		System.out.println("Running");
	}
	
	public static void main(String args[])
	{
		audi obj=new audi();
		obj.run();
	}
}