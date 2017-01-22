import java.util.*;

public class Transposition {
  public static void main(String[] args) {
    Random random; 
    long seed = System.currentTimeMillis();
    
    random = new Random(seed);

    int N = 5;
    int[][] matric = new int[N][N];

    for (int i = 0; i < N; i++) {
      for (int j = 0; j < N; j++) {
        matric[i][j] = StdRandom.uniform(100);
//        matric[i][j] = random.nextInt(100);
        System.out.printf("%d\t", matric[i][j]);
      }
      System.out.println("");
    }
  }
}
