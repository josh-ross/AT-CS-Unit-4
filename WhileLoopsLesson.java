/**
 * Write a description of class WhileLoopsLesson here.
 * 
 * @Josh Ross 
 * @10-20-14
 */
public class WhileLoopsLesson
{
  public int findSum(int n)
  {
      int k = 5; // k is serving as a loop counter
      int sum = 0;
      while (k <= n) //syntax: while (conditio)...
      {
          sum = k*k + 5 + sum;
          k = k + 1;
      }
      return sum;
  }
 
  // write a method to print out the multiples of 3 from 3 to x inclusive. you must use a while loop
   /**
   * Using a while loop finds all of the multiples of three up to and including a given number
   * @param x must be an integer
   */
  public static void multiplesOfThree(int x)
  {
      int k = 3;
      while (k <= x) //each time the body of a loop is executed is known as an iteration (looping is also refered to as iterating)
      {
          System.out.println(k);
          k = k + 3;
      }
  }
  
  /**
   * Using a for loop finds all of the multiples of three up to and including a given number
   * @param x must be an integer
   */
  public static void multiplesOfThree2(int x)
  {
      for(int k=3; k <= x; k += 3)
      {
          System.out.println(k);
      }
  }
  
  /**
   * Write a nested for loop to print:
   * 
   * *
   * * *
   * * * *
   */
  public static void starsAcross()
  {
      for(int rows = 0; rows < 4; rows++)
      {
          for (int columns = 0; columns < (rows+1); columns++)
          {
              System.out.print("* ");
          }
          System.out.println("");
      }
  }
  
  /**
   * Using a nested for loop print
   * ----
   * ---
   * *--
   * **-
   * ***
   */
  public static void starPractice()
  {
      for (int rows = 0; rows < 5; rows ++)
      {
          for (int star = 0; star < rows; star ++)
          {
              System.out.print("*");
          }
          for (int columns = 0; columns < (4-rows); columns++)
          {
             System.out.print("_");
          }
          System.out.println(""); 
      }
  }
  
  public static void starTriangle(int n)
  {
      for (int rows=0; rows<n; rows++)
      {
          for (int columns=0; columns<(rows+1); columns++)
          {
              System.out.print("* ");
          }
          System.out.println();
      }
  }     
}





