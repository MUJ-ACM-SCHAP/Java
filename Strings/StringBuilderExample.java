class StringBuilderExample
{
  public static void main(String args[])
  {
    String str = "abcdefghi";
    StringBuilder sb = new StringBuilder(str);

    System.out.println(sb);

    sb = sb.append("!");
    System.out.println(sb);

    sb.deleteCharAt(2);
    System.out.println(sb);

    sb.setCharAt(2, 'X');
    System.out.println(sb);

    sb = sb.insert(2, 'c');
    System.out.println(sb);

  }
}