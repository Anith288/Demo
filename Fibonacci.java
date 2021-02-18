import java.util.*;
class Fibonacci
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter number");
		int n=s.nextInt();
		int a=0,b=1,c;
		for(int i=0;i<n;i++)
		{
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}	
	}
}