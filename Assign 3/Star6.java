class Star6
{
	public static void main(String args[])
	{
		for (int i=1;i<=5;++i)
		{
			for (int k=1;k<=i;++k)
				System.out.print(" ");
			
			for (int j=9;j>=i*2-1;--j)
			    System.out.print("*");
			
			System.out.println();
		}
	}
}