class Patter2_2D
{
	public static void main(String args[])
	{
		int n = Integer.parseInt(args[0]);
		char a[][] = new char[n][];
		for(int i=0;i<n;i++)
		{
			a[i] = new char[i+1];
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<i+1;j++)
			{
				a[i][j] = '*';
			}
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<i+1;j++)
				System.out.print(a[i][j] + " ");
			System.out.println();
		}	
							
	}
} 