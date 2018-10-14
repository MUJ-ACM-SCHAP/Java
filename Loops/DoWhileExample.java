class DoWhileExample
{
  public static void main(String args[])
  {
    int i, n;

    i = 1;
    n = 0;
    do
    {
      System.out.println(i);
      i++;
    } while(i<=n);

    System.out.println("----------");

    i = 1;
    n = 5;
    do
    {
      System.out.println(i);
      i++;
    } while(i<=n);
  }
}