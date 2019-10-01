class Test
{
	
	public static void main(String args[])
	{
		String s1[]=new String[5];
        s1[0]="XYZ";
        s1[1]="ABC";
        s1[2]="BDC";
        s1[3]="ZOV";
        s1[4]="VCRUGE";
	    int i,j,pos;
	    String temp;
	    //pos=0;
	    for(i=4;i>0;i--)
	  {
		for(j=0;j<i-1;j++)
		{
			if(s1[j].compareTo(s1[j+1])>0)
			{
				temp=s1[j];
				s1[j]=s1[j+1];
				s1[j+1]=s1[j];
				//pos=j;
			}
		}
		//s1[pos]=s1[i-1];
		//s1[i-1]=l;
	}
	  for(i=0;i<5;i++)
	  {
		System.out.println(s1[i]);
	  }

}
}
