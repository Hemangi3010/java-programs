class BinaryConversion
{
	public static void main(String args[])
	{
		if(args.length!=2)
		{
			System.out.println("Error ..arguments are not proper..");
			System.out.println("Eg. java BinaryConversion <Choice> <value1>");
			System.exit(0);
		
		}
		int choice=Integer.parseInt(args[0]);
		int value1=Integer.parseInt(args[1]);
		if(choice==1)
		{
			System.out.println("Binary to decimal..");
				
				 
                int dec_value = 0; 
				int base = 1; 
				int temp = value1; 
				while (temp > 0) 
				{ 
					int last_digit = temp % 10; 
					temp = temp / 10; 
					//if(last_digit==0||last_digit==1)
					dec_value =dec_value + last_digit * base; 
					base = base * 2; 
				} 
				System.out.println(dec_value);
			
		}
		else
		{
			System.out.println(" decimal to Binary..");
			//int a=Integer.parseInt(args[1]);
			int[] arr=new int[50];
			int i=0;
			while(value1>0)
			{
				arr[i]=value1%2;
				value1=value1/2;
				i++;
			}			
			for(int j=i-1;j>=0;j--)
			{
				System.out.print(arr[j]);
			}
					
		}
	} 
}