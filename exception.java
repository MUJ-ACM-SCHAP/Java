 public class ExceptionA extends Exception
{
   public ExceptionA(String message)
   {
      super(message);
   }
 
   public static void getExceptionA() throws ExceptionA
   {
      throw new ExceptionA("Exception A");
   }
}
 
public class ExceptionB extends ExceptionA
{
   public ExceptionB(String message)
   {
      super(message);
   }
 
   public static void getExceptionB() throws ExceptionB
   {
      throw new ExceptionB("Exception B");
   }
}
 
public class ExceptionC extends ExceptionB
{
   public ExceptionC(String message)
   {
      super(message);
   }
 
   public static void getExceptionC() throws ExceptionC
  {
      throw new ExceptionC("Exception C");
   }
}
 
public class ExceptionTester
{
   public static void main(String[] args)
   {
      try
      {
        getExceptionA();
      }
      catch(ExceptionA ea)
      {
        ea.printStackTrace();
      }
  
      try
      {
        getExceptionB();
      }
      catch(ExceptionA ea)
      {
        ea.printStackTrace();
      }
  
      try
      {
        getExceptionC();
      }
      catch(ExceptionA ea)
      {
        ea.printStackTrace();
      }
   }
 
   public static void getExceptionA() throws ExceptionA
   {
      throw new ExceptionA("Exception A");
   }
 
   public static void getExceptionB() throws ExceptionB
   {
      throw new ExceptionB("Exception B");
   }
 
   public static void getExceptionC() throws ExceptionC
   {
      throw new ExceptionC("Exception C");
   }
}
