import java.util.*;

public class Transposition {
  public static void main(String[] args) {
    Random random; 
    long seed = System.currentTimeMillis();
    
    random = new Random(seed);

    int M = 5;
    int N = 3;
    int matric[][] = new int[M][N];

    for (int i = 0; i < M; i++) {
      for (int j = 0; j < N; j++) {
        matric[i][j] = StdRandom.uniform(100);
        System.out.printf("%d\t", matric[i][j]);
      }
      System.out.println("");
    }

    System.out.println("");

    int b[][] = transposition(matric);

    for (int i = 0; i < b.length; i++) {
      for (int j = 0; j < b[i].length; j++) {
        System.out.printf("%d\t", b[i][j]);
      }
      System.out.println("");
    }
  }

  public static int[][] transposition(int a[][]) {
    int b[][] = new int[a[0].length][a.length];

    for (int i = 0; i < b.length; i++) {
      for (int j = 0; j < b[i].length; j++) {
        b[i][j] = a[a.length - j - 1][a[i].length - i - 1];
      }
    }
 
    return b;
  }

}
