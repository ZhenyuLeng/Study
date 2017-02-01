import java.util.*;

public class LgInt {
  public static void main(String[] args) {
    Random random; 
    long seed = System.currentTimeMillis();
    random = new Random(seed);

    int m = StdRandom.uniform(2147483647);

    System.out.println(m);

    int n = lgInt(m);
    
    System.out.println(n);
  }

  public static int lgInt(int m) {
    int n = 0;
    
    while (m/2 > 0) {
      n++;
      m /= 2;
    }

    return n;
  }
}
