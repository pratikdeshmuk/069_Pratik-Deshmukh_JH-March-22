class pyra4
{
	public static void main(String args[])
	{
		for(int i=1;i<=9;++i)
		{
			for(int k=18;k>=i*2;--k)
			{	
			System.out.print(" ");
			}
			for(int j=1;j<=i;++j)
			{	
			System.out.print(j+" ");
			}
			for(int b=i-1;b>=1;--b)
		    {	
			    if(i==1)
				System.out.print(" ");
				
				else
				System.out.print(b+" ");
			}
		
		System.out.println();
		}
	}
}