import java.util.*;
class Palindrome
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter Number");
		int n=s.nextInt();
		int rem,sum=0,temp;
		temp=n;
		while(n!=0)
		{
			rem=n%10;
			sum=(sum*10)+rem;
			n=n/10;
		}
		if(temp==sum)	
		{
			System.out.println("It is palindrome");
	
		}
		else
		{
			System.out.println("it is not Palindrome");
		}
	}
}