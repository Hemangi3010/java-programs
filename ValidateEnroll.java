class ValidateEnroll
{
	public static void main(String args[])
	{
		if(args.length!=1)
		{
			System.out.println("Error ..arguments are not proper..");
			System.out.println("Eg. java ValidateEmail  <Email>");
			System.exit(0);
		
		}
		String enroll=args[0];
		//boolean valid=true;
		//System.exit(0);
		int enrollYear=Integer.parseInt(enroll.substring(0,2));
		if(!(enrollYear==16||enrollYear==17||enrollYear==18))
		{
			System.out.println("invalid enrollyear..");
			System.exit(0);
		}
		int enrollClg=Integer.parseInt(enroll.substring(2,5));
		if(!(enrollClg==47))
		{
			System.out.println("invalid enrollClg..");
			System.exit(0);
		}
		int enrollStud=Integer.parseInt(enroll.substring(5,7));
		if(!(enrollStud==31||enrollStud==01))
		{
			System.out.println("invalid enrollStud..");
			System.exit(0);
		}
		int enrollDept=Integer.parseInt(enroll.substring(7,9));
		if(!(enrollDept==7))
		{
			
			System.out.println("invalid enrollDept..");
			System.exit(0);
		}
		int enrollNo=Integer.parseInt(enroll.substring(9,12));
		if(!(enrollNo>=1&&enrollNo<=65))
		{
			System.out.println("invalid enrollNo..");
			System.exit(0);
		}
	
		System.out.println("Enrollment is Valid");
			
				
	}
}