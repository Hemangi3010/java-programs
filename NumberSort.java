class NumberSort
{
	public static void main(String args[])
	{
		int num=args.length;
		int[] sortNum=new int[num];
		int i,j;
		for(i=0;i<num;i++)
		{
			sortNum[i]=Integer.parseInt(args[i]);
		}
		for(i=0;i<num;i++)
		{
			for(j=0;j<num-i-1;j++)
			{
				if(sortNum[j]>sortNum[j+1])
				{
					int temp;
					temp=sortNum[j];
					sortNum[j]=sortNum[j+1];
					sortNum[j+1]=temp;
				}
			}
		}
		for(i=0;i<num;i++)
		{
			System.out.println(sortNum[i]);
		}
	}
}