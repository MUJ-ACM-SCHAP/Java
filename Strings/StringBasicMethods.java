class StringBasicMethods
{
  public static void main(String args[])
  {
    //  INDEX:  012
    String a = "abcdef";

    // Accessing characters at specific index
    char c = a.charAt(0);
    System.out.println("1st Character: " + c);

    // Substring Examples
    String str = "abcdef";
    String sub1 = str.substring(2);
    String sub2 = str.substring(2, 4);

    System.out.println("Substring1 : "+sub1);
    System.out.println("Substring2 : "+sub2);

    // Trim Function: Removes space from both ends
    String line = "  xyz 123 .  ";
    String trimmedLine = line.trim();

    System.out.println("Original Line: >" + line + "<");
    System.out.println("Trimmed Line: >" + trimmedLine + "<");

  }
}