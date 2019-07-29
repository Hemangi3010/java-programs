class Calculator
{
	public static void main(String args[])
	{
		if(args.length!=3)
		{
			System.out.println("Error ..arguments are not proper..");
			System.out.println("Eg. java Calculator <Choice> <value1> <value2>");
			System.exit(0);
		
		}
		double value1=Double.parseDouble(args[1]);
		double value2=Double.parseDouble(args[2]);
		int choice=Integer.parseInt(args[0]);
		switch(choice)
		{
			case 1:System.out.println("Addition="+(value1+value2));
					System.exit(0);
			case 2:System.out.println("Subtraction="+(value1-value2));
					System.exit(0);
			case 3:System.out.println("Multiplication"+(value1*value2));
					System.exit(0);
			case 4:System.out.println("Division="+(value1/value2));
					System.exit(0);				
			default:System.out.println("Invalid choice..."); 
					System.exit(0);
		}
	}
}	