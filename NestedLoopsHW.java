/**
 * Write a description of class NestedLoopsHW here.
 * 
 * @Josh Ross 
 * @10-22-14)
 */
public class NestedLoopsHW
{
  public static void starryDashFun(int n)
  {
      for (int rows = 0; rows < n; rows ++)
      {
          for (int star = 0; star < rows; star ++)
          {
              System.out.print("* ");
          }
          for (int columns = 0; columns < ((n-1)-rows); columns++)
          {
             System.out.print("_ ");
          }
          System.out.println(""); 
      }
  }
}
