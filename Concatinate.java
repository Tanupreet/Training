
import java.util.Scanner;
public class Concatinate {
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter first name");
	String a=sc.nextLine();
	System.out.println("Enter second name");
	String b=sc.nextLine();
	
		//String a=new String("abc");
//String a="abc";
//String b="xyz";
		StringBuilder sb=new StringBuilder(20);
	sb.append(a).append(" ").append(b);
	System.out.println(sb.toString());
	
}
}