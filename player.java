class player
{
	int id;
	String name;
	player(int i, String n)
	{
	id=i;
	name=n;
	}
	void disp()
	{
		System.out.println(id+" "+name);
	}
public static void main(String args[])
{
player x=new player(23,"tanu");
	x.disp();
}
}