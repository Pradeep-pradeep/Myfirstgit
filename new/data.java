class data 
{
	public static void main(String[] args)
	{
		int n=add(10,5);
			System.out.println(n);
	}
	static int add(int a,int b)
		{
			String s="";
			try
			{
				return a+b;
			}
			catch (Exception e)
			{
				return a-b;
			}
			finally
			{
				return a*b;
			}
		}
}
