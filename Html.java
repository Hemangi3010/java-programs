class Html
{
	public static void main(String args[])
	{
		String str=new String("<html>Extract the string...</html>");
		char arr[]=str.toCharArray();
		int flag=0;
		for(int j=0;j<str.length();j++)
		{
			if(arr[j]=='<')
				flag=0;
			else if(arr[j]=='>')
				flag=1;
			else if(flag==1)
				System.out.print(arr[j]);
		}
	}
}