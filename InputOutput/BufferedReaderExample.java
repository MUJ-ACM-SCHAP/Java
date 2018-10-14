import java.io.*;
class BufferedReaderExample
{
  public static void main(String args[])throws IOException
  {
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);

    System.out.println("Enter String: ");
    String str = br.readLine();

    System.out.println("Enter number: ");
    int number = Integer.parseInt(br.readLine());

    System.out.println("String: " + str);
    System.out.println("Number: "+ number);
  }
}