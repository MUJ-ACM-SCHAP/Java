class StringComparisonExamples
{
  public static void main(String args[])
  {
    String str1, str2;
    int res;

    System.out.println("compareTo() EXAMPLES");
    System.out.println("-------------------");

    // Example 1
    str1 = "aaa";
    str2 = "aaa";
    res = str1.compareTo(str2);
    System.out.println(str1+" "+str2+" : "+res);
    
    // Example 2
    str1 = "aaa";
    str2 = "aaaaa";
    res = str1.compareTo(str2);
    System.out.println(str1+" "+str2+" : "+res);

    // Example 3
    str1 = "baa";
    str2 = "aaa";
    res = str1.compareTo(str2);
    System.out.println(str1+" "+str2+" : "+res);


    // Example 4
    str1 = "aaa";
    str2 = "baa";
    res = str1.compareTo(str2);
    System.out.println(str1+" "+str2+" : "+res);

    // --------------------------------

    System.out.println("\nequals(), equalsIgnoreCase() EXAMPLES");
    System.out.println("-------------------");
    
    boolean equalStatus;

    // Example 1
    str1 = "aaa";
    str2 = "aaa";
    equalStatus = str1.equals(str2);
    System.out.println(str1+" "+str2+" : "+equalStatus);

    // Example 2
    str1 = "aaa";
    str2 = "aaA";
    equalStatus = str1.equals(str2);
    System.out.println(str1+" "+str2+" : "+equalStatus);

    // Example 3
    str1 = "aaa";
    str2 = "aAa";
    equalStatus = str1.equalsIgnoreCase(str2);
    System.out.println(str1+" "+str2+" : "+equalStatus);
  }
}