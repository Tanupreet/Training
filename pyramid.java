class pyramid
{
public static void main(String args[])
{
	int x= Integer.parseInt(args[0]);
	for(int i=0; i<x; i++)
	{
		for(int j=0; j<x-i; j++)
		{
			System.out.print(" ");
		}
		for(int k=0; k<=i; k++)
		{
			System.out.print(" * ");
		}
		System.out.println();
	}
}
}