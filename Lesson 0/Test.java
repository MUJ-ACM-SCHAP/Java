import java.util.*;
class Test
{
  public static void main(String args[]) {
    int n = Integer.parseInt(args[0]);
    ArrayList<Long> res = pascalN(n);
    display(res);
    
  }

  static ArrayList<Long> pascalN(int n) {
    ArrayList<Long> prev = new ArrayList<>(),
                    next = new ArrayList<>();
    next.add(1L);
    display(next);

    int size;
    for(int i=2;i<=n;i++) {
      prev.clear();
      size = next.size();
      for(int j=0;j<size;j++) prev.add(next.get(j));
      next.clear();
     
      size = prev.size();
      next.add(prev.get(0));
      for(int j=0;j<size-1;j++)
        next.add(prev.get(j)+prev.get(j+1));
      
      next.add(prev.get(size-1));
      
    }    

    return next;

  } 

  static void display(ArrayList<Long> list) {
    int size = list.size();
    for(int i=0;i<size;i++)
      System.out.print(list.get(i)+" ");
    System.out.println();
  }
}