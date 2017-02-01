import java.util.*;

public class Histogram {
  static int N = 30;
  static int M = 10;

  public static int[] histogram(int a[], int M) {
    int b[] = new int[M];

    for (int i = 0; i < a.length; i++) {
      b[a[i]]++;
    }

    return b;
  }

  public static void main(String[] args) {
    int a[] = new int[N];

    for (int i = 0; i < N; i++) {
      a[i] = StdRandom.uniform(M);
      System.out.print(a[i] + " "); 
    }
    System.out.println("");

    int b[] = histogram(a, M);

    for (int i = 0; i < M; i++) {
      System.out.print(b[i] + " "); 
    }
    StdOut.println("");    
  }
}
