class PrimeNo
{
	public static void main(String args[])
	{
		if(args.length!=1)
		{
			System.out.println("Error ..arguments are not proper..");
			System.out.println("Eg. java PrimeNo <number> ");
			System.exit(0);
		
		}
        int count=0;
		int number=Integer.parseInt(args[0]);
		for(i=2;count<number;i++)
		{
			for(int j=2;j<i;j++)
			if(i%j==0)
			{
				count++;
			}
		}
		if(count==number)
		{
			System.out.println();
		}
	}
}	
