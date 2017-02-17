import java.util.*;

public class ArrayExercise
{
  public static int gcd(int a, int b)
  {
    if (a == 0)
      return b;
    else
      return gcd(b % a, a);
  }

  public static void main(String[] args)
  {
    int N = StdIn.readInt();
   
    System.out.print("   "); 
    for (int i = 1; i <= N; i++)
      System.out.print(i + " ");
    System.out.println("");
    
    for (int i = 1; i <= N; i++) {
      System.out.print(i + " ");
      if (i < 10)
        System.out.print(" ");
      for (int j = 1; j <= N; j++) {
        if (gcd(i, j) == 1)
          System.out.print("0 ");
        else
          System.out.print("1 ");
        if (j > 9)
          System.out.print(" ");
      }
      System.out.println("");
    }
  }
}
