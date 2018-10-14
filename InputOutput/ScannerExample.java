import java.util.*;
class ScannerExample
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter String: ");
    String str = sc.nextLine();

    System.out.println("Enter number: ");
    int number = sc.nextInt();

    System.out.println("String: " + str);
    System.out.println("Number: "+ number);
  }
}