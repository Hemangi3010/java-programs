class CurrencyConverter
{
	public static void main(String args[])
	{
		if(args.length!=2)
		{
			System.out.println("Error ..arguments are not proper..");
			System.out.println("Eg. java CurrencyConverter <currencyType> <currencyValue>");
			System.exit(0);
		
		}
		int currencyType=Integer.parseInt(args[0]);
		double currencyValue=Double.parseDouble(args[1]);
		int rate=70;
		if(currencyType==1)
		{
			System.out.println("$"+currencyValue+"="+(currencyValue*rate)+"INR");
		}
		else
		{
			System.out.println(currencyValue+"INR=$"+(currencyValue/rate));
		}
			
		
	}
}