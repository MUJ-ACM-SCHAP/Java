class Demo{
	public static void main(String args[])
	{
		try
		{
			int a=Integer.parseInt(args[0]);
			int b=a+2;
			System.out.println(b);
		}
		catch(ArithmeticException e) 
		{}
		catch(ArrayIndexOutOfBoundsException e) 
		{}
		catch(NumberFormatException e) 
		{System.out.println("Number Format Exception");}
		
	}
}