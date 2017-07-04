class odd
{
 public static void main(String args[])
 {
  
  System.out.println("Number is");
  int x= Integer.parseInt(args[0]);
  System.out.println("Odd numbers are:");
  
  for(int i=0; i<x; i++)
  {
	  if(i%2!=0)
	  {
		  System.out.println(" "+i);
	  }
 }
 }
}