class ReverseWord
{
	public static void main(String args[])
	{
		String sentence=new String("VVP Engineering College");
		String[] word=sentence.split(" ");
		StringBuffer word1=new StringBuffer();
		word1.append(word[0]);
		word1.reverse();
		StringBuffer word2=new StringBuffer();
		word2.append(word[1]);
		word2.reverse();
		StringBuffer word3=new StringBuffer();
		word3.append(word[2]);
		word3.reverse();
		System.out.println(word1+" "+word2+" "+word3);
	}
}