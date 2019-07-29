class ValidateEmail
{
		public static void main(String[] args)
		{
			if(args.length!=1)
			{
				System.out.println("Error ..arguments are not proper..");
				System.out.println("Eg. java ValidateEmail  <Email>");
				System.exit(0);
		
			}
			String email=args[0];
			int fLetter=email.codePointAt(0);
			if(!((fLetter>='a'&&fLetter<='z')||(fLetter>=0&&fLetter<=9)))
			{
				System.out.println("invalid first character..");
				System.exit(0);
			}
			int atPosition=email.indexOf('@');
			if(atPosition==-1)
			{
				System.out.println("There must be one @ symbol...");
				System.exit(0);
			}
			String emailPart[]=email.split("@");
			if(!(emailPart[0].length()>=8||emailPart[0].length()<=10))
			{
				System.out.println("invalid No. of  characters..");
				System.exit(0);
			}
			for(int i=1;i<emailPart[0].length();i++)
			{
				if(!((emailPart[0].charAt(i)>='A'&&emailPart[0].charAt(i)<='Z')||
					(emailPart[0].charAt(i)>='a'&&emailPart[0].charAt(i)<='z')||
					(emailPart[0].charAt(i)>=0&&emailPart[0].charAt(i)<=9)||
					(emailPart[0].charAt(i)>='.')||(emailPart[0].charAt(i)<='_')))
					{
						System.out.println("invalid  characters..");
						System.exit(0);
						
					}
			}
			int atPosition1=emailPart[1].indexOf('.');
			if(atPosition==-1)
			{
				System.out.println("There must be one dot symbol...");
				System.exit(0);
			} 
			String emailPart1[]=emailPart[1].split(".");
			if(!(emailPart1[0].length()>=4 && emailPart1[0].length()<=6 ))
			{
				System.out.println("Invalid Characters i.e Domain ...");
				System.exit(0);
			}
			if(!(emailPart1[1].length()>=2 &&emailPart1[1].length()<=3))
			{
				System.out.println("Invalid Characters i.e Domain ...");
				System.exit(0);
			}
				
			System.out.println("Valid email address......");
	}
	
}