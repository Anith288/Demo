class Maximum
{
	public static void main(String[] args)
	{
		int a[]={23,4,45,454,6,646,346};
		int max =a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println(max);
	}
}