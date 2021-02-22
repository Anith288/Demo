import java.util.*;
class ReverseString
{
	public static void main(String[] args)
	{
		Scanner d=new Scanner(System.in);
		System.out.println("enter String");
		String s=d.next();
		String rev=" ";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);

	}
}