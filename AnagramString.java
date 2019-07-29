class AnagramString
{
	public static void main(String args[])
	{
		if(args.length!=2)
		{
			System.out.println("Invalid arguments.....i.e java AnagramString <firstString> <secondString>");
			System.exit(0);
		}
		String firstString=args[0];
		String secondString=args[1];
	
		int i,flag=0;
		int firstLength=firstString.length();
		int secondLength=secondString.length();

		int[] str1=new int[127];
		int[] str2=new int[127];	
	
		if(firstLength==secondLength)
		{
			for(i=0; i<firstLength; i++)
			{
				str1[firstString.codePointAt(i)]++;
				str2[secondString.codePointAt(i)]++;
			}
		
			//int stringLength = str1.length;
			for(i=0;i<str1.length;i++)
			{
				if(str1[i]==str2[i])
				{
					flag=1;
					//break;
				}
				else
				{
					flag=0;
					break;
				}
			}
		}
		if(flag==1)
		{
			System.out.println("Strings are anagram to each other..");
		}
		else
		{
			System.out.println("Strings are not anagram ..");
		}
	}
}